package br.calculadora.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculadoraClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:9876/calc?wsdl");
	    QName qname = new QName("http://soap.calculadora.br/","CalculadoraServerImplService");
	    Service ws = Service.create(url, qname);
	    CalculadoraServer calc = ws.getPort(CalculadoraServer.class);
	 
	    System.out.println("Soma (5+1): " + calc.soma(5,1));
	    System.out.println("Subtracao (5-1): " + calc.subtracao(5,1));
	    System.out.println("Multiplicacao (5*1): " + calc.multiplicacao(5,1));
	    System.out.println("Divisao (5/1): " + calc.divisao(5,1));
	}

}
