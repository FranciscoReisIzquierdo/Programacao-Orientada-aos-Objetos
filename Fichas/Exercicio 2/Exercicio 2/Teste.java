
/**
 * Classe Teste.
 */
public class Teste{
    public void main(){
        
        //Cria uma encomenda com apenas um produto
        LinhaEncomenda first= new LinhaEncomenda("Saxofone", "Instrumento Musical", 1000, 1, 0.23, 0.5);
        Encomenda e1= new Encomenda("Joao", 976890, "Rua da Liberdade", 3, first);
        System.out.println("Encomenda com um produto (aleatorio)");
        System.out.println(e1.toString());
        
        //Adiciona mais 2 produtos
        System.out.println("\nAdiciona 2 produtos aleatorios a encomenda");
        LinhaEncomenda second= new LinhaEncomenda("Bicicleta", "Veiculo de Transporte", 100.0, 3, 0.23, 0.35);
        LinhaEncomenda third= new LinhaEncomenda("PC", "Gaming", 1500.0, 1, 0.23, 0.05);
        e1.adicionaLinha(second);
        e1.adicionaLinha(third);
        System.out.println(e1.toString());
        
        //Remove um dos produtos (caso esteja na lista de produtos)
        System.out.println("\nRemove um produto especificado (caso exista na ecomenda)");
        e1.removeProduto("Saxofone");
        System.out.println(e1.toString());
        
        //Verifica se existe um produto especifico vai ser encomendado
        System.out.println("\nVerifica se um produto esta na encomenda");
        System.out.println(e1.existeProdutoEncomenda("Carro"));
        
        //Calcula o numero total de produtos na encomenda
        System.out.println("\nNumero total de produtos: "+ e1.numeroTotalProdutos());
        
        //Calcula o desconto total da encomenda
        System.out.println("\nDesconto: "+ e1.calculaValorDesconto());
        
        //Calcula o valor total da encomenda
        System.out.println("\nValor total: "+ e1.calculaValorTotal());
    }
}
