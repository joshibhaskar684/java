import java.util.*;
public class rec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                    }
                    }
                    System.out.println(count);
                    sc.close();
    }
}