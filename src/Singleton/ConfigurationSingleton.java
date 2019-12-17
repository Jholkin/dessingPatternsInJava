package Singleton;

import java.util.Properties;

public class ConfigurationSingleton {
	
	private static ConfigurationSingleton singleton;
	
	private static final String CONFIGURATION_PROP = "/Configuration.properties";
	private static final String APP_NAME_PROP = "appName";
	private static final String APP_VERSION_PROP = "appVersion";
	
	private String appName;
	private String appVersion;
	
	private ConfigurationSingleton() {
		Properties prop = PropertiesUtil.loadProperty(CONFIGURATION_PROP);
		this.appName = prop.getProperty(APP_NAME_PROP);
		this.appVersion = prop.getProperty(APP_VERSION_PROP);
	}
	
	private static synchronized void createInstance() {
		if (singleton == null) {
			singleton = new ConfigurationSingleton();
		}
	}
	
	public static ConfigurationSingleton getInstance() {
		if (singleton == null) {
			createInstance();
		}
		return singleton;
	}
	
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	@Override
	public String toString() {
		return "ConfigurationSingleton [appName=" + appName + ", appVersion=" + appVersion + "]";
	}

}
