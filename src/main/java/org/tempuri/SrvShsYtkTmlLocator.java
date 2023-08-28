/**
 * SrvShsYtkTmlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SrvShsYtkTmlLocator extends org.apache.axis.client.Service implements org.tempuri.SrvShsYtkTml {

    public SrvShsYtkTmlLocator() {
    }


    public SrvShsYtkTmlLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SrvShsYtkTmlLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpsBinding_KBSServis
    private java.lang.String BasicHttpsBinding_KBSServis_address = "https://vatandas.jandarma.gov.tr/KBS_Tesis_Servis/SrvShsYtkTml.svc";

    public java.lang.String getBasicHttpsBinding_KBSServisAddress() {
        return BasicHttpsBinding_KBSServis_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpsBinding_KBSServisWSDDServiceName = "BasicHttpsBinding_KBSServis";

    public java.lang.String getBasicHttpsBinding_KBSServisWSDDServiceName() {
        return BasicHttpsBinding_KBSServisWSDDServiceName;
    }

    public void setBasicHttpsBinding_KBSServisWSDDServiceName(java.lang.String name) {
        BasicHttpsBinding_KBSServisWSDDServiceName = name;
    }

    public org.tempuri.ISrvShsYtkTml getBasicHttpsBinding_KBSServis() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpsBinding_KBSServis_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpsBinding_KBSServis(endpoint);
    }

    public org.tempuri.ISrvShsYtkTml getBasicHttpsBinding_KBSServis(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpsBinding_KBSServisStub _stub = new org.tempuri.BasicHttpsBinding_KBSServisStub(portAddress, this);
            _stub.setPortName(getBasicHttpsBinding_KBSServisWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpsBinding_KBSServisEndpointAddress(java.lang.String address) {
        BasicHttpsBinding_KBSServis_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.ISrvShsYtkTml.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpsBinding_KBSServisStub _stub = new org.tempuri.BasicHttpsBinding_KBSServisStub(new java.net.URL(BasicHttpsBinding_KBSServis_address), this);
                _stub.setPortName(getBasicHttpsBinding_KBSServisWSDDServiceName());
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
        if ("BasicHttpsBinding_KBSServis".equals(inputPortName)) {
            return getBasicHttpsBinding_KBSServis();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "SrvShsYtkTml");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpsBinding_KBSServis"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpsBinding_KBSServis".equals(portName)) {
            setBasicHttpsBinding_KBSServisEndpointAddress(address);
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
