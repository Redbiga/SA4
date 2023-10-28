/**
 * CalTaxService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example.client;

public interface CalTaxService extends javax.xml.rpc.Service {
    public java.lang.String getCalTaxAddress();

    public example.client.CalTax_PortType getCalTax() throws javax.xml.rpc.ServiceException;

    public example.client.CalTax_PortType getCalTax(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
