public class MaquinaRefinadora {
    public void refinarProduto (String produto){

        if (produto == null) {
            System.out.println("Sem ingredientes, adicione ovo ou leite.");
        }
        else if (produto.equals("ovo") ) {
            System.out.println("Ovo cozinhando... Ovo cozido, pronto para comer");
        }
        else if (produto.equals("leite")) {
            System.out.println("Leite fervendo... Leite pasteurizado, Pronto para beber");
        }
        else {
            System.out.println("Ingrediente desconhecido");
        }

    }



}
