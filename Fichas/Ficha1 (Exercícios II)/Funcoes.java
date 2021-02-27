import java.util.Date; //Biblioteca para output de data
import java.time.LocalTime;


public class Funcoes{
    //Exercicio 1
    public double celsiusParaFarenheit(double graus){
        System.out.println("Questao 1");
        return (graus*9/5 +32);
    }
    
    //Exercicio 2
    public int maximo(int a, int b){
        System.out.println("Questao 2");
        return Math.max(a, b);
    }
    
    //Exercicio 3
    public String criaDescricaoConta(String nome, double saldo){
        System.out.println("Questao 3");
        return ("Nome: "+ nome +";" +" Saldo: "+saldo+ "€");
    }
    
    //Exercicio 4
    public double eurosParaLibras(double valor, double taxaConversao){
        System.out.println("Questao 4");
        return (valor*taxaConversao);
    }
    
    //Exercicio 5
    public String reverseOrderMed(double num1, double num2){
        System.out.println("Questao 5");
        double med= (num1+ num2)/ 2;
        return (Math.max(num1, num2)+ "->"+ Math.min(num1, num2)+ "; Media: "+ med);
    }
    
    //Exercicio 6
    public long factorial(int num){
        if(num== 0) return 1;
        return num* factorial(--num);
    }
    
    //Exercicio 7
    public long tempoGasto(){
        Date data= new Date();
        System.out.println("Data: "+ data);
        long tempoInicial= System.currentTimeMillis();
        long fact= factorial(5000);
        long tempoFinal= System.currentTimeMillis();
        
        System.out.println("Fatorial de 5000: "+ fact+ " (overflow)");
        LocalTime tempo_depois= LocalTime.now();
        System.out.println("Hora (apos o calculo de fatorial de 5000): "+ tempo_depois);
        return (tempoFinal- tempoInicial);
    }
        
    
    
    
}
