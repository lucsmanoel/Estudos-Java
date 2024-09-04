package aula01;

public class aula01{
    public static void main(String[] args) {
        /*
        lenght é o tamanho, então enquanto i < tamanho do array ele continuar contar
         */  
        double [] notas = new double[5];
        for(int i = 0; i < notas.length; i++){
            notas[i] = i;
        }
         for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
         }

    }
}