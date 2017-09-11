package av;

import java.util.Scanner;

public class leitura {
	private Object in;

	public static double main (String[] args, leitura Scanner ) {

		 double valor;
		 int meses;
		 
		 Scanner = new leitura();
		 
		 System.out.println("Informe o valor: ");
		 valor = leitura.nextDouble();
		 System.out.println("Informe quantidade de meses: ");
		 meses = leitura.nextInt();
		 
		 
		 
		 if (meses >= 5)
			 return (valor * 0.70);
		return meses;
		 
		
	}

	

	

