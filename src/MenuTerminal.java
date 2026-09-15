import Animal.Animal;
import java.util.Scanner;

public class MenuTerminal {
    private Scanner teclado = new Scanner(System.in);

    public void executar(Curral curral, MaquinaRefinadora maquina) {
        while (true) {
            exibirMenuPrincipal();
            String opcao = lerOpcao();

            if (opcao.equals("0")) {
                break;
            } else if (opcao.equals("1")) {
                exibirAnimaisDoCurral(curral);
            } else if (opcao.equals("2")) {
                exibirMenuIngredientes();
                String ingredienteEscolhido = lerOpcao();
                if (ingredienteEscolhido.equals("0")) {
                    break;
                }
                if (!ingredienteEscolhido.equals("1") && !ingredienteEscolhido.equals("2")) {
                    System.out.println("Opção inválida, tente novamente.");
                    continue;
                }

                exibirAnimaisDoCurral(curral);
                System.out.print("Digite o ID do animal para coletar (0 - Sair): ");
                String id = lerOpcao();
                if (id.equals("0")) {
                    break;
                }

                Animal animal = curral.buscarAnimalPorId(id);
                if (animal == null) {
                    System.out.println("Opção inválida, tente novamente. ID não encontrado.");
                    continue;
                }

                String produto = animal.coletarProduto();
                if (produto == null) {
                    System.out.println(animal.getNome() + " ainda não produz. Nenhum produto coletado.");
                } else if (ingredienteEscolhido.equals("1")) {
                    maquina.refinarProduto(produto);
                }
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        System.out.println("Você saiu.");
        teclado.close();
    }

    private String lerOpcao() {
        // Se a entrada do terminal for encerrada, finaliza sem lançar uma exceção.
        if (!teclado.hasNextLine()) {
            return "0";
        }
        return teclado.nextLine().trim();
    }

    private void exibirMenuPrincipal() {
        System.out.println();
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("1 - Ver animais no curral");
        System.out.println("2 - Comércio (Coletar/Refinar produtos)");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void exibirMenuIngredientes() {
        System.out.println("Qual ingrediente?");
        System.out.println("1 - Ingrediente refinado (coletar e refinar)");
        System.out.println("2 - Ingrediente bruto (somente coletar)");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void exibirAnimaisDoCurral(Curral curral) {
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("ANIMAIS NO CURRAL:");
        System.out.println("--------------------------------------------------");

        for (Animal animal : curral.getAnimais()) {
            System.out.println("[ID: " + animal.getID() + "] " + animal.getNome()
                    + " (" + animal.getEspecie() + ")");
            System.out.println("  - Raça: " + animal.getRaca());
            String unidadeIdade = "anos";
            if (animal.getIdade() == 1) {
                unidadeIdade = "ano";
            }
            System.out.println("  - Idade: " + animal.getIdade() + " " + unidadeIdade
                    + " | Status: " + animal.getStatus());
            System.out.print("  - Som: ");
            animal.emitirSom();
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
    }
}
