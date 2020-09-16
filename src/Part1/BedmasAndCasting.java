package Part1;
public class BedmasAndCasting {

    public static void main(String[] args) {
        int x = 22;
        int y = x * 2; // 44
        
        double z = (double)y/7;
        
        System.out.println(z);
        
        int remain = y % 7;
        System.out.format("%d mod 7 = %d", y, remain);
        
        int e,f,g;
        e=f=g=5;
        int ans = e + f * g;
        System.out.format("%d + %d * %d = %d\n", e, f, g, ans);
        
        ans = (e + f) * g;
        System.out.format("%d + %d * %d = %d\n", e, f, g, ans);
        
        ans = e + f % g;
        System.out.format("%d + %d %% %d = %d\n", e, f, g, ans);  
    }
}
