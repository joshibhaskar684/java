import java.util.*;
public class selectionsort {
    public static int small(int a[],int s,int n){
        int min=s;
        for(int i=s;i<n;i++){
            if(a[min]>a[i]){
                min=i;
            }

        }
        return min;
    }

public static void selectsort(int ar[],int nn){
    for(int i=0;i<nn;i++){
    int min=small(ar,i,nn);
    if(ar[i]!=ar[min]){
        int temp=ar[i];
        ar[i]=ar[min];
        ar[min]=temp;
    }
}
}
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22,4};
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        selectsort(arr,n);
        System.out.println(Arrays.toString(arr));

        
    }
}
