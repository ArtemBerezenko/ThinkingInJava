package ThinkingInJava.Ch_12_Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Home on 21.02.2017.
 */
public class InputFile {
    private BufferedReader in;
    public InputFile(String  fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть " + fname);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close() исполнен неудачно");
            }
            throw e;
        } finally {
            //Не закрывайте файл здесь!!!
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() исполнен неудачно");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() успешен");
        } catch (IOException e2) {
            throw new RuntimeException("in.close() исполнен неудачно");
        }
    }
}
