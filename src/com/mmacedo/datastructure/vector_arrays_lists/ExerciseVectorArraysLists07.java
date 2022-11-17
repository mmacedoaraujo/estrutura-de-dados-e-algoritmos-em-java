package com.mmacedo.datastructure.vector_arrays_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseVectorArraysLists07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Contact> contactList = new ArrayList<>();

        int option = 1;

        while (option != 0) {
            option = getOptionFromMenu(scan);
            menuActions(option, contactList, scan);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Usuário digitou 0, programa encerrou.");

    }

    private static void menuActions(int option, List<Contact> list, Scanner scan) {
        Contact contact = new Contact();
        int position = 0;
        switch (option) {
            case 1:
                System.out.println("Criando um contato no final do vetor, entre com as informações: ");
                contactInformationGatherer(scan, list, contact, option);
                try {
                    list.add(contact);
                    System.out.println("Elemento adicionado com sucesso!");
                } catch (Exception ex) {
                    System.out.println("Erro ao inserir novo elemento");
                }
                break;
            case 2:
                try {
                    System.out.println("Adicionando um contato numa posição específica, entre com as informações: ");
                    System.out.println("Insira a posição em que deseja inserir o contato: ");
                    position = Integer.valueOf(scan.nextLine());
                    System.out.println("Insira o nome do contato: ");
                    String name = scan.nextLine();
                    System.out.println("Insira o número do contato: ");
                    Integer number = Integer.valueOf(scan.nextLine());
                    System.out.println("Insira o email do contato: ");
                    String email = scan.nextLine();
                    contact.setName(name);
                    contact.setNumber(number);
                    contact.setEmail(email);
                } catch (Exception ex) {
                    menuReturnWhenExceptionOccurs(option, list, scan);
                }
                try {
                    list.add(position, contact);
                    System.out.println("Elemento adicionado com sucesso!");
                } catch (Exception ex) {
                    System.out.println("Erro ao inserir novo elemento");
                }
                break;
            case 3:
                try {
                    System.out.println("Obtendo um contato  de uma posição específica, entre com a posição que deseja saber: ");
                    position = Integer.valueOf(scan.nextLine());
                } catch (Exception ex) {
                    menuReturnWhenExceptionOccurs(option, list, scan);
                }
                System.out.println(list.get(position));
                break;

            case 4:
                System.out.println("Consultando um contato, entre com as informações: ");
                System.out.println("Insira nome, número ou email para verificar: ");
                String variable = String.valueOf(scan.nextLine());
                list = list.stream().filter(x -> x.getName().equals(variable) || String.valueOf(x.getNumber()).equals(variable) || x.getEmail().equals(variable)).collect(Collectors.toList());
                System.out.println(list);
                break;
            case 5:
                System.out.println("Consultando o último índice do contato, entre com as informações: ");
                contactInformationGatherer(scan, list, contact, option);
                System.out.println(list.lastIndexOf(contact));
                break;
            case 6:
                System.out.println("Verificando se o contato existe, entre com as informações: ");
                contactInformationGatherer(scan, list, contact, option);
                System.out.println(list.contains(contact));
                break;
            case 7:
                try {
                    System.out.println("Excluindo um contato pela posição, entre com a posição desejada: ");
                    position = Integer.valueOf(scan.nextLine());
                    list.remove(position);
                } catch (Exception ex) {
                    menuReturnWhenExceptionOccurs(option, list, scan);
                }
                break;
            case 8:
                System.out.println("Excluindo um contato, entre com as informações: ");
                contactInformationGatherer(scan, list, contact, option);
                list.remove(contact);
                break;
            case 9:
                System.out.println("\n O tamanho do vetor é: " + list.size() + "\n");
                break;

            case 10:
                list.clear();
                break;

            case 11:
                System.out.println("\n" + list + "\n");
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

    public static void contactInformationGatherer(Scanner scan, List<Contact> list, Contact contact, int option) {
        try {
            System.out.println("Insira o nome do contato: ");
            String name = scan.nextLine();
            System.out.println("Insira o número do contato: ");
            Integer number = Integer.valueOf(scan.nextLine());
            System.out.println("Insira o email do contato: ");
            String email = scan.nextLine();
            contact.setName(name);
            contact.setNumber(number);
            contact.setEmail(email);
        } catch (Exception ex) {
            menuReturnWhenExceptionOccurs(option, list, scan);
        }
    }

    public static void menuReturnWhenExceptionOccurs(int option, List<Contact> list, Scanner scan) {
        System.out.println("\nEntrada inválida, tente novamente.\n");
        menuActions(option, list, scan);
    }
}
