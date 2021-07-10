import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Set;


public class ColecaoTriangulos{
    private List<Triangulo> triangulos;
    
    //O modelo de associaçao entre ColeccaoTriangulos e Triangulo (no diagrama de classes) sera de Composiçao
    
    public ColecaoTriangulos(){
        this.triangulos= new ArrayList<>();
    }
    
    public ColecaoTriangulos(List<Triangulo> tr){
        this.triangulos= new ArrayList<>();
        for(Triangulo t: tr){
            this.triangulos.add(t.clone());
        }
    }

    public ColecaoTriangulos(ColecaoTriangulos outro) {

    this.triangulos = outro.getTriangulos();

    }
    
    public List<Triangulo> getTriangulos(){
        List<Triangulo> res= new ArrayList<>();
        
        /* 
         * Com iteradores externos
         * for(Triangulo t: this.triangulos) res.add(t.clone());
        
        return res; */
        
        //Com iterador interno
        return this.triangulos.stream().map(Triangulo:: clone).collect(Collectors.toList());      
    }
    
    //a) Inserir triangulo
    public void insert(Triangulo t){ 
        this.triangulos.add(t.clone());
    }
    
    //b) Determinar se triangulo existe na coleçao
    public boolean existeTriangulo(Triangulo t){
        return this.triangulos.contains(t);
    }
    
    //c) Determinar o triangulo com maior area
    public Triangulo tComMaxArea(){
        double max = 0;
        Triangulo res= new Triangulo();

        for(Triangulo t : this.triangulos) {
            double area= t.calculaAreaTriangulo();
            if(max < area) {
                res = t;
                max = area;
            }
        }
        return res.clone();
    }
    
    //Outra versao com iteradores
    public Triangulo tComMaxAreaIterator(){
        double max = 0;
        Triangulo res= new Triangulo();
        
        Iterator<Triangulo> it= this.triangulos.iterator();
        while(it.hasNext()){
            Triangulo t= it.next();
            double area= t.calculaAreaTriangulo();
            if(max < area) {
                res = t;
                max = area;
            }
        }
        return res.clone();
    }
    
    //Outra implementaçao do metodo recorrendo a ordenaçao com Set<Triangulo> 
    //1) ordem natural- confiar na implementacao do compareTo na clase Triangulo
    public Triangulo tComMaxAreav2(){
        TreeSet<Triangulo> ord= new TreeSet<>();
        
        for(Triangulo t: this.triangulos) ord.add(t);
        return ord.last().clone();

    }
    
    //Outra implementaçao do metodo recorrendo a ordenaçao com Set<Triangulo> 
    //1) comparador- definir uma implementacao de comparaçao
    public Triangulo tComMaxAreav3(){
        Comparator<Triangulo> comp= (t1, t2)-> (int)(t1.calculaAreaTriangulo()- t2.calculaAreaTriangulo());
        TreeSet<Triangulo> ord= new TreeSet<>(comp);
        
        for(Triangulo t: this.triangulos) ord.add(t);
        return ord.last().clone();
    }
    
    //Devolver um Set<Triangulo> ordenado decrescentemente por perimetro
    public Set<Triangulo> ordenaOrdemDecrescente(){
        TreeSet<Triangulo> res= new TreeSet<>(new PerimetroDecrescente());
        for(Triangulo t: this.triangulos) res.add(t.clone());
        return res;
    }
    
    public Triangulo tComMaxPerimetro(){
        double max = 0;
        Triangulo res= new Triangulo();

        for(Triangulo t : this.triangulos) {
            double perimetro= t.calculaPerimetroTriangulo();
            if(max < perimetro) {
                res = t;
                max = perimetro;
            }
        }
        return res.clone();
    }
    
    public String toString(){
        return "Colecao Triangulos: "+ this.triangulos.toString();
    }
    
    public boolean equals(Object o){
        if(this== o) return true;
        if((o== null) || (this.getClass() != o.getClass())) return false;
        
        ColecaoTriangulos ct= (ColecaoTriangulos) o;
        return this.triangulos.equals(ct.getTriangulos());
    }
    
    public ColecaoTriangulos clone(){
        return new ColecaoTriangulos(this);
    }
}
