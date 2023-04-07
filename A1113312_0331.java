import java.util.Scanner;

class anAnimals
{
    String name;
    double tall;
    int weight;
    double speed;

    anAnimals(String name,Double tall,int weight,double speed)
    {
        this.name=name;
        this.tall=tall;
        this.weight=weight;
        this.speed=speed;
    }
    void show()
    {
        System.out.println("name:"+name);
        System.out.println("tall:"+tall+"m");
        System.out.println("weight:"+weight+"kg");
        System.out.println("speed:"+speed+"min/s");
    }

    double distance1(int x,Double y)
    {
        double dis1=x*y*speed;
        return dis1;
    }

    double distance2(int x)
    {
        double dis2=x*speed;
        return dis2;
    }

    public static void showinfo()
    {
        System.out.println("welcome to frozen system !");
    }
}

class Human extends anAnimals
{
    int sexual;
    Human(String name,Double tall,int weight,double speed,int sexual)
    {
        super(name, tall, weight, speed);
        this.sexual=sexual;
    }

    void show2()
    {
        show();
        if(sexual==1)
        {
            System.out.println("sexual:man");
        }
        if(sexual==2)
        {
            System.out.println("sexual:female");
        }
    }
}

class Snow extends Human
{
    int yesno;
    Snow(String name,Double tall,int weight,double speed,int sexual,int yesno)
    {
        super(name, tall, weight, speed, sexual);
        this.yesno=yesno;
        //yes=1;
        //no=0;
    }

    void show3()
    {
        show2();
        System.out.println("snowskill:yes");
    }

    double distance3(int x,double y)
    {
        double dis3=distance1(x, y)*2;
        return dis3;
    }
}

public class A1113312_0331_1 
{
    public static void main(String [] argv)
    {
        Scanner sc = new Scanner(System.in);
        int t1, t2, t3, t4, t5, t6;
        double a1, a3, a4, a6;

        System.out.print("enter the time and acceleration that snowbaby distance:");
        t1 = sc.nextInt();
        a1 = sc.nextInt();

        System.out.print("enter the time that donkey distance:");
        t2 = sc.nextInt();

        System.out.print("enter the time and acceleration that acre distance:");
        t3 = sc.nextInt();
        a3 = sc.nextInt();

        System.out.print("enter the time and acceleration that hans distance:");
        t4 = sc.nextInt();
        a4 = sc.nextInt();

        System.out.print("enter the time that anna distance:");
        t5 = sc.nextInt();

        System.out.print("enter the time and acceleration that elsa distance:");
        t6 = sc.nextInt();
        a6 = sc.nextInt();

        anAnimals snowbaby=new anAnimals("snowbaby",1.1,52,100);
        anAnimals donkey=new anAnimals("donkey", 1.5,99,200);
        Human acre=new Human("acre", 1.9, 80, 150,1);
        Human hans=new Human("hans", 1.8, 78, 130,1);
        Human anna=new Human("anna", 1.7, 48, 120,2);
        Snow elsa=new Snow("elsa", 1.7,50,120,2,1);

        snowbaby.showinfo();
        snowbaby.show();
        System.out.println("");
        donkey.show();
        System.out.println("");
        acre.show2();
        System.out.println("");
        hans.show2();
        System.out.println("");
        anna.show2();
        System.out.println("");
        elsa.show3();
        System.out.println("");

        System.out.println("snowbaby distance:"+snowbaby.distance1(t1, a1)+"m");
        System.out.println("donkey distance:"+donkey.distance2(t2)+"m");
        System.out.println("acre distance:"+acre.distance1(t3, a3)+"m");
        System.out.println("hans distance:"+hans.distance1(t4, a4)+"m");
        System.out.println("anna distance:"+anna.distance2(t5)+"m");
        System.out.println("elsa distance:"+elsa.distance3(t6, a6)+"m");

        sc.close();
    }
}
