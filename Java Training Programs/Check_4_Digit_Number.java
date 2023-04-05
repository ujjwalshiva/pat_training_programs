import java.util.*;

public class Check_4_Digit_Number {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        long n = o.nextLong();
        if(n <= 9999)
            System.out.print((n/1000)%10+(n/100)%10+(n/10)%10+n%10);
        else
            System.out.print("Not a 4 digit number.");
        o.close();
      
    }
}
