/*
   Name: Therese Andrei C. Arcenal
   Cr & Sec : BSIT 2B
   Activity: ActivityThreeArcenal
*/


import java.util.Scanner;

public class ActivityThreeArcenal {
    public static void main(String[] args) {
        // List of Menu Items
        double c1Price = 100.00;
        double c2Price = 150.00;
        double c3Price = 200.00;
        double r1Price = 35.00;
        double r2Price = 50.00;

        // Conversion rate from PHP to USD
        double conversionRate = 0.0176;

        // Initialize variables to keep track of total price and quantity
        double totalPrice = 0.0;
        int totalQuantity = 0;
        String orderCode = "";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. C1 - " + c1Price);
            System.out.println("2. C2 - " + c2Price);
            System.out.println("3. C3 - " + c3Price);
            System.out.println("4. Add ONS - R1 - " + r1Price);
            System.out.println("5. Add ONS - R2 - " + r2Price);
            System.out.println("6. Exit");

            System.out.print("Enter the Order Code: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    double itemPrice = 0.0;

                    // Determine the item price based on the choice
                    switch (choice) {
                        case 1:
                            itemPrice = c1Price;
                            orderCode = "C1";
                            break;
                        case 2:
                            itemPrice = c2Price;
                            orderCode = "C2";
                            break;
                        case 3:
                            itemPrice = c3Price;
                            orderCode = "C3";
                            break;
                        case 4:
                            itemPrice = r1Price;
                            orderCode = "R1";
                            break;
                        case 5:
                            itemPrice = r2Price;
                            orderCode = "R2";
                            break;
                    }

                    // Calculate total price and quantity
                    totalPrice += quantity * itemPrice;
                    totalQuantity += quantity;

                    System.out.println("Added " + quantity + " " + orderCode + " to your order.");
                    break;

                case 6:
                    // Quit the program
                    double phpToUsd = totalPrice * conversionRate;
                    System.out.println("Quantity: " + totalQuantity);
                     System.out.println("Order Code: " + orderCode);
                    System.out.println("Total Price in PHP: " + totalPrice);
                    System.out.println("Total Price in USD: $" + phpToUsd);
                    System.out.println("We appreciate your Food Order Have A Good Day!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
