package br.com.fiap.ex01;

public class Main {

	public static void main(String[] args) {
		ContaPoupanca p = new ContaPoupanca();
		p.setNome("Teste1");
		p.setSaldo(10d);
		
		ContaPoupanca p1 = new ContaPoupanca();
		p1.setNome("Teste1");
		p1.setSaldo(20d);
		
		ContaPoupanca p2 = p1; 
		
		System.out.println(p.equals(p1));
		System.out.println(p.equals(p2));
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		
		
		
	}

}
