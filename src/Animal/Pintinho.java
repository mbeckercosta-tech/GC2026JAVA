package Animal;

public class Pintinho extends GalinhaMae {
    public Pintinho(String nome, int idade, String cor, String ID, String raça) {
        super(nome, idade, cor, ID, raça);
    }

    @Override
    public void emitirSom() {
        System.out.println("piupiupiu");
    }

    @Override
    public String coletarProduto() {
        return null;
    }

    @Override
    public String getStatus() {
        return "Filhote: ainda não produz";
    }
}

