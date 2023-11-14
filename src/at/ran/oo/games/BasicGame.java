package at.ran.oo.games;

public interface BasicGame {
    public void render();
    public void update();
    public void init();
    
    public default void sayIt(){
        
    }
}
