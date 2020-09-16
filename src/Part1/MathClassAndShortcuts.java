package Part1;
/*
        Math class is part of core Java --> no import needed.
        All methods of Math class are static.
        Thus, we do not need to make a Math object --> Don't do this: Math m = new Math();
        All Math class can be run directly from Math class.

        Math.pow(base, exponent) --> Power to.
        Math.sqrt(n) --> Squareroot.
        Math.round(n) // Round a number.
        Math.max/Math.min(n, m) // Which is higher/which is lower?
        Math.random() // Random digit between 0 to 1.
        - int rnum (int)(Math.random() * 10 + 1); // Range.
 */
public class MathClassAndShortcuts {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(Math.pow(x, 3)); // 10e3
        System.out.println(Math.sqrt(x)); // sqrt(x)
        double y = 8.9876;
        System.out.println(Math.round(y)); // Round
        System.out.println(Math.max(x, y)); // Which is higher..?
        
        int roll = (int)(Math.random() * 6 + 1); // range, starting number
        System.out.println(roll);
        
        System.out.println("=====");
        
        int a = 10;
        a += 10;
        int b = a;
        b++;
        a *= 2;
        int c = b++;
        int d = ++b;
        
    }
}
