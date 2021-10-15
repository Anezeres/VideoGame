package mapa;

import graficos.Pantalla;

public abstract class Mapa {
    
    private final int ancho;
    private final int alto;
    
    private final int[] cuadros;
    
    public Mapa(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
        
        cuadros = new int[ancho*alto];
        
        generarMapa();
    }
    
    public void mapa(String ruta){
        cargarMapa(ruta);
    }
    
    private void generarMapa(){
    
    }
    
    private void cargarMapa(String ruta){
    
    }
    
    public void actualizar(){
    
    }
    
    public void mostrar(int compensacionX, int compensacionY, Pantalla pantalla){
    
    }
    
}
