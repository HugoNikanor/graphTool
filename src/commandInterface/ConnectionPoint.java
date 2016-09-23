package commandInterface;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketException;
import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPoint extends ServerSocket {

	private List<Connection> connections;

	private MessageDispatcher dispatcher;

	public ConnectionPoint(int port) throws IOException {
		super(port);

		connections = new ArrayList<Connection>();
		dispatcher = new MessageDispatcher();

		System.out.format("Server open on port %d%n", port);

		new Thread(() -> {
			try {
				while(true) {
					System.out.println("waiting for client");
					Connection c = (Connection) this.accept();
					connections.add(c);
					c.getOut().println("Connected!");
					System.out.println("client connected");
				}
			} catch (IOException e) {
			}
		}).start();

		new Thread(() -> {
			while(true) {
				for(Connection connection : connections) {
					try {
						String input = connection.getIn().readLine();
						String output = dispatcher.dispatch(input);
						connection.getOut().println(output);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	@Override
	public Connection accept() throws IOException {
		if (isClosed())
			throw new SocketException("Socket is closed");
		if (!isBound())
			throw new SocketException("Socket is not bound yet");
		Connection s = new Connection((SocketImpl) null);
		implAccept(s);
		return s;
	}
}
