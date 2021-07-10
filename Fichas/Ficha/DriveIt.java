import java.util.*;
import java.util.stream.Collectors;

public class DriveIt{
    
    private String nome;
    private Map<String, Veiculo> viaturas;
    
    public DriveIt(){
        this.nome= "";
        this.viaturas= new HashMap();
    }
    
    public DriveIt(String nome, Map<String, Veiculo> viatura){
        this.nome= nome;
        this.viaturas= viaturas.entrySet().stream().collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue().clone()));
    }
    
    public DriveIt(DriveIt d){
        this(d.getNome(), d.getViaturas());
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Map<String, Veiculo> getViaturas(){
        return this.viaturas.entrySet().stream().collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue().clone()));
    }
    
    public DriveIt clone(){
        return new DriveIt(this);
    }
    
    //Alinea a)
    public boolean existeVeiculo(String cod){
        return this.viaturas.containsKey(cod);
    }
    
    //Alinea b)
    public int quantos(){
        return this.viaturas.size();
    }
    
    //Alinea c)
    public int quantos(String marca){
        return (int)this.viaturas.values().stream().filter(v-> v.getMarca().equals(marca)).count();
    }
    
    //Alinea d)
    public Veiculo getVeiculo(String cod){
        if(this.viaturas.containsKey(cod))
            return this.viaturas.get(cod).clone();
        else return null;
    }
    
    //Alinea e)
    public void adiciona(Veiculo v){
        this.viaturas.putIfAbsent(v.getMatricula(), v.clone());
    }
    
    //Alinea f)
    /*public List<Veiculo> getVeiculos(){
        return this.viaturas
    }*/
    
    //Alinea i)
    public void classificaVeiculo(String cod, int classificacao){
        if(this.viaturas.containsKey(cod)) this.viaturas.get(cod).addClassificacao(classificacao);
    }
    
    //Alinea j)
    public int custoRealKm(String cod){
        int custo= 0;
        if(this.viaturas.containsKey(cod))
        custo= (int)this.viaturas.get(cod).custoRealKM();
        return custo;
    }
    
    //Exercicio adicional
    public Veiculo veiculoMaisBarato(){
        Comparator<Veiculo> cv= (v1, v2)-> (v1.custoRealKM()!= v2.custoRealKM()?
        (int) (v1.custoRealKM()- v2.custoRealKM()): v1.getMatricula().compareTo(v2.getMatricula()));
        
        return this.viaturas.values().stream().sorted(cv).findFirst().get().clone();
    }
    
    //public Veiculo veiculoMenosUitlizado(){}
    public Veiculo veiculoMaisUtilizado(){
        Comparator<Veiculo> cv= (v1, v2)-> (v1.getKms()!= v2.getKms())? (v2.getKms()- v1.getKms()): v2.getMatricula().compareTo(v1.getMatricula());
        return this.viaturas.values().stream().map(Veiculo:: clone).sorted(cv).findFirst().get().clone();
    }
    
    public void colocaEmpresaEmPromocao(){
        for(Veiculo v : this.viaturas.values())

        if( v instanceof VeiculoOcasiao)

            ((VeiculoOcasiao) v).setPromocao(true);
    
    }
}
