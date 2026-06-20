class wed2{
    public static void main(String[] args){
          try {
              try {
                try {
                    int a=10/0;
                } 
                catch (Exception e) {
                    System.out.println("not divided");
                }
                  
              } 
              catch (Exception r) {
                System.out.println(" divided");
            
          }
          }
          catch(Exception s){
            System.out.println("divisible");
          } 
    }
}