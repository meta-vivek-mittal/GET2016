package conversion;

import java.util.Scanner;

import javax.xml.rpc.ServiceException;

public class Convert {
	
	public static void main(String[] args) {
		TemperatureConversionServiceLocator temperatureConversionServiceLocator=new TemperatureConversionServiceLocator();
		temperatureConversionServiceLocator.setTemperatureConversionEndpointAddress("http://localhost:8080/ServerSide/services/TemperatureConversion");
		try {
			TemperatureConversion temperatureConversion = temperatureConversionServiceLocator.getTemperatureConversion();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter temp in fahrenheit");
			double temperatureInFahrenheit=sc.nextDouble();
			System.out.println("Temperature in Celsius: "+temperatureConversion.fahrenheitToCelsius(temperatureInFahrenheit));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
