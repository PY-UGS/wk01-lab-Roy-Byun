package Week_2;
import java.util.Scanner;


public class Lab02Q1 {
    public static void main(String[] args){
        float radius = 0;
        double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        radius = input.nextFloat();

        double area = radius * radius * PI;
        System.out.print("The area for the circle of radius " + radius + " is " + area);
    }
}
