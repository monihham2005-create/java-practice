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
        fw.write("kerosine dopamine chemical induced fantasy and fame the things we choose show me hate,show me love,make me bullet proof we call this shit normal runaway out of sight dont know what i want wish i had a minute just turn me off kerosine dopomine what i got to do yeah we call this shit normal");
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