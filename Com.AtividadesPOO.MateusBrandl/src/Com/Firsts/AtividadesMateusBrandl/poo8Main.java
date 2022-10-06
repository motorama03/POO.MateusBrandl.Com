package Com.Firsts.AtividadesMateusBrandl;

public class poo8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o = 2;
		
		poo08 banco = new poo08(3,"cláudio",19234,o);
		
		if(o==1) {
			System.out.println(banco.cadastro());
		}else if(o==2) {
			System.out.println(banco.alterarNome("Roberto"));
		}else if(o==3) {
			System.out.println(banco.deposito(2000));
		}else {
			System.out.println(banco.saque(500));
		}

	}

}
