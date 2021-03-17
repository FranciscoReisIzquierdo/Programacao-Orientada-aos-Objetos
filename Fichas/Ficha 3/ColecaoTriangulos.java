import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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
    
    public Triangulo tComMaxPerimetro(){
        double max = 0;
        Triangulo res= new Triangulo();

        for(Triangulo t : this.triangulos) {
            double perimetro= t.CalculaPerimetroTriangulo();
            if(max < perimetro) {
                res = t;
                max = perimetro;
            }
        }
        return res.clone();
    }
    
    public String toString(){
        return this.triangulos.toString();
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
