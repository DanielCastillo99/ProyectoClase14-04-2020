package Cine;

public class Peliculas {
    private String nombre;
    private String director;
    private int año;
    private String reseña;
    private int tiquete;

    public Peliculas(String nombre, String director, int año, String reseña) {
        this.nombre = nombre;
        this.director = director;
        this.año = año;
        this.reseña = reseña;
    }
    
    public String total(){
        return ("Nombre: "+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public int getTiquete() {
        return tiquete;
    }

    public void setTiquete(int tiquete) {
        this.tiquete = tiquete;
    }
    
}
