package pe.gobconsult.ejecutorfirmas;

public class SignatureWriteWSProxy implements pe.gobconsult.ejecutorfirmas.SignatureWriteWS {
  private String _endpoint = null;
  private pe.gobconsult.ejecutorfirmas.SignatureWriteWS signatureWriteWS = null;
  
  public SignatureWriteWSProxy() {
    _initSignatureWriteWSProxy();
  }
  
  public SignatureWriteWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initSignatureWriteWSProxy();
  }
  
  private void _initSignatureWriteWSProxy() {
    try {
      signatureWriteWS = (new pe.gobconsult.ejecutorfirmas.SignatureWriteWSServiceLocator()).getSignatureWriteWS();
      if (signatureWriteWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)signatureWriteWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)signatureWriteWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (signatureWriteWS != null)
      ((javax.xml.rpc.Stub)signatureWriteWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pe.gobconsult.ejecutorfirmas.SignatureWriteWS getSignatureWriteWS() {
    if (signatureWriteWS == null)
      _initSignatureWriteWSProxy();
    return signatureWriteWS;
  }
  
  public boolean signFile(java.lang.String rutaSalidaPdfFile, java.lang.String rutaEntradaPdfFile, java.lang.String rutaFirmaDigitalFile, java.lang.String clavePublica, java.lang.String clavePrivada) throws java.rmi.RemoteException{
    if (signatureWriteWS == null)
      _initSignatureWriteWSProxy();
    return signatureWriteWS.signFile(rutaSalidaPdfFile, rutaEntradaPdfFile, rutaFirmaDigitalFile, clavePublica, clavePrivada);
  }
  
  public boolean signFileByFirmante(java.lang.String rutaSalidaPdfFile, java.lang.String rutaEntradaPdfFile, java.lang.String rutaFirmaDigitalFile, java.lang.String clavePublica, java.lang.String clavePrivada, int numeroFirmante) throws java.rmi.RemoteException{
    if (signatureWriteWS == null)
      _initSignatureWriteWSProxy();
    return signatureWriteWS.signFileByFirmante(rutaSalidaPdfFile, rutaEntradaPdfFile, rutaFirmaDigitalFile, clavePublica, clavePrivada, numeroFirmante);
  }
  
  
}