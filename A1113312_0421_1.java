import java.util.Scanner;
public class A1113312_0421_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String mail;
        boolean yesno;
        do
        {
            yesno=true;
            System.out.print("please enter your mail(school mail):");
            mail=sc.next();
            if(mail.matches("[a]{1}[1][0,1]{1}[0-9]{1}[3][3]{1}[0-9]{2}@mail.nuk.edu.tw"))
            {
                System.out.println("ok,the mail is right!");
            }
            else
            {
                yesno=false;
                System.out.println("the mail is wrong!");
            }
        }
        while(!yesno);
        sc.close();
    }
      
}