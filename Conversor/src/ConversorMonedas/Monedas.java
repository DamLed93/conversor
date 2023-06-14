package ConversorMonedas;
import javax.swing.JOptionPane;

public class Monedas {
	
	String nombre;
	double valor;
	
	public void pesosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido * 0.0048;
		
		monedaDolar=(double) Math.round(monedaDolar * 100) /100;
		
		JOptionPane.showMessageDialog(null, "tienes "+monedaDolar+" dolares.");
	}
	
	public void pesosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido * 0.0043;
		
		monedaEuro=(double) Math.round(monedaEuro * 100) /100;
		
		JOptionPane.showMessageDialog(null, "tienes "+monedaEuro+" euros");
	}
	
	public void pesosALibra(double valorRecibido) {
		double monedaLibra = valorRecibido * 0.0038;
		
		monedaLibra=(double) Math.round(monedaLibra* 100) /100;
		
		JOptionPane.showMessageDialog(null, "tienes "+monedaLibra+" libras");
	}
	
	public void pesosAYenes(double valorRecibido) {
		double monedaYen = valorRecibido * 0.63;
		
		monedaYen=(double) Math.round(monedaYen* 100) /100;
		
		JOptionPane.showMessageDialog(null, "tienes "+ monedaYen+" yenes");
	}
	
	public void pesosAWon(double valorRecibido) {
		double monedaWon = valorRecibido * 6.29;
		
		monedaWon=(double) Math.round(monedaWon* 100) /100;
		
		JOptionPane.showMessageDialog(null,"tienes "+monedaWon+" wones");
	}
	
	
}
