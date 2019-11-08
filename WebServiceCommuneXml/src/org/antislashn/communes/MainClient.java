package org.antislashn.communes;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.antislashn.communes.service.Commune;
import org.antislashn.communes.service.CommuneService;
import org.antislashn.communes.service.CommuneServiceServiceLocator;

class MainClient {

	public static void main(String[] args) throws ServiceException, RemoteException {
		CommuneService service = new CommuneServiceServiceLocator().getCommuneServicePort();
		String[] regions = service.getAllRegions();
		for (String r : regions) {
			System.out.println(r);
		}
		Commune[] commune = service.getCommunesByCodePostalLike("972");
		for (Commune c : commune) {
			System.out.println(service.decimalToSexagesimal(c.getGpsLatitude()) +" "+c.getCodePostal());
		}
		
		
	}
}
