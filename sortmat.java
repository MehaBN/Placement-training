import java.util.*;
public class sortmat{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2d size");
        // int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        int k=0,i,j;
        System.out.println("enter 2d matrix");
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int a[] = new int[m*m];
        
                for(i=0;i<m;i++){
                    for(j=0;j<m;j++){
                        a[k] = arr[i][j];
                        k++;
                    }
                
        }

        Arrays.sort(a);
        k=0;
       for(i=0;i<m;i++){
                    for(j=0;j<m;j++){
                        arr[i][j] = a[k];
                        k++;
                    }
                
        }
        System.out.println("sorted 2d array");
        for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                
        }
        
    }
}