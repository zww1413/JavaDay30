package day22;

import java.io.*;
import java.util.Locale;

public class InPutStreamReaderTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            InputStream is = System.in;
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            OutputStream out = System.out;
            OutputStreamWriter osw = new OutputStreamWriter(out);
            bw = new BufferedWriter(osw);

            String len;
            while ((len = br.readLine()) != null){
                if("over".equals(len))
                    break;
                bw.write(len.toUpperCase());
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
