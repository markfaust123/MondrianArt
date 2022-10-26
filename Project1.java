import java.util.Scanner;

/**
* Starter file for Project A, EN.500.112 Gateway Computing: Java.
* Mondrian Art
* Fall 2022
* @author Joanne Selinski
* @author Mark Faust mfaust4
*
* The purpose of this program is to allow users to input their own values
* which will describe the characteristics of a computer-generated, custom  
* piece of art that mimicks the style of Dutch artist Piet Mondrian.
* 
* Mark Faust
* mfaust4
* 9/21/22
*/


public class Project1 {

   /** Main method.
   * @param args not used
   */
   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);  // this allows us to collect input
   
      // variable declarations
      double blueBlockWidth;
      double blueBlockHeight;
      
      double topLeftHeight;
      
      double bottomRightWidth;
      double bottomRightHeight;
      
      double circleRadius;
      
      double thinThick = 0.01;
      double middleThick = 2.0 * thinThick;
      double wideThick = 3.0 * thinThick;
   
      // fixed-value "constants" needed by the program
      final int SIZE = 512;  // can be increase if you want
      StdDraw.setCanvasSize(SIZE, SIZE);
    
      
      // Prompt for and collect parameters from the user
      System.out.print("Enter percent for blue block width: ");
      blueBlockWidth = kb.nextDouble() * 0.01;
      
      System.out.print("Enter percent for blue block height: ");
      blueBlockHeight = kb.nextDouble() * 0.01;
      
      System.out.print("Enter percent for top left block height: ");
      topLeftHeight = kb.nextDouble() * 0.01;
      
      System.out.print("Enter percent for bottom right block width: ");
      bottomRightWidth = kb.nextDouble() * 0.01;
   
      // Make the output based on the inputs

      circleRadius = (1.0 / 3.0) * topLeftHeight;

      bottomRightHeight = (1.0 / 2.0) * blueBlockHeight;
      
      StdDraw.setPenColor(34, 80, 149); //Blue Rectangle
      StdDraw.filledRectangle((1.0 / 2.0) * blueBlockWidth, 
                        (1.0 / 2.0) * blueBlockHeight, 
                        (1.0 / 2.0) * blueBlockWidth, 
                        (1.0 / 2.0) * blueBlockHeight);
                      
      StdDraw.setPenColor(250, 201, 1); //Yellow Rectangle
      StdDraw.filledRectangle(1 - (1.0 / 2.0) * bottomRightWidth, 
                       (1.0 / 4.0) * blueBlockHeight, 
                       (1.0 / 2.0) * bottomRightWidth, 
                       (1.0 / 4.0) * blueBlockHeight);
                     
      StdDraw.setPenColor(221, 1, 0); //Red Rectangle
      StdDraw.filledRectangle(1 - ((1.0 / 2.0) * (1 - blueBlockWidth)), 
                              1 - ((1.0 / 2.0) * (1 - blueBlockHeight)), 
                              (1.0 / 2.0) * (1 - blueBlockWidth), 
                              (1.0 / 2.0) * (1 - blueBlockHeight));
            
      StdDraw.setPenRadius(thinThick); //White Circle
      StdDraw.setPenColor(StdDraw.WHITE); 
      StdDraw.filledCircle(blueBlockWidth, 1 - topLeftHeight, circleRadius);
      
      StdDraw.setPenRadius(thinThick); //Blue Arc
      StdDraw.setPenColor(34, 80, 149); 
      StdDraw.arc(blueBlockWidth, 1 - topLeftHeight, circleRadius, 90, 180);
      
      StdDraw.setPenRadius(thinThick); //Yellow Arc
      StdDraw.setPenColor(250, 201, 1); 
      StdDraw.arc(blueBlockWidth, 1 - topLeftHeight, circleRadius, 180, 270);
      
      StdDraw.setPenRadius(wideThick); //Wide Horizontal Line
      StdDraw.setPenColor(StdDraw.BLACK);            
      StdDraw.line(0, 1 - topLeftHeight, 
                   blueBlockWidth - 0.01, 1 - topLeftHeight);
      
      StdDraw.setPenRadius(thinThick); //Thin Vertical Line
      StdDraw.setPenColor(StdDraw.BLACK); 
      StdDraw.line(blueBlockWidth, 1, blueBlockWidth, 0);
      StdDraw.line(0, blueBlockHeight, 1, blueBlockHeight); //Thin Horiz Line
      
      StdDraw.setPenRadius(thinThick);  //Black Arc
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.arc(blueBlockWidth, 1 - topLeftHeight, circleRadius, -90, 90);
      
      StdDraw.setPenColor(StdDraw.BLACK); //Middle Thickness Bottom Right Lines
      StdDraw.setPenRadius(middleThick); 
      StdDraw.line(1 - bottomRightWidth, blueBlockHeight - 0.008, 
                   1 - bottomRightWidth, 0);
      StdDraw.line(1 - bottomRightWidth, (1.0 / 2.0) * blueBlockHeight, 
                   1, (1.0 / 2.0) * blueBlockHeight);

   }
}