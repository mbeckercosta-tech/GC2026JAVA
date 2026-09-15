package Animal;

     public class Bezerrinho extends VacaMae {
        public Bezerrinho(String nome, int idade, String cor, String ID, String raça) {
            super(nome, idade, cor, ID, raça);
        }

        @Override
        public void emitirSom() {
            System.out.println("muuuuuuuuuuuuuuuuuuuuu");
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


