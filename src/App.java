import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {

            int compados = sc.nextInt();
            int troca = sc.nextInt();
            int garafas = 0;

            while (troca <= compados) {
                compados -= troca;
                garafas++;
            }

            if (troca > compados) {
                garafas += compados;
            }

            arr[i] = garafas;
        }

        for(Integer p : arr){
            System.out.println(p);
        }
        
        sc.close();
    }
}
