package br.com.generation.Objetos;

public class Cliente {

	//Atributos --> caracteristicas --> variaveis
		String nome;
		int idade;
		double saldoDebito;
		double saldoCredito;
		
		//M�todos --> verbos --> a��es
		void pagarDebito(double valorProduto) {
			saldoDebito = saldoDebito - valorProduto;
		}
		//criei duas vari�veis iguais para caber numeros int ou doubles
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
