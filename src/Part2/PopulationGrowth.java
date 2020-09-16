package Part2;

import java.text.NumberFormat;

public class PopulationGrowth {

    public static void main(String[] args) {
        int pop = 160000;
        int growth;
        NumberFormat nf;
        nf = NumberFormat.getNumberInstance();
        
        System.out.format("%5s", "YEAR");
        System.out.format("%20s", "POPULATION");
        System.out.format("%15s", "GROWTH");
        System.out.format("%20s\n", "NEW POPULATION");
           
        System.out.format("%5s", "====");
        System.out.format("%20s", "==========");
        System.out.format("%15s", "======");
        System.out.format("%20s\n", "==============");
        
        for (int year = 2020; year < 2129; year+=10) {
            System.out.format("%5d", year);
            System.out.format("%20s", nf.format(pop));
            growth = (int)(0.6 * pop);
            System.out.format("%15s", nf.format(growth));
            pop += growth;
            System.out.format("%20s\n", nf.format(pop));
        }
    }
}
