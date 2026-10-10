import java.util.Scanner;

public class labquiz2{
    public static void main(String[]args){


        double soysauce = 0.5;
        double vinegar = 0.33;
        double kilo = 1.5;
        double result = kilo*soysauce;
        double result2 = kilo*vinegar;


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the adobo cooking show");
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("How many kilo of pork will you cook?: ");
        kilo = sc.nextDouble();


        System.out.println("The ratio of soy sauce for " + kilo  + "kg is = " + result + "cups");
        System.out.println("The ratio of vinegar for " + kilo  + "kg is = "  + result2 + "cups");


    }
}
