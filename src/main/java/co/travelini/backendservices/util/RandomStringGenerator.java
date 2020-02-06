package co.travelini.backendservices.util;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomStringGenerator {

	private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private static final String LOWER = UPPER.toLowerCase(Locale.ROOT);

	private static final String DIGIT = "0123456789";

	private static final String ALPHANUM = UPPER + LOWER + DIGIT;

	private static String genString(Random random, char[] characters, char[] buffer) {
		for (int i = 0; i < buffer.length; ++i)
			buffer[i] = characters[random.nextInt(characters.length)];

		return new String(buffer);
	}

	public static String generateRandomString(int length, Random random, String symbols) {

		if (length < 1 && length > 24)
			throw new IllegalArgumentException(
					"Length of the requested Random String cannot be 0 also cannot be more than 24");

		if (symbols.length() < 2)
			throw new IllegalArgumentException("");

		random = Objects.requireNonNull(random);
		char[] characters = symbols.toCharArray();
		char[] buffer = new char[length];

		return genString(random, characters, buffer);
	}

	public static String generateRandomString(int length, Random random) {
		return generateRandomString(length, random, ALPHANUM);
	}

	public static String generateRandomString(int length) {
		return generateRandomString(length, new Random());
	}

	public static String generateRandomString() {
		return generateRandomString(21);
	}

}
