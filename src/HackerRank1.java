import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.concurrent.*;
public class HackerRank1 {
    public void helloWorld() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
    public void scanner() {
        Scanner scanner = new Scanner(System.in);
        int inpt1 = scanner.nextInt();
        int inpt2 = scanner.nextInt();
        int inpt3 = scanner.nextInt();
        System.out.println(inpt1+"\n"+inpt2+"\n"+inpt3);
    }
    public void statement1() {
        Scanner scanner = new Scanner(System.in);
        int inpt1 = scanner.nextInt();
        if(inpt1%2==1 || ((inpt1%2==0) && (inpt1>=6 && inpt1 <=20))) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
    public void scanner2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input1 = scanner.nextLine();
        System.out.println("Enter a double number");
        double input2 = scanner.nextDouble();
        System.out.println("Enter an integer");
        int input3 = scanner.nextInt();
        System.out.println("String: "+input1+"\n"+"Double: "+input2+"\n"+"Integer: "+input3);
    }
    public void formating() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("================================");
        for(int counter=0;counter<3;counter++) {
            String inpt1=scanner.next();
            int inpt2=scanner.nextInt();
            System.out.printf("%-15s%03d%n", inpt1, inpt2);
        }
        System.out.println("================================");
    }
    public void loop1() {
        Scanner scanner=new Scanner(System.in);
        int inpt1 = scanner.nextInt();
        for(int counter=1;counter<=10;counter++) {
            System.out.println(inpt1 +" x "+ counter + " = " + inpt1*counter);
        }
    }
    public void loop2() {

    }
}