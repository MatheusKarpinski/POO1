import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ItemCompra> listaSupermercado = new ArrayList<>();
        Random random = new Random();

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Adicionar item à lista");
            System.out.println("2 - Editar item na lista");
            System.out.println("3 - Remover item da lista");
            System.out.println("0 - Encerrar e imprimir lista");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("0")) {
                break;
            } else if (opcao.equals("1")) {
                System.out.print("Digite o nome do item que deseja adicionar à lista: ");
                String nomeItem = scanner.nextLine();
                double preco = Math.round(random.nextDouble() * 100.0 * 100.0) / 100.0; // Preço aleatório entre 0.0 e 100.0
                listaSupermercado.add(new ItemCompra(nomeItem, preco));
                System.out.printf("%s adicionado à lista com preço R$%.2f%n", nomeItem, preco);
            } else if (opcao.equals("2")) {
                if (listaSupermercado.isEmpty()) {
                    System.out.println("Lista de compras está vazia. Nada para editar.");
                } else {
                    System.out.println("Lista de Compras Atual:");
                    for (int i = 0; i < listaSupermercado.size(); i++) {
                        ItemCompra item = listaSupermercado.get(i);
                        System.out.printf("%d - %s (R$%.2f)%n", i + 1, item.getNome(), item.getPreco());
                    }
                    System.out.print("Digite o número do item que deseja editar (ou 0 para cancelar): ");
                    int indice = Integer.parseInt(scanner.nextLine());

                    if (indice == 0) {
                        continue;
                    } else if (indice >= 1 && indice <= listaSupermercado.size()) {
                        System.out.printf("Digite o novo nome para '%s': ", listaSupermercado.get(indice - 1).getNome());
                        String novoNome = scanner.nextLine();
                        double novoPreco = Math.round(random.nextDouble() * 100.0 * 100.0) / 100.0; // Novo preço aleatório
                        listaSupermercado.get(indice - 1).setNome(novoNome);
                        listaSupermercado.get(indice - 1).setPreco(novoPreco);
                        System.out.printf("Item editado com sucesso para '%s' com preço R$%.2f%n", novoNome, novoPreco);
                    } else {
                        System.out.println("Índice inválido. Tente novamente.");
                    }
                }
            } else if (opcao.equals("3")) {
                if (listaSupermercado.isEmpty()) {
                    System.out.println("Lista de compras está vazia. Nada para remover.");
                } else {
                    System.out.println("Lista de Compras Atual:");
                    for (int i = 0; i < listaSupermercado.size(); i++) {
                        ItemCompra item = listaSupermercado.get(i);
                        System.out.printf("%d - %s (R$%.2f)%n", i + 1, item.getNome(), item.getPreco());
                    }
                    System.out.print("Digite o número do item que deseja remover (ou 0 para cancelar): ");
                    int indice = Integer.parseInt(scanner.nextLine());

                    if (indice == 0) {
                        continue;
                    } else if (indice >= 1 && indice <= listaSupermercado.size()) {
                        ItemCompra itemRemovido = listaSupermercado.remove(indice - 1);
                        System.out.printf("Item '%s' removido com sucesso.%n", itemRemovido.getNome());
                    } else {
                        System.out.println("Índice inválido. Tente novamente.");
                    }
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Calcula a soma dos preços
        double somaPrecos = 0.0;
        for (ItemCompra item : listaSupermercado) {
            somaPrecos += item.getPreco();
        }

        // Verifica se o usuário possui cartão fidelidade
        System.out.print("\nVocê possui cartão fidelidade? (sim/não): ");
        String cartaoFidelidade = scanner.nextLine().toLowerCase();

        // Aplica desconto de 5% se tiver cartão fidelidade
        if (cartaoFidelidade.equals("sim")) {
            double desconto = somaPrecos * 0.05;
            double totalComDesconto = somaPrecos - desconto;
            System.out.printf("\nDesconto de 5%% aplicado! Total com desconto: R$%.2f%n", totalComDesconto);
        } else {
            System.out.printf("\nTotal dos preços: R$%.2f%n", somaPrecos);
        }

        // Imprime a lista final de compras
        System.out.println("\nLista de Compras Final:");
        for (ItemCompra item : listaSupermercado) {
            System.out.printf("%s - R$%.2f%n", item.getNome(), item.getPreco());
        }

        scanner.close();
    }

    static class ItemCompra {
        private String nome;
        private double preco;

        public ItemCompra(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }
    }
}