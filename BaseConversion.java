/**
 * 
 */
package p1;

import java.util.Scanner;
/**
 * BaseConversion.
 * @author ËÎÓëçñ
 * @version 1.2
 */
public class BaseConversion {
    /**
     * heheda.
     * @param args dsadaaw
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int base;
        int base10Num;
        int maxNumber;
        int place0;
        int place1;
        int place2;
        int place3;

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Base Conversion Program");
        System.out.println();
        System.out.print("Please enter a base (2-9): ");
        base = scan.nextInt();
        maxNumber = (int) base * base * base * base - 1;
        System.out.println("The max number should be " + maxNumber);
        System.out.print("Enter a base 10 number to convert: ");
        base10Num = scan.nextInt();
        place0 = base10Num % base;
        place1 = base10Num / base % base;
        place2 = base10Num / base / base % base;
        place3 = base10Num / base / base / base % base;
        System.out.println("The answer should be " + place3 + place2 
                + place1 + place0 + " in base" + base);
        scan.close();
    }

}
