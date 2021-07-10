import java.util.Date;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Iterator;

/**
 * Classe Encomenda
 * DISCLAIMER: ESTA CLASSE FOI FEITA EM GRUPO: 
 * INTEGRANTES: A93241 (Autor) FRANCISCO REIS IZQUIERDO
 * A93273 JOSE PEDRO MARTINS MAGALHAES
 * A93185 CARLOS FILIPE ALMEIDA DIAS
 * A93203 TIAGO FERNANDES RIBEIRO
 * A89526 DUARTE AUGUSTO RODRIGUES LUCAS
 * A93222 PAULO MIGUEL FREITAS OLIVEIRA
 */
public class Encomenda{
    //Variaveis de instancia
    private String nomeCliente;
    private int nif;
    private String morada;
    private int numero_encomenda;
    private LocalDate data_encomenda;
    private List<LinhaEncomenda> lista;
       
    /**Construtor para objetos da classe Encomenda **/
    public Encomenda(){
        this.nomeCliente= "";
        this.nif= 0;
        this.morada= "";
        this.numero_encomenda= 0;
        this.data_encomenda= LocalDate.now();
        this.lista= new ArrayList<>();
    }
    
    /**Construtor para objetos da classe Encomenda **/
    public Encomenda(String client, int nif, String morada, int number, LinhaEncomenda box){
        this.nomeCliente= client;
        this.nif= nif;
        this.morada= morada;
        this.numero_encomenda= number;
        this.data_encomenda= LocalDate.now();
        this.lista= new ArrayList<>();
        this.lista.add(box);
    }
    
    /**Construtor para objetos da classe Encomenda **/
    public Encomenda(Encomenda j){
        this.nomeCliente= j.nomeCliente;
        this.nif= j.nif;
        this.morada= j.morada;
        this.numero_encomenda= j.numero_encomenda;
        this.data_encomenda= j.data_encomenda;
        
        this.lista= new ArrayList<> (j.lista);
    }
    
    //Metodos acessores e modificadores
    public String getclienteNome(){
        return this.nomeCliente;
    }
    
    public int getNif(){
        return this.nif;
    }
    
    public String getMorada(){
        return this.morada;
    }
    
    public int getNumeroEncomenda(){
        return this.numero_encomenda;
    }
    
    public LocalDate getDataEncomenda(){
        return this.data_encomenda;
    }
    
    public ArrayList getLista(){
        return (ArrayList)this.lista;
    }
    
    public void setNomeCliente(String nome){
        this.nomeCliente= nome;
    }
    
    public void setNif(int nif){
        this.nif= nif;
    }
    
    public void setMorada(String morada){
        this.morada= morada;
    }
    
    public void setNumeroEncomenda(int numero){
        this.numero_encomenda= numero;
    }
    
    public void setDataEncomenda(LocalDate data){
        this.data_encomenda= data;
    }
    
    public void setLista(ArrayList box){
        this.lista= new ArrayList<>(box);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do cliente: ").append(getclienteNome());
        sb.append("\nNif: ").append(getNif());
        sb.append("\nMorada: ").append(getMorada());
        sb.append("\nNumero da encomenda: ").append(getNumeroEncomenda());
        sb.append("\nData: ").append(getDataEncomenda());
        sb.append("\nLista de encomendas: ");
        sb.append(this.lista.toString());
        
        return sb.toString();
    }
    
    //Metodos abstratos
    /**Calcula o valor total da encomenda**/
    public double calculaValorTotal(){
        double valor= 0;
        for(LinhaEncomenda t: this.lista) valor+= t.calculaValorLinhaEnc();
        return valor;
    }
    
    /**Calcula o desconto total da encomenda**/
    public double calculaValorDesconto(){
        double valor= 0;
        for(LinhaEncomenda t: this.lista) valor+= t.calculaValorDesconto();
        return valor;
    }
    
    /**Calcula o numero total da encomenda**/
    public int numeroTotalProdutos(){
        int quant= 0;
        for(LinhaEncomenda t: this.lista) quant+= t.getQuantidade();
        return quant;
    }
    
    /**Verifica se existe um determinado produto na encomenda**/
    public boolean existeProdutoEncomenda(String refProduto){
        for(LinhaEncomenda t: this.lista){
            if(t.getReferencia()== refProduto) return true;
        }
        return false;
    }
    
    /**Adiciona um produto a encomenda**/
    public void adicionaLinha(LinhaEncomenda linha){
        this.lista.add(linha);
    }
    
    /**Remove um produto a encomenda**/
    public void removeProduto(String codProd){ 
        boolean valor= true;
        Iterator<LinhaEncomenda> lista= this.lista.iterator();
        LinhaEncomenda linha;
            while(lista.hasNext() && valor){
                linha= lista.next();
                if(linha.getReferencia()== codProd){
                    valor= false;
                    this.lista.remove(linha);
                }
            }
        }
}
