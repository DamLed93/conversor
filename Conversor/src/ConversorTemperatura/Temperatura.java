package ConversorTemperatura;

import javax.swing.JOptionPane;

public class Temperatura {

	ConvertirTemperatura temp = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double valor) {
		String temperatura []= {
				"Grados Celsius a Farenheit",
				"Grados Celsius a Kelvin",
				"Grados Farenheit a grados Celsius",
				"Grados Kelvin a grados Celsius",
				"Grados Kelvin a grados Farenheit"
		};
		
		String opcion = (JOptionPane.showInputDialog(null,"¿A que temperatura quiere convertir?","Temperatura",
				JOptionPane.PLAIN_MESSAGE,null, temperatura, "Selecciona")).toString();
		
		switch (opcion) {
		
			case "Grados Celsius a Farenheit":
			temp.celsiusAFarenheit(valor);
			break;
		
			case "Grados Celsius a Kelvin":
			temp.celsiusAKelvin(valor);
			break;
			
			case "Grados Farenheit a grados Celsius":
			temp.farenheitACelsius(valor);
			break;
			
			case "Grados Kelvin a grados Celsius":
			temp.kelvinACelsius(valor);
			break;
			
			case "Grados Kelvin a grados Farenheit":
			temp.kelvinAFareheit(valor);
			break;
		}
	}
}
