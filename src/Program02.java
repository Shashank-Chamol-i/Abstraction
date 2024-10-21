abstract class Shape
{
    abstract void draw();
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Rectangle Shape : ");
    }
}
class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Triangle Shape : ");
    }
}
public class Program02 {
    public static void main(String[] args)
    {
       Shape r = new Rectangle();
       Shape t = new Triangle();
        r.draw();
        t.draw();
    }
}
