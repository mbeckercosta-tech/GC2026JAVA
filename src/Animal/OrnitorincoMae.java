package Animal;

public class OrnitorincoMae extends AnimalBase {
    public OrnitorincoMae(String nome, int idade, String cor, String ID, String raça) {
        super(nome, idade, cor, ID, raça);
    }
    @Override
    public void emitirSom() {
        System.out.println("NHOMNHOMNHOM");
    }
    @Override
    public String coletarProduto() {
        System.out.println("Você coletou um ovo. Agora a ornitorinca está triste.");
        return "ovo";
    }

    @Override
    public String getEspecie() {
        return "Ornitorrinco";
    }

    @Override
    public String getStatus() {
        return "Produz ovos";
    }

}


