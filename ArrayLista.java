import java.util.Scanner;
import java.util.ArrayList;
public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String resp = "";

        while(true){
            System.out.println("Insert a name: ");
            names.add(sc.next());
            System.out.println("Do your wish to type other name? Y or N ");
            resp = sc.next().toUpperCase();
            if(resp.equals("N")){
                break;
            }
        }
        for (String name: names) {
            System.out.println(name);

        }
    }
}
