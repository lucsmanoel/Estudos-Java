package aula03_lista_ligada;

public class ListaLigada{
    private Elemento primeiro;
    public Elemento getPrimeiro() {
        return primeiro;
    }
    public ListaLigada(){
        this.tamanho = 0;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    private Elemento ultimo;
    private int tamanho;
    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
    }
    public void remover(String novoValor){

    }
    public Elemento get (int posicao){
        return null;
    }
}
