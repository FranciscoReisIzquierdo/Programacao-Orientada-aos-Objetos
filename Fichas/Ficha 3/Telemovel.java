public class Telemovel{

  private String marca;
  private String modelo;
  private int x;
  private int y;
  private int numMensagens;
  private String[] mensagens;
  private int dimFotos;
  private int dimApps;
  
  private double armazenamentoTotal;
  private double ocupado;
  private int numFotos;
  private int numApps;
  private String[] apps;
  
  public Telemovel(){
    this.marca= "n/a";
    this.modelo= "n/a";
    this.x= 0;
    this.y= 0;
    this.numMensagens= 0;
    this.mensagens= new String[100];
    this.dimFotos= 1024;
    this.dimApps= 2048;
    this.armazenamentoTotal= 1024+ 2048;
    this.ocupado= 0;
    this.numFotos= 0;
    this.numApps= 0;
    this.apps= new String[100];
  }
    
  //Verifica se existe espaço
  public boolean existeEspaco(int numeroBytes){
    return ((this.armazenamentoTotal- this.ocupado) > numeroBytes);
  }
  
  //Instala uma app
  public void instalaApp(String nome, int tamanho){
      if(existeEspaco(tamanho) && this.numApps< apps.length){
          this.apps[this.numApps]= nome;
          this.numApps++;
          this.ocupado+= tamanho;
        }
  }
  
  //Recebe uma mensagem 
  public void recebeMsg(String msg){
      if(this.numMensagens< 100){
          this.mensagens[this.numMensagens++]= msg;
        }
  }
  
  //Tamanho medio de uma app
  public double tamMedioApps(){
      return dimApps/ numApps;
  }

  //Maior mensagem
  public String maiorMsg(){
    String res="";
    for(int i=0 ;i<numMensagens;i++){
        if(this.mensagens[i].length()>res.length()){
            res=this.mensagens[i];
        }
    }
    return res;
  }
  
  public void removeApp(String nome,int tamanho){
      int ind= -1;
      for(int i= 0; i< this.numApps; i++){
          if(apps[i].equals(nome)) ind= i;
    }
    
    if(ind!= -1){
        for(int i= ind; i< this.numApps; i++) apps[i]= apps[i+i];
        this.numApps--;
        this.ocupado-= tamanho;
    }
  }
}