package ListaMateusAtividade;
import java.util.Scanner;

public class QuatroAtividadeMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas horas você trabalha por dia??");
		double n1 = entrada.nextDouble();
		
		System.out.println("Quanto vale sua hora de servico??");
		double n2 = entrada.nextDouble();
		
		salario Sal = new salario(n1, n2);
		
		System.out.println(Sal.SalBruto());
		System.out.println("Valor de INSS por/h : "+Sal.INSS());
		System.out.println("Valor do sindicato por/h : "+Sal.Sidicas());
		System.out.println("Salário líquido por/h "+Sal.SalLiquido());
		
		entrada.close();
	}

}
