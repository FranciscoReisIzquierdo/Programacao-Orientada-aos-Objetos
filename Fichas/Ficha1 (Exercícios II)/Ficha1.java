import java.util.Scanner; //Biblioteca para output de impressao


public class Ficha1{
    public void main(String[] args){
        Funcoes f1= new Funcoes();
        
        //Exercicio 6
        int numero= Integer.parseInt(args[0]);
        System.out.println("Questao 6");
        System.out.println("Fatorial de "+ numero+ ": "+ f1.factorial(numero));
        
        Scanner sc1= new Scanner(System.in);
        System.out.println("Insira o numero da questao (insira 0 se quiser sair do programa)");
        int question= sc1.nextInt();
        
        for(; question!= 0; question= sc1.nextInt()){
            if(question== 1){
                System.out.println("Insira o valor em graus (celsius) que deseja converter em Farenheit");
                Scanner sc2= new Scanner(System.in);
                double celsius= sc2.nextDouble();
                System.out.println("Valor em graus (celsius): "+ celsius+ "=>"+ " Valor em Farenheit: "+ f1.celsiusParaFarenheit(celsius));
            }
            else if(question== 2){
                System.out.println("Insira o valor do primeiro numero: ");
                Scanner sc2= new Scanner(System.in);
                int num1= sc2.nextInt();
                System.out.println("Insira o valor do segundo numero: ");
                sc2= new Scanner(System.in);
                int num2= sc2.nextInt();
                System.out.println("Maximo entre "+ num1+ " e "+ num2+ ": "+ f1.maximo(num1, num2));
            }
            else if(question== 3){
                System.out.println("Insira o nome da conta: ");
                Scanner sc2= new Scanner(System.in);
                String nome= sc2.nextLine();
                System.out.println("Insira o saldo da conta: ");
                sc2= new Scanner(System.in);
                double saldo= sc2.nextDouble();
                System.out.println(f1.criaDescricaoConta(nome, saldo));
            }
            else if(question== 4){
                System.out.println("Insira o valor em euros: ");
                Scanner sc2= new Scanner(System.in);
                double valor= sc2.nextDouble();
                System.out.println("Insira o valor da taxa de conversao: ");
                double taxa= sc2.nextDouble();
                System.out.println("Valor em libras: "+ f1.eurosParaLibras(valor, taxa));
            }
            else if(question== 5){
                System.out.println("Insira o valor do primeiro numero: ");
                Scanner sc2= new Scanner(System.in);
                int num1= sc2.nextInt();
                System.out.println("Insira o valor do segundo numero: ");
                sc2= new Scanner(System.in);
                int num2= sc2.nextInt();
                System.out.println(f1.reverseOrderMed(num1, num2));
            }
            else if(question== 7){
                long temp_gasto= f1.tempoGasto();
                System.out.println("Tempo gasto: "+ temp_gasto+ "(milessegundos)");
            }
            else System.out.println("Numero da questao inexistente!");
                
            System.out.println("Insira o numero da questao (insira 0 se quiser sair do programa)");
        }
        System.out.println("Program killed");
            
        
    }
}
