package br.com.generation.Objetos;

public class testaCliente {

	public static void main(String[] args) {
		
	Cliente comprador = new Cliente();
	
	comprador.nome = "Lina";
	comprador.idade = 36;
	comprador.saldoCredito = 500;
	comprador.saldoDebito = 750.90;
	
	comprador.pagarCredito(300);
	comprador.pagarDebito(500.90);
	
	System.out.println(comprador.nome);
	System.out.println("Novo Saldo Credito: " + comprador.saldoDebito);
	System.out.println();	
	System.out.println("Novo Saldo Debito: " + comprador.saldoCredito);
	System.out.println();
	}

}
