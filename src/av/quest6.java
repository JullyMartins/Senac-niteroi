package av;
import java.util.Scanner;
public class quest6 {
	public static void main (String[] args ) {

	 double valor;
	 int meses;
	 
	 Scanner = new leitura(Scanner.in);
	 
	 System.out.println("Informe o valor: ");
	 valor = leitura.nextDouble();
	 System.out.println("Informe quantidade de meses: ");
	 meses = leitura.nextInt();
	 
	 leitura.close();
	 
	 if (meses >= 5)
		 return (valor * 0.70);
	 
	
}
}
