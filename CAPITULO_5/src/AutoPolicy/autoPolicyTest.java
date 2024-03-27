package AutoPolicy;

public class autoPolicyTest {
	public static void main(String[] args) {
		// cria dois objetos AutoPolicy
		autoPolicy policy1 = new autoPolicy(11111111, "Toyta Camry", "NJ");
		autoPolicy policy2 = new autoPolicy(22222222, "Ford Fusion", "ME");

		// exibe se cada apólice está em um estado "sem culpa"
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}

	public static void policyInNoFaultState(autoPolicy policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State: %s %s a no-fault state%n%n", policy.getAccountNumber(),
				policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
	}
} // fim da classe autoPolicyTest
