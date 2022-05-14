
import java.util.Scanner;
import java.util.Arrays;

public class HIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int j=0;
        while(t-->0){
            j++;
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int count=0;
            int citNum=1;
            System.out.print("Case #"+j+":");
            for(int i=0;i<n;i++){
                if(a[i]-citNum>=citNum){
                    count++;
                }
                if(count>citNum){
                    citNum++;
                }
                System.out.print(" "+citNum);
            }
            System.out.println();
        }
        sc.close();
        
    }
}

