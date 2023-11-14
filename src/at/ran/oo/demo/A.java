package at.ran.oo.demo;

public class A implements Weightable{
    public void drive(){
        System.out.println("A is driving");
    }

    public void sayHelloA(){
        System.out.println("Hello A");
    }

    @Override
    public int getWeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWeight'");
    }

}
