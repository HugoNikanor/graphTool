package commandInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketImpl;

public class Connection extends Socket {
	private BufferedReader in;
	private PrintStream out;

	public Connection(SocketImpl si) throws SocketException {
		super(si);
	}

	public PrintStream getOut() {
		if(out == null) {
			try {
				out = new PrintStream(
						this.getOutputStream());
			} catch (IOException e) {
				// TODO figure out what to do
				e.printStackTrace();
			}
		}
		return out;
	}

	public BufferedReader getIn() {
		if(in == null) {
			try {
				in = new BufferedReader(
						new InputStreamReader(
							this.getInputStream()));
			} catch (IOException e) {
				// TODO figure out what to do
				e.printStackTrace();
			}
		}
		return in;
	}
}
