package day21;


import sun.font.TrueTypeFont;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File file2 = new File("D:\\JavaStudio\\Code\\JavaDay30\\src\\day21\\file1.txt");
            fw = new FileWriter(file2,true);
            fw.write("李在淦神魔");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
