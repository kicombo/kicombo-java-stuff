import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int k;

    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        while(true) {
            k = sc.nextInt();
            if(k == 0)
                break;
            arr = new int[k];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            combination(0, k, 6);
            System.out.println();
        }
        sc.close();
    }

    static ArrayList<ArrayList<Integer>> combination(int s, int k, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int j = s; j < k; j++) {
            for (ArrayList<Integer> x : combination(j+1, k-1, n-1)) {
                System.out.print(j);
                for (int element: x) {
                    System.out.print(" " + element);
                }
            }
        }
        return result;
    }
}