package aula02_vetor;

import java.util.Scanner;

public class SecondMain {
    public static void main(String[] args) {
        String[]estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for(int i =0; i < estados.length; i++){
            System.out.println("Estados " +  i  + ": " + estados[i]);

        }
    try (//Utilizo o scanner para receber dados do usuario abaixo está a sintax
        Scanner leitor = new Scanner(System.in)) {
            System.out.println("Qual sigla de estado você quer ?");
            String siglaBuscar = leitor.next();

            //Busca Linear: vai procurar desde primeira até a ultima perguntando se é o contéudo que você está buscando.(Porém a busca linear não é uma busca rapida.)

            for(int i =0; i < estados.length; i++){
               String elemento = estados[i];
               if (elemento.equals(siglaBuscar)){
                System.out.println("Achoooou!!!!!");
                break;
               }else{
                System.out.println("Não Achou ");
               }
            }
        }
    }
} 
