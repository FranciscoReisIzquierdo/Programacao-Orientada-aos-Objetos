import java.util.Scanner;
import java.util.Arrays;


public class Ficha2{
    
    public static void main(String [] args){
        Exercicios ex=  new Exercicios();
        Auxiliar aux= new Auxiliar();
        Scanner sc1= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        
        
        System.out.println("Insira o numero da questao (insira 0 se quiser sair do programa)");
        int question= sc1.nextInt();
        for(; question!= 0; question= sc1.nextInt()){
            if(question== 1){
                System.out.println("Questao 1");
                System.out.println("Insira a letra da alinea (insira Q para sair da questao 1)");
                char alinea= sc2.next().charAt(0);
                while(alinea!= 'Q'){
                    if(alinea== 'a'){
                        System.out.println("Alinea a) ");
                        int array[]= aux.constroiArray();
                        System.out.println("Valor minimo do array: "+ ex.minimo(array));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 1)");
                        alinea= sc2.next().charAt(0);
                    }
                    else if(alinea== 'b'){
                        System.out.println("Alinea b) ");
                        int array[]= aux.constroiArray();
                        int dimensao= array.length;
                        for(int i= 0; i< dimensao; array[i++]= sc2.nextInt());
                        int inicio= 0, fim= 0; boolean flag= true;
                        while(flag){
                            System.out.println("Indice do inicio do intervalo do array");
                            inicio= sc2.nextInt();
                            System.out.println("Indice do final do intervalo do array");
                            fim= sc2.nextInt();
                            if(inicio> fim || inicio>= dimensao || fim>= dimensao) System.out.println("Indice de inicio do intervalo tem de ser menor ou igual que o indice do final do intervalo do array (ambos menor que a dimensao do array). Insira de novo os valores.");
                            else flag= false;
                        }
                        int intervalo[]= new int[fim- inicio+ 1];
                        System.out.println("Array resultado (intervalo): "+ Arrays.toString(ex.arrayEntreIndices(array, inicio, fim)));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 1)");
                        alinea= sc2.next().charAt(0);
                    }
                    else if(alinea== 'c'){
                        System.out.println("Alinea c) ");
                        System.out.println("Primeiro array");
                        int array1[]= aux.constroiArray();
                        int dimensao1= array1.length;
                        System.out.println("Segundo array");
                        int array2[]= aux.constroiArray();
                        int dimensao2= array2.length;
                        System.out.println("Array resultado: "+ Arrays.toString(ex.comuns(array1, array2)));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 1)");
                        alinea= sc2.next().charAt(0);
                    }
                    else{
                        System.out.println("Alinea inexistente. Insira uma alinea valida");
                        alinea= sc2.next().charAt(0);
                    }
                }
                System.out.println("Insira o numero da questao (insira 0 se quiser sair do programa)");
            }
            if(question== 2){
                System.out.println("Questao 2");
                System.out.println("Insira a letra da alinea (insira Q para sair da questao 1)");
                char alinea= sc2.next().charAt(0);
                while(alinea!= 'Q'){
                    if(alinea== 'a'){
                        System.out.println("Alinea a)");
                        int notasTurma[][]= aux.constroiNotasTurma(); 
                        ex.imprimeNotas(notasTurma);
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 2)");
                        alinea= sc2.next().charAt(0);
                    }
                    else if(alinea== 'b'){
                        System.out.println("Alinea b)");
                        int notasTurma[][]= aux.constroiNotasTurma();
                        System.out.println("Qual a unidade curricular que deseja ver a soma das notas dos alunos?");
                        boolean flag= true;
                        int unidade= 0;
                        while(flag){
                            unidade= sc1.nextInt();
                            if(unidade>= 5 || unidade< 0) System.out.println("Unidade curricular inexistente. Qual a unidade curricular que deseja ver a soma das notas dos alunos?");
                            else flag= false;
                        }
                        System.out.println("Soma da unidade curricular "+ unidade+ ": "+ ex.somaUnidadeCurricular(unidade, notasTurma));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 2)");
                        alinea= sc2.next().charAt(0);
                    }
                    else if(alinea== 'c'){
                        System.out.println("Alinea c)");
                        int notasTurma[][]= aux.constroiNotasTurma();
                        System.out.println("De que aluno pretende saber a media?");
                        boolean flag= true;
                        int aluno= 0;
                        while(flag){
                            aluno= sc1.nextInt();
                            if(aluno>= 5 || aluno< 0) System.out.println("Aluno inexistente. De que aluno pretende saber a media?");
                            else flag= false;
                        }
                        System.out.println("Media do aluno "+ aluno+ ": "+ ex.mediaAluno(aluno, notasTurma));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 2)");
                        alinea= sc2.next().charAt(0);
                    }
                    else if(alinea== 'd'){
                        System.out.println("Alinea d)");
                        int notasTurma[][]= aux.constroiNotasTurma();
                        System.out.println("De que unidade curricular pretende saber a media?");
                        boolean flag= true;
                        int unidade= 0;
                        while(flag){
                            unidade= sc1.nextInt();
                            if(unidade>= 5 || unidade< 0) System.out.println("Aluno inexistente. De que aluno pretende saber a media?");
                            else flag= false;
                        }
                        System.out.println("Media da unidade "+ unidade+ ": "+ ex.mediaCurricular(unidade, notasTurma));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 2)");
                        alinea= sc2.next().charAt(0);
                    }
                    else if(alinea== 'e'){
                        System.out.println("Alinea e)");
                        int notasTurma[][]= aux.constroiNotasTurma();
                        int notasAltas[]= ex.maioresNotas(notasTurma);
                        for(int unidade= 0; unidade< notasTurma[0].length; unidade++) System.out.println("A maior nota a unidade curricular "+ unidade+ " foi: "+ notasAltas[unidade]);
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 2)");
                        alinea= sc2.next().charAt(0);
                        
                    }
                    else if(alinea== 'f'){
                        System.out.println("Alinea f)");
                        int notasTurma[][]= aux.constroiNotasTurma();
                        int notasBaixas[]= ex.menoresNotas(notasTurma);
                        for(int unidade= 0; unidade< notasTurma[0].length; unidade++) System.out.println("A menor nota a unidade curricular "+ unidade+ " foi: "+ notasBaixas[unidade]);
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 2)");
                        alinea= sc2.next().charAt(0);
                    }
                    else if(alinea== 'g'){
                        System.out.println("Alinea g)");
                        int notasTurma[][]= aux.constroiNotasTurma();
                        System.out.println("Valor para o qual quer ver que notas sao superiores");
                        int valor= sc1.nextInt();
                        System.out.println(Arrays.toString(ex.maioresQueValor(notasTurma, valor)));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 2)");
                        alinea= sc2.next().charAt(0);
                    }
                    else if(alinea== 'i'){
                        System.out.println("Alinea i)");
                        int notasTurma[][]= aux.constroiNotasTurma();
                        System.out.println("A unidade curricular com maior media e a unidade "+ ex.maiorMedia(notasTurma));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 2)");
                        alinea= sc2.next().charAt(0);
                    }
                    else{
                        System.out.println("Alinea inexistente. Insira uma alinea valida");
                        alinea= sc2.next().charAt(0);
                    }
                }
                System.out.println("Insira o numero da questao (insira 0 se quiser sair do programa)");
                }
                if(question== 4){
                    System.out.println("Insira a letra da alinea (insira Q para sair da questao 4)");
                    char alinea= sc2.next().charAt(0);
                    while(alinea!= 'Q'){
                        if(alinea== 'a'){
                        System.out.println("Alinea a)");
                        int array[]= aux.constroiArray();
                        System.out.println("Array ordenado: "+Arrays.toString(ex.ordenaCrescente(array)));
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 4)");
                        alinea= sc2.next().charAt(0);
                    }
                    if(alinea== 'b'){
                        System.out.println("Alinea b)");
                        int array[]= aux.constroiArray();
                        System.out.println("Que elemento deseja procurar?");
                        int elemento= sc1.nextInt();
                        int valor= ex.procuraBinaria(array, elemento);
                        if(valor== -1) System.out.println("Elemento nao existe no array");
                        else System.out.println("Elemento encontrado : "+ valor);
                        System.out.println("Insira a letra da alinea (insira Q para sair da questao 4)");
                        alinea= sc2.next().charAt(0);
                    }
            
                }            
            }
        }
    }
}
