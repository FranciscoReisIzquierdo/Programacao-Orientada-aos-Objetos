

public class TesteCirculos{
    public static void main(String[] args){
        Circulo c1= new Circulo();
        Circulo c2= new Circulo(3, 3, 30);
        Circulo c3= new Circulo(2, 5, 19);
        Circulo c4= new Circulo(c2);
        
        System.out.println("C1: "+ c1.toString());
        System.out.println("C2: "+ c2.toString());
        System.out.println("C3: "+ c3.toString());
        System.out.println("C4: "+ c4.toString());
        
        c1.setX(10); c1.setY(8); c1.setRaio(6);
        
        System.out.println("C1: "+ c1.toString());
        System.out.println("C2: "+ c2.toString());
        System.out.println("C3: "+ c3.toString());
        System.out.println("C4: "+ c4.toString());
        
        double p= c2.calculaPerimetro();
        System.out.println("Perimetro de C2: "+ p);
        
        System.out.println("C4== C2? "+ c4.equals(c2));
        Circulo c5= c3.clone();
        System.out.println("C5: "+ c5.toString());
        System.out.println("C5== C3? "+ c5.equals(c3));
        
        
    }
}
