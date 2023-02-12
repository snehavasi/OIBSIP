public class Transfer {
    int transfer(int amount,int balance,int acc){
        balance-=amount;
        System.out.println("The amount "+amount+" is transferred to account number "+acc);
        System.out.println("The balance is:"+balance);
        return balance;
    }
}
