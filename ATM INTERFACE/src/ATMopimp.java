import java.util.*;

public class ATMopimp implements ATMop {

	ATM atm = new ATM();
	Map<Double, String> transhis = new HashMap<>();

	@Override
	public void history() {
		// TODO Auto-generated method stub
	for(	Map.Entry<Double,String> m:transhis.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());
	}

	}

	@Override
	public void withdraw(double withdraw) {
		// TODO Auto-generated method stub
		if (withdraw <= atm.getBalance()) {

			System.out.println("please collect Your cash");
			atm.setBalance(atm.getBalance() - withdraw);
			transhis.put(withdraw, "--WITHDRAWN--");
			balance();
		}

		else {
			System.out.println(" WARNING---INSUFFICIENT BALANCE!!!");
		}
	}

	@Override
	public void deposit(double deposit) {
		// TODO Auto-generated method stub
		System.out.println("\nRs " + deposit + "Deposited Successfully\n");
		atm.setBalance(atm.getBalance() + deposit);
		transhis.put(deposit, "--DEPOSITED--");
		balance();
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Availbale balance is:Rs " + atm.getBalance());
	}

}
