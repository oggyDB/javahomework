import java.util.*;

class Animals
{
    String name;
    double height;
    int weight;
    double speed;

    void show()
    {
        System.out.println("Name:"+name);
        System.out.println("Height:"+height);
        System.out.println("Weight:"+weight);
        System.out.println("Speed:"+speed);
    }

    double distance(int x,double y)
    {
        double length;
        length=x*y*this.speed;
        return length;
    }

    double distancenoy(int x)
    {
        double lengthnoy;
        lengthnoy=x*this.speed;
        return lengthnoy;
    }
}

public class frozen
{
    public static void main(String [] argv)
    {
        Scanner sc=new Scanner(System.in);
        int timesnowbaby,timesven,timeanna,timeelsa;
        double accelerationsven,accelerationanna;

        System.out.print("how many time did snowbaby run:");
        timesnowbaby=sc.nextInt();
        Animals snowbaby=new Animals();
        snowbaby.name="snowbaby";
        snowbaby.height=1.1;
        snowbaby.weight=52;
        snowbaby.speed=100;
        snowbaby.show();
        System.out.println("snowbaby run way:"+snowbaby.distancenoy(timesnowbaby));
        System.out.println();
        

        System.out.print("how many time and what acceleration did sven run:");
        timesven=sc.nextInt();
        accelerationsven=sc.nextDouble();
        Animals sven=new Animals();
        sven.name="sven";
        sven.height=1.5;
        sven.weight=99;
        sven.speed=200;
        sven.show();
        System.out.println("sven run way:"+sven.distance(timesven, accelerationsven));
        System.out.println();
       

        System.out.print("how many time and what acceleration did anna run:");
        timeanna=sc.nextInt();
        accelerationanna=sc.nextDouble();
        Animals anna=new Animals();
        anna.name="anna";
        anna.height=1.7;
        anna.weight=48;
        anna.speed=120;
        anna.show();
        System.out.println("anna run way:"+anna.distance(timeanna, accelerationanna));
        System.out.println();
       

        System.out.print("how many time did elsa run:");
        timeelsa=sc.nextInt();
        Animals elsa=new Animals();
        elsa.name="elsa";
        elsa.height=1.7;
        elsa.weight=50;
        elsa.speed=120;
        elsa.show();
        System.out.println("run way:"+elsa.distancenoy(timeelsa));
        System.out.println();
        sc.close();
    }
}



