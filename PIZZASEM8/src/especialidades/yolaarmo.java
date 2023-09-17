package especialidades;

import base.Pizza;
import base.Topping;
public class yolaarmo extends Pizza{



    public yolaarmo(String name, double price,String tamano, Topping... toppings){
        super(name, price,tamano, toppings);
    }





    @Override
    public void prepare() {
        System.out.println("Preparing..... " + getName());
        System.out.println("Adding toppings:");
        for (Topping topping : getToppings()) {
            System.out.println("- " + topping.getNombre());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The Pizza is ready!");
    }
}
