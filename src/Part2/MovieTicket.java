package Part2;

import java.util.Scanner;

public class MovieTicket {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String day;
        int age;
        double price;
        boolean ageok;

        while (true) {
            System.out.print("Enter day code: \"m\"-Matinee, \"t\"-Tuesday \"o\"-Other: ");
            day = s.next().toLowerCase();
            if("o".equals(day) || "m".equals(day) || "t".equals(day)) break;
            System.out.println("Error, must be o, t, or m. Please try again.\n");
        }
        switch (day) {
            case "m":
                price = 5;
                break;
            case "t":
                price = 4;
                break;
            default:
                do{
                    System.out.println("Enter age from 1 to 99.");
                    age = s.nextInt();
                }while(age < 1 || age > 99);
                price = age <18? 8 : 10;
                break;
        }
        
        System.out.println("Price is: " + price);
    }    
}
