import java.util.Scanner;
import java.util.Arrays;

public class Auxiliar{
    
    int[] constroiArray(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Insira a dimensao do array");
        int dimensao= sc.nextInt();
        int array[]= new int[dimensao];
        System.out.println("Elementos do array:");
        for(int i= 0; i< dimensao; array[i++]= sc.nextInt());
        return array;
    }
    
    int[][] constroiNotasTurma(){
        Scanner sc= new Scanner(System.in);
        int notasTurma[][]= new int[5][5];
        for(int aluno= 0; aluno< 5; aluno++){
            System.out.println("Insira as notas do aluno "+ aluno);
            for(int unidade= 0; unidade< 5; unidade++){
                System.out.println("Nota da unidade curricular "+ unidade);
                notasTurma[aluno][unidade]= sc.nextInt();
            }
        }
        return notasTurma;
    }
    int[] swap(int array[], int i, int j){
        int temp= array[i];
        array[i]= array[j];
        array[j]= temp;
        return array;
    }
    
    String[] constroiArrayString(){
        System.out.println("Quantas strings deseja escrever?");
        Scanner sc= new Scanner(System.in);
        int dimensao= sc.nextInt();
        String frases[]= new String[dimensao];
        for(int i= 0; i< dimensao; i++){
            System.out.println("Escreva a string "+ i);
            frases[i]= sc.next();
        }
        return frases;
    }
    
    int[][] constroiMatriz(int linhas, int colunas){
        Scanner sc= new Scanner(System.in);
        int matriz[][]= new int[linhas][colunas];
        for(int i= 0; i< linhas; i++){
            for(int j= 0; j< colunas; j++){
                System.out.println("Insira o elemento da linha "+ i+ " coluna "+ j);
                int elemento= sc.nextInt();
                matriz[i][j]= elemento;
            }
        }
        return matriz;
    }
    void imprimeMatriz(int matriz[][]){
        System.out.println("Matriz");
        System.out.println(Arrays.deepToString(matriz));
    }
    
    public int[] insereNumeros(){
        Scanner sc= new Scanner(System.in);
        int numeros[]= new int[5], i= 0, indice= 0, j= 0;
        while(i< 5){
            int number= sc.nextInt();
            if(number> 50 || number<= 0) System.out.println("Numero invalido. Os valores dos numeros estao entre 1 e 50 (inclusive)");
            else{
                for(j= 0; j< indice && numeros[j]!= number; j++);
                if(j== indice){
                    numeros[indice++]= number; i++;
                }
                else System.out.println("Ja inseriu esse numero. Insira um numero diferente.");
            } 
        }
        return numeros;
    }
    
    public int[] insereEstrelas(){
        Scanner sc= new Scanner(System.in);
        int estrelas[]= new int[2], i= 0, indice= 0, j= 0;
        
        while(i< 2){
            int number= sc.nextInt();
            if(number> 9 || number<= 0) System.out.println("Estrela invalida. Os valores das estrelas estao entre 1 e 9 (inclusive)");
            else{
                for(j= 0; j< indice && estrelas[j]!= number; j++);
                if(j== indice){
                    estrelas[indice++]= number; i++;
                }
                else System.out.println("Ja inseriu essa estrela. Insira uma estrela diferente.");
            } 
        }
        return estrelas;
    }
        
}
