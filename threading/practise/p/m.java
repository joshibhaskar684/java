package p;
// program to find small and large no in  an array
public class m{
    public static void main(String[] args) {
        int a[]={1,3,-1,43,24,34,234,3};
        max(a);
        min(a);
    }
    public static void max( int a[]){
        int n=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>n){
                n=a[i];
            }
        }

        System.out.println( "max is"+n);
    }
    public static void min( int a[]){
        int n=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<n){
                n=a[i];
            }
        }
        System.out.println( "min is" + n);
    }
}