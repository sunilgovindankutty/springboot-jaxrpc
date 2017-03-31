/**
 * OrderProcessingServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sample;

public interface OrderProcessingServiceService extends javax.xml.rpc.Service {
    public java.lang.String getOrderProcessingServiceAddress();

    public sample.OrderProcessingService getOrderProcessingService() throws javax.xml.rpc.ServiceException;

    public sample.OrderProcessingService getOrderProcessingService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
