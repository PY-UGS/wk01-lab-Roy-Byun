package Week_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab02Q2 {
    public static void main(String[] args){
        float numList[] = new float[3];
        float sum = 0;
        float ave;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three number: ");
        for (int i = 0; i < 3; i++){
            numList[i] = input.nextFloat();
            sum += numList[i];
        }

        ave = sum / 3;

        System.out.println("The average of " + numList[0] + " " + numList[1] + " " + numList[2] + " is " + ave);

    }
}
