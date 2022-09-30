package com.Poo.BrandlMateus;

import java.util.Arrays;

public class ProvaObj {
	
	private int tam;
	private String[] fita;
	private String[] transcricao;
	
	public ProvaObj(int tam) {
		this.tam = tam;
		fita = new String[tam];
		transcricao = new String[tam];
	}
	
	
	public void transcricao(){
		
		
		for (int i = 0; i < fita.length; i++) {
			if(fita[i].equals("A")) {
				transcricao[i] = "U";
			}else {
				if(fita[i].equals("T")) {
					transcricao[i] = "A";
				}else {
					if(fita[i].equals("G")) {
						transcricao[i] = "C";
					}else {
						if(fita[i].equals("C")) {
							transcricao[i] = "G";
						}
					}
				}
			}
		}
	}
	
	
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}
	public String[] getFita() {
		return fita;
	}
	public void setFita(String[] fita) {
		this.fita = fita;
	}
	public String[] getTranscricao() {
		return transcricao;
	}
	public void setTranscricao(String[] transcricao) {
		this.transcricao = transcricao;
	}
	@Override
	public String toString() {
		return "ProvaObj [tam=" + tam + ", fita=" + Arrays.toString(fita) + ", transcricao="
				+ Arrays.toString(transcricao) + "]";
	}
	
	
	
}
