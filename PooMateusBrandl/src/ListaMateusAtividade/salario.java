package ListaMateusAtividade;

public class salario{

	private double num1;
	private double num2;
	
	
	public salario(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		//setNum1(num1 * num2);
		
	}
	
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		if(num1 > 0) {
			this.num1 = num1;
		}
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String Sidicas() {
		
		StringBuilder builder = new StringBuilder();
		
		double Sindicas = num2 * 0.05;
		builder.append(Sindicas);
		
		return builder.toString();
	}

	public String INSS(){
		
		StringBuilder builder = new StringBuilder();
		double inss = num2 * 0.11;
		builder.append(inss);
		
		return builder.toString();
	}
	
	public String SalBruto(){
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(num1 * num2);
		
		return builder.toString();
	}
	
	public String SalLiquido() {
		
		StringBuilder builder = new StringBuilder();
		
		double salario = num2;
		double inss = salario * 0.11;
		double sind = salario * 0.05;
		salario = salario - (inss + sind);
		builder.append(salario);
		
		return builder.toString();
	}
	
	
	
	
}
