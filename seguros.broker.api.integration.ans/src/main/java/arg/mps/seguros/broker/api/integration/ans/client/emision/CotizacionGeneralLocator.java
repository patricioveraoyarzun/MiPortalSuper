/**
 * CotizacionGeneralLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package arg.mps.seguros.broker.api.integration.ans.client.emision;

@SuppressWarnings("all")
public class CotizacionGeneralLocator extends org.apache.axis.client.Service implements arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneral {

    public CotizacionGeneralLocator() {
    }


    public CotizacionGeneralLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CotizacionGeneralLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CotizacionGeneralSoap12
    private java.lang.String CotizacionGeneralSoap12_address = "http://prueba.ant.cl/ws_emision/cotizaciongeneral.asmx";

    public java.lang.String getCotizacionGeneralSoap12Address() {
        return CotizacionGeneralSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CotizacionGeneralSoap12WSDDServiceName = "CotizacionGeneralSoap12";

    public java.lang.String getCotizacionGeneralSoap12WSDDServiceName() {
        return CotizacionGeneralSoap12WSDDServiceName;
    }

    public void setCotizacionGeneralSoap12WSDDServiceName(java.lang.String name) {
        CotizacionGeneralSoap12WSDDServiceName = name;
    }

    public arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap_PortType getCotizacionGeneralSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CotizacionGeneralSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCotizacionGeneralSoap12(endpoint);
    }

    public arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap_PortType getCotizacionGeneralSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap12Stub _stub = new arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap12Stub(portAddress, this);
            _stub.setPortName(getCotizacionGeneralSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCotizacionGeneralSoap12EndpointAddress(java.lang.String address) {
        CotizacionGeneralSoap12_address = address;
    }


    // Use to get a proxy class for CotizacionGeneralSoap
    private java.lang.String CotizacionGeneralSoap_address = "http://prueba.ant.cl/ws_emision/cotizaciongeneral.asmx";

    public java.lang.String getCotizacionGeneralSoapAddress() {
        return CotizacionGeneralSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CotizacionGeneralSoapWSDDServiceName = "CotizacionGeneralSoap";

    public java.lang.String getCotizacionGeneralSoapWSDDServiceName() {
        return CotizacionGeneralSoapWSDDServiceName;
    }

    public void setCotizacionGeneralSoapWSDDServiceName(java.lang.String name) {
        CotizacionGeneralSoapWSDDServiceName = name;
    }

    public arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap_PortType getCotizacionGeneralSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CotizacionGeneralSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCotizacionGeneralSoap(endpoint);
    }

    public arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap_PortType getCotizacionGeneralSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoapStub _stub = new arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoapStub(portAddress, this);
            _stub.setPortName(getCotizacionGeneralSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCotizacionGeneralSoapEndpointAddress(java.lang.String address) {
        CotizacionGeneralSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap12Stub _stub = new arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap12Stub(new java.net.URL(CotizacionGeneralSoap12_address), this);
                _stub.setPortName(getCotizacionGeneralSoap12WSDDServiceName());
                return _stub;
            }
            if (arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoapStub _stub = new arg.mps.seguros.broker.api.integration.ans.client.emision.CotizacionGeneralSoapStub(new java.net.URL(CotizacionGeneralSoap_address), this);
                _stub.setPortName(getCotizacionGeneralSoapWSDDServiceName());
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
        if ("CotizacionGeneralSoap12".equals(inputPortName)) {
            return getCotizacionGeneralSoap12();
        }
        else if ("CotizacionGeneralSoap".equals(inputPortName)) {
            return getCotizacionGeneralSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "CotizacionGeneral");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "CotizacionGeneralSoap12"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "CotizacionGeneralSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CotizacionGeneralSoap12".equals(portName)) {
            setCotizacionGeneralSoap12EndpointAddress(address);
        }
        else 
if ("CotizacionGeneralSoap".equals(portName)) {
            setCotizacionGeneralSoapEndpointAddress(address);
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
