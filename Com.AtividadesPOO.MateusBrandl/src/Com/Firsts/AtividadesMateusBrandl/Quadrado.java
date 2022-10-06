package Com.Firsts.AtividadesMateusBrandl;

public class Quadrado {

		private double comprimento;
		private double altura;
		
		public Quadrado(double comprimento, double altura) {
			this.altura = altura;
			this.comprimento = comprimento;
			
		}
		
		public double getComprimento() {
			return comprimento;
		}
		public void setComprimento(double comprimento) {
			this.comprimento = comprimento;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		//public String areaCubo(double comprimento, double altura) {
		//	StringBuilder saida = StringBuilder();
			
			
			
		//}
		
		
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Quadrado [comprimento=");
			builder.append(comprimento);
			builder.append(", altura=");
			builder.append(altura);
			builder.append("]");
			return builder.toString();
		}
		
		
}
