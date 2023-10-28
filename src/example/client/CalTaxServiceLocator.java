/**
 * CalTaxServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example.client;

public class CalTaxServiceLocator extends org.apache.axis.client.Service implements example.client.CalTaxService {

    public CalTaxServiceLocator() {
    }


    public CalTaxServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalTaxServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalTax
    private java.lang.String CalTax_address = "http://localhost:8080//services/example/CalTax";

    @Override
    public java.lang.String getCalTaxAddress() {
        return CalTax_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalTaxWSDDServiceName = "CalTax";

    public java.lang.String getCalTaxWSDDServiceName() {
        return CalTaxWSDDServiceName;
    }

    public void setCalTaxWSDDServiceName(java.lang.String name) {
        CalTaxWSDDServiceName = name;
    }

    public example.client.CalTax_PortType getCalTax() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalTax_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalTax(endpoint);
    }

    public example.client.CalTax_PortType getCalTax(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            example.client.CalTaxSoapBindingStub _stub = new example.client.CalTaxSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalTaxWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalTaxEndpointAddress(java.lang.String address) {
        CalTax_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (example.client.CalTax_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                example.client.CalTaxSoapBindingStub _stub = new example.client.CalTaxSoapBindingStub(new java.net.URL(CalTax_address), this);
                _stub.setPortName(getCalTaxWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalTax".equals(inputPortName)) {
            return getCalTax();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example", "CalTaxService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example", "CalTax"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalTax".equals(portName)) {
            setCalTaxEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
