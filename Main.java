import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    // problem 1
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a postive integer:");
    int a = scanner.nextInt();
    System.out.println("Random numbers:");
    printRandom3(a);

    //problem 2
    System.out.println("what is the x value of the first coordinate?");
    double x1 = scanner.nextDouble();
    System.out.println("what is the x value of the second coordinate?");
    double x2 = scanner.nextDouble();
    System.out.println("what is the y value of the first coordinate?");
    double y1 = scanner.nextDouble();
    System.out.println("what is the y value of the second coordinate?");
    double y2 = scanner.nextDouble();
    System.out.println("slope: " + calcSlope(x1, x2, y1, y2));

    //problem 3
    System.out.println("enter 2 doubles pls:");
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();
    System.out.println("Distance: " + roundedDist(x, y));

    scanner.close();
  }

  // write your methods here
  public static void printRandom3(int n){
    for (int i = 0; i < 3; i++){
    System.out.println((int) (Math.random() * n) + 2);
    }
  }
  public static double calcSlope(double x1, double x2, double y1, double y2){
    double a = (y2-y1) / (x2-x1);
    return a;
  }
  public static int roundedDist(double x, double y){
    int z = (int) (Math.abs(y-x) + 0.5);
    return z;
  }
}
