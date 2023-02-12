import java.util.*;
public class Transaction_history {
    void withdraw(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.println("The amount "+list.get(i)+" is withdrawed from your account");
        }
    }
    void deposit(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.println("The amount "+list.get(i)+" is deposited to your account");
        }
    }
    void transfer(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.println("The amount "+list.get(i)+" is transfered from your account");
        }
    }
}
