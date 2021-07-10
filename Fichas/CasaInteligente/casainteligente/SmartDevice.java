 


public class SmartDevice{
    private String nome;
    private String identificador;
    private boolean estado;
    
    //Construtores
    public SmartDevice(){
        this.nome= "";
        this.identificador= "";
        this.estado= false;
    }
    
    public SmartDevice(String nome){
        this.nome= "";
        this.identificador= nome;
        this.estado= false;
    }
    
    public SmartDevice(String nome, boolean estado){
        this.nome= "";
        this.identificador= nome;
        this.estado= estado;
    }
    
    public SmartDevice(String nome, String identificador, boolean estado){
        this.nome= nome;
        this.identificador= identificador;
        this.estado= estado;
    }
    
    public SmartDevice(SmartDevice dev){
        this.nome= dev.getNome();
        this.identificador= dev.getID();
        this.estado= dev.getOn();
    }
    
    //Metodos gettes e setters
    public String getNome(){
        return this.nome;
    }
    
    public String getID(){
        return this.identificador;
    }
    
    public boolean getOn(){
        return this.estado;
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }
    
    public void setIdentificador(String identificador){
        this.identificador= identificador;
    }
    
    public void setOn(boolean estado){
        this.estado= estado;
    }
    
    //Metodos 
    public boolean equals(Object device){
        if(device == this) return true;
        if(device== null || device.getClass() != this.getClass()) return false;
    
        SmartDevice dev= (SmartDevice) device;
        return (this.nome.equals(dev.getNome()) && this.estado== dev.getOn() &&
        this.identificador== dev.getID());
    }
}
