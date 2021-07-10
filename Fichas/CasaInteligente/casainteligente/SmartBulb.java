 


public class SmartBulb extends SmartDevice{
    private int tonalidade;
    
    public static final int COLD= 0;
    public static final int NEUTRAL= 1;
    public static final int WARM= 2;
    
    //Construtores
    public SmartBulb(){
        super();
        this.tonalidade= NEUTRAL;
    }
    
    public SmartBulb(String nome){
        super(nome);
        this.tonalidade= NEUTRAL;
    }
    
    public SmartBulb(String nome, int tonalidade){
        super(nome);
        this.tonalidade= tonalidade;
    }
    
    //Metodos getters e setters
    public int getTone(){
        return this.tonalidade;
    }
    
    public void setTone(int tonalidade){
        if(tonalidade<= 2 && tonalidade>= 0) this.tonalidade= tonalidade;
        else if(tonalidade> 2) this.tonalidade= 2;
        else this.tonalidade= 0;
    }
    
    public boolean equals(Object bulb){
        if(bulb == this) return true;
        if(bulb== null || bulb.getClass() != this.getClass()) return false;
        
        SmartBulb lampada= (SmartBulb) bulb;
        return (super.equals(lampada) && this.tonalidade== lampada.getTone());
    }
    
}
