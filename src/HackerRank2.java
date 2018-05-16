import java.time.LocalDate;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.concurrent.*;
public class HackerRank2 {
    public void javaStrings(){
        Scanner scanner = new Scanner(System.in);
        String inpt1 = scanner.nextLine();
        String inpt2 = scanner.nextLine();
        System.out.println(inpt1.length()+inpt2.length());
        System.out.println(inpt1.compareTo(inpt2)>0?"YES":"NO");
        System.out.println(inpt1.substring(0,1).toUpperCase()+inpt1.substring(1, inpt1.length())+" "+inpt2.substring(0,1).toUpperCase()+inpt2.substring(1, inpt2.length()));
    }
}
