package javaSession;

public class Wallet {
private float money;
public void setMoney(float money){
	this.money=money;
}
public boolean pullOutMoney(float amount) {
	if(money >=amount) {
		money -=amount;
		return true;
	}
	return false;
}
}
