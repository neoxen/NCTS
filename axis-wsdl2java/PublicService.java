/**
 * PublicService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package src;

public interface PublicService extends java.rmi.Remote {
    public src.Djnrb getTS(java.lang.String name, java.lang.String id) throws java.rmi.RemoteException;
    public src.Djnrb getTSById(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String save(src.Djnrb dj1) throws java.rmi.RemoteException;
}
