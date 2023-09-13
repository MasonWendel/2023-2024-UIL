import java.io.*;
import java.util.*;

public class DryRun{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DryRun.dat"));


        int n = in.nextInt();
        in.nextLine();
         
        while (n-->0){
            String line = in.nextLine();
            System.out.printf("I like %s.%n", line);
        }
    }
}