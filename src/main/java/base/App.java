package base;
/*
Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output:
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints:
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */
import java.util.Scanner;
import java.lang.Math;
public class App {
    Scanner inp = new Scanner(System.in);
    final static double gallon = 350.0;
    public static void main(String args[])
    {
        App myApp = new App();
        int len = myApp.readIn("length");
        int width = myApp.readIn("width");
        int area = myApp.area(len, width);
        double areaInGallons = myApp.convert(area);
        int roundedGallons = myApp.round(areaInGallons);
        System.out.println("You will need to purchase " + roundedGallons + " gallons of paint to cover " + area + " square feet.");
    }
    private int area(int len, int width){
        return len * width;
    }
    private double convert(int sqFeet){
        return sqFeet/gallon;
    }
    private int round(double gallons){
        return (int)Math.ceil(gallons);
    }
    private int readIn(String word){
        System.out.print("What is the " + word + " of your room in feet? ");
        return Integer.parseInt(inp.nextLine());
    }
}
