package com.Poo.BrandlMateus;
import java.util.Scanner;

public class ProvaMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da fita");
		int tamanho = entrada.nextInt();
		
		entrada.nextLine(); // LIMPEZA DO BUFFER, EVITA PAU NO VETOR
		
		//ProvaObj OBJ = new ProvaObj(tamanho);
		
		String[] fita = new String[tamanho];
		//String[] transcricao = new String[tamanho];
		
			for(int x = 0; x < fita.length; x++) {
				boolean pas = true;
				do {
					if(pas == false) {
						System.out.println("Valor inválido!!!");
					}
					System.out.print("Informe RNA A, T, C ou G");
					fita[x] = String.valueOf(entrada.nextLine().charAt(0)).toUpperCase();
					pas = false;
				}while(!fita[x].equals("A") && !fita[x].equals("T") && !fita[x].equals("C") && !fita[x].equals("G"));
	
				//System.out.println(OBJ.getFita().length);
			}
		
		  
		
		entrada.close();
	}

}
