package FactoryMethod.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties loadProperty(String propertiesURL) {
		try {
			Properties properties = new Properties();
			InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesURL);
			return properties;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}