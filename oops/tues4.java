class tues4{
    public static void main(String[] args) {
        vechicle v=new car();
        v.start();
        v.fuel();
    }
}
interface vechicle{
    void start();
    default void fuel(){
        System.out.println("fuel");
    }
}
class car implements vechicle{
    public void start(){
        System.out.println("Car started");
    }
}