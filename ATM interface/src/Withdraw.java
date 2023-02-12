public class Withdraw {
    int withdraw(int amount, int balance){
        balance=balance-amount;
        System.out.println("The amount "+amount+" is withdrawed from your account");
        System.out.println("The balance is "+balance);
        return balance;
    }
    boolean balance_check(int amount,int balance){
        if(amount<balance){
            return true;
        }
        else{
            return false;
        }
    }

}
