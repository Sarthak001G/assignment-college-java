// 5. Sum of Digits
import java.util.Scanner;
class sum_digit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}

