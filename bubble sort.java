public class bubble {
    public static void main(String[] args) {
    int [] arr={15,54,24,19,21,46,76,32};
    bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
