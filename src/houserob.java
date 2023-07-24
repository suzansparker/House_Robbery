import java.util.Scanner;

public class houserob {
    public static int rob(int A[])
    {
        int sum1=0;
        int sum2=0;
        int n= A.length;
        for(int i=0;i<n;i+=2){
            sum1+=A[i];

        }for(int i=1;i<n;i+=2){
            sum2+=A[i];}
        if(sum1>sum2) {
            return sum1;
        }

    return sum2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();

        }
        System.out.println(houserob.rob(A));
    }

}
