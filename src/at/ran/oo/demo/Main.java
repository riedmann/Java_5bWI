package at.ran.oo.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            A a= new A();
            B b1 = new B();
            B b2 = new B();

            List<Weightable> weights = new ArrayList<Weightable>();
            weights.add(b1);
            weights.add(b2);
            weights.add(a);


            A a1 = new C();
            
            int sum = 0;
            for (Weightable weightable : weights) {
                sum += weightable.getWeight();
            }
            System.out.println(sum);
        }
}
