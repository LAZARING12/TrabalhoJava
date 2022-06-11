import java.util.Scanner;

public class cinema1 {


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    // imprimir menu
    public static void printMenu(String[] opções) {

        for (int i = 0; i < opções.length; i++) {
            System.out.println(opções[i]);
        }
            System.out.print("Escolha uma opção: ");
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opção = 1;


        // imprimir menu
        while (opção != 4) {
            String[] opções = { "1 - Reservar", "2 - Comprar", "3 - Relatórios","4 - Sair" };
            clearScreen();
            System.out.println("-----CINEMA-----");
            printMenu(opções);
            opção = in.nextInt();
            switch (opção){
                case 1:
                    opção1 ();
                    break;
                case 2:
                    opção2 ();
                    break;
                case 3:
                    opção3 ();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                
            }
        }
        
    }
    
    public static void opção1(){
        int opçãoReserva = 1;
        Scanner in = new Scanner(System.in);
        while (opçãoReserva != 4){
            clearScreen();
            System.out.println("-----Reserva-----");
            System.out.println("1 - Reservar cadeira");
            System.out.println("2 - Ver cadeiras reservadas");
            System.out.println("3 - Cancelar reserva");
            System.out.println("4 - Sair");
            opçãoReserva = in.nextInt();

        }
    }

    public static void opção2(){
        int opçãoCompra = 1;
        Scanner in = new Scanner(System.in);
        while (opçãoCompra != 3){
            clearScreen();
            System.out.println("-----Comprar-----");
            System.out.println("1 - Comprar cadeira");
            System.out.println("2 - Ver cadeiras compradas");
            System.out.println("3 - Sair");
            opçãoCompra = in.nextInt();

        }
    }

    public static void opção3(){
        int opçãoRelatorio = 1;
        Scanner in = new Scanner(System.in);
        while (opçãoRelatorio != 2){
            clearScreen();
            System.out.println("-----Relatório-----");
            System.out.println("1 - Ver relatórios");
            System.out.println("2 - Sair");
            opçãoRelatorio = in.nextInt();

        }
    }
    
 }
 
