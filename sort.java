import java.util.*;

public class sort {
    public static int[] sortedarray(int[] arr){
        int N = arr.length;
        for(int i = 0;i<N-1;i++){
            
            for(int j = i+1;j<N;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
            
        }
        arr = sortedarray(arr);
        for(int i = 0;i<N;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
