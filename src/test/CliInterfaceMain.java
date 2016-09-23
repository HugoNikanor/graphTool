package test;

import java.util.Scanner;

import commandInterface.ConnectionPoint;

public class CliInterfaceMain {
	public static void main(String[] args) throws Exception {
		ConnectionPoint cp = new ConnectionPoint(12345);
		String cli = "";
		Scanner sc = new Scanner(System.in);
		while((cli = sc.nextLine()) != null) {
			if (cli == "quit") break;
			System.out.println(cli);
		}
		sc.close();
		cp.close();
	}
}
