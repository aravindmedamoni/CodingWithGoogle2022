import java.util.Scanner;

public class CentauriPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int j=0;
        while(t-->0){
            j++;
            String s = sc.next();
            if(Character.toLowerCase(s.charAt(s.length()-1))=='y'){
                System.out.println("Case #"+j+": "+s+" is ruled by nobody.");
            }else if(Character.toLowerCase(s.charAt(s.length()-1)) =='a' || 
                Character.toLowerCase(s.charAt(s.length()-1)) == 'e' ||
                Character.toLowerCase(s.charAt(s.length()-1)) == 'i' ||
                Character.toLowerCase(s.charAt(s.length()-1)) =='o'   ||
                Character.toLowerCase(s.charAt(s.length()-1)) =='u'){
                    System.out.println("Case #"+j+": "+s+" is ruled by Alice.");
                }else{
                    System.out.println("Case #"+j+": "+s+" is ruled by Bob.");
                }
        }
        sc.close();
    }
}