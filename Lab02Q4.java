package Week_2;

import java.util.Scanner;

public class Lab02Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year;
        int zod = 0;

        System.out.print("Enter a year: ");
        year = input.nextInt();

        zod = year % 12;

        switch (zod)
        {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
        }
    }
}
