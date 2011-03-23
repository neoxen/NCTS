/**
 * PublicServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package src;

public interface PublicServiceService extends javax.xml.rpc.Service {
    public java.lang.String getpublicServiceAddress();

    public src.PublicService getpublicService() throws javax.xml.rpc.ServiceException;

    public src.PublicService getpublicService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
