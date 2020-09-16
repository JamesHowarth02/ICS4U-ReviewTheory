package Part2;
import java.util.Scanner;

public class IfReview {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mynumber, randomnumber;
        
        System.out.print("Enter a number --> ");
        mynumber = s.nextInt();
        
        if(mynumber < 7) {
            System.out.println("Number is too low, adding one.");
            mynumber = mynumber + 1;
        }else if(mynumber > 7) {
            System.out.println("Number is too high, subtracting one.");
        }else{
            System.out.println("Number is seven, it is just right.");
        }
        
        System.out.format("Number is now %d\n", mynumber);
        randomnumber = (int)(Math.random() * 10 + 1);
        System.out.format("Computer number is %d\n", randomnumber);
        
        int higher;
        if(mynumber > randomnumber) higher = mynumber;
        else higher = randomnumber;
        
        System.out.format("The higher number is %d\n", higher);
        
        higher = Math.max(mynumber, randomnumber);
        
        higher = randomnumber > mynumber? randomnumber : mynumber;
        // - pick this is true : pick this if false
    }  
}
