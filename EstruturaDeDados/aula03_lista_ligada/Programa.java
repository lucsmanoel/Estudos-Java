package aula03_lista_ligada;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("AC");
        System.out.println( "TAMANHO: " + lista.getTamanho());
    }
}
