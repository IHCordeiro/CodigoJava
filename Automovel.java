package Automovel;

import java.util.*;

public class Automovel {
	
	String marca;
	String modelo;
	int ano;
	int km;
	float valor;
	
	private List<String> lista = new ArrayList<String>();
	
	public void add(String cpf){
		lista.add(cpf);
	}

	public void remove(String cpf) {
		lista.remove(cpf);
	}
	
	public void exibirProprietarios() {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(marca);
			System.out.println(lista);
		}
	}
	
	public Automovel(String marca, String modelo, int ano, int km, float valor) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.km = km;
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Automovel [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", km=" + km + ", valor=" + valor
				+ "]";
	}
	
}