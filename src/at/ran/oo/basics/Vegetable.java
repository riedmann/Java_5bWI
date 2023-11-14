package at.ran.oo.basics;
public class Vegetable implements Info {
    private String name;
    private String color;

    public Vegetable(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;

    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String getInfo() {

        return "Vegetable " + this.name + " " + this.color;
    }

   

}
