package Com.Firsts.AtividadesMateusBrandl;

public class UmAtv {
	
	private String nome;
	private String sobrenome;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String toString() {
		StringBuilder saida = new StringBuilder();
		saida.append("Seu nome completo é: "+nome+" "+sobrenome);
		
		return saida.toString();
	}
	
	
	
}
