package account;

public class Account {
	private String name; // variavel de instancia
	private double balance; // variavel de instacia
	
	public Account(String name, double balance) {
		this.name = name;
		
		// valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance matém seu valor inicial padrão de 0.0
		if(balance > 0.0) // se o saldo for válido
			this.balance = balance;
	}
	
	// metodo que deposita (adiciona) apenas uma quantia vpálida no saldo
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) // se o deposit amount foi valide
			balance += depositAmount; // o adiciona ao saldo
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
