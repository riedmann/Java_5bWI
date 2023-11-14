package at.ran.oo.basics;
public class Test {
    public static void main(String[] args) {
        Vegetable v1 = new Vegetable("Gurke", "green");
        Vegetable v2 = new Vegetable("Tomate", "red");

        Car c1 = new Car(100);
        Car c2 = new Car(150);
        SuperCar c3 = new SuperCar(500);

        Board board = new Board();

        board.addInfo(v2);
        board.addInfo(c2);

        board.addInfo(c3);
        board.printInfos();

    }
}
