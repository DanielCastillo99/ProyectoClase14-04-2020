package Cine;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Ver {
    
    ArrayList<Peliculas> pel = new ArrayList();
    
    
    public void Llenado(){
        
        Peliculas p1 = new Peliculas("50 Sombras de Grey", "Sam Taylor-Wood", 2015, "Cine Romantico");
        Peliculas p2 = new Peliculas("Parasitos", "Bong Joon-ho", 2019, "Cine Suspenso");
        Peliculas p3 = new Peliculas("Django Sin Cadenas", "Quentin Tarantino", 2012, "Cine Drama");
        Peliculas p4 = new Peliculas("Wall-E", "Andrew Stanton", 2008, "Cine Familiar");
        Peliculas p5 = new Peliculas("Forrest Gump", "Robert Zemeckis", 1994, "Cine Comedia Dramatica");
        Peliculas p6 = new Peliculas("Gladiador", "Ridley Scott", 2000, "Cine Aventura");
        Peliculas p7 = new Peliculas("El Caballero Oscuro", "Christopher Nolan", 2008, "Cine Aventura");
        Peliculas p8 = new Peliculas("Matrix", "Lana Wachowski - Lilly Wachowski", 1999, "Cine Ficcion");
        Peliculas p9 = new Peliculas("Mision Imposible:Repercusión", "Christopher McQuarrie", 2018, "Cine Espionaje");
        Peliculas p10 = new Peliculas("Titanic", "James Cameron", 1997, "Cine Drama");
        
        pel.add(p1);
        pel.add(p2);
        pel.add(p3);
        pel.add(p4);
        pel.add(p5);
        pel.add(p6);
        pel.add(p7);
        pel.add(p8);
        pel.add(p9);
        pel.add(p10);
    }
    
    public void Buscar(String nombre){
        
        Iterator it = pel.iterator();
        
        while(it.hasNext()){
            Peliculas pelicula = (Peliculas)it.next();
            if ( nombre.equalsIgnoreCase(pelicula.getNombre()) ) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre()+ " " + pelicula.getDirector()+ " " + pelicula.getAño() + " " + pelicula.getReseña());
            }
        
        }
    }
    public void vender(int cantidad , String nombre ){
        Iterator it = pel.iterator();
        while(it.hasNext()){
            Peliculas pelicula = (Peliculas)it.next();
            if ( nombre.equalsIgnoreCase(pelicula.getNombre()) ) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre() + pelicula.getDirector() + pelicula.getAño() + pelicula.getReseña());
                pelicula.setTiquete(cantidad + pelicula.getTiquete());
            }
            
        }
        
    }
    
    public void totalD(String nombre) {
        Iterator it = pel.iterator();
        while (it.hasNext() ){
           Peliculas pelicula = (Peliculas)it.next();
           if (nombre.equalsIgnoreCase(pelicula.getNombre())){
               JOptionPane.showMessageDialog(null, pelicula.getNombre());
           }
        } 
       
    }
}
