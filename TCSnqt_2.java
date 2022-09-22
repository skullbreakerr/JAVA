import java.util.Scanner;

public class TCSnqt_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n], ar[] = new int[n], cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] != 0) {
                ar[cnt++] = arr[i];
            }
        }

        System.out.println(cnt);
        display(ar);

        in.close();
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}