package Animal;

public class VacaMae extends AnimalBase {
    public VacaMae(String nome, int idade, String cor, String ID, String raça) {
        super(nome, idade, cor, ID, raça);
    }

    @Override
    public void emitirSom() {
        System.out.println("MUUUUUUUUUUUUUUUUUUUUUU");
    }
    @Override
    public String coletarProduto() {
        System.out.println("Você coletou leite. Agora o bezerro passa fome");
        return "leite";
    }

    @Override
    public String getEspecie() {
        return "Vaca";
    }

    @Override
    public String getStatus() {
        return "Produz leite";
    }

}

