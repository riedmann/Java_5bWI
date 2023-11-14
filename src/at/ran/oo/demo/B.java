package at.ran.oo.demo;

public class B extends A implements Weightable{
    public void drive() {
        System.out.println("B is driving");
    }
    public void sayHello(){
        System.out.println("Hello B");
    }
    
    @Override
    public int getWeight() {
        return 4;
    }
}
