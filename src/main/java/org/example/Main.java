package org.example;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static String statusdoRobo = null, statusdoPrograma = null, statusdeComunicacao = null;
    static int rampa = 0, contadordePecas = 0;

    public static void main(String[] args) {

        int escolha;

        do {
            System.out.println("""
                    \n============ MENU DE OPÇÕES DO ROBÔ ============
                    [1] Parada de Emergência
                    [2] Status do Robô
                    [3] Status do Programa
                    [4] Status de Comunicação
                    [5] Contador de peças
                    """);

            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    System.out.print("Sistema encerrando!");
                    break;

                case 2:
                    statusRobo();
                    break;

                case 3:
                    statusPrograma();
                    break;

                case 4:
                    statusComunicacao();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolha != 1);
    }

    static void statusRobo() {


        if (statusdoRobo != null) {

            System.out.println("===============================");
            System.out.println("Status do Robô: " + statusdoRobo);

            if (statusdoRobo.equals("Em execução")) {
                System.out.println("Rampa " + rampa + " em execução");
            }

            System.out.println("===============================");

            System.out.println("Deseja mudar o status do robô?");
            System.out.println("[1] Sim\n[2] Não");

            int modificador = input.nextInt();

            if (modificador == 2) {
                return;
            }
        }


        System.out.println("Qual o estado do robô no momento?");
        System.out.println("[1] Em execução\n[2] Em repouso");

        int escolha = input.nextInt();

        switch (escolha) {

            case 1:
                statusdoRobo = "Em execução";

                System.out.println("Qual rampa está sendo utilizada?");
                rampa = input.nextInt();
                break;

            case 2:
                statusdoRobo = "Em repouso";
                rampa = 0;
                break;

            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("===============================");
        System.out.println("Status do Robô: " + statusdoRobo);

        if (statusdoRobo.equals("Em execução")) {
            System.out.println("Rampa " + rampa + " em execução");
        }

        System.out.println("===============================\n");
    }

    static void statusPrograma(){

        int escolha;

        if(statusdoPrograma != null){

            System.out.println("Status: "+statusdoPrograma);

            System.out.println("Deseja mudar o estado do programa de controle do robô?\n[1] Sim\n[2] Não");
            escolha = input.nextInt();

            if (escolha == 1) {
                System.out.println("O programa de controle do robô está:\n[1] Habilitado\n[2] Desabilitado");

                escolha = input.nextInt();

                switch (escolha) {
                    case 1:
                        statusdoPrograma = "Habilitado";
                        break;

                    case 2:
                        statusdoPrograma = "Desabilitado";
                        break;
                }

            }

        }else{
            System.out.println("O programa de controle do robô está:\n[1] Habilitado\n[2] Desabilitado");
            escolha = input.nextInt();

            switch (escolha){

                case 1:
                    statusdoPrograma = "Habilitado";
                    break;

                case 2:
                    statusdoPrograma = "Desabilitado";
                    break;

                default:
                    System.out.println("Opção indisponivel.");
                    return;

            }
            System.out.println("Status: "+statusdoPrograma);


        }




    }

    static void statusComunicacao(){

        int escolha;

        if(statusdeComunicacao != null){

            System.out.println("Status de comunicação: "+statusdeComunicacao);

        }else{

            System.out.println("O estado de conexão com o sistema está:\n[1] Online\n[2] Offline");

            escolha = input.nextInt();

            switch (escolha){

                case 1:
                    statusdeComunicacao = "Online";
                    break;

                case 2:
                    statusdeComunicacao = "Offline";
                    break;

                default:
                    System.out.println("Opção inválida.");

            }


        }




    }

    static void contadorPecas(){

        int escolha;

        if(contadordePecas != 0){

            System.out.println("Peças processadas até o momento: "+contadordePecas);

            System.out.println("Deseja cadastrar o processamento de mais peças?");
            escolha = input.nextInt();


        }



    }

}