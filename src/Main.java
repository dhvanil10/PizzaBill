import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("WelCome to MyPizza Shop");
        System.out.println("Veg(true or False)");
        Boolean Veg = scan.nextBoolean();
        System.out.println("What Would You Like to Order \n Enter the Number \n 1 for DeluxePizza \n 2 for RegularPizza");
        int n = scan.nextInt();
        if (n == 1) {
            DeluxPizza p1 = new DeluxPizza(Veg);
            System.out.println("Would You Like to Takeaway or Dine In 1.TakeWay and 2.DineIn");
            int n3 = scan.nextInt();
            if (n3 == 1) {
                p1.Bag();
            }
            System.out.println("Your Bill");
            p1.GetBill();
        }
        else if (n == 2) {
            Pizza p1 = new Pizza(Veg);
            System.out.println("Would You Like to Add Extra Cheese 1. Yes or 2. No ");
            int n1 = scan.nextInt();
            if (n1 == 1) {
                p1.addExtraCheese();
            }
            System.out.println("Would You Like to Add Extra Topping 1. Yes or 2. No ");
            int n2 = scan.nextInt();
            if (n2 == 1) {
                p1.addExtraTopping();
            }
            System.out.println("Would You Like to Takeaway or Dine In 1.TakeWay and 2.DineIn");
            int n3 = scan.nextInt();
            if (n3 == 1) {
                p1.Bag();
            }
            System.out.println("Your Bill");
            p1.GetBill();
        }

    }




}