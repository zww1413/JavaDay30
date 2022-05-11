package day21;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args)  {
        FileReader fr = null;
        try {
            File file1 = new File("D:\\JavaStudio\\Code\\JavaDay30\\src\\day21\\file1.txt");
            fr = new FileReader(file1);
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                for(int i = 0;i < len; i++){
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
