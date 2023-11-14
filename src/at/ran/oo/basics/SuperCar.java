package at.ran.oo.basics;
public class SuperCar extends Car {
    private boolean boost;

    public SuperCar(int hp){
        super(hp);
    }

    public boolean isBoost() {
        return boost;
    }

    public int getHorsePower(){
        return super.getHorsePower() + 5;
    }
    
}
