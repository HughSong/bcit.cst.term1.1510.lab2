/**
 * 
 */
package p1;

import java.util.Scanner;

/**
 * @author ËÎÓëçñ
 *
 */
public class average {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter three intergers and"+"I will conpute their average");
        val1= scan.nextInt();
        val2= scan.nextInt();
        val3= scan.nextInt();
        average = (val1 + val2 + val3)/3;
        System.out.println("The average of these three intergers is "+average);
        
        
        
        
    }

}
