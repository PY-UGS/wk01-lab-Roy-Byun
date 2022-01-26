package Week_1;

public class Lab1Q3 {
    public static void main(String arg[])
    {
        String module = "CSC1009";
        switch (module)
        {
            case "CSC1006":
            System.out.println("Mathematics II");
            break;

            case "CSC1007":
            System.out.println("Operating System");
            break;

            case "CSC1008":
            System.out.println("Data Structures and Algorithms");
            break;

            case "CSC1009":
            System.out.println("Object-OrSiented Programming");
            break;

            case "CSC1010":
            System.out.println("Computer Networks");
            break;
        }
        System.out.println("After switch");
    }
}
