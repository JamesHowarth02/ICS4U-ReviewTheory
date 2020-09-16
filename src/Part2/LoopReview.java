package Part2;

public class LoopReview {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i is now " + i);
        }
        
        for (double i = 20; i >= 10; i-=0.5) {
            String weather = i >= 15? "warm" : "cold";
            System.out.format("The tempature is a %s %.2f\n", weather, i);
        }

        int tries = 0;
        int rnum = 0;
        
        System.out.println("\nGAME 1\n==========\n");
        
        do{
            rnum = (int)(Math.random() * 20 + 1);
            tries ++;
            System.out.format("On try %d a %d was chosen\n", tries, rnum);
        }while(rnum !=7);
            System.out.format("A 7 was chosen after %d tries.\n", rnum);
        
        tries = 0;
        rnum = 0;
            
        System.out.println("\nGAME 2\n==========\n");
        
        while(rnum != 7){
            rnum = (int)(Math.random() * 20 + 1);
            tries ++;
            System.out.format("On try %d a %d was chosen\n", tries, rnum);
        };
        System.out.format("A 7 was chosen after %d tries.\n", rnum);
    }
    
}
