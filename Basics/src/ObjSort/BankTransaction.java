package ObjSort;

import java.util.List;
import java.util.Vector;

public class BankTransaction {
	
	public static void main (String arg[]){
		
		List<AccountDetails> l1 = new Vector<>();
		l1.add(new AccountDetails(1,"Murthy",1000));
		l1.add(new AccountDetails(2,"Viswa",2000));
		l1.add(new AccountDetails(3,"veera",3000));
		l1.add(new AccountDetails(4,"Venkata",5000));
		
		
	//	addAccount (11);
		
		deposit( 2, l1, 500);
		deposit( 4, l1, 1000);
		
		withDraw( 2, l1, 500);
		withDraw( 4, l1, 500);
		int sum =0;
		for(AccountDetails ac : l1){
			//System.out.println(ac.getAcctNum());
			sum = sum + ac.getAcctBalance();
		}
		System.out.println("Sum of Balace "+ sum);
	}
	
	public static void  addAccount(){
		System.out.println("add");
		//l1.add(new AccountDetails(4,"Venkata",5000));
	}
	
	public static void deposit(int acctNumber, List<AccountDetails> l1, int depAmt){
		int temp=0;
		System.out.println("Deposit");
		for(AccountDetails ac : l1){
			
			if(ac.getAcctNum() == acctNumber){
			//	l1.add(new AccountDetails(1,"Murthy",1000));
				temp = ac.getAcctBalance() + depAmt;
				System.out.println("Account Number:"+ac.acctNum+" Acct Name:"+ac.getName()+" Sum :"+temp);
				//l1.add(new AccountDetails(1,"Murthy",temp));
				//l1.get(ac.acctNum).set(setAcctBalance(temp));
			}
		}
	}
	
	public static void withDraw(int acctNumber, List<AccountDetails> l1, int withAmt){
		int temp=0;
		System.out.println("Withdraw");
		for(AccountDetails ac : l1){
			
			if(ac.getAcctNum() == acctNumber){
				temp = ac.getAcctBalance() - withAmt;
				System.out.println("Account Number:"+ac.acctNum+" Acct Name:"+ac.getName()+" Sum :"+temp);
			}
		}
	}
}


class AccountDetails{
	
	int acctNum;
	String name;
	int acctBalance;
	
	public AccountDetails(int acctNum, String name, int acctBalance) {
		super();
		this.acctNum = acctNum;
		this.name = name;
		this.acctBalance = acctBalance;
	}
	
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(int acctBalance) {
		this.acctBalance = acctBalance;
	}
	
	
	
}