class tues5{
    public static void main(String[] args) {
        calculator.add(20,30);
    }
}
interface calculator{
    static void add(int a,int b){
        System.out.println(a+b);
    }
}