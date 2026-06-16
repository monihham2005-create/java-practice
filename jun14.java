import java.util.Scanner;
public class jun14
{
             int m1,m2,m3,total,avg;
             String name;
             public static void main(String[]args){
                jun14 o[]=new jun14[3];
                for(int i=0;i<5;i++){
                    o[i]=new jun14();
                    o[i].input();
                    o[i].cal();
                }

     }
     void input(){
        Scanner s=new Scanner(System.in);
        m1=s.nextInt();
         m2=s.nextInt();
          m3=s.nextInt();
           name=s.next();
     }
     void cal(){
        total=m1+m2+m3;
        avg=total/3;
        System.out.println("Name: "+name);
         System.out.println("Total: "+total);
        System.out.println("The result is"+avg);
     }
}
  
        