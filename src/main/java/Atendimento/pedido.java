package Atendimento;
import Pizzas.pizza;
import Pizzas.tipos.pizzassalgadas;
import Pizzas.tipos.pizzasdoces;
import Bebidas.bebidas;
import Bebidas.refrigerantes;

import java.util.Scanner;
import java.util.ArrayList;


public class pedido {

    public static int leitorSabor;
    public static int leitorSabor2;

    public static float precoFinal = 0;

    public static String dadosPedido;
    public static String dadosPedidoLa;

    public static void getDados() {

        Scanner scanner = new Scanner(System.in);

        String nomeC;
        String telC;
        String enderecoC;
        String CPFC;

        System.out.println("Qual é o seu nome? ");
        nomeC = scanner.nextLine();
        System.out.println("Qual é o seu CPF? ");
        CPFC = scanner.nextLine();
        System.out.println("Qual é o seu telefone? ");
        telC = scanner.nextLine();
        System.out.println("Qual é o seu endereço? ");
        enderecoC = scanner.nextLine();


        dadosPedido = "Dados do requeremte: "
                + "\n Nome: " + nomeC
                + "\n CPF: " + CPFC
                + "\n Telefone: "+ telC
                + "\n Endereço: " + enderecoC + "\n";
    }

    public static void getPizza() {

        pizza pizza = new pizza();



        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o sabor da primeira metade da pizza? \n "
                + "(1) - Salgada \n "
                + "(2) - Doce \n");

        int sabor = scanner.nextInt();

        ArrayList <Float> precoSabor = new ArrayList<Float>();

        if(sabor == 1) {

            System.out.println("Escolha a primeira metade:");

            for (pizzassalgadas saborSalgada : pizza.getSaboresSalgada()) {
                System.out.printf("(%d) - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomePizza());
                precoSabor.add(saborSalgada.getPrecoPizza());
            }

            leitorSabor = scanner.nextInt();

            precoFinal = precoFinal + (precoSabor.get(leitorSabor - 1)/2);


            System.out.println("Qual é o sabor da segunda metade da pizza? \n "
                    + "(1) - Salgada \n "
                    + "(2) - Doce \n");

            int sabor2 = scanner.nextInt();

            System.out.println("Escolha a segunda metade:");

            if(sabor2 == 1) {

                for (pizzassalgadas saborSalgada : pizza.getSaboresSalgada()) {
                    System.out.printf("(%d) - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomePizza());
                    precoSabor.add(saborSalgada.getPrecoPizza());
                }

                leitorSabor2 = scanner.nextInt();

                precoFinal = precoFinal + (precoSabor.get(leitorSabor2 - 1)/2);

                System.out.println("Preço da pizza: " + precoFinal);

            } else if (sabor2 == 2) {

                for (pizzasdoces saborDoce : pizza.getSaboresDoces()) {
                    System.out.printf("(%d) - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomePizza());
                    precoSabor.add(saborDoce.getPrecoPizza());
                }

                leitorSabor2 = scanner.nextInt();

                precoFinal = precoFinal + (precoSabor.get(leitorSabor2 - 1)/2);

                System.out.println("Preço da pizza: " + precoFinal);

            }

        } else if (sabor == 2) {

            for (pizzasdoces saborDoce : pizza.getSaboresDoces()) {
                System.out.printf("(%d) - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomePizza());
                precoSabor.add(saborDoce.getPrecoPizza());
            }

            leitorSabor = scanner.nextInt();

            precoFinal = precoFinal + (precoSabor.get(leitorSabor - 1)/2);

            System.out.println("Qual é o sabor da segunda metade da pizza? \n "
                    + "(1) - Salgada \n "
                    + "(2) - Doce \n");

            int sabor2 = scanner.nextInt();

            System.out.println("Escolha a segunda metade:");

            if(sabor2 == 1) {

                for (pizzassalgadas saborSalgada : pizza.getSaboresSalgada()) {
                    System.out.printf("(%d) - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomePizza());
                    precoSabor.add(saborSalgada.getPrecoPizza());
                }

                leitorSabor2 = scanner.nextInt();

                precoFinal = precoFinal + (precoSabor.get(leitorSabor2 - 1)/2);

                System.out.println("Preço da pizza: " + precoFinal);

            } else if (sabor2 == 2) {

                for (pizzasdoces saborDoce : pizza.getSaboresDoces()) {
                    System.out.printf("(%d) - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomePizza());
                    precoSabor.add(saborDoce.getPrecoPizza());
                }

                leitorSabor2 = scanner.nextInt();

                precoFinal = precoFinal + (precoSabor.get(leitorSabor2 - 1)/2);

                System.out.println("Preço da pizza: " + precoFinal);

            }

        }
    }

    public static void getBebida() {

        ArrayList<Float> valoresBebida = new ArrayList<Float>();

        bebidas bebidas = new bebidas();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seria a bebida?\n ");

        for(refrigerantes tipoRefri: bebidas.getTipoBebida()){
            System.out.printf("%d - %s\n",tipoRefri.ordinal()+1,tipoRefri.getNomeBebida());
            valoresBebida.add(tipoRefri.getPrecoBebida());
        }
        int leitor = scanner.nextInt();

        precoFinal = precoFinal + (valoresBebida.get((leitor - 1)));
    }

    public static void getPagamento() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual será a forma de pagamento? \n"
                + "(1) - PIX \n"
                + "(2) - Cartão de débito \n"
                + "(3) - Cartão de crédito");

        int formaPagamento = scanner.nextInt();

        if(formaPagamento == 1) {
            scanner.nextLine();
            System.out.println("CPF:");
            String CPFc = scanner.nextLine();
            System.out.println("Nome:");
            String nomec = scanner.nextLine();
            System.out.println("(QR CODE) \n"
                    + "(CHAVE DA PIZZARIA) \n"
                    + "O total ficou: " + precoFinal + "R$");
            dadosPedido = dadosPedido + "Forma de pagamento: PIX \n";
            dadosPedidoLa = "Forma de pagamento: PIX \n";
        } else if(formaPagamento == 2) {
            scanner.nextLine();
            System.out.println("Número do cartão:");
            String numeroDebito = scanner.nextLine();
            System.out.println("Nome no cartão:");
            String nomeDebito = scanner.nextLine();
            System.out.println("CVV:");
            String cvvDebito = scanner.nextLine();
            System.out.println("Data de validade cartão:");
            String validadeDebito = scanner.nextLine();
            System.out.println("O total ficou: " + precoFinal + "R$");
            dadosPedido = dadosPedido + "Forma de pagamento: Débito \n";
            dadosPedidoLa = "Forma de pagamento: Débito \n";
        } else if(formaPagamento == 3) {
            scanner.nextLine();
            System.out.println("Número do cartão:");
            String numeroCredito = scanner.nextLine();
            System.out.println("Nome no cartão:");
            String nomeCredito = scanner.nextLine();
            System.out.println("CVV:");
            String cvvCredito = scanner.nextLine();
            System.out.println("Data de validade cartão:");
            String validadeCredito = scanner.nextLine();
            System.out.println("O total ficou: " + precoFinal + "R$");
            dadosPedido = dadosPedido + "Forma de pagamento: Crédito \n";
            dadosPedidoLa = "Forma de pagamento: Crédito \n";
        }
    }

    public static void getPedido() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual será o método de entrega? \n "
                + "(1) - Retirada no balcão \n "
                + "(2) - Delivery \n "
                + "(3) - La Carte \n ");

        int tipoEntrega = scanner.nextInt();

        switch(tipoEntrega) {
            case 1:
                getDados();
                getPizza();
                getBebida();
                getPagamento();
                dadosPedido = dadosPedido + "Forma de entrega: Retirada no balcão \n";
                System.out.println(dadosPedido);
                break;
            case 2:
                precoFinal = precoFinal + 20; // frete
                getDados();
                getPizza();
                getBebida();
                getPagamento();
                dadosPedido = dadosPedido + "Forma de entrega: Delivery \n";
                System.out.println(dadosPedido);
                break;
            case 3:
                getPizza();
                getBebida();
                getPagamento();
                dadosPedidoLa = dadosPedidoLa + "Forma de entrega: La Carte \n";
                System.out.println(dadosPedidoLa);
                break;
        }


    }
}
