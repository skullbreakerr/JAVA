import java.util.Scanner;
public class matrixChainMultiplication {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
    }
    public static int MatrixChainOrder(int arr[],int i, int j){
        if(i==j){
            return 0;
        }
        int k,min = INT_MAX,count;

        for(k=i;k<j;k++){
            count = MatrixChainOrder(arr,i,k)+MatrixChainOrder(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];

            if(count<min){
                min=count;
            }
        }
        return min;

    }
}
