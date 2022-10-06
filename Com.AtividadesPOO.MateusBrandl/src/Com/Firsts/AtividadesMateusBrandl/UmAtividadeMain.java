package Com.Firsts.AtividadesMateusBrandl;

import java.util.Scanner;

public class UmAtividadeMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		UmAtv ent = new UmAtv();
		
		System.out.println("Como você se chama?");
		String nome = entrada.nextLine();
		
		System.out.println("E seu sobrenome, qual é??");
		String sobrenome = entrada.nextLine();
		
		ent.setNome(nome);
		ent.setSobrenome(sobrenome);
		
		System.out.println(ent);
		
		entrada.close();
		
	}

}
