import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-=-=-=-=BEM VINDO-=-=-=-=");
        System.out.println("O jogo consiste em você acertar onde \nestá o tesouro dentro da matriz.\n");

        int[][] matriz = new int[5][5];
//        int chances = 3;
        Random rand = new Random();
        int coluna = rand.nextInt(5);
        int linha = rand.nextInt(5);
        System.out.println(coluna);
        System.out.println(linha);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print("-\t");
                }
            }
            System.out.println("");

        }

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a linha da matriz onde se encontra o tesouro: ");
            int linhaU = sc.nextInt();
            System.out.print("Digite a coluna da matriz onde se encontra o tesouro: ");
            int colunaU = sc.nextInt();

            if(linha == linhaU && colunaU == coluna) {
                matriz[coluna][linha] = 1;
                System.out.println("Parabéns você acertou!!!");
                for (int k = 0; k < 5; k++) {
                    for (int j = 0; j < 5; j++) {
                        if (matriz[k][j] == 0) {
                            System.out.print("-\t");
                        } else if (matriz[k][j] == 1) {
                            System.out.print("*\t");
                        } else if(matriz[k][j] == 2) {
                            System.out.print("X\t");

                        }
                    }
                    System.out.println("");

                }
            }else{
               matriz[colunaU][linhaU] = 2;
                for (int l = 0; l < 5; l++) {
                    for(int m = 0; m < 5; m++) {
                        if (matriz[l][m] == 2) {
                            System.out.print("X\t");
                        } else if (matriz[l][m] == 0) {
                            System.out.print("-\t");
                        } else if (matriz[l][m] == 1) {
                            System.out.print("*\t");
                        }
                    }
                    System.out.println("");
                }
            }
        }
    }
}





