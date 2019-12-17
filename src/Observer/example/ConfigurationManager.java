package Observer.example;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class ConfigurationManager extends Subject{

	private static ConfigurationManager configurationManager;
	private SimpleDateFormat defaultDateFormat;
	private NumberFormat moneyFormat;
	
	private ConfigurationManager() {
		
	}
	
	public static ConfigurationManager getInstance() {
		if (configurationManager == null) {
			configurationManager = new ConfigurationManager();
		}
		return configurationManager;
	}
	
	public SimpleDateFormat getDefaultDateFormat() {
		return this.defaultDateFormat;
	}
	
	public NumberFormat getMoneyFormat() {
		return this.moneyFormat;
	}
	
	public void setDefaultDateFormat(SimpleDateFormat dateFormat) {
		this.defaultDateFormat = dateFormat;
		notifyAllObservers("defaultDateFormat", this);
	}
	
	public void setMoneyFormat(NumberFormat moneyFormat) {
		this.moneyFormat = moneyFormat;
		notifyAllObservers("moneyFormat", this);
	}
	
}
