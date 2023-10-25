import java.util.Scanner;

public class routejava{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("=== WELCOME!===");
         System.out.println("We will guide you to the Best way Route to Moalboal.");

        double distance = 0;

        if (isRouteObstructed("Route via Barili", scanner)) {
            if (isRouteObstructed("Via Dumanjug (Route 4.2.1)", scanner)) {
                distance = 92.3;
                routeInfo("Recommended Route 3: via Argao");
            } else {
                distance = 94.0;
                routeInfo("Recommended Route 2: via Sibonga");
            }
        } else {
            distance = 84.9;
            routeInfo("Recommended Route");
        }

        calculateETA(distance, scanner);
        scanner.close();
    }

    static boolean isRouteObstructed(String routeName, Scanner scanner) {
        System.out.print("Is " + routeName + " obstructed? [Y/N]: ");
        char ans = Character.toLowerCase(scanner.next().charAt(0));
        return ans == 'y';
    }

    static void routeInfo(String routeName) {
        System.out.println(routeName);
        System.out.println("Cebu City... (Start)");
        System.out.println("Minglanilla... (Route 1)");
        System.out.println("San Fernando... (Route 2)");
        System.out.println("Carcar City... (Route 3)");
        if (routeName.contains("Sibonga") || routeName.contains("Argao")) {
            System.out.println("Sibonga... (Route 4.2)");
        }
        System.out.println("Dumanjug... (Route 4.2.1)");
        System.out.println("Alcantara... (Route 4.2.2)");
        System.out.println("Moalboal... (END)");
    }

    static void calculateETA(double distance, Scanner scanner) {
        System.out.print("Enter your speed: ");
        int speed = scanner.nextInt();
        double estimatedHrs = distance / speed;
        int hours = (int) estimatedHrs;
        int minutes = (int) ((estimatedHrs - hours) * 60);
        System.out.println("Distance: " + distance + "km");
        System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
    }
}
