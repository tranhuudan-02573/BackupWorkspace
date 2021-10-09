package JVM;

import java.io.IOException;

public class ngoailekodcxayra {
 
    void method() throws IOException {
        throw new IOException("device error");
    }
 
    public static void main(String args[]) {
        try {
            ngoailekodcxayra obj = new ngoailekodcxayra();
            obj.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
 
        System.out.println("normal flow...");
    }
 
}