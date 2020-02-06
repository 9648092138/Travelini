package co.travelini.backendservices.util;

import java.util.Base64;

public class EncodingUtil {

	public static String encodeBase64(String toEncode) {
		return Base64.getEncoder().encodeToString(toEncode.getBytes());
	}

	public static String decodeBase64(String toDecode) {
		return new String(Base64.getDecoder().decode(toDecode));
	}

}
