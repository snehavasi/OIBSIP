public class Deposit {
    int deposit(int amount, int balance){
        balance+=amount;
        System.out.println("The amount "+amount+" is deposited to your account");
        System.out.println("The balance is "+balance);
        return balance;
    }
}

