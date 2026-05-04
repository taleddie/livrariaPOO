import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GestorEstoque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> estoque = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- GESTOR DE ESTOQUE ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Remover Produto");
            System.out.println("4. Buscar Produto");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    // TODO: Implementar Adição
                    System.out.print("Nome do produto: ");
                    String novoProduto = leitor.nextLine();
                    if (estoque.contains(novoProduto)){
                        System.out.println("Produto já existe no estoque!");
                    } else {
                        estoque.add(novoProduto);
                        System.out.println("Produto adicionado com sucesso!");
                    }
                    break;
                case 2:
                    // TODO: Implementar Listagem
                    Collections.sort(estoque);
                    int[] cont = {1};

                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio!");
                    } else {
                        System.out.println("Produtos no estoque:");
                        estoque.forEach(produto -> System.out.println((cont[0]++) + ". " + produto));
                    }                                            
                    break;
                case 3:
                    // TODO: Implementar Remoção
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio!");
                    } else {
                        System.out.print("Produto a remover: ");
                        String produtoRemover = leitor.nextLine();
                        if (estoque.remove(produtoRemover)) {
                            System.out.println("Produto removido com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado no estoque!");
                        }
                    }
                    break;
                case 4:
                    // TODO: Implementar Busca
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio!");
                    } else {
                        System.out.print("Produto a buscar: ");
                        String produtoBuscar = leitor.nextLine();
                        int indice = estoque.indexOf(produtoBuscar);
                        if (indice != -1) {
                            System.out.println("Produto encontrado no índice: " + (indice + 1));
                        } else {
                            System.out.println("Produto não encontrado no estoque!");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}