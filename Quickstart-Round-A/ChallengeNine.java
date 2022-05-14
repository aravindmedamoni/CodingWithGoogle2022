import java.util.Scanner;

public class ChallengeNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            StringBuffer sb = new StringBuffer(sc.next());
            boolean isAppend=true;
            long n = 0;
            for(int j=0;j<sb.length();j++){
                n += Long.parseLong(String.valueOf(sb.charAt(j)));
            }
            if(n%9==0){
                if(sb.length()>1){
                    int value=0;
                    for(int j=1;j<sb.length();j++){
                        if(value<Integer.parseInt(String.valueOf(sb.charAt(j)))){
                            sb.insert(j,value);
                            isAppend=false;
                            break;
                        }
                    }
                    if(isAppend){
                        sb.append(value);
                    }
                    System.out.println("Case #"+i+": "+sb);
                }else{
                    System.out.println("Case #"+i+": "+n+"0");
                }
            }else{
                long value = 9-n%9;
                for(int j=0;j<sb.length();j++){
                if(value<Integer.parseInt(String.valueOf(sb.charAt(j)))){
                    sb.insert(j,value);
                    isAppend=false;
                    break;
                }
            }
            if(isAppend){
                sb.append(value);
            }
            System.out.println("Case #"+i+": "+sb);
            }
        }
        sc.close();
    }
}
