import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar: ");
        int n = sc.nextInt();
        Integer [] vetor = new Integer[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Qual é o número no índice " + (i+1)+" : ");
            int num = sc.nextInt();
            vetor[i] = num;
            total += num;
        }

        int media = total / n;
        System.out.println(media);
    }
}
