import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[6];
        int [] vetor1 = new int[6];
        int soma = 0;


        for(int i = 0; i<vetor.length;i++){
            System.out.print((i+1)+"º"+"Valor do primeiro Array: " );
            int n1 = sc.nextInt();
            vetor[i]=n1;
        }

        System.out.println("\n");

        for(int x = 0; x<vetor1.length;x++){
            System.out.print("Valores do " + (x+1) + " do segundo Array: " );
            int n2 = sc.nextInt();
            vetor1[x]=n2;
        }

        for(int y = 0; y<vetor.length;y++) {
            soma = vetor[y] + vetor1[y];
            System.out.print("[" + soma + "]" + " ");

        }

        }

    }

