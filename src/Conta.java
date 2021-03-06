
public class Conta {

	private String numero;
	private double saldo;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void creditar (double valor) {
		saldo += valor;
	}
		
	public void debitar (double valor) {
		saldo -= valor;	
	}
	public void transferir (Conta contaDestino, double valor) {
		debitar(valor);
		contaDestino.creditar(valor);
		
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + "]";
	}	
	
	
} 


