
public class UIBMain {
	public static void main (String args[] ) {
		
	Cliente c1 = new Cliente ();
	Cliente c2 = new Cliente ();
	
	Conta conta1 = new Conta ();
	Conta conta2 = new Conta ();
	
	conta1.setCliente(c1);
	conta2.setCliente(c2);
	
	c1.setNome("andre");
	c1.setCpf("123");
	
	c2.setNome("arthur");
	c2.setCpf("12334");
	
	conta1.setSaldo(200);
	conta2.setSaldo(100);
	
	conta1.setNumero("56789");
	conta2.setNumero("12345");
	
	conta1.debitar(100);
	conta1.creditar(20);	
	conta2.transferir(conta1, 50);
	
	
	System.out.println(conta1.getCliente());
	
	
	
	
	}
}
