/*
   Name:Therese Andrei C. Arcenal
   Crs & Sec: BSIT2B
   Date: Oct 9, 2023
   Activity: RouteActivityArcenal
   
*/
import java.util.Scanner;

public class RouteActivityArcenal {
    public static void main(String[] args) {
        Route route = new Route();
        int speed;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== WELCOME!===");
        System.out.println("We will guide you to the Best way Route to Moalboal.");
        route.defRoute();
        System.out.print("Is Route via Barili obstructed? [Y/N]: ");
        char ans = scanner.next().charAt(0);
        ans = Character.toLowerCase(ans);

        if (ans == 'y') {
            System.out.print("Is Via Dumanjug (Route 4.2.1) obstructed? [Y/N]: ");
            char ans2 = Character.toLowerCase(scanner.next().charAt(0));

            if (ans2 == 'y') {
                route.route3();
                System.out.print("Enter your speed: ");
                speed = scanner.nextInt(); //distance of route3
                double distance = 92.3;
                double estimatedHrs = Eta.est_time_arr(distance, speed);
                int hours = (int) estimatedHrs;
                int minutes = (int) ((estimatedHrs - hours) * 60);
                System.out.println("Distance: " + distance + "km");
                System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minutes");


            } else {
                route.route2();
                System.out.print("Enter your speed: ");
                speed = scanner.nextInt();
                double distance = 94.0;   //distance of route 2
                double estimatedHrs = Eta.est_time_arr(distance, speed);
                int hours = (int) estimatedHrs;
                int minutes = (int) ((estimatedHrs - hours) * 60);
                System.out.println("Distance: " + distance + "km");
                System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minutes");
                System.out.println("ENJOY ROADTRIP TO MOALBOAL!");
            }
        } else {
            route.route4();
            System.out.print("Enter your speed: ");
            speed = scanner.nextInt();       //distance of route4
            double distance = 84.9;
            double estimatedHrs = Eta.est_time_arr(distance, speed);
            int hours = (int) estimatedHrs;
            int minutes = (int) ((estimatedHrs - hours) * 60);
            System.out.println("Distance: " + distance + "km");
            System.out.println("Estimated Time of Arrival: " + hours + " hour(s) and " + minutes + " minute(s)");
            System.out.println("ENJOY ROADTRIP TO MOALBOAL!");

        }

        scanner.close();
    }

    static class Route {
        void defRoute() {
            System.out.println("Default Route:");
            System.out.println("Cebu City... (Start)");
            System.out.println("Minglanilla... (Route 1)");
            System.out.println("San Fernando... (Route 2)");
            System.out.println("Carcar City... (Route 3)");
            System.out.println("Barili... (Route 4)");
            System.out.println("Dumanjug... (Route 4.2.1)");
            System.out.println("Alcantara... (Route 4.2.2)");
            System.out.println("Moalboal... (END)");
        }

        void route2() {
            System.out.println("Recommended Route 2: via Sibonga");
            System.out.println("Cebu City... (Start)");
            System.out.println("Minglanilla... (Route 1)");
            System.out.println("San Fernando... (Route 2)");
            System.out.println("Carcar City... (Route 3)");
            System.out.println("Sibonga... (Route 4.2)");
            System.out.println("Dumanjug... (Route 4.2.1)");
            System.out.println("Alcantara... (Route 4.2.2)");
            System.out.println("Moalboal... (END)");
        }

        void route3() {
            System.out.println("Recommended Route 3: via Argao");
            System.out.println("Cebu City... (Start)");
            System.out.println("Minglanilla... (Route 1)");
            System.out.println("San Fernando... (Route 2)");
            System.out.println("Carcar City... (Route 3)");
            System.out.println("Argao... (Route 5)");
            System.out.println("Ronda... (Route 5.1)");
            System.out.println("Alcantara... (Route 5.2)");
            System.out.println("Moalboal... (END)");
        }
        void route4(){
            System.out.println("Recommended Route: ");
            System.out.println("Cebu City    ... (Start)");
            System.out.println("Minglanilla  ... (Route 1)");
            System.out.println("San Fernando ... (Route 2)");
            System.out.println("Carcar City  ... (Route 3)");
            System.out.println("Barili       ... (Route 4)");
            System.out.println("Dumanjug     ... (Route 4.2.1)");
            System.out.println("Alcantara    ... (Route 4.2.2)");
            System.out.println("Moalboal     ... (Arrived)");
      
        }
     }
     
     public static class Eta{
          public static double est_time_arr(double distance, int speed) {
            double time  = distance / speed;  
            return time;        
     
     }
   }

}