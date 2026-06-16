class tues{
    public static void main(String[]args){
     Payment p1=new googlepay();
     p1.pay();
     Payment p2=new phonepe();
     p2.pay();

    }
}
interface Payment {
     void pay();
}
class googlepay implements Payment {
    public void pay() {
        System.out.println("payment done with googlepay");
    }
}
class phonepe implements Payment {
    public void pay() {
        System.out.println("payment done with phonepe");
    }
}