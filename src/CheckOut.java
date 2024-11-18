import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;

        do
        {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item ($0.50 - $10.00)",0.5,10.0);
            totalCost += itemPrice;


            if (SafeInput.getYNConfirm(in, "Do you have more items to add?[Y/N]"))
            {
                System.out.println();
            }else
            {
                break;
            }
        }while (true);
        System.out.println("\n Your total cost of items: $%.2f%n" + totalCost);
    }
}