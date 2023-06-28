package final1;

public class Rectangle {
   /**
    * A variable that holds the name of the rectangle
    */
   private String name;

   /**
    * A variable that holds the x coordinate of the rectangle
    */
   private int x;

   /**
    * A variable that holds the y coordinate of the rectangle
    */
   private int y;

   /**
    * A variable that holds the width coordinate of the rectangle
    */
   private int w;

   /**
    * A variable that holds the height coordinate of the rectangle
    */
   private int h;

   /**
    * Class Constructor
    * @param name the rectangle name
    * @param x coordinate
    * @param y coordinate
    * @param w width
    * @param h height
    */
   public Rectangle(String name, int x, int y, int w, int h) {
       this.name = name;
       this.x = x;
       this.y = y;
       this.w = w;
       this.h = h;
   }

   /**
    * A getter method for the name
    * @return the name of the rectangle
    */
   public String getName() {
       return name;
   }

   /**
    * A getter method for the x coordinate
    * @return the x coordinate of the rectangle
    */
   public int getX() {
       return x;
   }

   /**
    * A getter method for the y coordinate
    * @return the y coordinate of the rectangle
    */
   public int getY() {
       return y;
   }

   /**
    * A getter method for the width coordinate
    * @return the w coordinate of the rectangle
    */
   public int getWidth() {
       return w;
   }

   /**
    * A getter method for the height coordinate
    * @return the h coordinate of the rectangle
    */
   public int getHeight() {
       return h;
   }

   /**
    * A toString method for the rectangle
    * @return a String of the Rectangle
    */
   public String toString() {
       String string = String.format("%d, %d, %d, %d", getX(),
           getY(), getWidth(), getHeight());
       return string;
   }
}
