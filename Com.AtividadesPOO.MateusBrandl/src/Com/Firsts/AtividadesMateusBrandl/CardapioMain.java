package Com.Firsts.AtividadesMateusBrandl;
import java.util.Scanner;


public class CardapioMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String especificao = "Cachorro quente";
		int codigo = 5;
		double preco = 22.5;
		double precototal = 0;
		
		
		while(codigo != 0) {
		System.out.println("Temos caf�, cachorro quente e mist�o");
		System.out.println("1: Caf� 2,50 - 2: cachorro quente 7,20 - 3: mist�o 3,99");
		System.out.println("O que voc� deseja?");
		int escolha = entrada.nextInt();
		
		if(escolha == 1) {
			especificao = "caf�";
			preco = 2.50;
			precototal = preco + precototal;
		}else {
			if(escolha == 2) {
				especificao = "Cachorro Quente";
				preco = 7.20;
				precototal = preco + precototal;
			}else {
				if(escolha == 3) {
					especificao = "Mist�o";
					preco = 3.99;
					precototal = preco + precototal;
				}else {
					System.out.println("codigo errado!");
					System.out.println("Informe novamente!");
				}
			}	
		}
		
		Cardapio cardapias = new Cardapio(especificao, codigo, preco);
		System.out.println(cardapias);
		System.out.println("Informe o c�digo!");
		codigo = entrada.nextInt();
		}
		
		entrada.close();
	}

}
