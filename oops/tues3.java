class tues3{
    public static void main(String[]args){
        car v1=new BMW();
        v1.start();
         v1.drive();
    }
}
interface Vechicle{
    void start();
}
interface car extends Vechicle{
    void drive();
}
class BMW implements car{
    public void start(){
        System.out.println("car started");
    }
    public void drive(){
        System.out.println("car is driving");
    }
}