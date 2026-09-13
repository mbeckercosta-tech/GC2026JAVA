package Animal;

public class GalinhaMae extends Animal {
    public GalinhaMae(String nome, int idade, String cor, String som, String produto) {
        super(nome, idade, cor, produto, som);


    }

    @Override
    public void emitirSom() {
        System.out.println("PÓPÓPÓPÓ");
    }
}
