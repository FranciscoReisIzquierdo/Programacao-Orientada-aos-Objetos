 

public class SmartSpeaker extends SmartDevice{
    private int volume;
    private String canal;
    
    public static final int MIN= 0;
    public static final int MAX= 20;
    
    //Construtores
    public SmartSpeaker(){
        super();
        this.volume= MIN;
        this.canal= "";
    }
    
    public SmartSpeaker(String nome){
        super(nome);
        this.volume= MIN;
        this.canal= "";
    }
    
    public SmartSpeaker(String nome, String canal, int volume){
        super(nome);
        this.canal= canal;
        setVolume(volume);
    }
    
    //Metodos getters e setters
    public int getVolume(){
        return this.volume;
    }
    
    public String getChannel(){
        return this.canal;
    }
    
    public void setVolume(int volume){
        if(volume>= 0 && volume<= 20) this.volume= volume;
        else if(volume> 20) this.volume= MAX;
        else this.volume= MIN;
    }
    
    public void setChannel(String canal){
        this.canal= canal;
    }
    
    //Metodos 
    public void volumeUp(){
        int volume= getVolume()+ 1;
        if(volume<= 25) setVolume(volume);
        else setVolume(MAX);
    }
    
    public void volumeDown(){
        int volume= getVolume()- 1;
        if(volume>= 0) setVolume(volume);
        else setVolume(MIN);
    }
    
    public boolean equals(Object speaker){
        if(speaker == this) return true;
        if(speaker== null || speaker.getClass() != this.getClass()) return false;
        
        SmartSpeaker voz= (SmartSpeaker) speaker;
        return (super.equals(voz) && this.canal== voz.getChannel() && this.volume== voz.getVolume());
    }
    
    
    
    
    
     

}
