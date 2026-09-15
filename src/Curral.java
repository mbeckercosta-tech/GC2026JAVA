import Animal.Animal;

import java.util.ArrayList;

public class Curral {
    public String nomeDocurral;
    public String localizacão;

    private ArrayList<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public void emitirSons() {
        for (Animal animal : animais) {
            animal.emitirSom();
        }

    }

    public ArrayList<Animal> getAnimais() {
        return new ArrayList<>(animais);
    }

    public Animal buscarAnimalPorId(String id) {
        for (Animal animal : animais) {
            if (animal.getID().equals(id)) {
                return animal;
            }
        }
        return null;
    }






}
