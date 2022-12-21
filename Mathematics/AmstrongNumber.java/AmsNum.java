import java.util.Scanner;

public class AmsNum {
    public static void main(String[] args) {
        System.out.println("Enter the number.");
        int num= new Scanner(System.in).nextInt();
        int ori=num;
        int rev=0,rem=0;
        while(num>0){
            rem=num%10;
            rev=rem+(10*rev);
            num/=10;
        }
        System.out.println(rev);
        if(rev==ori)
        System.out.println("ams");
        else
        System.out.println("not ams");

    }
}
