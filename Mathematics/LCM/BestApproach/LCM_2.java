// package Mathematics.LCM.BestApproach;

public class LCM_2 {
    public static void main(String[] args) {
        int a = 9, b = 13;
        System.out.println("Largest "+returnLcm(a, b));
    }
    public static int returnLcm(int a, int b) {
        if(b==0)
        return a;
        else
        return returnLcm(b, a%b);
    }
}
