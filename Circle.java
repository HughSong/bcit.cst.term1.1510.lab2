/**
 * 
 */
package p1;

import java.util.Scanner;

/**
 * @author ËÎÓëçñ
 *
 */
public class Circle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final double PI = 3.14159;
        int radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter two value of radius");
        radius= scan.nextInt();
        double area1 =PI * radius * radius;
        System.out.println("The area of a circle with radius "+ radius +" is "+area1);
              
        double circumference1 = 2 * PI * radius;
        System.out.println("The circumference of a circle "
                + "with radius " + radius +
                " is " + circumference1);
        radius= scan.nextInt();
        double area2 =PI * radius * radius;
        System.out.println("The area of a circle with radius "+ radius +" is "+area2);
        double circumference2 = 2 * PI * radius;
        System.out.println("The circumference of a circle with radius " + radius +
                " is " + circumference2);
        double time1 = area2 / area1;
        System.out.println("The area2 is "+ time1 +" times of the area1");
        double time2 = circumference2 / circumference1;
        System.out.println("The circuference2 is " + time2 +" times of the circuference1");
        
    }

}
