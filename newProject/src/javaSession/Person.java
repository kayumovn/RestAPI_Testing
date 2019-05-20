package javaSession;

public class Person {

	public static void main(String[] args) {
		Wallet wallet = new Wallet();
		System.out.println("Putting $500 in the wallet\n");
        wallet.setMoney(500);
        System.out.println("Pulling out $100....");
        boolean isMoneyInWallet=wallet.pullOutMoney(100);
        if(isMoneyInWallet) {
        	System.out.println("Got it!");
        }else {
        	System.out.println("Nope , not enough money");	
        	}
        System.out.println("\nPulling out $300...");
        isMoneyInWallet = wallet.pullOutMoney(300);
        if(isMoneyInWallet) {
        	System.out.println("Got it!");
        }
        else {
        	System.out.println("Nope, not enough money");
        }
        System.out.println("\nPulling out $200....");
        isMoneyInWallet = wallet.pullOutMoney(200);
        if(isMoneyInWallet) {
        	System.out.println("Got it!");
        }
        else {
        	System.out.println("Nope, not enough money");
        }
	}

}
