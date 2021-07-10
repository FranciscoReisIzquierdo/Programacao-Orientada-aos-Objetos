
//Classe que implementa uma stack de Strings
//Utiliza um List<String> como var interna

import java.util.ArrayList;
import java.util.List;

public class StckString{
    private List<String> elementos;
    
    public StckString(){
        this.elementos= new ArrayList<String>(); //Escolhi a clase de implementaçao
    }
    
    public StckString(List<String> strs){
        this.elementos= new ArrayList<>();
        
        for(String s: strs){
            this.elementos.add(s);
        }
    }
    
    public StckString(StckString outra){
        this.elementos= outra.getElementos();
    }
    
    public List<String> getElementos(){
        //Criar uma copia de ArrayList
        ArrayList<String> res= new ArrayList<>();
        for(String s: this.elementos){
            res.add(s);
        }
        return res;
    }
    
    //Alinea a)
    public String top(){
        if(!this.elementos.isEmpty()){
            return this.elementos.get(this.elementos.size()- 1);
        }
        else return null; //Nao e boa soluçao
    }
    
    //Alinea b)
    public void push(String s){
        this.elementos.add(s);
    }
    
    //Alinea c)
    public String pop(){
        if(!this.elementos.isEmpty()){
            String topo= top();
            this.elementos.remove(this.elementos.size()- 1);
            return topo;
        }
        else return null; //Nao e boa soluçao
    }
    
    //Alinea d)
    public boolean empty(){
        return this.elementos.isEmpty();
    }
    
    //Alinea e)
    public int length(){
        return this.elementos.size();
    }
    
    
    public boolean equals(Object o){
        if(this== o) return true;
        if((o== null) || (this.getClass() != o.getClass())) return false;
        
        StckString ss= (StckString) o;
        return this.elementos.equals(ss.getElementos());
    }
        
    public StckString clone(){
        return new StckString(this);
    }     
}
