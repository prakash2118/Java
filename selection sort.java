import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[]  arr={13,26,45,39,29,38,9,5};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }



    }
    public static void sort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }


}
