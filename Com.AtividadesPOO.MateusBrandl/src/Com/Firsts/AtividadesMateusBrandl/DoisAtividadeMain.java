package Com.Firsts.AtividadesMateusBrandl;
import java.util.Scanner;

public class DoisAtividadeMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o primeiro número");
		int num1 = entrada.nextInt();
		
		System.out.println("Informe o segundo número");
		int num2 = entrada.nextInt();
		
		DoisAtv intervas = new DoisAtv(num1, num2);
		
		intervas.setNum1(num1);
		intervas.setNum2(num2);
		
		System.out.println(intervas);
		
		entrada.close();
		
	}

}
