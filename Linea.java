public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Linea(int x1, int y1, int x2, int y2) {
        this.punto1 = new Punto(x1, y1);
        this.punto2 = new Punto(x2, y2);
    }

    public double pendiente() {
        if (punto1.getX() == punto2.getX()) {
            return Double.POSITIVE_INFINITY; //ayuda con el chatgpt
        } else {
            return ((double) (punto2.getY() - punto1.getY())) / (punto2.getX() - punto1.getX());
        }
    }

    public boolean esColineal(Punto punto) {
        double pendienteActual = this.pendiente();
        double pendienteOtro = (punto.getY() - punto1.getY()) / (punto.getX() - punto1.getX());
        if (Double.isInfinite(pendienteActual)) { //ayuda con el chatgpt 
            return punto.getX() == punto1.getX();
        } else {
            return Math.abs(pendienteActual - pendienteOtro) < 0.0001; //ayuda con el chatgpt
        }
    }

    @Override
    public String toString() {
        return "[" + punto1 + ", " + punto2 + "]";
    }
}
