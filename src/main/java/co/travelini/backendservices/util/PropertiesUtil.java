package co.travelini.backendservices.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	private Properties properties;

	public PropertiesUtil(String propertiesFilePath) {

		try (InputStream stream = this.getClass().getClassLoader().getResourceAsStream(propertiesFilePath)) {

			this.properties = new Properties();
			properties.load(stream);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getPropertyValue(String key) {
		return properties.getProperty(key, "");
	}

}
