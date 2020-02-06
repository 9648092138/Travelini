package co.travelini.backendservices.util;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.mindrot.jbcrypt.BCrypt;

public class EncryptionUtil {

	private static class StringEncryptor {

		private int poolSize = 4;

		private String algorithm = "PBEWITHMD5ANDDES";

		private final String secret = Constants.APP_PASSWORD;

		private PooledPBEStringEncryptor pooledPBEStringEncryptor;

		public StringEncryptor() {

			pooledPBEStringEncryptor = new PooledPBEStringEncryptor();

			pooledPBEStringEncryptor.setPassword(secret);
			pooledPBEStringEncryptor.setPoolSize(poolSize);
			pooledPBEStringEncryptor.setAlgorithm(algorithm);
		}

		public String encryptString(String toEncrypt) {
			return pooledPBEStringEncryptor.encrypt(toEncrypt);
		}

		public String decryptString(String toDecrypt) {
			return pooledPBEStringEncryptor.decrypt(toDecrypt);
		}
	}

	private static StringEncryptor stringEncryptor = new StringEncryptor();

	public static String encryptPassword(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt(11));
	}

	public static boolean checkPassword(String password, String encryptedPassword) {
		return BCrypt.checkpw(password, encryptedPassword);
	}

	public static String encryptString(String toEncrypt) {
		return stringEncryptor.encryptString(toEncrypt);
	}

	public static String decryptString(String toDecrypt) {
		return stringEncryptor.decryptString(toDecrypt);
	}

	public static void main(String[] args) {
		System.out.println(decryptString("jetghxNhn+3dUi3KMpU2r5/VIpB7F6d2hilNezXpsZ0="));
	}
}