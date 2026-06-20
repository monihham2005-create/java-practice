class example6{
    public static void main(String[] args) {
        AIDS a=new AIDS();
        AIDS a1=new AIDS("moni");
        AIDS a2=new AIDS("moni",20);
        a.display();
        a1.display();
    }
}
class AIDS{
    AIDS(String name)
    {
        System.out.println(name);
    }
    AIDS(String name,int age)
    {
        System.out.println("good morning"+name);
        System.out.println("good "+age);
    }
    AIDS()
    {
        System.out.println("good morning");
    }
    void display()
    {
        System.out.println("hello world");
    }
}
