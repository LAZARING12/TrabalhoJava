import java.util.Scanner;
public class cinema {
 
static Scanner in = new Scanner(System.in);
    // Função de limpar terminal
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
 
    // Função que imprimi o menu
    public static void printMenu(String[] opções) {
 
        for (int i = 0; i < opções.length; i++) {
            System.out.println(opções[i]);
        }
        System.out.print("Escolha uma opção: ");
    }
 
    // Menu Principal
    public static void main(String[] args) {
       
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
       
    }
 
    // Imprime Menu da Reserva;
 
    public static void printReserva(String[] opçõesReserva) {
 
        for (int i = 0; i < opçõesReserva.length; i++) {
            System.out.println(opçõesReserva[i]);
        }
        System.out.print("Escolha uma opção: ");
    }
 
    // Menu de Reserva
    public static void opção1() {
       
        int Reserva = 1;
        clearScreen();
        while (Reserva != 4) {
            String[] opçõesReserva = { "1 - Ver cadeiras disponíveis", "2 - Escolher cadeiras", "3 - Cancelar",
                    "4 - Sair" };
           
            System.out.println("-----Reserva-----");
            printReserva(opçõesReserva);
            Reserva = in.nextInt();
 
 
 
            switch (Reserva) {
                case 1:
                    Reserva1();
                    break;
                case 2:
                    Reserva2();
                    break;
                case 3:
                    Reserva3();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                   
            }
           
        }
    }
 
    //Cadeiras disponiveis
    public static void Reserva1() {
       
        System.out.println("Exibindo cadeiras... AGUARDE");
       
    }
    // Escolher cadeiras
    public static void Reserva2() {
       
        System.out.println("Escolhendo Cadeiras... AGUARDE");
       
    }

    public static void Reserva3(){

        System.out.println("Deseja Cancelar qual Cadeira?");
    }
   


    
    public static void printCompra(String[] opçõesCompra) {
 
        for (int i = 0; i < opçõesCompra.length; i++) {
            System.out.println(opçõesCompra[i]);
        }
        System.out.print("Escolha uma opção: ");
    }
 
    // Menu de Compra
    public static void opção2() {
       
        int Compra = 1;
        clearScreen();
        while (Compra != 4) {
            String[] opçõesCompra = { "1 - Ver cadeiras disponíveis", "2 - Escolher cadeiras", "3 - Cancelar",
                    "4 - Sair" };
           
            System.out.println("-----Compra-----");
            printCompra(opçõesCompra);
            Compra = in.nextInt();

            switch (Compra) {
                case 1:
                    Compra1();
                    break;
                case 2:
                    Compra2();
                    break;
                case 3:
                    Compra3();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                   
            }
        }
       
    }

    public static void Compra1(){
        System.out.println("Exibindo Cadeiras... AGUARDE");
    }

    public static void Compra2(){
        System.out.println("Escolhendo Cadeiras... AGUARDE");
    }

    public static void Compra3(){
        System.out.println("Cancelar Compra de Cadeiras... AGUARDE");
    }

 
    public static void printRelatorio(String[] opçõesRelatorio) {
 
        for (int i = 0; i < opçõesRelatorio.length; i++) {
            System.out.println(opçõesRelatorio[i]);
        }
        System.out.print("Escolha uma opção: ");
    }
 
    // Menu de Relatorio
    public static void opção3() {
       
        int Relatorio = 1;
        clearScreen();
        while (Relatorio != 3) {
            String[] opçõesRelatorio = { "1 - Ver relatório de Reserva", "2 - Ver relatório de Compra",
                    "3 - Sair" };
           
            System.out.println("-----Relatorio-----");
            printRelatorio(opçõesRelatorio);
            Relatorio = in.nextInt();

            switch (Relatorio) {
                case 1:
                    Relatorio1();
                    break;
                case 2:
                    Relatorio2();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;     
            }
        }
       
    }
    

    public static void Relatorio1(){
        System.out.println("Exibindo Relatório de Reservas... AGUARDE");
    }

    public static void Relatorio2(){
        System.out.println("Exibindo Relatório de Compras... AGUARDE");
    }
       
}
