import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sb.append((int)Math.pow(2, n)-1).append('\n');
        TOH(n, 1, 2, 3);
        System.out.print(sb);
    }

    static void TOH(int n, int start, int temp, int goal) {
        if(n==0) return;
        TOH(n-1, start, goal, temp);
        move(start, goal);
        TOH(n-1, temp, start, goal);
    }

    static void move(int start, int goal) {
        sb.append(start + " " + goal + "\n");
    }
}