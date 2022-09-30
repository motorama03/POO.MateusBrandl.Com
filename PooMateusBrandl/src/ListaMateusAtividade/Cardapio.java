package ListaMateusAtividade;

public class Cardapio {

	private String especificao;
	private int codigo;
	private double preco;
	
	public Cardapio(String especificacao, int codigo, double preco){
		this.codigo = codigo;
		this.especificao = especificacao;
		this.preco = preco;
	}
	
	public String getEspecificao() {
		return especificao;
	}
	public void setEspecificao(String especificao) {
		this.especificao = especificao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cardapio [Lanche =");
		builder.append(especificao);
		builder.append(", Codigo =");
		builder.append(codigo);
		builder.append(", Total a pagar=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
	
	
}
