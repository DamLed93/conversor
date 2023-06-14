package ConversorMonedas;
import javax.swing.JOptionPane;

public class Cambio {
	
	Monedas moneda= new Monedas();
	CambioAPesos pesos=new CambioAPesos();
	
	public void Moneda(double valorIngresado) {
		String conversiones[] = {
			"De pesos a dolares", //Pesos Argentinos
			"De pesos a Euros",
			"De pesos a Libra",
			"De pesos a Yen",
			"De pesos a Won",
			"De dolares a pesos",
			"De euros a pesos",
			"De libra a pesos",
			"De yen a pesos",
			"De won a pesos"
		};
			
			String Opciones = (JOptionPane.showInputDialog(null,"elija la moneda","Moneda",
					JOptionPane.PLAIN_MESSAGE, null, conversiones,"Selecciona")).toString();	
			
			switch (Opciones) {
			case "De pesos a dolares":
				moneda.pesosADolar(valorIngresado);
				break;
			case "De pesos a Euros":
				moneda.pesosAEuro(valorIngresado);
				break;
			case "De pesos a Libra":
				moneda.pesosALibra(valorIngresado);
				break;
			case "De pesos a Yen":
				moneda.pesosAYenes(valorIngresado);
				break;
			case "De pesos a Won":
				moneda.pesosAWon(valorIngresado);
				break;
			case "De dolares a pesos":
				moneda.pesosADolar(valorIngresado);
				break;
			case "De euros a pesos":
				moneda.pesosAEuro(valorIngresado);
				break;
			case "De libra a pesos":
				moneda.pesosALibra(valorIngresado);
				break;
			case "De yen a pesos":
				moneda.pesosAYenes(valorIngresado);
				break;
			case "De won a pesos":
				moneda.pesosAWon(valorIngresado);
				break;	
			}
		
			}
				
			
}

