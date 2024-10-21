interface A
{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A
{
    public void c()
    {
        System.out.println("It is the non abstract method : ");
    }
}
class C extends B
{
    public void a ()
    {
        System.out.println("I am A : ");
    }
    public void b ()
    {
        System.out.println("I am B : ");
    }
    public void d()
    {
        System.out.println("I am D : ");
    }
}
public class Program05 {
    public static void main(String[] args)
    {
        A aa = new C();
        aa.a();
        aa.b();
        aa.c();
        aa.d();

    }
}
