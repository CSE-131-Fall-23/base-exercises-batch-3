package module08._02constructors;

// 1. Make the class square inherit from Rectangle
public class Square 
{
     // 2. Add a Square no-argument constructor
     
     // 3. Add a Square constructor with 1 argument for a side

     public static void main(String[] args)
     {
        Rectangle r = new Rectangle(3,5);
        r.draw();
        // 4. Uncomment these to test
        // Square s1 = new Square();
        // s1.draw();
        // Square s = new Square(3);
        // s.draw();
     }
}
