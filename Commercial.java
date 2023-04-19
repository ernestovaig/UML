public class Commercial extends AudioElement{
    private int profit;
    private String fichero;

    public Commercial(String nombre, String fichero, int profit){
        super(nombre);
        this.fichero = fichero;
        this.profit = profit;
    }

    @Override
    public int profit() {
        return profit();
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo " + getName());
    }

    @Override
    public int duration() {
        return duration();
    }

    public int getProfit() {
        return profit;
    }

    public String getFichero() {
        return fichero;
    }
    
}
