
import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int score=0;
        char choice='Y';
        System.out.println("***** GUESS THE NUMBER *****");
        System.out.println("          Welcome!         \n");
        System.out.println("Rules of the game:\n1.You have 3 turns to guess the number\n2.Score is given based on the attempt you guess the number\n");
        while(choice=='Y' || choice=='y'){
            System.out.println("\nChoose difficulty level:");
            System.out.println("Select 1-Easy(0-10)");
            System.out.println("Select 2-Medium(0-100)");
            System.out.println("Select 3-Hard(0-1000)");
            System.out.println("Select 4-Exit");
            System.out.println();
            System.out.print("Enter your choice:");
            int a=1;
            int d=sc.nextInt();
            switch(d){
                case 1:a=11;
                    break;
                case 2:a=101;
                    break;
                case 3:a=1001;
                    break;
                case 4:System.exit(0);
                default:System.out.println("Invalid number!!!");
                        continue;
            }
            int r=rand.nextInt(a);
            for(int i=0;i<3;i++){
                System.out.println("You have "+(3-i)+" turns left");
                System.out.print("Pick a number between 0 and "+(a-1)+":");
                int n=sc.nextInt();
                System.out.println();
                if(i<2) {
                    if (n < (a - 1)) {
                        if (r == n) {
                            score = 100 - (25 * i);
                            System.out.println("Hurrah!!! You won");
                            System.out.println("It took " + (i + 1) + " turns to guess my number,which is " + r);
                            System.out.println();
                            break;
                        } else if (r > n) {
                            System.out.println("Your number " + n + " is too low\n");
                        } else {
                            System.out.println("Your number " + n + " is too high\n");
                        }
                    }
                    else{
                        System.out.println("The number entered is out of range\n");
                    }
                }
                else{
                    if(r==n){
                        score=100-(25*i);
                        System.out.println("You won");
                        System.out.println("It took "+(i+1)+" turns to guess my number,which is "+r);
                        break;
                    }
                    else{
                        score=0;
                        System.out.println("No turns left");
                        System.out.println("You lost!! Better luck next time....\n");
                        System.out.println("My number is:"+r);
                    }
                }
            }
            System.out.print("Your score:");
            System.out.println(score);
            System.out.print("\nDo you want to play another game(Y/N):");
            choice=sc.next().charAt(0);
            System.out.println();
        }
    }
}