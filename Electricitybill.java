import java.util.Scanner;
public class Electricitybill{
 public static void main(String arg[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the current unit: ");
    int currentunit=sc.nextInt();
    System.out.println("Enter the previous unit: ");
    int prevunit=sc.nextInt();
    double unit=0;
    double total=currentunit-prevunit;
     if(prevunit>currentunit)
     {
     System.out.println("Invalid entry..! Please try again.");
     }
       else 
       if(total==0)
        {
         System.out.println("Bill due is : 38");
        }
          else {if(total>0 && total<=100)
            {
             unit=total*2.5;
              
             }
            else if(total>100 && total<=200)
             {
             unit=250+(total-100)*3;
             
              }
            else if(total>200 && total<=400)
              {
               unit=550+(total-200)*4;
              
                }
              else{
                    unit=1350+(total-400)*6;
                   
                  }
                    System.out.println("      ---Bill Details---");
                    System.out.println("********************************");
                    System.out.println("  Bill due Rs.:"+unit);
  }}
}