import java.util.*;

public class Grade_Calculate {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        String name = o.next();
        int n = o.nextInt();
        char gr = 'F';
        if(n >=701 && n<=900) gr='A';
        else if(n>=610 && n<=624) gr='C';
        else if(n>=125 && n<=600) gr='B';
        else if(n>=27 && n<=32) gr='D';
        System.out.println("My name is "+name+". My Grade is "+gr+".");
        o.close();
    }
}