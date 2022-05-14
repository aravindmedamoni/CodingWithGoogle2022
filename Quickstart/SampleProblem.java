import java.util.Scanner;

public class SampleProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int j=0;
        while(t-->0){
            j++;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            long sum=0;
            for(int i=0;i<n;i++){
                sum +=a[i]%m;
            }
            System.out.println("Case #"+j+": "+sum%m);
        }
        sc.close();
    }
}
