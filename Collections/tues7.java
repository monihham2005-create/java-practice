interface Animal{
    void sound();
}
class tues7{
    public static void main(String[] args) {
        Animal a=new Animal(){
          public void sound(){
            System.out.println("Anonymous animal");
          };
        };
        a.sound();

        
    };
}