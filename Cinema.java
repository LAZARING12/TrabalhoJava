import java.util.Scanner;

public class Cinema {

    //Função de limpar terminal
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    
    //Função que imprimi o menu
    public static void printMenu(String[] opções) {

        for (int i = 0; i < opções.length; i++) {
            System.out.println(opções[i]);
        }
        System.out.print("Escolha uma opção: ");
    }


    //Menu Principal
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opção = 1;

        while (opção != 4) {
            String[] opções = { "1 - Reservar", "2 - Comprar", "3 - Relatórios", "4 - Sair" };
            clearScreen();
            System.out.println("-----CINEMA-----");
            printMenu(opções);
            opção = in.nextInt();

            switch (opção) {
                case 1:
                    opção1();
                    break;
                case 2:
                    opção2();
                    break;
                case 3:
                    opção3();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;

            }
        }
        in.close();
    }


    // Menu de Reserva
    public static void opção1() {
        Scanner in = new Scanner(System.in);
        int opcaoReserva = 1;
        while (opcaoReserva != 4) {
            clearScreen();
            System.out.println("-----Reserva-----");
            System.out.println("1 - Ver cadeiras disponiveis");
            System.out.println("2 - Escolher cadeira");
            System.out.println("3 - Cancelar");
            System.out.println("4 - Sair");
            opcaoReserva = in.nextInt();
        }

        switch (opcaoReserva) {
            case 1:
                opção1();
                break;
            case 2:
                opção2();
                break;
            case 3:
                opção3();
                break;
            case 4:
                System.out.println("Saindo...");
                break;
        }
        in.close();
    }


    // Menu de Compra
    public static void opção2() {
        Scanner in = new Scanner(System.in);
        int opcaoCompra = 1;
        while (opcaoCompra != 4) {
            clearScreen();
            System.out.println("-----Compra-----");
            System.out.println("1 - Comprar cadeira escolhida");
            System.out.println("2 - Ver cadeiras compradas");
            System.out.println("3 - Cancelar compra");
            System.out.println("4 - Sair");
            opcaoCompra = in.nextInt();

            switch (opcaoCompra) {
                case 1:
                    opção1();
                    break;
                case 2:
                    opção2();
                    break;
                case 3:
                    opção3();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        }
        in.close();
    }


    // Menu de Relatório
    public static void opção3() {
        Scanner in = new Scanner(System.in);
        int opcaoRelatorio = 1;

        while (opcaoRelatorio != 3) {
            clearScreen();
            System.out.println("-----Relatório-----");
            System.out.println("1 - Relatório de reserva");
            System.out.println("2 - Relatóroio de compra");
            System.out.println("3 - Sair");
            opcaoRelatorio = in.nextInt();

            switch (opcaoRelatorio) {
                case 1:
                    opção1();
                    break;
                case 2:
                    opção2();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
            }
        }
        in.close();
    }

}