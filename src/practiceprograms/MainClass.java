package practiceprograms;

class A3
{
    int i = 10;
}
 
class B3 extends A3
{
    int i = 20;
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A3 a = new A3();
 
        System.out.println(a.i);
    }
}