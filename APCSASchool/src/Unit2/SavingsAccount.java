package Unit2;

public class SavingsAccount {
private double balance;
private double interest;

public SavingsAccount(double b, double i){
	balance = b;
	interest = i;
}

public void addInterest(){
	balance = balance * (1 + interest);
}

}
