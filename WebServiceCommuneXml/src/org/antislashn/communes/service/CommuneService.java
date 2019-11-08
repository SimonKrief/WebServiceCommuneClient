/**
 * CommuneService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.antislashn.communes.service;

public interface CommuneService extends java.rmi.Remote {
    public java.lang.String[] getAllRegions() throws java.rmi.RemoteException;
    public org.antislashn.communes.service.Commune[] getCommunesByCodePostalLike(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String decimalToSexagesimal(double arg0) throws java.rmi.RemoteException;
}
