import java.util.Scanner;
class example2{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your mark:");
        int mark=sc.nextInt();
        
        if(mark>=90){
           System.out.println("grade a");
        }
        else if(mark>=70)
        {
           System.out.println("grade b");
        }
        else if(mark>=50)
        {
            System.out.println("grade c");
        }
        else{
            System.out.println("fail");
        }

        
    }
}