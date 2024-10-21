abstract class Bank
{
    abstract int roi();
}
class PNB extends Bank
{
    int roi()
    {
        return 7;
    }
}
class HDFC extends Bank
{
    int roi()
    {
        return 8;
    }
}
public class Program03 {
    public static void main(String[] args)
    {
        Bank b;
        b = new PNB();
        System.out.println(b.roi()+"%");
        b = new HDFC();
        System.out.println(b.roi()+"%");
    }

}
