package com.ceair.ita.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

public class PostClient {

	public static String postRQ(String rs) throws IOException{
		StringBuilder response = new StringBuilder();
//		System.setProperty("https.proxySet", "true");
//		System.setProperty("https.proxyHost", "127.0.0.1");  
//		System.setProperty("https.proxyPort", "8000");
		System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
		System.setProperty("sun.net.client.defaultReadTimeout", "30000");
		HttpURLConnection conn = (HttpURLConnection) new URL("https://www.google.com/travel/qpxconnect/production").openConnection();
		conn.setDoOutput(true);
		conn.setDoInput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "text/xml");
		conn.setRequestProperty("Accept-Encoding", "gzip");
		conn.setConnectTimeout(30000);
		conn.setReadTimeout(100000);
		
		OutputStreamWriter writer = new OutputStreamWriter(conn
				.getOutputStream());
		writer.write(rs);
		writer.flush();

		if (conn.getResponseCode() == 200) {
			InputStream is = conn.getInputStream();
			if ("gzip".equals(conn.getContentEncoding())) {
				is = new GZIPInputStream(is);
			}
			is = new BufferedInputStream(is);
			int ch = is.read();
			while (ch >= 0) {
//				System.out.print((char) ch);
				response.append((char) ch);
				ch = is.read();
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		} else {
			System.out.println("Error: " + conn.getResponseCode() + " "
					+ conn.getResponseMessage());
		}
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("rs.xml"));
//		bw.write(response.toString());
//		bw.flush();
//		bw.close();
		return response.toString();
	}
}
