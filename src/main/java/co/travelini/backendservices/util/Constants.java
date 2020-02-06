package co.travelini.backendservices.util;

import java.util.regex.Pattern;

public class Constants {

	public static final String APP_PASSWORD = "mXnFOGaOUfLf0qDPC";

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public static final String RESPONSE_CODES_PROPERTIES_FILE_PATH = "responsecodes.properties";

	public static final String SUCCESS_PREFIX = "SUC_";
	public static final String ERROR_PREFIX = "ERR_";

}
