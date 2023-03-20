import java.io.*;

public class A1113312_230317 
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br=new
        BufferedReader(new InputStreamReader(System.in));

        System.out.println("please enter N and M");

        System.out.print("N:");
        String str=br.readLine();
        int n=Integer.parseInt(str);
        
        System.out.print("M:");
        str=br.readLine();
        int m=Integer.parseInt(str);


        double [][] array=new double [n][m];
        for(int a=0;a<array.length;a++)
        {
            for(int b=0;b<array[a].length;b++)
            {
                array[a][b]=(a+1)*(b+1);
            }
        }
        for(double [] one:array)
        {
          for(double two:one)
          {
            System.out.print(two+"\t");
          }
            System.out.println("");
        }       
    }
}
