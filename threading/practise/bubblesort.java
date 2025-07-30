import java.util.Arrays;

public class bubblesort{
    public static void main(String[] args) {
        int a[]={3,6,2,3,1,5,4};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
         System.out.println(Arrays.toString(a));
    }
}