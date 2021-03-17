


public class Circulo{

    //Variaveis de instancia
    private double x;
    private double y;
    private double raio;
    
    //Construtor por omissao (o Java faz o mesmo por omissao)
    public Circulo(){
        this.x= 0;
        this.y= 0;
        this.raio= 0;        
    }
    
    //Construtor parametrizado
    public Circulo(double x, double y, double raio){
        this.x= x;
        this.y= y;
        this.raio= raio; //(mecanismo de Exception)
    }
    
    //Construtor de copia
    public Circulo(Circulo umCirculo){
        this.x= umCirculo.getX();
        this.y= umCirculo.getY();
        this.raio= umCirculo.getRaio();
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double getRaio(){
        return this.raio;
    }
    
    public void setX(double x){
        this.x= x;
    }
    
    public void setY(double y){
        this.y= y;
    }
    
    public void setRaio(double raio){
        this.raio= raio;
    }
    
    //Metodo que altera o centro do circulo
    public void alteraCentro(double x, double y){
        setX(x);
        setY(y);
        //this.x= x;
        //this.y= y;
    }
    
    //Metodo que calcula a area
    public double calculaArea(){
    return Math.PI*Math.pow(this.raio,2);
    }
    
    //Metodo que calcula o perimetro
    public double calculaPerimetro(){
    return 2*this.raio*Math.PI;
    }
    
    //Metodo que reescreve o equals
    public boolean equals(Object o){
        if(this== o) return true;
        if((o== null)|| (this.getClass()!= o.getClass())) return false;
        Circulo c= (Circulo) o;
        return (this.x== c.getX() && this.y== c.getY() && this.raio== c.getRaio());
    }
    
    //Metodo toString
    public String toString(){
        return "X: "+ this.x+ " Y: "+ this.y+ " Raio: "+ this.raio;
        
        /*StringBuilder sb= new StringBuilder();
        sb.append("X: ");
        sb.append(this.x);
        sb.append(", Y: ");
        sb.append(this.y);
        sb.append(", R: ");
        sb.append(this.raio);
        return sb;*/
    }
    
    public Circulo clone(){
        return new Circulo(this);
    }
    
     
    
    

    
    
    
    
    
}
