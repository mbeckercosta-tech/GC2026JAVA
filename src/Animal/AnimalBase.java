package Animal;

public abstract class AnimalBase implements Animal {
    private String nome;
    private int idade;
    private String cor;
    private String ID;
    private String raça;


    public AnimalBase(String nome, int idade, String cor, String ID, String raça) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.ID = ID;
        this.raça = raça;
    }
    public String getNome() {
        return nome;
    }

    public String getID() {
        return ID;
    }

    public String getRaca() {
        return raça;
    }

    public int getIdade() {
        return idade;
    }
}

