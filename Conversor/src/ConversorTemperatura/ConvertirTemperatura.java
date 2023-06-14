package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public double celsiusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round( farenheit*100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " grados Celsius son" + farenheit +" grados Fareheit");
		return farenheit;
	}
	
	public void celsiusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round( kelvin*100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " grados Celsius son" + kelvin+" grados Kelvin");
	}
	
	public void farenheitACelsius(double valor) {
		double celsius = (valor-32) / 1.8 ;
		celsius = (double) Math.round( celsius*100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " grados Farenheit son" + celsius+" grados celsius");
	}
	
	public double kelvinACelsius(double valor) {
		double celsius = valor - 273.15;
		celsius = (double) Math.round( celsius*100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " grados Kelvin son" + celsius+" grados Celsius");
		return celsius;
	}
	
	public void kelvinAFareheit(double valor) {
		double kelvinfarenheit = kelvinACelsius(valor);
		kelvinfarenheit = celsiusAFarenheit(valor);
		kelvinfarenheit = (double) Math.round( kelvinfarenheit*100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " grados celsius son" + kelvinfarenheit +" grados Fareheit");
		
	}
	
}
