import java.util.*;
import java.util.stream.Collectors;

public class DriveIt{
    
    private String nome;
    private Map<String, Veiculo> viaturas;
    private static Map<String, Comparator<Veiculo>> comps= new HashMap<>();
    
    public static void addComparador(String nomeComparador, Comparator<Veiculo> cv){
        comps.put(nomeComparador, cv);
    }
    
    public static Comparator getComparador(String nomeComparador, Comparator<Veiculo> cv){
        return comps.get(nomeComparador);
    }
    
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
    
    public Set<Veiculo> ordernarVeiculos(){
        TreeSet<Veiculo> res= new TreeSet<>();
        
        for(Veiculo v: this.viaturas.values())
        res.add(v.clone());
        return res;
    }
    /*
    public List<Veiculo> ordernarVeiculosL(){
        return this.viaturas.values().stream().map(Veiculo::clone).sorted().collet(Collectors.toList());
    }*/
    
    public Map<String, List<Veiculo>> porMarca_Modelo(){
        /*Comparator<Veiculo> cv= (v1, v2)-> (v1.getModelo().compareTo(v2.getModelo()));
        return this.viaturas.values().stream().map(Veiculo:: clone).sorted(cv).collect(Collectors.groupingBy(Veiculo:: getMarca));*/
        
        Comparator<Veiculo> cv= (v1,v2)-> (v1.getModelo().compareTo(v2.getModelo()));
        Map<String, List<Veiculo>> res= new HashMap();
        for(Veiculo v: this.viaturas.values()){
            String marca= v.getMarca();
            res.putIfAbsent(marca, new ArrayList<>());
            res.get(marca).add(v.clone());
        }
        for(List<Veiculo> l: res.values()){
            l.sort(cv);
        }
        
        return res;
    }
    
        
    /*public Map<String, List<Veiculo>> porMarca_Modelo(String nomeComparador){
        /*Comparator<Veiculo> cv= (v1, v2)-> (v1.getModelo().compareTo(v2.getModelo()));
        return this.viaturas.values().stream().map(Veiculo:: clone).sorted(cv).collect(Collectors.groupingBy(Veiculo:: getMarca));*/
        
       /* Map<String, List<Veiculo>> res= new HashMap();
        for(Veiculo v: this.viaturas.values()){
            String marca= v.getMarca();
            res.putIfAbsent(marca, new ArrayList<>());
            res.get(marca).add(v.clone());
        }
        for(List<Veiculo> l: res.values()){
            l.sort(getComparador(nomeComparador));
        }
        return res;
    }*/
        
        
        
}
