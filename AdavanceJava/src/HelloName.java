import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HelloName {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Name");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }


}
