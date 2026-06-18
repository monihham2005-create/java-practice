import java.util.ArrayList;
import java.util.List;


class t{
    public static void main(String[] args){
       List<String> a=new ArrayList<>();
       a.add("mango");
       a.add("apple");
       a.add("banana");
       
       System.out.println(a);
       
       
       
                int w=a.indexOf("banana");
                System.out.println(w);
                a.size();
                System.out.println(a);
                a.set(0,"grapes");
                System.out.println(a);
                String s=a.get(2);
                System.out.println(s);

       
       
    }
}
