abstract class Bike
{
    abstract void run();
}
class Program01 extends Bike{
    void run()
    {
        System.out.println("Bike is running : ");
    }
    public static void main(String[] args)
    {
        Program01 p = new Program01();
        p.run();
    }

}
