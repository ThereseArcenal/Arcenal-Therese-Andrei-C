import java.util.Scanner;
                 
 class MDA
{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float divide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter First Numbers: ");
    first = scanner.nextInt();
    System.out.print("Enter Second Numbers: ");
    second = scanner.nextInt();

    add = first + second;
    multiply = first * second;
    divide = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + divide);
  }
}