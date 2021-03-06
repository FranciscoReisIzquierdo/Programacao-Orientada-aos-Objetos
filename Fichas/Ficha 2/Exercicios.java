import java.util.Arrays;
import java.util.Random;


public class Exercicios{
    public int minimo(int [] numeros){
        int minimo= numeros[0];
        for(int i= 1; i< numeros.length; i++){
            if(minimo> numeros[i]) minimo= numeros[i];
        }
        return minimo;
    }
        
    public int[] arrayEntreIndices(int[] numeros, int i, int f){
        int tam= f- i+ 1;
        int[] res= new int[tam];
            
        System.arraycopy(numeros, i, res, 0, tam);
        return res;
    }
        
    public int[] comuns(int a1[], int a2[]){
        int menor;
        if(a1.length> a2.length) menor= a2.length;
        else menor= a1.length;
            
        int [] res= new int[menor];
        int dim= 0;
        int h= 0;
        for(int i= 0; i< a1.length; i++){
            for(int j= 0; j< a2.length; j++){
                if(a2[j]== a1[i]){
                    for(h= 0; h< dim; h++) if(res[h]== a1[i]) break;
                    if(dim== h) res[dim++]= a1[i];
                }
            }
        }
        int[] resultado= new int[dim];
        System.arraycopy(res, 0, resultado, 0, dim);
        return resultado;
    }
    
    public void imprimeNotas(int notasTurma[][]){
        int notas[]= new int[5];
        for(int aluno= 0; aluno< notasTurma.length; aluno++){
            for(int note= 0; note< notasTurma[0].length; notas[note]= notasTurma[aluno][note++]);
            System.out.println("Aluno "+ aluno+ " -> "+ Arrays.toString(notas));
        }
    }
    
    public int somaUnidadeCurricular(int unidade, int notasTurma[][]){
        int soma= 0;
        for(int coluna= 0; coluna< notasTurma[0].length; soma+= notasTurma[unidade][coluna++]);
        return soma;
    }
    
    public float mediaAluno(int aluno, int notasTurma[][]){
        float med= 0;
        for(int coluna= 0; coluna< notasTurma[0].length; med+= notasTurma[aluno][coluna++]);
        return med/notasTurma[0].length;
    }
    
    public float mediaCurricular(int unidade, int notasTurma[][]){
        float med= 0;
        for(int linha= 0; linha< notasTurma.length; med+= notasTurma[linha++][unidade]);
        return med/notasTurma.length;
    }
    
    public int[] maioresNotas(int notasTurma[][]){
        int notasAltas[]= new int[5];
        for(int unidade= 0; unidade< notasTurma[0].length; unidade++){
            int alta= 0;
            for(int aluno= 0; aluno< notasTurma.length; aluno++) if(notasTurma[aluno][unidade]> alta) alta= notasTurma[aluno][unidade];
            notasAltas[unidade]= alta;
        }
        return notasAltas;
    }
    
    public int[] menoresNotas(int notasTurma[][]){
        int notasAltas[]= new int[5];
        for(int unidade= 0; unidade< notasTurma[0].length; unidade++){
            int menor= notasTurma[0][0];
            for(int aluno= 0; aluno< notasTurma.length; aluno++) if(notasTurma[aluno][unidade]< menor) menor= notasTurma[aluno][unidade];
            notasAltas[unidade]= menor;
        }
        return notasAltas;
    }
    
    public int[] maioresQueValor(int notasTurma[][], int valor){
        int array[]= new int[notasTurma.length*notasTurma[0].length];
        int indice= 0;
        
        for(int aluno= 0; aluno< notasTurma.length; aluno++){
            for(int unidade= 0; unidade< notasTurma[0].length; unidade++) if(notasTurma[aluno][unidade]> valor) array[indice++]= notasTurma[aluno][unidade];
        }
        int[] resultado= new int[indice];
        System.arraycopy(array, 0, resultado, 0, indice);
        return resultado;
    }
    
    public int maiorMedia(int notasTurma[][]){
        float alta= 0;
        int unit= 0;
        for(int unidade= 0; unidade< notasTurma[0].length; unidade++){
            int media= 0;
            for(int aluno= 0; aluno< notasTurma.length; aluno++) media+= notasTurma[aluno][unidade];
            media/= notasTurma[0].length;
            if(media> alta){
                alta= media;
                unit= unidade;
            }
        }
        return unit;
    }
    
    public int[] ordenaCrescente(int array[]){
        Auxiliar aux= new Auxiliar();
        for(int i= 0; i< array.length; i++){
            for(int j= i; j< array.length; j++){
                if(array[i]> array[j]) aux.swap(array, i, j);
            }
        }
        return array;
    }
    
    public int procuraBinaria(int array[], int elemento){
        array= ordenaCrescente(array);
        int fim= array.length- 1, inicio= 0;
        int meio= fim/ 2;
        while(inicio< array.length && fim>= 0){
            if(array[meio]== elemento) return meio;
            else if(array[meio]< elemento){
                inicio= meio+ 1;
                meio= (inicio+ fim)/ 2;
            }
            else{
                fim= meio- 1;
                meio= (inicio+ fim)/ 2;
            }
        }
        return -1;
        
    }  
    /*
    public String[] removeRepeticoes(String array[]){
        int i= 0, j= 1, tamanho= array.length, tam= 0;
        while(i< tamanho){
            int index= j;
            while(j< tamanho){
                if(array[j]!= array[i]){
                    array[index++]= array[j++]; tam++;
                }
                else j++;
            }
            tamanho= tamanho- (j- index);
            i++; j= i+ 1;
        }
        String[] resultado= new String[tam];
        System.arraycopy(array, 0, resultado, 0, tam);
        System.out.println("Teste");
        for(int k= 0; k< tam; System.out.println(resultado[k++]));
        return resultado;
    }*/
    
    public int[][] somaMatrizes(int matriz1[][], int matriz2[][]){
        int linhas= matriz1.length, colunas= matriz1[0].length;
        int matrizResultado[][]= new int[linhas][colunas];
        for(int i= 0; i< linhas; i++){
            for(int j= 0; j< colunas; j++) matrizResultado[i][j]= matriz1[i][j]+ matriz2[i][j];
        }
        return matrizResultado;
    } 
    
    public boolean comparaMatrizes(int matriz1[][], int matriz2[][]){
        boolean flag= true;
        for(int i= 0; i< matriz1.length && flag; i++){
            for(int j= 0; j< matriz1[0].length && flag; j++) if(matriz1[i][j]!= matriz2[i][j]) flag= false;
        }
        return (flag? true: false);
    }
    
    public int simetricoInt(int numero){
        if(numero> 0) numero= 0- numero;
        else if(numero< 0) numero= numero;
        else numero= 0;
        return numero;
    }
    
    public int[][] matrizOposta(int matriz[][], int linhas, int colunas){
        int elemento= 0;
        int oposta[][]= new int[linhas][colunas];
        for(int i= 0; i< linhas; i++){
            for(int j= 0; j< colunas; j++){
               oposta[i][j]= simetricoInt(matriz[i][j]);
            } 
        }
        return oposta;
    }
    
    public int[] geraNumeros(){
        Random gerador= new Random();
        int numeros[]= new int[5];
        int i= 0, indice_n= 0, j= 0, number= 0;
        while(i< 5){
            number= gerador.nextInt(50)+ 1;
            for(j= 0; j< indice_n && numeros[j]!= number; j++);
            if(j== indice_n){
                numeros[indice_n++]= number; i++;
            }
        }
        return numeros;
    }
    
    public int[] geraEstrelas(){
        Random gerador= new Random();
        int estrelas[]= new int[2];
        int i= 0, indice_s= 0, j= 0, number= 0;
        while(i< 2){
            number= gerador.nextInt(9)+ 1;
            for(j= 0; j< indice_s && estrelas[j]!= number; j++);
            if(j== indice_s){
                estrelas[indice_s++]= number; i++;
            }
        }
        return estrelas;
    }
    
    public int[] comparaNumeros(int machine[], int user[]){
        int tam= machine.length, indice= 0;
        int resultado[]= new int[tam];
        for(int i= 0; i< tam; i++){
            for(int j= 0; j< tam; j++){
                if(user[i]== machine[j]){
                    resultado[indice++]= user[i];
                    break;
                }
            }
        }
        int[] result= new int[indice];
        System.arraycopy(resultado, 0, result, 0, indice);
        return result;
    }
    
    public void imprimeChave(int numeros[], int estrelas[]){
        System.out.println("Jackpot!!!");
        int coluna= 0;
        for(int i= 0; i< 50; i++){
            for(int j= 0; j< coluna; j++) System.out.print(" ");
            System.out.print("Numeros: "+ Arrays.toString(numeros)+ " Estrelas: "+ Arrays.toString(estrelas));
            coluna+= 2;
            System.out.println();
        }
    }
    
    
    
    
    
}
