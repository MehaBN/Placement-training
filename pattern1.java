import java.util.*;

public class PatternPrinter{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size:");
        int n=5,k=1;

        for(int i=1;i<=n;i++){
            if(i%2!=0){
            for(int j=1;j<=n;j++){
                if(j%2!=0){
                System.out.print(k);
                k+2;
                }
                else{
                    System.out.print("-");
                }
                
            }
        }
        
          else{
            for(int j=1;j<=n;j++){
                if(j%2=0){
                System.out.print("-");
                }
                else{
                    System.out.print("-");
                }
            }
        }
        System.out.println(); 
               
        }
    }
}