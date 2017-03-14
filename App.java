import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter package width:");
    int userWidth = Integer.parseInt(console.readLine());
    System.out.println("Enter package height:");
    int userHeight = Integer.parseInt(console.readLine());
    System.out.println("Enter package depth:");
    int userDepth = Integer.parseInt(console.readLine());
    System.out.println("Enter package weight:");
    int userWeight = Integer.parseInt(console.readLine());

    System.out.println("Enter shipping speed: 'fast' or 'slow'");
    String userSpeed = console.readLine();
    System.out.println("Enter shipping distance:");
    int userDistance = Integer.parseInt(console.readLine());

    Parcel userParcel = new Parcel(userWidth, userHeight, userDepth, userWeight);

    System.out.println("Do you want gift wrapping?");
    String userWrap = console.readLine();
    if (userWrap.equals("yes")) {
      double totalcost = userParcel.costToShip(userSpeed, userDistance) + userParcel.costToWrap();
      System.out.println("Total shipping cost is " + totalcost);
    } else {
      System.out.println("Total shipping cost is " + userParcel.costToShip(userSpeed, userDistance));
    }
  }
}
