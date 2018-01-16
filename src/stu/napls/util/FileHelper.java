package stu.napls.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;

public class FileHelper {

	public static String readFile(String path, String charset) {
		File file = new File(path);
		Long filelength = file.length();
		byte[] filecontent = new byte[filelength.intValue()];
		try {
			FileInputStream in = new FileInputStream(file);
			in.read(filecontent);
			in.close();
			// System.out.println(URLEncoder.encode(new String(filecontent), charset));
			return new String(filecontent, charset);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String readFileByLine(String path, String charset) throws IOException {
		String result = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), charset));
			StringBuffer sb = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			br.close();
			result = sb.toString();
		} catch (FileNotFoundException e) {

		}
		return result;
	}

	public static String readFileByURLEncode(String path, String charset) throws IOException {
		File file = new File(path);
		Long filelength = file.length();
		byte[] filecontent = new byte[filelength.intValue()];
		try {
			FileInputStream in = new FileInputStream(file);
			in.read(filecontent);
			in.close();
			// System.out.println(URLEncoder.encode(new String(filecontent), charset));
			return URLEncoder.encode(new String(filecontent), charset);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}