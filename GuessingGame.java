import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Number Guessing Game");
        System.out.print("Guess a number between(1-100) : ");
        int random =(int)(Math.random()*100+1);
        int input,count=0;
        do{
            input =sc.nextInt();
            count++;
            if (input<random) {
                System.out.println(input+ " is smaller number");
            }else if(input>random){
                System.out.println(input+ " is greater number");
            }else {
                System.out.println("Congratulation!!!");
                System.out.printf("You have successfully guessed the number in %d attampts",count);
            }

        } while (input != random);
          System.out.println("\nThanks for playing");
          System.out.println("Developed by : Sachin kumar");
        }
    }

