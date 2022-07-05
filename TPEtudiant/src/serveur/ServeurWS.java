package serveur;

import javax.xml.ws.Endpoint;

import service.EtudiantWS;

public class ServeurWS {

	public static void main(String[] args){

		String url ="http://192.168.1.14:8582/";
		Endpoint.publish(url, new EtudiantWS());

		System.out.println(url);

	}

}
