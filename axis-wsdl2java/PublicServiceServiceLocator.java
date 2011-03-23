/**
 * PublicServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package src;

public class PublicServiceServiceLocator extends org.apache.axis.client.Service implements src.PublicServiceService {

    public PublicServiceServiceLocator() {
    }


    public PublicServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PublicServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for publicService
    private java.lang.String publicService_address = "http://59.173.86.50:8080/wh12315ww/services/publicService";

    public java.lang.String getpublicServiceAddress() {
        return publicService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String publicServiceWSDDServiceName = "publicService";

    public java.lang.String getpublicServiceWSDDServiceName() {
        return publicServiceWSDDServiceName;
    }

    public void setpublicServiceWSDDServiceName(java.lang.String name) {
        publicServiceWSDDServiceName = name;
    }

    public src.PublicService getpublicService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(publicService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpublicService(endpoint);
    }

    public src.PublicService getpublicService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            src.PublicServiceSoapBindingStub _stub = new src.PublicServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getpublicServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpublicServiceEndpointAddress(java.lang.String address) {
        publicService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (src.PublicService.class.isAssignableFrom(serviceEndpointInterface)) {
                src.PublicServiceSoapBindingStub _stub = new src.PublicServiceSoapBindingStub(new java.net.URL(publicService_address), this);
                _stub.setPortName(getpublicServiceWSDDServiceName());
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
        if ("publicService".equals(inputPortName)) {
            return getpublicService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://59.173.86.50:8080/wh12315ww/services/publicService", "PublicServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://59.173.86.50:8080/wh12315ww/services/publicService", "publicService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("publicService".equals(portName)) {
            setpublicServiceEndpointAddress(address);
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
