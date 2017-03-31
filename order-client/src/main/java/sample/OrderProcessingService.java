/**
 * OrderProcessingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sample;

public interface OrderProcessingService extends java.rmi.Remote {
    public java.lang.String processOrder(java.lang.String orderID, sample.holders.OrderHolder orderHolder) throws java.rmi.RemoteException;
    public java.lang.String updateOrder(sample.holders.OrderHolder orderHolder) throws java.rmi.RemoteException;
}
