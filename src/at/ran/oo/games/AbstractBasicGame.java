package at.ran.oo.games;

public abstract class AbstractBasicGame{
    private String name; 
    
    public AbstractBasicGame(String name){
        this.name = name;
    }
    public abstract void render();
    public abstract void update();
    public void init(){
        System.out.println("init");
    }
}
