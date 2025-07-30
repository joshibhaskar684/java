import java.util.Arrays;

public class bubblesort{
    public static  void gap(){
        System.out.println("\n");
    }
    public static void bubblsort(int a[],int nn){
        int i,j,k=0;
        for(i=0;i<nn-1;i++){
            for(j=0;j<nn-1-i;j++){
                if(a[j]>a[j+1]){

                    k=a[j];

                    a[j]=a[j+1];

                    a[j+1]=k;
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        System.out.println("doing bubble sort");
        gap();
        bubblsort(arr,n);
        System.out.println(Arrays.toString(arr));

    }
}