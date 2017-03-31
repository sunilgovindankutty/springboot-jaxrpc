/**
 * OrderProcessingServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sample;

public class OrderProcessingServiceServiceLocator extends org.apache.axis.client.Service implements sample.OrderProcessingServiceService {

    public OrderProcessingServiceServiceLocator() {
    }


    public OrderProcessingServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderProcessingServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OrderProcessingService
    private java.lang.String OrderProcessingService_address = "http://localhost:8080/order/services/OrderProcessingService";

    public java.lang.String getOrderProcessingServiceAddress() {
        return OrderProcessingService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OrderProcessingServiceWSDDServiceName = "OrderProcessingService";

    public java.lang.String getOrderProcessingServiceWSDDServiceName() {
        return OrderProcessingServiceWSDDServiceName;
    }

    public void setOrderProcessingServiceWSDDServiceName(java.lang.String name) {
        OrderProcessingServiceWSDDServiceName = name;
    }

    public sample.OrderProcessingService getOrderProcessingService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OrderProcessingService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOrderProcessingService(endpoint);
    }

    public sample.OrderProcessingService getOrderProcessingService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            sample.OrderProcessingServiceSoapBindingStub _stub = new sample.OrderProcessingServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOrderProcessingServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOrderProcessingServiceEndpointAddress(java.lang.String address) {
        OrderProcessingService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (sample.OrderProcessingService.class.isAssignableFrom(serviceEndpointInterface)) {
                sample.OrderProcessingServiceSoapBindingStub _stub = new sample.OrderProcessingServiceSoapBindingStub(new java.net.URL(OrderProcessingService_address), this);
                _stub.setPortName(getOrderProcessingServiceWSDDServiceName());
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
        if ("OrderProcessingService".equals(inputPortName)) {
            return getOrderProcessingService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sample", "OrderProcessingServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sample", "OrderProcessingService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OrderProcessingService".equals(portName)) {
            setOrderProcessingServiceEndpointAddress(address);
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
