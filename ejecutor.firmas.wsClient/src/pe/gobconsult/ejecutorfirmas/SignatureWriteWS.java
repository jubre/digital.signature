/**
 * SignatureWriteWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.gobconsult.ejecutorfirmas;

public interface SignatureWriteWS extends java.rmi.Remote {
    public boolean signFile(java.lang.String rutaSalidaPdfFile, java.lang.String rutaEntradaPdfFile, java.lang.String rutaFirmaDigitalFile, java.lang.String clavePublica, java.lang.String clavePrivada) throws java.rmi.RemoteException;
    public boolean signFileByFirmante(java.lang.String rutaSalidaPdfFile, java.lang.String rutaEntradaPdfFile, java.lang.String rutaFirmaDigitalFile, java.lang.String clavePublica, java.lang.String clavePrivada, int numeroFirmante) throws java.rmi.RemoteException;
}
