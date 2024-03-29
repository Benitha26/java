    
// abstract class
abstract class Shape
  {
// declare fields
       String objectName = " ";  
       Shape(String name)
          {
             this.objectName = name;
          }   
public void moveTo(int x, int y)
      {
         System.out.println(this.objectName + " " + "has been moved to"
                                   + " x = " + x + " and y = " + y);
      }   
// abstract methods which will be implemented by its subclass(es)
          abstract public double area();
          abstract public void draw();
  }
class Rectangle extends Shape
   {  
       int length, width;  
// constructor
       Rectangle(int length, int width, String name)
           {      
               super(name);
               this.length = length;
               this.width = width;
           }    
@Override
public void draw()
        {
           System.out.println("Rectangle has been drawn ");
        }   
@Override
public double area()
        {
            return (double)(length*width);
        }
    }
class Circle extends Shape
   {  
        double pi = 3.14;
        int radius;   
//constructor
        Circle(int radius, String name)
           {      
              super(name);
              this.radius = radius;
           }   
@Override
public void draw()
          {      
               System.out.println("Circle has been drawn ");
          }
@Override
public double area()
         {
            return (double)((pi*radius*radius)/2);
         }
    }
class AbstractDemo
     {
         public static void main (String[] args)
             {
// creating the Object of Rectangle class and using shape class reference.
                   Shape rect = new Rectangle(2,3, "Rectangle");
                   System.out.println("Area of rectangle: " + rect.area());
                   rect.moveTo(1,2);  
                   rect.draw();
                   System.out.println(" ");       
// creating the Objects of circle class
                   Shape circle = new Circle(2, "Circle");
                   System.out.println("Area of circle: " + circle.area());
                   circle.moveTo(2,4);   
             }
     }