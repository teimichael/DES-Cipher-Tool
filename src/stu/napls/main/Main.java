package stu.napls.main;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import stu.napls.util.FileHelper;

public class Main {

	public static void main(String[] args) throws IOException {
		// Encode file
		encodeFile();
		
		// Decode file
		decodeFile();
	}

	private static void encodeFile() throws IOException {
		String result;
		String data2e = FileHelper.readFileByURLEncode(Configure.encodeFilePath, Configure.charset);
		if (data2e != null) {
			result = CipherController.getEncode(data2e);
			System.out.println(result);
		}
	}

	private static void decodeFile() throws UnsupportedEncodingException {
		String result;
		String data2d = FileHelper.readFile(Configure.decodeFilePath, Configure.charset);
		if (data2d != null) {
			result = CipherController.getDecodeByURLDecoder(data2d);
			System.out.println(result);
		}
	}

}
