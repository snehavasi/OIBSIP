import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.HashMap;
public class ATM {
    public static void main(String[] args) {
        System.out.println("             Welcome to the ATM interface project\n ");
        ArrayList<Integer> listw = new ArrayList<>();
        ArrayList<Integer> listd = new ArrayList<>();
        ArrayList<Integer> listt = new ArrayList<>();
        Transaction_history th=new Transaction_history();
        Withdraw w=new Withdraw();
        Deposit d=new Deposit();
        Transfer t=new Transfer();
        Quit q=new Quit();
        boolean end=false;
        int balance=5000;
        Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
        h1.put(9654332, 1234);
        while(!end){
            int epin=1234;
            Scanner sc=new Scanner(System.in);
            System.out.print("\nEnter your account number:");
            int accountnumber=sc.nextInt();
            if(h1.containsKey(accountnumber)){
                    System.out.print("\nEnter pin number:");
                    int pin=sc.nextInt();
                    if(pin==epin){
                        int choice;
                        System.out.println("\nSelect one operation:");
                        System.out.println("Type 1-Transaction history");
                        System.out.println("Type 2-Withdraw");
                        System.out.println("Type 3-Deposit");
                        System.out.println("Type 4-Transfer");
                        System.out.println("Type 5-Quit");
                        System.out.print("\nEnter your choice:");
                        choice=sc.nextInt();
                        switch(choice){
                            case 1:th.withdraw(listw);
                                   th.deposit(listd);
                                   th.transfer(listt);
                                   System.out.println("\nThe balance is:"+balance);
                                   break;
                            case 2:
                                System.out.print("\nEnter the withdrawal amount:");
                                int amount=sc.nextInt();

                                if(w.balance_check(amount,balance)) {
                                        balance=w.withdraw(amount,balance);
                                        listw.add(amount);
                                }
                                else{
                                        System.out.println("\nInsufficient balance");
                                }

                                break;
                            case 3:System.out.print("\nEnter the amount to deposit:");
                                int cash=sc.nextInt();
                                balance=d.deposit(cash,balance);
                                listd.add(cash);
                                break;
                            case 4:System.out.print("\nEnter the amount to transfer:");
                                int pay=sc.nextInt();
                                System.out.print("\nEnter the account number:");
                                int acc=sc.nextInt();
                                balance=t.transfer(pay,balance,acc);
                                listt.add(pay);
                                break;
                            case 5:q.quit();
                            default:System.out.println("\nInvalid number!!!");
                                continue;
                        }
                    }
                    else{
                        System.out.println("\nIncorrect pin!!!");
                    }
                }
            else{
                System.out.println("\nAccount number is invalid!!!");
            }
            System.out.print("\nDo you want to do another transaction:");
            String s=sc.next();
            if(s.equals("yes"))
                end=false;
            else
                end=true;

        }
        System.out.println("\n\n       Thank you     ");



    }
}