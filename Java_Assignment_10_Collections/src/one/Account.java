package one;

import java.util.List;
import java.util.ArrayList;

public class Account {
	
	private long id;
	private String accountType;
	
	public Account (long id, String accountType) {
		this.id = id;
		this.accountType = accountType;
	}
	
	public static List<Account> createAccounts(int numAccounts){
		List<Account> accounts = new ArrayList<>();
		
		while( numAccounts > 0) {
			Account a = new Account(1000 + numAccounts, "savings" );
			accounts.add(a);
			numAccounts--;
		}
		
		return accounts;
	}
	
	public String toString() {
		return "Account [id:" + this.id + "]";
	}

}
