public class Punto {
    private int x;
    private int y;

    public Punto() {
        this(0,0);
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void voltear(){
        int auxiliar = x;
        this.x = -y;
        this.y = -auxiliar;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  "(" + x + "," + y + ')';
    }
   
    public double distancia(){
        return distancia(0,0);
    }
    
    public double distancia(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
            
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distanciaManhattan(Punto otroPunto) {
        return Math.abs(x - otroPunto.getX()) + Math.abs(y - otroPunto.getY());
    }
    
    public double distancia (Punto otroPunto){
        return distancia(otroPunto.getX(),otroPunto.getY());
    }
    

    public boolean esVertical(Punto otroPunto) {
        return x == otroPunto.getX();
    }
    
    public double pendiente(Punto otroPunto) {
        return (double) (y - otroPunto.getY()) / (x - otroPunto.getX());
    }
    

    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        Punto p1 = new Punto();                     // Test constructor
        System.out.println(p1);                     // Test toString()
        p1.setX(8);                                 // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX());   // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setX(5);                                 // Test setters
        p1.setY(-3);                           
        System.out.println(p1);                     // Test toString()

        Punto p2 = new Punto(0, 4);                 // Test another constructor
        System.out.println(p2);
        
        // Testing the overloaded methods distance()
        System.out.println("distancia: " + p1.distancia(p2));   
        System.out.println("distancia: " + p2.distancia(p1));   
        System.out.println("distancia: " + p1.distancia(5, 6));  
        System.out.println("distancia: " + p1.distancia());
        
        

        p1.voltear();                               // Test voltear()
        System.out.println("después de voltear: " + p1);

        System.out.println("La distancia Manhattan es: " + p1.distanciaManhattan(p2)); // Test distancia Manhattan
    }
}
