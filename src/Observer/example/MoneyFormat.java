package Observer.example;

public class MoneyFormat implements IObserver {

	public void notifyObserver(String cadena, Object objeto) {
		if(cadena.equals("moneyFormat")) {
			ConfigurationManager conf = (ConfigurationManager)objeto;
			System.out.println("Observer ==> MoneyFormatObserver.moneyObserverFormatChange > "
					+ conf.getMoneyFormat().format(1.11));
		}
	}
}
