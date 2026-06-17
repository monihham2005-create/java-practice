import java.util.ArrayList;

class thurs2{
    public static void main(String[] args){
       ArrayList a=new ArrayList();
       a.add(890);
       a.add(900);
       a.add("hello");
       
       System.out.println(a);
       
       
       a.add("world");
       
       System.out.println(a);
       a.remove(1);
       System.out.println(a);
       a.add(1,1234567890);
       System.out.println(a);
       a.set(0,"welcome");
       System.out.println(a);
    }
}
