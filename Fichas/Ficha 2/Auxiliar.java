import java.util.Scanner;

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
}
