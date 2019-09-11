package br.calculadora.soap;
 
 
import javax.xml.ws.Endpoint;
 
public class CalculadoraServerPublisher {
 
  public static void main(String[] args)
  {
	  System.out.println("Iniciando a publicação do WebService Calculadora.");
    Endpoint.publish("http://127.0.0.1:9876/calc", new CalculadoraServerImpl());
    System.out.println("Calculadora publicada!");
  }
}