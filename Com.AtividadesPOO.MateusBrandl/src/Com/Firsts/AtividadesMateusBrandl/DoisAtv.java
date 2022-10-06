package Com.Firsts.AtividadesMateusBrandl;

public class DoisAtv {

	private int num1;
	private int num2;
	
	public DoisAtv (int num1 ,int num2){
		this.num1 = num1;
		this.num2 = num2;
		int num3 = 0;
		if(num1 < num2){
			num3 = this.num1;
			this.num1 = num2;
			this.num2 = num3;
		}
	}
	
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public String toString() {
		StringBuilder intervalo = new StringBuilder();
	
		for(int x = num1; x < num2; x++){
			intervalo.append(x+" | ");
		}
		return intervalo.toString();
	}
	
}
