package graficos;

public class Sprite{
    
    private final int lado;
    
    private final int x;
    private final int y;
    
    public final int[] pixeles;
    private final HojaSprites hoja;
    
    //coleccion de sprites
    
    public static Sprite cesped = new Sprite(32,0,0,HojaSprites.campo);
    
    //fin coleccion de sprites

    public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja){
        this.lado = lado;
        pixeles = new int[lado*lado];
        
        this.x = columna * lado;
        this.y = fila * lado;
        this.hoja = hoja;
        
        for (int y = 0; y < lado; y++) {
            for (int x = 0; x < lado; x++) {
                pixeles[x+y*lado] = hoja.pixeles[(x+this.x)+(y+this.y)*hoja.getAncho()]; 
                
            }
            
        }
       
    }
    
    
    
    
    
    
}
