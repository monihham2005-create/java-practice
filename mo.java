class moni{
    public static void main(String[]args){
     
            aidsb b=new aidsb();
            b.show();
            b.play();
       }
    }
    class aidsa{
        void play(){
            System.out.println("Aids a");
           
        }
    }
     class aidsb extends Aidsa{
        void show(){
            System.out.println("Aids b");
            
        }
    }
}
