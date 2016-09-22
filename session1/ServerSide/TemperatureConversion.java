
package conversion;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TemperatureConversion 
{

	@WebMethod
	public double fahrenheitToCelsius(double fahrenheit)
	{
		double celsius=((fahrenheit-32)*5)/9;
		return celsius;
	}
}