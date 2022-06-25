package java.core;

abstract class Bank{
	public Bank() {
		System.out.println("Rate of Interested Applying...");
	}
	abstract int getRateOfInterest();
	void exceptionRate() {
		System.out.println("RBI must be takecare of All Bank Interest Rate");
	}
}

class SBI extends Bank{

	@Override
	int getRateOfInterest() {
		return 6;		
	}	
}
class PNB extends Bank{

	@Override
	int getRateOfInterest() {
		return 8;
	}
}

public class TestBank {
	
	public static void main(String[] args) {
		Bank bank;
		bank = new SBI();
		System.out.println("Rate of Interest for SBI : "+bank.getRateOfInterest());
		System.out.println("----------------------------------------------------");
		bank = new PNB();
		System.out.println("Rate of Interest for PNB : "+bank.getRateOfInterest());
		System.out.println("----------------------------------------------------");
		bank.exceptionRate();
		System.out.println("----------------------------------------------------");
	}
}
