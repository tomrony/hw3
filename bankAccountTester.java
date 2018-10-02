package hw3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class bankAccountTester {
	public static void main(String args[])
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		for(int i = 0; i < 6; i++)
		{
			Random rand = new Random();
			int n = rand.nextInt(100000)+1500;
			BankAccount accounti = new BankAccount(i,n);
			accounts.add(accounti);
			
		}
		Collections.sort(accounts);
		for(BankAccount a: accounts)
		{
			System.out.println(a);
		}
	}

}
