package br.com.fiap.ex01;

public class Main {

	public static void main(String[] args) throws SaldoInsuficiente {
		ContaPoupanca p = new ContaPoupanca(0d, "Teste", "12");
		p.sacar(10d);
		ContaPoupanca p1 = new ContaPoupanca(0d, "Teste1", "123");
		ContaPoupanca p2 = p1; 
		
		System.out.println(p.equals(p1));
		System.out.println(p.equals(p2));
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		
		
		
	}

}
