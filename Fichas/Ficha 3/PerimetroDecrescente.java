import java.util.Comparator;

/**
 * Comparador de Triangulos
 * Implementa uma comparaçao por ordem decrescente de perimetro
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class PerimetroDecrescente implements Comparator<Triangulo>{
     public int compare(Triangulo t1, Triangulo t2){
         return (int)(t2.calculaPerimetroTriangulo()- t1.calculaPerimetroTriangulo());
        }
}
