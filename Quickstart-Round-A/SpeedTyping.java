import java.util.Scanner;

public class SpeedTyping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<=t;j++){
            String i = sc.next();
            String p = sc.next();
            int count=0;
            if(i.length()==p.length()){
                if(i.equals(p))
                    System.out.println("Case #"+j+": "+count);
                else
                    System.out.println("Case #"+j+": "+"IMPOSSIBLE");
                
            }else{
                int n = p.length();
                //char c = '\0';
                int iIndex=0;
                for(int k=0;iIndex<i.length()&&k<n;k++){
                    if(i.charAt(iIndex)==p.charAt(k)){
                        iIndex++;
                    }
                }
                if(iIndex==i.length()){
                    count = p.length()-i.length();
                    System.out.println("Case #"+j+": "+count);
                }else{
                    System.out.println("Case #"+j+": "+"IMPOSSIBLE");
                }
                
            }
        }
        sc.close();
    }
}
