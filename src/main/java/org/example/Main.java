package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir =true;
        while (seguir){
            System.out.println("menu principal");
            System.out.println("1.-comprar entrada" );
            System.out.println("salir");
            System.out.println("selecione una opcion");

            int opcion =scanner.nextInt();
            scanner.nextLine();

            if(opcion == 1){
                System.out.println("Zonas disponibles: A,B,C");
                System.out.println("ingrese la zona deseada");
                String zona = scanner.nextLine().toUpperCase();
                if (zona.equals("A")&&!zona.equals("B")&&!zona.equals("C")) {
                    System.out.println("zona invalida.intente nuevamente.");
                    continue;
                }
                int preciobase = 0;
                if (zona.equals("A")) {
                 int   preciobase = 20.000;
                } else if (zona.equals("B")) {
                    int preciobase = 15.000;
                } else if ( zona.equals("C")) {
                    int preciobase = 10.000;
                }
                System.out.println("ingrese su edad:");
                int edad = scanner.nextInt();
                scanner.nextLine();

                if (edad < 0) {
                    System.out.println("edad invalida.intente nuevamente");
                    continue;
                }
                double descuento = 0;
                if (edad <=25) {
                    descuento = 0.10; // 10% para estudiantes
                } else if (edad >=60) {
                    descuento = 0.15; //15% tercera edad
                }
                double preciofinal= preciobase;
                int i = 0;
                while (i< 1) {
                    preciofinal = preciobase * (1 - descuento);
                    i++;
                }
                System.out.println("resumen de la compra:");
                System.out.println("zona:"+ zona);
                System.out.println("precio base:$"+ preciobase);
                System.out.println("descuento aplicado:"+ (int)(descuento * 100) +"%");
                System.out.println("precio final a pagar: $" + preciofinal);


                System.out.println("desea realizar otra compra(si/ no :");
                String respuesta = scanner.nextLine().toLowerCase();
                if (!respuesta.equals("si")) {
                    seguir = false;
                    System.out.println("hasta luego");
                }else{
                    System.out.println("opcion invalida.intente de nuevo");

                    scanner.close();
                }



            }


            }

            }
            }
        }
}