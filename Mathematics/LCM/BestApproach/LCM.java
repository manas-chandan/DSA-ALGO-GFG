// package Mathematics.LCM.BestApproach;
// trying to print Greatest common devisor
public class LCM {
    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println(returnLcm(a, b));
    }

    public static int returnLcm(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}