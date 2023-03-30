import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [][] matriz = new int[11][11];
        int i;
        int x;

//        for (i=0; i<=10; i++){
//            for(x=0; x<=10; x++){
//                if(i*x<=9) {
//                        System.out.print("\t\t0"+i+"x0"+x+"="+"[" + (matriz[i][x] = i*x) + "\t");
////                    System.out.print((matriz[i][x] = i*x)+"\t");
//                }else if (i*x<=99){
//                    System.out.print("\t"+i+" x "+x+" = "+"0" + (matriz[i][x] = i*x) + "\t");
////                    System.out.print((matriz[i][x] = i*x)+"\t");
//                }else{
//                    System.out.print((matriz[i][x] = i*x)+"\t");
////                    System.out.print("\t\t"+i+"x"+x+"="+"[" + (matriz[i][x] = i*x) + "]\t");
//                }
//            }
//            System.out.println(" ");
//        }

        for (i=0; i<=10; i++){
            for(x=0; x<=10; x++){
                int resultado = i*x;
                matriz[i][x] = resultado;
            }
        }

        for (i=0; i<=10; i++) {
            System.out.println("\n\033[31;;1m--=== Tabuada ===-- \033[m\n");
            for (x = 0; x <= 10; x++) {
                System.out.println(i+"x"+x+"="+matriz[i][x]+"\t\t");
            }
        }
    }
}
