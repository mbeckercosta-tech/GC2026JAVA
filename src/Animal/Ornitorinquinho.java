package Animal;

public class Ornitorinquinho extends OrnitorincoMae {
    public Ornitorinquinho(String nome, int idade, String cor, String ID, String raça) {
        super(nome, idade, cor, ID, raça);
    }

    @Override
    public void emitirSom() {
        System.out.println("nhomnhomnhom");
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

