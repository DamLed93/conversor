
import javax.swing.JOptionPane;

import ConversorMonedas.Cambio;


import ConversorTemperatura.Temperatura;

public class MenuPrincipal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean start=true;
		Cambio cambio=new Cambio();
		Temperatura temp=new Temperatura();
		
		while (start) {
			String menu[] = {"monedas","temperaturas"};
			String Menu = (JOptionPane.showInputDialog (null, "Selecciona lo que deseas convertir","Conversor",
					JOptionPane.PLAIN_MESSAGE, null, menu,"Seleccion")).toString();
			
			switch(Menu) {
				case "monedas":
					String input = (JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero a convertir"));
				    
					if (validarNumero(input) == true) {
	                    double valorIngresado = Double.parseDouble(input);
	                    cambio.Moneda(valorIngresado);

	                    int respuesta = JOptionPane.showConfirmDialog(null,
	                            "Deseas seguir?");

	                    if (respuesta == JOptionPane.YES_OPTION) {
	                        System.out.println("Selecciona tu alternativa");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Programa finalizado");
	                        start = false;
	                    }
	                }
	                break;
					

				case "temperaturas":
					String input2 = (JOptionPane.showInputDialog(null,"Ingrese el valor a convertir"));
					if (validarNumero(input2) == true) {
						double valorIngresado = Double.parseDouble(input2);
						temp.ConvertirTemperatura(valorIngresado);
						
						int respuesta = 0;
						respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
						if((respuesta == 0) && (validarNumero(input2)==true)) {
							}
						else {
							JOptionPane.showMessageDialog(null, "Hasta la proxima!");
						}
						}
			
						else {
							JOptionPane.showMessageDialog(null, "El valor no es válido");
						}
						break;
						}
					}
	}
	
		
		public static boolean validarNumero(String input) {
			try {
				double x = Double.parseDouble(input);
				if(x >= 0 || x < 0);
					return true;
					
			} catch (NumberFormatException e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			}
		}
		
	}



