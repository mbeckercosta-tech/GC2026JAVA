import Animal.*;

public class stardewManager {
    public static void main(String[] args) {
        Animal[] animais = {
            new GalinhaMae("Bernadete", 3, "pintada", "204", "voadora"),
            new VacaMae("gorda", 20, "caramelo", "89", "nelore"),
            new OrnitorincoMae("tatiana", 10, "preto", "1006", "orelhudo"),
            new Pintinho("Bernardinho", 1, "amarelinho", "305", "voadora"),
            new Bezerrinho("gordinho", 3, "cinza", "150", "nelore"),
            new Ornitorinquinho("tobias", 2, "laranja", "1100", "orelhudo")
        };

        Curral curral = new Curral();
        for (Animal animal : animais) {
            curral.adicionarAnimal(animal);
        }

        MaquinaRefinadora maquina = new MaquinaRefinadora();
        MenuTerminal terminal = new MenuTerminal();
        terminal.executar(curral, maquina);
    }
}
