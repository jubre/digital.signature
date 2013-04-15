/**
 * SignatureWriteWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gobconsult.ejecutorfirmas;

public class SignatureWriteWSServiceLocator extends org.apache.axis.client.Service implements pe.gobconsult.ejecutorfirmas.SignatureWriteWSService {

    public SignatureWriteWSServiceLocator() {
    }


    public SignatureWriteWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SignatureWriteWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SignatureWriteWS
    //private java.lang.String SignatureWriteWS_address = "http://localhost:8080/ejecutor.firmas.ws/services/SignatureWriteWS";
    private java.lang.String SignatureWriteWS_address = "http://app.gobconsult.net:8088/ejecutor.firmas.ws/services/SignatureWriteWS";

    public java.lang.String getSignatureWriteWSAddress() {
        return SignatureWriteWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SignatureWriteWSWSDDServiceName = "SignatureWriteWS";

    public java.lang.String getSignatureWriteWSWSDDServiceName() {
        return SignatureWriteWSWSDDServiceName;
    }

    public void setSignatureWriteWSWSDDServiceName(java.lang.String name) {
        SignatureWriteWSWSDDServiceName = name;
    }

    public pe.gobconsult.ejecutorfirmas.SignatureWriteWS getSignatureWriteWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SignatureWriteWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSignatureWriteWS(endpoint);
    }

    public pe.gobconsult.ejecutorfirmas.SignatureWriteWS getSignatureWriteWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pe.gobconsult.ejecutorfirmas.SignatureWriteWSSoapBindingStub _stub = new pe.gobconsult.ejecutorfirmas.SignatureWriteWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getSignatureWriteWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSignatureWriteWSEndpointAddress(java.lang.String address) {
        SignatureWriteWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pe.gobconsult.ejecutorfirmas.SignatureWriteWS.class.isAssignableFrom(serviceEndpointInterface)) {
                pe.gobconsult.ejecutorfirmas.SignatureWriteWSSoapBindingStub _stub = new pe.gobconsult.ejecutorfirmas.SignatureWriteWSSoapBindingStub(new java.net.URL(SignatureWriteWS_address), this);
                _stub.setPortName(getSignatureWriteWSWSDDServiceName());
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
        if ("SignatureWriteWS".equals(inputPortName)) {
            return getSignatureWriteWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ejecutorfirmas.gobconsult.pe", "SignatureWriteWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ejecutorfirmas.gobconsult.pe", "SignatureWriteWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SignatureWriteWS".equals(portName)) {
            setSignatureWriteWSEndpointAddress(address);
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
