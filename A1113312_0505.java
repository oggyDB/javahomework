import java.util.Scanner;
class outexception1 extends Exception
{
    public outexception1(String msg)
    {
        super();
        System.out.println(msg);
    } 
}
class outexception2 extends Exception
{
    public outexception2(String msg)
    {
        super();
        System.out.println(msg);
    } 
}
public class A1113312_0505_1
{
    public static void main(String [] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,accumulate=0;
        int [] a=new int [6];
        int [] real={24,03,11,10,14,13};
        System.out.print("please enter the 6 serise number(the range is 1-49)**use space to gap**:");
        try
        {
            for(i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]>49)
                {
                    throw new outexception1("you could just enter the numbers only 1-49");
                }
                if(a[i]<1)
                {
                    throw new outexception2("you could just enter the numbers only 1-49");
                }
            }   
        }
        catch(outexception1 | outexception2 e)
        {
            System.out.println("wrong enter !");
        }
        for(i=0;i<a.length;i++)
        {
            for(int k:real)
            {
                if(a[i]==k)
                {
                    accumulate++;
                }
            }
        } 
        if(accumulate==6)
        {
            System.out.println("congratulate you win !");
        }
        else
        {
            System.out.println("you miss !");
            System.out.println("the win numbers are:");
            for(int r:real)
            {
                System.out.println(r);
            }
        }
        sc.close();
    }
}