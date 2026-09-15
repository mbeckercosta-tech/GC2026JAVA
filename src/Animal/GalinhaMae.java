package Animal;

public class GalinhaMae extends AnimalBase {
    public GalinhaMae(String nome, int idade, String cor, String ID, String raça) {
        super(nome, idade, cor, ID, raça);

    }

    @Override
    public void emitirSom() {
        System.out.println("PÓPÓPÓPÓ");
    }
    @Override
    public String coletarProduto() {
        System.out.println("Você coletou um ovo. Agora a galinha está triste.");
        return "ovo";
    }

    @Override
    public String getEspecie() {
        return "Galinha";
    }

    @Override
    public String getStatus() {
        return "Produz ovos";
    }

}


