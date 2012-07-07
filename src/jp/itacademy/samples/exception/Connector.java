package jp.itacademy.samples.exception;

import java.io.IOException;
import java.net.Socket;

import org.omg.CORBA.portable.UnknownException;

public class Connector {

	public static void main(String[] args) {
		Connector conn = new Connector("www.yahoo.co.jp", 80);
		try {
			conn.connect();
		} catch (UnknownException e) {
			System.err.println(conn.host + "Å@Ç™å©Ç¬Ç©ÇËÇ‹ÇπÇÒ");
		} catch (IOException e) {
			System.err.println("ê⁄ë±Ç≈Ç´Ç‹ÇπÇÒ");
		}
	}

	private String host;
	private int port;

	public Connector(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public void connect() throws UnknownException, IOException {
		Socket sock = new Socket(host, port);
		System.out.println("ê⁄ë±ê¨å˜: " + sock);
	}
}
