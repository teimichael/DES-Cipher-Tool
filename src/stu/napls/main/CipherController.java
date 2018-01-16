package stu.napls.main;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import stu.napls.util.CipherUtils;

public class CipherController {
	public static String getEncode(String data) {
		return CipherUtils.encode(Configure.key, data);
	}

	public static String getDecode(String data) {
		return CipherUtils.decode(Configure.key, data);
	}

	public static String getDecodeByURLDecoder(String data) throws UnsupportedEncodingException {
		return URLDecoder.decode(getDecode(data), Configure.charset);
	}
}
