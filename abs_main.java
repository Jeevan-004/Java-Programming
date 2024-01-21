abstract class Shape
{
    int d1;
    int d2;
    
    abstract void printArea();
}
class Rectangle extends Shape
{
    Rectangle(int x, int y)
    {
        d1 = x;
        d2 = y;
    }
    void printArea()
    {
        System.out.println("Area of the rectangle: " + (d1*d2));
    }
}
class Triangle extends Shape
{
    Triangle(int x, int y)
    {
        d1 = x;
        d2 = y;
    }
    void printArea()
    {
        System.out.println("Area of the Triangle: " + (0.5*d1*d2));
    }
}
class Circle extends Shape
{
    Circle(int x)
    {
        d1 = x;
        
    }
    void printArea()
    {
        System.out.println("Area of the Circle: " + (3.14*d1*d1));
    }
}

class Main 
{
    public static void main (String[] args) {
        Rectangle r1 = new Rectangle(5,3);
        Triangle t1 = new Triangle(4,8);
        Circle c1 = new Circle(5);
        
        r1.printArea();
        t1.printArea();
        c1.printArea();
    }
}
