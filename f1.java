import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class f1{
    public static void main(String[] args) throws IOException{
        //File f=new File("hello.java");
        //f.createNewReader();
       // System.out.println(f.getCanonicalPath());
        BufferedWriter fw=new BufferedWriter (new FileWriter("hello.txt"));
        fw.write("like listening music");
        fw.close();
        System.out.println(fw);
        BufferedReader fr=new BufferedReader (new FileReader("hello.txt"));
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
            }
}