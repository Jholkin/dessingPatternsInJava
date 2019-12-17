package Observer.example;

import java.util.Date;

public class DateFormat implements IObserver{
	
	public void notifyObserver(String cadena, Object objeto) {
		if(cadena.equals("defaultDateFormat")) {
			ConfigurationManager conf = (ConfigurationManager)objeto;
			System.out.println("Observer ==> DateFormatObserver.dateFormatChange > "
					+ conf.getDefaultDateFormat().format(new Date()));
		}
	}
	
}
