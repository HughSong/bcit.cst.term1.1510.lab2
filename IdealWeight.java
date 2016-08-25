
package p1;

import java.util.Scanner;

/**
 * IdealWeight.
 * @author ËÎÓëçñ
 * @version 1.0
 */
public class IdealWeight {
    /**
     * I will use it to fingure out people's idealweight.
     * @param args is import my literal text.
     * @throws Exception if has error
     */
    public static void main(String[] args) {
        double heightfeet;
        double heightinches;
        double idealWeight1;
        double idealWeight2;
        double height;
        final int basew = 100;
        final int basem = 106;
        final int base = 60;
        final int increase1 = 5; 
        final int increase2 = 6;
        final int convert = 12;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your heights in feet and"
                + " inches separated by a space in the next line");
        heightfeet = scan.nextInt();
        heightinches = scan.nextInt();
        System.out.println("You entered " + heightfeet + "feets" 
        + heightinches + "inches");
        height = heightfeet * convert + heightinches;
        idealWeight1 = basew + (height - base) * increase1;
        System.out.print("If you are a feimle, your ideal weight will be " + idealWeight1 + " pounds");
        System.out.println(" ,and your weight could maintain between " + (idealWeight1 * 0.85) + " to " + (idealWeight1 * 1.15));
        idealWeight2 = basem + (height - base) * increase2;
        System.out.print("If you are a male, your ideal weight will be " + idealWeight2 + " pounds");
        System.out.println(" ,and your weight could maintain between " + (idealWeight2 * 0.85) + " to " + (idealWeight2 * 1.15));
        scan.close();
    }

}
