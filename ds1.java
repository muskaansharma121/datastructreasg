import java.io.*;
 
class Main {
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int N)
    {
        if (index == N)
        {
            for (int j=0; j<N; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
        for (int i=start; i<=end && end-i+1 >= N-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, N);
        }
    }
    static void printCombination(int arr[], int n, int N)
    {
        int data[]=new int[N];
        combinationUtil(arr, data, 0, n-1, 0, N);
    }
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int N = 3;
        int n = arr.length;
        printCombination(arr, n, N);
    }
}