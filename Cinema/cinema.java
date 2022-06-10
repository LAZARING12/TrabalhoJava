import java.util.Scanner;

public class cinema {

    public static void printMenu(String[] options){
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Menu Principal
        System.out.println("-----CINEMA-----");
        System.out.println("1 - Reservar Cadeira");
        System.out.println("2 - Cancelar Reserva");
        System.out.println("3 - Comprar Cadeira");
        System.out.println("4 - Ver as Estatísticas");
        int opção = in.nextInt();

        // Opções de seguimento do Menu
        if (opção == 1) {
            for (int col = 1; col <= 9; col++) {
                for (int lin = 1; lin <= 9; lin++) {
                    System.out.print("[" + col + ":" + lin + "]   ");
                    System.out.println();
                    System.out.println();
                }
            }
            // escolha de poltrona
                    System.out.println("escolha sua poltrona:");
                    int poltrona = in.nextInt();

        } else if (opção == 2) {
            System.out.println("-----Cancelar Reserva-----");
            System.out.println("1 - Ver Lugares para Cancelar");
            System.out.println("2 - Cancelar Cadeira");
            int cancelar = in.nextInt();

        } else if (opção == 3) {
            System.out.println("-----Comprar-----");
            System.out.println("1 - Ver Lugares Livres");
            System.out.println("2 - Comprar Lugar");
            int comprar = in.nextInt();

        } else if (opção == 4) {
            System.out.println("-----Relatórios-----");
            System.out.println("1 - Ver relatórios de Reserva");
            System.out.println("2 - Ver relatório de Cancelamento");
            System.out.println("3 - Ver relatório de Compra");
            int relatorio = in.nextInt();

            if (relatorio == 1) {
                System.out.println("-----Reservas-----");
            } else if (relatorio == 2) {
                System.out.println("-----Cancelamento-----");
            } else if (relatorio == 3) {
                System.out.println("-----Compras-----");
            }
        }

        in.close();
    }
}
