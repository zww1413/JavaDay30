package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileCopyTest {
    public static void main(String[] args)  {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file5 = new File("D:\\JavaStudio\\Code\\JavaDay30\\src\\day21\\img1.png");
            fis = new FileInputStream(file5);
            fos = new FileOutputStream("D:\\JavaStudio\\Code\\JavaDay30\\src\\day21\\img1(1).png");
            byte[] cbuf = new byte[5];
            int len;
            while ((len = fis.read(cbuf)) != -1) {
                fos.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
