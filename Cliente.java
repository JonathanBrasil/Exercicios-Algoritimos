package br.com.generation.Objetos;

public class Cliente {

	//Atributos --> caracteristicas --> variaveis
		String nome;
		int idade;
		double saldoDebito;
		double saldoCredito;
		
		//Métodos --> verbos --> ações
		void pagarDebito(double valorProduto) {
			saldoDebito = saldoDebito - valorProduto;
		}
		//criei duas variáveis iguais para caber numeros int ou doubles
		void pagarDebito(int valorProduto) {
			saldoDebito = saldoDebito - valorProduto;
		}
		
		void pagarCredito(int valorProduto) {
			saldoCredito = saldoCredito - valorProduto;
	
		}
		
		void pagarCredito(double valorProduto) {
			saldoCredito = saldoCredito - valorProduto;
	
		}
}
