package org.example;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static String statusdorobo = null;
    static int rampa = 0;

    public static void main(String[] args) {

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

                case 3:
                    System.out.println("Programa em execução!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolha != 1);
    }

    static void statusRobo() {


        if (statusdorobo != null) {

            System.out.println("===============================");
            System.out.println("Status do Robô: " + statusdorobo);

            if (statusdorobo.equals("Em execução")) {
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
                statusdorobo = "Em execução";

                System.out.println("Qual rampa está sendo utilizada?");
                rampa = input.nextInt();
                break;

            case 2:
                statusdorobo = "Em repouso";
                rampa = 0;
                break;

            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("===============================");
        System.out.println("Status do Robô: " + statusdorobo);

        if (statusdorobo.equals("Em execução")) {
            System.out.println("Rampa " + rampa + " em execução");
        }

        System.out.println("===============================\n");
    }
}