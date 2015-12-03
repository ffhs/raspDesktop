package net.p45q.swingremote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * SendStartAction
 *
 * Pascal Bieri, Thierry Baumann
 */
public class SendStartAction {
	int actionnr;

	public SendStartAction(int actionnr) {
		super();
		this.actionnr = actionnr;
		URL yahoo;
		try {
			yahoo = new URL("http://192.168.42.1:8080/startaction?pinnr="
					+ actionnr);
			URLConnection yc = yahoo.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(
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
