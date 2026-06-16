class kaviya
{
    public static void main(String[]args){
        child c=new child();
        c.show();
        c.display();

        
    }
}
class parent{
 void show()
 {
    System.out.println("giving bike");
 }   
}
class child extends parent{
 void display()
 {
    System.out.println("giving car");
 }   

}
