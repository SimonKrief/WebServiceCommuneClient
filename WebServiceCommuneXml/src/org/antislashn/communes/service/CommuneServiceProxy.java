package org.antislashn.communes.service;

public class CommuneServiceProxy implements org.antislashn.communes.service.CommuneService {
  private String _endpoint = null;
  private org.antislashn.communes.service.CommuneService communeService = null;
  
  public CommuneServiceProxy() {
    _initCommuneServiceProxy();
  }
  
  public CommuneServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCommuneServiceProxy();
  }
  
  private void _initCommuneServiceProxy() {
    try {
      communeService = (new org.antislashn.communes.service.CommuneServiceServiceLocator()).getCommuneServicePort();
      if (communeService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)communeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)communeService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (communeService != null)
      ((javax.xml.rpc.Stub)communeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.antislashn.communes.service.CommuneService getCommuneService() {
    if (communeService == null)
      _initCommuneServiceProxy();
    return communeService;
  }
  
  public java.lang.String[] getAllRegions() throws java.rmi.RemoteException{
    if (communeService == null)
      _initCommuneServiceProxy();
    return communeService.getAllRegions();
  }
  
  public org.antislashn.communes.service.Commune[] getCommunesByCodePostalLike(java.lang.String arg0) throws java.rmi.RemoteException{
    if (communeService == null)
      _initCommuneServiceProxy();
    return communeService.getCommunesByCodePostalLike(arg0);
  }
  
  public java.lang.String decimalToSexagesimal(double arg0) throws java.rmi.RemoteException{
    if (communeService == null)
      _initCommuneServiceProxy();
    return communeService.decimalToSexagesimal(arg0);
  }
  
  
}