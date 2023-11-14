package at.ran.oo.basics;
public class Car implements MoveableInfo, Info {
    private int horsePower;

    public Car(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setHorsePower(int hosePower) {
        this.horsePower = hosePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return " I am a car " + horsePower;
    }

}
