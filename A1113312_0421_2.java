import java.util.Scanner;
public class A1113312_0421_2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String date;
        boolean yesno;

        do
        {
            System.out.print("please enter the date(yyyy/mm/dd or mm/dd/yyyy):");
            date=sc.next();
            if(date.matches("[0-9]{4}[0-9]{1}/[0,1]{1}[0-9]{1}/[0,1,2,3]{1}[0-9]{1}") || date.matches("[0,1]{1}[0-9]{1}/[0,1,2,3]{1}[0-9]{1}/[0-9]{4}"))
            {
                yesno=true;
                System.out.println("ok! your date is :"+date);
            }
            else
            {
                yesno=false;
                System.out.println("your enter is wrong!");
            }
        }
        while(!yesno);
        sc.close();
    }
    
}
