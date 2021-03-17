import java.time.LocalDateTime;

public class JogoFutebol{
    private static final int POR_INICIAR= 0;
    private static final int A_DECORRER= 1;
    private static final int TERMINADO= 2;
    
    private int estadoJogo;
    private String visitante;
    private String visitado;
    private int golos_visitado;
    private int golos_visitante;
    private LocalDateTime data;
    
    public JogoFutebol(){
        this.estadoJogo= 0;
        this.visitante= "";
        this.visitado= "";
        this.golos_visitado= 0;
        this.golos_visitante= 0;
        this.data= LocalDateTime.now();
    }
    
    public void startGame(){
        if(this.estadoJogo== POR_INICIAR) this.estadoJogo= A_DECORRER;
    }
    
    //Acaba o jogo
    public void endGame(){
        if(this.estadoJogo== A_DECORRER) this.estadoJogo= TERMINADO;
    }
    
    public void goloVisitado(){
        if(this.estadoJogo== A_DECORRER) this.golos_visitado++;
    }
    
    public void goloVisitante(){
        if(this.estadoJogo== A_DECORRER) this.golos_visitante++;
    }
    
    public String resultadoActual(){
        return ("Golos do visitado: "+ this.golos_visitado+ " Golos visitante: "+ this.golos_visitante);
    }
   
}
