package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class Config {
	private static HashMap<String, String> configInfo;
	static{
		configInfo = new HashMap<String, String>();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("config.conf"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line;
		String info[];
		while (scanner.hasNext()){
			line = scanner.nextLine();
			info = line.split("[=]");
			configInfo.put(info[0], info[1]);
		}
		scanner.close();
	}
	public static String getInfo(String infoName){
		return configInfo.get(infoName);
	}
}
