package com.mmacedo.datastructure.vector_arrays_lists;

import com.mmacedo.datastructure.vector.List;

import java.util.Random;
import java.util.Scanner;

public class ExerciseVectorArraysLists06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Contact> contactList = new List<>(20);
        System.out.println(contactList);
        createContactDinamically(10, contactList);

        int option = 1;

        while (option != 0) {
            option = getOptionFromMenu(scan);
            menuActions(option, contactList, scan);
        }

        System.out.println("Usuário digitou 0, programa encerrou.");

    }

    private static void menuActions(int option, List<Contact> list, Scanner scan) {
        Contact contact = new Contact();
        switch (option) {
            case 1:
                try {
                    System.out.println("Insira o nome do contato: ");
                    String name = scan.nextLine();
                    System.out.println("Insira o número do contato: ");
                    Integer number = Integer.valueOf(scan.nextLine());
                    System.out.println("Insira o email do contato: ");
                    String email = scan.nextLine();
                    Contact contactCreated = new Contact(name, number, email);
                    list.addNewElement(contactCreated);
                    System.out.println("\n" + list.get(list.size() - 1) + "\n");
                } catch (Exception ex) {
                    System.out.println("\nEntrada inválida, tente novamente.\n");
                    menuActions(1, list, scan);
                }

                break;
            case 2:
                try {
                    System.out.println("Insira a posição em que deseja inserir o contato: ");
                    Integer position = Integer.valueOf(scan.nextLine());
                    System.out.println("Insira o nome do contato: ");
                    String name = scan.nextLine();
                    System.out.println("Insira o número do contato: ");
                    Integer number = Integer.valueOf(scan.nextLine());
                    System.out.println("Insira o email do contato: ");
                    String email = scan.nextLine();
                    Contact contactCreated = new Contact(name, number, email);
                    list.addNewElement(contactCreated, position);
                    System.out.println(list.get(position));
                } catch (Exception ex) {
                    System.out.println("\nEntrada inválida, tente novamente.\n");
                    menuActions(1, list, scan);
                }
                break;

            case 3:
                try {
                    System.out.println("Insira a posição do contato: ");
                    Integer position = Integer.valueOf(scan.nextLine());
                    System.out.println(list.get(position));
                } catch (Exception ex) {
                    System.out.println("\nEntrada inválida, tente novamente.\n");
                    menuActions(3, list, scan);
                }
                break;
            case 4:
                try {
                    System.out.println("Insira o nome do contato que deseja saber a posição: ");
                    String name = scan.nextLine();
                    System.out.println("Insira o número do contato que deseja saber a posição: ");
                    Integer number = Integer.valueOf(scan.nextLine());
                    System.out.println("Insira o email do contato que deseja saber a posição: ");
                    String email = scan.nextLine();
                    contact.setName(name);
                    contact.setNumber(number);
                    contact.setEmail(email);
                    System.out.println(list.get(contact));
                } catch (Exception ex) {
                    System.out.println("\nEntrada inválida, tente novamente.\n");
                    menuActions(3, list, scan);
                }
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;

            case 8:

                break;

            case 9:

                break;

            case 10:

                break;

            case 11:

                break;


        }
    }

    private static int getOptionFromMenu(Scanner scan) {

        boolean validEntry = false;
        int option = 0;
        String userEntry = "";

        while (!validEntry) {

            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato numa posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contato do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");


            try {
                userEntry = scan.nextLine();
                option = Integer.parseInt(userEntry);

                if (option >= 0 && option <= 11) {
                    validEntry = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println("Entrada inválida, digite novamente.");
                validEntry = false;
            }

        }
        return option;
    }


    private static void createContactDinamically(int quantity, List<Contact> list) {
        Random random = new Random();
        Contact contact = new Contact();

        for (int i = 0; i <= quantity; i++) {
            contact.setName("Contact " + i);
            contact.setNumber(random.nextInt(99999999));
            contact.setEmail("contact" + i + "@gmail.com");
            list.addNewElement(contact);
        }
    }
}
