package Automovel;

public class Main {

	public static void main(String[] args) {
		

		 Automovel hb20 = new Automovel("hb20", "passeio", 2020, 1000, 100000.2f);
			
			Automovel palio = new Automovel("elx", "14", 2021, 800, 13000.2f);
			
			hb20.add("123456789-09");
			palio.add("987654321-09");
			
			hb20.exibirProprietarios();
			palio.exibirProprietarios();
			
			hb20.add("321456798-09");
			
			hb20.exibirProprietarios();
			
			palio.add("1231546496-09");
			palio.exibirProprietarios();
			
			hb20.remove("123456789-09");
			palio.remove("987654321-09");
			
			hb20.exibirProprietarios();
			palio.exibirProprietarios();
	}

}
