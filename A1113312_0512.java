import java.util.Scanner;
import java.util.Random;

class storethread extends Thread
{
    String kinds;
    int customersnum;
    static int pork=5000;
    static int beef=3000;
    static int vegtable=1000;
    
    public storethread(int kind,int cusnum)
    {
        customersnum=cusnum;
        switch(kind)
        {
            case 1:
            kinds="pork";
            break;
            case 2:
            kinds="beef";
            break;
            case 3:
            kinds="vegtable";
            break;
        }
    }
    public void run()
    {
        synchronized(A1113312_0512demo.class)
        {
            
            if(kinds=="pork")
            {
                int porkstock=(int)(Math.random()*41)+10;
                System.out.println("the customer "+customersnum+" order "+porkstock+" pork dumplings");
                pork=pork-porkstock;
                if(pork<0)
                {
                    pork=0;
                }
            }
            else if(kinds=="beef")
            {
                int beefstock=(int)(Math.random()*41)+10;
                System.out.println("the customer "+customersnum+" order "+beefstock+" beef dumplings");
                beef=beef-beefstock;
                if(beef<0)
                {
                    beef=0;
                }
            }
            else if(kinds=="vegtable")
            {
                int vegstock=(int)(Math.random()*41)+10;
                System.out.println("the customer "+customersnum+" order "+vegstock+" vegtable dumplings");
                vegtable=vegtable-vegstock;
                if(vegtable<0)
                {
                    vegtable=0;
                }
            }
            System.out.println("we have "+beef+" beef dumpling ; "+pork+" pork dumpling ; "+vegtable+" vegtable dumpling");
            try
            {
                storethread.sleep(3000);
            }
            catch(InterruptedException e)
            {}
        } 
    }
}
public class A1113312_0512demo 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numbers of customers:");
        int cus=sc.nextInt();

        for(int i=1;i<=cus;i++)
        {
            int dum=(int)(Math.random()*3)+1;
            switch(dum)
            {
                case 1:
                storethread porknum=new storethread(1,i);
                porknum.start();
                break;
                case 2:
                storethread beefnum=new storethread(2,i);
                beefnum.start();
                break;
                case 3:
                storethread vegnum=new storethread(3,i);
                vegnum.start();
                break;
            }
        }
        sc.close();
    }   
}
