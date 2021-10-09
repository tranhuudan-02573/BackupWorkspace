package JVM;

import java.io.IOException;

public class ngoailedcxayra {
 
    void method() throws IOException {
        throw new IOException("device error");
    }
 
    public static void main(String args[]) throws IOException {
        ngoailedcxayra obj = new ngoailedcxayra();
        obj.method();
        System.out.println("normal flow...");
    }
 
}