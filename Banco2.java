import javax.swing.*;
public class Banco2 {
	public static void main(String[] args)
	{
		double ahorroCuenta, cantTransaccion;
		int tipoTransaccion, numTransaccion = 1;
		String registro = "", continuar, inputUser;
		boolean prosegir = true;
		String msj = "Digite el tipo de transaccion\n1) Para depositar\n2) Para retirar\n3) Para salir";

		inputUser = JOptionPane.showInputDialog("Ingrese sus ahorros");
		ahorroCuenta = Double.parseDouble(inputUser);

		do{
			inputUser = JOptionPane.showInputDialog(msj);
			tipoTransaccion = Integer.parseInt(inputUser);
		}while(tipoTransaccion < 1 || tipoTransaccion > 3);

		while(ahorroCuenta >= 5000 && tipoTransaccion != 3 && prosegir == true)
		{
			registro = registro + "\nNumero de transaccion: " + numTransaccion + "\nMonto antes de la transaccion: ¢" + ahorroCuenta;

			inputUser = JOptionPane.showInputDialog("De cuanto va a ser la transaccion");
			cantTransaccion = Double.parseDouble(inputUser);

			switch(tipoTransaccion)
			{
				case 1: 
				ahorroCuenta = ahorroCuenta + cantTransaccion;
				break;

				case 2:
				ahorroCuenta = ahorroCuenta - cantTransaccion;
				break;
			}

			System.out.println("Usted cuenta con ¢" + ahorroCuenta);

			registro = registro + "\nLa transaccion fue de: ¢" + cantTransaccion + "\nDespues de esta transaccion quedaron: ¢" + ahorroCuenta + "\n-------------------------------------";

			numTransaccion = numTransaccion + 1;

			if(ahorroCuenta >= 5000)
			{
				do{
					inputUser = JOptionPane.showInputDialog(msj);
					tipoTransaccion = Integer.parseInt(inputUser);
				}while(tipoTransaccion < 1 || tipoTransaccion > 3);
			}else{
				prosegir = false;
			}
		}
		System.out.println(registro);
	}
}