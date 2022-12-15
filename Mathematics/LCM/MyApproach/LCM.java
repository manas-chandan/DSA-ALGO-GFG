
// package Mathematics.LCM.MyApproach;

public class LCM {
    public static void main(String[] args) {
        int a=10,b=100;
        int min=Math.min(a, b);//4
        int max=Math.max(a, b);//6
        // System.out.println(max%min);
        if(max%min==0){
            System.out.println("GCD : "+min);
        }
        else{
            while(min>0){
                if((b%min==0) &&(a%min==0))
                {
                    System.out.println("G C D - "+min);
                    break;
                }
                min--;
            }
        }
    }
}
