package bank;
import account.*;
import customer.*;

public class Bank {
	Account bankAllAccounts[]= null; 

	
public Bank() {
	this.bankAllAccounts=null;
}

public long sumAllBalances() {
	long sum=0;
	for (int i=0;i<bankAllAccounts.length;i++)
	{
		sum = (long) (sum + bankAllAccounts[i].getBalance());
	}
	return sum;
	
	
} 


}
