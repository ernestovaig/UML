abstract public class AudioElement {
    
    private String nombre;

    public AudioElement(String nombre){
        this.nombre = nombre;
    }

    public String getName(){
        return nombre;
    }
    abstract public int profit();
    abstract public void play();
    abstract public int duration();

    @Override
    public String toString() {
        return "AudioElement nombre: " + nombre + " " + "(" + duration() + ")";
    }

    
}
