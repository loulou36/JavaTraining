package bankingApplication;
import account.Account;
import bank.*;
import customer.*;

public class bankingApplication {

public static void main(String[] args) {
	System.out.println("banking app start");
	System.out.println("create new bank");
	Bank bnp = new Bank();
	System.out.println("create new account");
	Account account1 =new Account();
	System.out.println("create new customer");
	Customer customer1 = new Customer();
	
	account1.openAccount();
	
	
	
}
}
