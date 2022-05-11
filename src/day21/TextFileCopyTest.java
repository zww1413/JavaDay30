package day21;

import java.io.*;

public class TextFileCopyTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file3 = new File("D:\\JavaStudio\\Code\\JavaDay30\\src\\day21\\file1.txt");
            File file4 = new File("D:\\JavaStudio\\Code\\JavaDay30\\src\\day21\\file1(1).txt");
            fr = new FileReader(file3);
            fw = new FileWriter(file4);
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                    fw.write(cbuf, 0, len);
            }
            System.out.println("复制成功，将file1复制到file1(1)");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
