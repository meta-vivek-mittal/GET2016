/**
 * TemperatureConversionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package conversion;

public interface TemperatureConversionService extends javax.xml.rpc.Service {
    public java.lang.String getTemperatureConversionAddress();

    public conversion.TemperatureConversion getTemperatureConversion() throws javax.xml.rpc.ServiceException;

    public conversion.TemperatureConversion getTemperatureConversion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
