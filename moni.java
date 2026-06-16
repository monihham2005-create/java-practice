class moni
{
    public static void main(String[]args){
      Dog d=new Dog();
      d.sound(); 
      Animal e=new Animal();
      e.sound(); 
       
        
    }
}

class Animal{
    void sound()
 {
    System.out.println("Animal sound");
 }  
}
class Dog extends Animal {
 void sound()
 {
    System.out.println("Dog sound");
 }   
}


