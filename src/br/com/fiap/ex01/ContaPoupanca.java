package br.com.fiap.ex01;

public class ContaPoupanca {
	private Double saldo;
	private String nome;
	private String cpf;

	public ContaPoupanca(Double saldo, String nome, String cpf) {
		super();
		this.saldo = saldo;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void sacar(Double valor) throws SaldoInsuficiente {
		if ((this.saldo - valor) < 0) {
			throw new SaldoInsuficiente("Saldo insuficiente");
		}
		this.saldo -= valor;
	}

	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaPoupanca other = (ContaPoupanca) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (saldo == null) {
			if (other.saldo != null)
				return false;
		} else if (!saldo.equals(other.saldo))
			return false;
		return true;
	}
	
}
