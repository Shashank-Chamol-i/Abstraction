abstract class Vegi
{
    Vegi(){System.out.println("Constructor of Vegitable");}
    abstract void green();
    void health()
    {
        System.out.println("Green Vegitables are good for health :");
    }
}
class Old_vegi extends Vegi
{
    void green()
    {
        System.out.println("A green Vegitable have Vitamin E,A");
    }
}
public class Program04 {
    public static void main(String[] args)
    {
        Vegi v = new Old_vegi();
        v.green();
        v.health();
    }
}
