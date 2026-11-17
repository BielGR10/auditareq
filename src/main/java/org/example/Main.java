package org.example;

import java.util.Scanner;



public class Main {
    static Scanner input = new Scanner(System.in);

    static void main() {


        int escolha;

        do {
            System.out.println("""
                    \n============ MENU DE OPÇÕES DO ROBÔ ============
                    [1] Parada de Emergência
                    [2] Status do Robô
                    [3] Status do Programa
                    
                    
                    
                    """);
            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Sistema encerrando!");
                    break;

                case 2:
                    statusRobo();
                    break;


            }


        } while (escolha != 1);


    }

    static void statusRobo() {

        String statusdorobo = null;
        int escolha, modificador = 0, rampa = 0;

        do {

            if (statusdorobo == null) {

                System.out.println("Qual o estado do robo no momento?");
                System.out.println("[1] Em execução\n[2] Em repouso");

                escolha = input.nextInt();

                switch (escolha) {

                    case 1:
                        statusdorobo = "Em execução";

                        System.out.println("Qual rampa está sendo utilizada?");
                        rampa = input.nextInt();
                        break;

                    case 2:
                        statusdorobo = "Em repouso";
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        continue;
                }

            } else {

                System.out.println("===============================");
                System.out.println("Status do Robô: " + statusdorobo);

                if (statusdorobo.equals("Em execução")) {
                    System.out.println("Rampa " + rampa + " em execução");
                }

            }

            System.out.println("Deseja mudar o status do robô?");
            System.out.println("[1] Sim\n[2] Não");

            modificador = input.nextInt();

            if (modificador == 1) {
                statusdorobo = "";
            }

        } while (modificador == 1);
        System.out.println("===============================");
        System.out.println("Status do Robô: " + statusdorobo);

        if (statusdorobo.equals("Em execução")) {
            System.out.println("Rampa " + rampa + " em execução");

        }
    }
}


