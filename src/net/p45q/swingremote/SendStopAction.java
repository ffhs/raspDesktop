package net.p45q.swingremote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SendStopAction {
	int actionnr;

	public SendStopAction(int actionnr) {
		super();
		this.actionnr = actionnr;
		URL yahoo;
		try {
			yahoo = new URL("http://192.168.42.1:8080/stopaction?pinnr="+actionnr);
			URLConnection yc = yahoo.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                yc.getInputStream()));
	        String inputLine;
	
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
