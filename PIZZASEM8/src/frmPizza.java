//import base.Pizza;
//import base.Topping;
//import especialidades.*;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
//
//public class frmPizza extends JFrame {
//
//    private JPanel panel1;
//    private JLabel lbltipopizza;
//    private JLabel lblseleccioningredientes;
//    private JLabel lblnombre;
//    public JComboBox cbotipopizza;
//    private JComboBox cboselecing;
//    private JTextField txtnombre;
//    private JButton btnagregar;
//    private JTextArea textArea1;
//    private JButton btnpreparar;
//    private JTextArea textArea2;
//    private JLabel lblprecio;
//    public  List<Pizza> pizzas;
//    String nompizzaselecc;
//    yolaarmo pyolaarmo;
//    public frmPizza(){
//
//        super("PIZZAS");
//        setContentPane(panel1);
//
//        pizzas= new ArrayList<>();
//
//        PizzaItaliana pizza = new PizzaItaliana( "Pizza Italiana Q100 Mediana",100,"medium", "Tous Isl");
//        pizza.addTopping(new Topping("Tomato Q13",13));
//        pizza.addTopping(new Topping("Mozzarella Q18",18));
//        pizza.addTopping(new Topping("Champinon Q20",20));
//
//
//        PizzaHawaina pizza2 = new PizzaHawaina( "Pizza Hawaina Q200 Pequeña",200,"small", "tapenade");
//        pizza2.addTopping(new Topping("Tomato Q15",15));
//        pizza2.addTopping(new Topping("queso Q20",20));
//        pizza2.addTopping(new Topping("Champinon Q30",30));
//
//        PizzaMargarita pizza3 = new PizzaMargarita( "Pizza Margarita Q300 Grande",300,"large", "Fermento");
//        pizza3.addTopping(new Topping("Tomato Q30",30));
//        pizza3.addTopping(new Topping("Mozzarella Q12",12));
//        pizza3.addTopping(new Topping("Champinon Q20",20));
//
//        PizzaPepperoni pizza4 = new PizzaPepperoni( "Pizza Pepperoni Q100 Mediana",100,"medium", "Chia");
//        pizza4.addTopping(new Topping("Tomato Q5",5));
//        pizza4.addTopping(new Topping("Mozzarella Q30",30));
//        pizza4.addTopping(new Topping("Champinon Q12.5",12.5));
//
//        pizzas.add(pizza);
//        pizzas.add(pizza2);
//        pizzas.add(pizza3);
//        pizzas.add(pizza4);
//
//        this.cbotipopizza.addItem("YO LA ARMO");
//        for (Pizza pizz : pizzas) {
//            this.cbotipopizza.addItem(pizz.getName());
//            this.cbotipopizza.setSelectedIndex(-1);
//        }
//
//        this.cbotipopizza.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                 nompizzaselecc = (String)cbotipopizza.getSelectedItem();
//
//                cboselecing.removeAllItems();
//                for (Pizza pizz : pizzas) {
//                    if(pizz.getName().equals(nompizzaselecc)){
//                        List<Topping> toppings=pizz.getToppings();
//                        lblprecio.setText(pizz.calculatePrice()+"");
//                        for (Topping top:toppings){
//                            cboselecing.addItem(top.getNombre());
//                        }
//                    }else{
//                        cboselecing.addItem("Piña");
//                        cboselecing.addItem("Queso");
//                        cboselecing.addItem("champiñones");
//                        cboselecing.addItem("salsa tomate");
//                        cboselecing.addItem("chorizo");
//                        cboselecing.addItem("jamon");
//                        pyolaarmo=new yolaarmo("yo la armo",100,"small");
//                        break;
//                    }
//                }
//            }
//        });
//
//        this.btnagregar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                for (Pizza pizz : pizzas) {
//                    if(pizz.getName().equals(nompizzaselecc)){
//                        List<Topping> toppings=pizz.getToppings();
//
//                        for (Topping top:toppings){
//                            textArea1.append(top.getNombre()+" - "+top.getPrice()+" \n");
//                        }
//                    }
//                }
//                if(nompizzaselecc.equals("YO LA ARMO")){
//                    String nombre=(String)cboselecing.getSelectedItem();
//                    pyolaarmo.addTopping(new Topping(nombre,20));
//                    lblprecio.setText(pyolaarmo.calculatePrice()+"");
//                    textArea1.append(nombre+" - "+20+" \n");
//                }
//            }
//        });
//
//        this.btnpreparar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(!(txtnombre.getText().equals("") && textArea1.getText().equals("") )){
//                    for (Pizza pizz : pizzas) {
//                        if(pizz.getName().equals(nompizzaselecc)){
//                            textArea2.append("Preparando..... " + pizz.getName()+"\n");
//                            textArea2.append("Añadiendo Toppings: \n");
//                            for (Topping topping : pizz.getToppings()) {
//                                textArea2.append("- " + topping.getNombre()+"\n");
//
//
//                                try {
//                                    Thread.sleep(1000);
//                                } catch (InterruptedException ex) {
//                                    throw new RuntimeException(ex);
//                                }
//
//                            }
//
//                            textArea2.append("La Pizza está Lista!");
//                        }else{
//                            textArea2.append("Preparando..... " + pyolaarmo.getName()+"\n");
//                            textArea2.append("Añadiendo Toppings: \n");
//                            for (Topping topping : pyolaarmo.getToppings()) {
//                                textArea2.append("- " + topping.getNombre()+"\n");
//
//
//                                try {
//                                    Thread.sleep(1000);
//                                } catch (InterruptedException ex) {
//                                    throw new RuntimeException(ex);
//                                }
//
//                            }
//
//                            textArea2.append("La Pizza está Lista!");
//                            break;
//                        }
//                    }
//                }else{
//                    JOptionPane.showMessageDialog(null,"Ingrese primero el nombre de la pizza o los Ingredientes");
//                }
//
//            }
//        });
//
//    }
//
//
//}


//import base.Pizza;
//import base.Topping;
//import especialidades.*;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
//
//public class frmPizza extends JFrame {
//
//    private JPanel panel1;
//    private JLabel lbltipopizza;
//    private JLabel lblseleccioningredientes;
//    private JLabel lblnombre;
//    public JComboBox<String> cbotipopizza;
//    private JComboBox<String> cboselecing;
//    private JTextField txtnombre;
//    private JButton btnagregar;
//    private JTextArea textArea1;
//    private JButton btnpreparar;
//    private JTextArea textArea2;
//    private JLabel lblprecio;
//    public List<Pizza> pizzas;
//    private String nompizzaselecc;
//    private Pizza pizzaSeleccionada;
//    private List<Topping> ingredientesSeleccionados;
//
//    public frmPizza() {
//        super("PIZZAS");
//        setContentPane(panel1);
//
//        pizzas = new ArrayList<>();
//        ingredientesSeleccionados = new ArrayList<>();
//
//        PizzaItaliana pizza = new PizzaItaliana("Pizza Italiana Q100 Mediana", 100, "medium", "Tous Isl");
//        pizza.addTopping(new Topping("Tomato", 13));
//        pizza.addTopping(new Topping("Mozzarella", 18));
//        pizza.addTopping(new Topping("Champinon", 20));
//
//        // Agrega más pizzas aquí
//
//        pizzas.add(pizza);
//
//        cbotipopizza.addItem("YO LA ARMO");
//        for (Pizza pizz : pizzas) {
//            cbotipopizza.addItem(pizz.getName());
//        }
//
//        cbotipopizza.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                nompizzaselecc = (String) cbotipopizza.getSelectedItem();
//                cboselecing.removeAllItems();
//
//                for (Pizza pizz : pizzas) {
//                    if (pizz.getName().equals(nompizzaselecc)) {
//                        pizzaSeleccionada = pizz;
//                        ingredientesSeleccionados.clear();
//
//                        List<Topping> toppings = pizz.getToppings();
//                        lblprecio.setText(pizz.calculatePrice() + "");
//
//                        for (Topping top : toppings) {
//                            cboselecing.addItem(top.getNombre());
//                        }
//                    }
//                }
//            }
//        });
//
//        cboselecing.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String ingredienteSeleccionado = (String) cboselecing.getSelectedItem();
//                if (pizzaSeleccionada != null && ingredienteSeleccionado != null) {
//                    ingredientesSeleccionados.add(new Topping(ingredienteSeleccionado, 20));
//                }
//            }
//        });
//
//        btnagregar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (pizzaSeleccionada != null) {
//                    StringBuilder ingredientes = new StringBuilder();
//                    double precioTotal = 0;
//
//                    for (Topping topping : ingredientesSeleccionados) {
//                        ingredientes.append(topping.getNombre()).append(" - ").append(topping.getPrice()).append("\n");
//                        precioTotal += topping.getPrice();
//                    }
//
//                    textArea1.setText(ingredientes.toString());
//                    lblprecio.setText(String.valueOf(pizzaSeleccionada.calculatePrice() + precioTotal));
//                }
//            }
//        });
//
//        btnpreparar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (!(txtnombre.getText().isEmpty() || textArea1.getText().isEmpty())) {
//                    textArea2.setText("Preparando..... " + txtnombre.getText() + "\n");
//                    textArea2.append("Añadiendo Toppings: \n");
//
//                    double precioTotalPizza = pizzaSeleccionada.calculatePrice();
//                    for (Topping topping : ingredientesSeleccionados) {
//                        textArea2.append("- " + topping.getNombre() + "\n");
//                        precioTotalPizza += topping.getPrice();
//                        try {
//                            Thread.sleep(1000); // Simula el proceso de preparación
//                        } catch (InterruptedException ex) {
//                            throw new RuntimeException(ex);
//                        }
//                    }
//
//                    textArea2.append("La Pizza está Lista!\n");
//                    textArea2.append("Precio Total: " + precioTotalPizza);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Ingrese primero el nombre de la pizza o los Ingredientes");
//                }
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Ejemplo de CardLayout");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frmPizza pizzaForm = new frmPizza();
//        frame.setContentPane(pizzaForm.panel1);
//
//        frame.setSize(800, 600);
//        frame.setVisible(true);
//    }
//}

//
//
//import base.Pizza;
//import base.Topping;
//import especialidades.*;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
//
//public class frmPizza extends JFrame {
//
//    private JPanel panel1;
//    private JLabel lbltipopizza;
//    private JLabel lblseleccioningredientes;
//    private JLabel lblnombre;
//    public JComboBox<String> cbotipopizza;
//    private JComboBox<String> cboselecing;
//    private JTextField txtnombre;
//    private JButton btnagregar;
//    private JButton btneliminar;
//    private JTextArea textArea1;
//    private JButton btnpreparar;
//    private JTextArea textArea2;
//    private JLabel lblprecio;
//    public  List<Pizza> pizzas;
//    private String nompizzaselecc;
//    private Pizza pizzaSeleccionada;
//    private List<Topping> ingredientesSeleccionados;
//
//    public frmPizza() {
//        super("PIZZAS");
//        setContentPane(panel1);
//
//        pizzas = new ArrayList<>();
//        ingredientesSeleccionados = new ArrayList<>();
//
//        PizzaItaliana pizza = new PizzaItaliana("Pizza Italiana Q100 Mediana", 100, "medium", "Tous Isl");
//        pizza.addTopping(new Topping("Tomato Q13", 13));
//        pizza.addTopping(new Topping("Mozzarella Q18", 18));
//        pizza.addTopping(new Topping("Champinon Q20", 20));
//
//        PizzaHawaina pizza2 = new PizzaHawaina("Pizza Hawaina Q200 Pequeña", 200, "small", "tapenade");
//        pizza2.addTopping(new Topping("Tomato Q15", 15));
//        pizza2.addTopping(new Topping("queso Q20", 20));
//        pizza2.addTopping(new Topping("Champinon Q30", 30));
//
//        // Agrega más pizzas aquí
//
//        pizzas.add(pizza);
//        pizzas.add(pizza2);
//
//        cbotipopizza.addItem("YO LA ARMO");
//        for (Pizza pizz : pizzas) {
//            cbotipopizza.addItem(pizz.getName());
//        }
//
//        cbotipopizza.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                nompizzaselecc = (String) cbotipopizza.getSelectedItem();
//                cboselecing.removeAllItems();
//
//                for (Pizza pizz : pizzas) {
//                    if (pizz.getName().equals(nompizzaselecc)) {
//                        pizzaSeleccionada = pizz;
//                        ingredientesSeleccionados.clear();
//
//                        List<Topping> toppings = pizz.getToppings();
//                        lblprecio.setText(pizz.calculatePrice() + "");
//
//                        for (Topping top : toppings) {
//                            cboselecing.addItem(top.getNombre());
//                        }
//                    }
//                }
//            }
//        });
//
//        cboselecing.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String ingredienteSeleccionado = (String) cboselecing.getSelectedItem();
//                if (pizzaSeleccionada != null && ingredienteSeleccionado != null) {
//                    ingredientesSeleccionados.add(new Topping(ingredienteSeleccionado, 20));
//                }
//            }
//        });
//
//        btnagregar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (pizzaSeleccionada != null) {
//                    StringBuilder ingredientes = new StringBuilder();
//                    double precioTotal = 0;
//
//                    for (Topping topping : ingredientesSeleccionados) {
//                        ingredientes.append(topping.getNombre()).append(" - ").append(topping.getPrice()).append("\n");
//                        precioTotal += topping.getPrice();
//                    }
//
//                    textArea1.setText(ingredientes.toString());
//                    lblprecio.setText(String.valueOf(pizzaSeleccionada.calculatePrice() + precioTotal));
//                }
//            }
//        });
//
//        btneliminar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (pizzaSeleccionada != null) {
//                    String ingredienteAEliminar = (String) cboselecing.getSelectedItem();
//                    if (ingredienteAEliminar != null) {
//                        // Eliminar el ingrediente de la lista
//                        ingredientesSeleccionados.removeIf(ingrediente -> ingrediente.getNombre().equals(ingredienteAEliminar));
//
//                        // Actualizar la lista de ingredientes y el precio total
//                        StringBuilder ingredientes = new StringBuilder();
//                        double precioTotal = 0;
//
//                        for (Topping topping : ingredientesSeleccionados) {
//                            ingredientes.append(topping.getNombre()).append(" - ").append(topping.getPrice()).append("\n");
//                            precioTotal += topping.getPrice();
//                        }
//
//                        textArea1.setText(ingredientes.toString());
//                        lblprecio.setText(String.valueOf(pizzaSeleccionada.calculatePrice() + precioTotal));
//                    }
//                }
//            }
//        });
//
//        btnpreparar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (!(txtnombre.getText().isEmpty() || textArea1.getText().isEmpty())) {
//                    textArea2.setText("Preparando..... " + txtnombre.getText() + "\n");
//                    textArea2.append("Añadiendo Toppings: \n");
//
//                    double precioTotalPizza = pizzaSeleccionada.calculatePrice();
//                    for (Topping topping : ingredientesSeleccionados) {
//                        textArea2.append("- " + topping.getNombre() + "\n");
//                        precioTotalPizza += topping.getPrice();
//                        try {
//                            Thread.sleep(1000); // Simula el proceso de preparación
//                        } catch (InterruptedException ex) {
//                            throw new RuntimeException(ex);
//                        }
//                    }
//
//                    textArea2.append("La Pizza está Lista!\n");
//                    textArea2.append("Precio Total: " + precioTotalPizza);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Ingrese primero el nombre de la pizza o los Ingredientes");
//                }
//
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Ejemplo de CardLayout");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frmPizza pizzaForm = new frmPizza();
//        frame.setContentPane(pizzaForm.panel1);
//
//        frame.setSize(800, 600);
//        frame.setVisible(true);
//    }
//}



import base.Pizza;
import base.Topping;
import especialidades.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class frmPizza extends JFrame {

    private JPanel panel1;
    private JLabel lbltipopizza;
    private JLabel lblseleccioningredientes;
    private JLabel lblnombre;
    public JComboBox<String> cbotipopizza;
    private JComboBox<String> cboselecing;
    private JTextField txtnombre;
    private JButton btnagregar;
    private JButton btneliminar;
    private JTextArea textArea1;
    private JButton btnpreparar;
    private JTextArea textArea2;
    private JLabel lblprecio;
    public  List<Pizza> pizzas;
    String nompizzaselecc;
    yolaarmo pyolaarmo;
    private Pizza pizzaSeleccionada;
    private List<Topping> ingredientesSeleccionados;

    public frmPizza(){

        super("PIZZAS");
        setContentPane(panel1);

        pizzas= new ArrayList<>();
        ingredientesSeleccionados = new ArrayList<>();

        PizzaItaliana pizza1 = new PizzaItaliana( "Pizza Italiana Q100 Mediana",100,"medium", "Tous Isl");
        pizza1.addTopping(new Topping("Tomato Q13",13));
        pizza1.addTopping(new Topping("Mozzarella Q18",18));
        pizza1.addTopping(new Topping("Champinon Q20",20));

        PizzaHawaina pizza2 = new PizzaHawaina( "Pizza Hawaina Q200 Pequeña",200,"small", "tapenade");
        pizza2.addTopping(new Topping("Tomato Q15",15));
        pizza2.addTopping(new Topping("queso Q20",20));
        pizza2.addTopping(new Topping("Champinon Q30",30));

        PizzaMargarita pizza3 = new PizzaMargarita( "Pizza Margarita Q300 Grande",300,"large", "Fermento");
        pizza3.addTopping(new Topping("Tomato Q30",30));
        pizza3.addTopping(new Topping("Mozzarella Q12",12));
        pizza3.addTopping(new Topping("Champinon Q20",20));

        PizzaPepperoni pizza4 = new PizzaPepperoni( "Pizza Pepperoni Q100 Mediana",100,"medium", "Chia");
        pizza4.addTopping(new Topping("Tomato Q5",5));
        pizza4.addTopping(new Topping("Mozzarella Q30",30));
        pizza4.addTopping(new Topping("Champinon Q12.5",12.5));

        Pizza pizza5 = new Pizza("Pizza Personalizada", 0, "small", "Custom");

        pizzas.add(pizza1);
        pizzas.add(pizza2);
        pizzas.add(pizza3);
        pizzas.add(pizza4);
        pizzas.add(pizza5);

        this.cbotipopizza.addItem("YO LA ARMO");
        for (Pizza pizz : pizzas) {
            this.cbotipopizza.addItem(pizz.getName());
        }

        cbotipopizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nompizzaselecc = (String) cbotipopizza.getSelectedItem();
                cboselecing.removeAllItems();

                for (Pizza pizz : pizzas) {
                    if (pizz.getName().equals(nompizzaselecc)) {
                        pizzaSeleccionada = pizz;
                        ingredientesSeleccionados.clear();

                        List<Topping> toppings = pizz.getToppings();
                        lblprecio.setText(pizz.calculatePrice() + "");

                        for (Topping top : toppings) {
                            cboselecing.addItem(top.getNombre());
                        }
                    } else {
                        cboselecing.addItem("Piña");
                        cboselecing.addItem("Queso");
                        cboselecing.addItem("champiñones");
                        cboselecing.addItem("salsa tomate");
                        cboselecing.addItem("chorizo");
                        cboselecing.addItem("jamon");
                        pyolaarmo = new yolaarmo("yo la armo", 100, "small");
                        break;
                    }
                }
            }
        });

        cboselecing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingredienteSeleccionado = (String) cboselecing.getSelectedItem();
                if (pizzaSeleccionada != null && ingredienteSeleccionado != null) {
                    ingredientesSeleccionados.add(new Topping(ingredienteSeleccionado, 20));
                }
            }
        });

        btnagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pizzaSeleccionada != null || pyolaarmo != null) {
                    String ingrediente = (String) cboselecing.getSelectedItem();
                    if (ingrediente != null) {
                        ingredientesSeleccionados.add(new Topping(ingrediente, 20));
                        mostrarIngredientes();
                    }
                }
            }
        });

        btneliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pizzaSeleccionada != null || pyolaarmo != null) {
                    String ingredienteAEliminar = (String) cboselecing.getSelectedItem();
                    if (ingredienteAEliminar != null) {
                        // Eliminar todos los ingredientes iguales de la lista
                        ingredientesSeleccionados.removeIf(ingrediente -> ingrediente.getNombre().equals(ingredienteAEliminar));
                        mostrarIngredientes();
                    }
                }
            }
        });


        btnpreparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(txtnombre.getText().isEmpty() || textArea1.getText().isEmpty())) {
                    textArea2.setText("Preparando..... " + txtnombre.getText() + "\n");
                    textArea2.append("Añadiendo Toppings: \n");

                    double precioTotalPizza = pizzaSeleccionada != null ? pizzaSeleccionada.calculatePrice() : pyolaarmo.calculatePrice();
                    List<Topping> ingredientesPizza = pizzaSeleccionada != null ? ingredientesSeleccionados : pyolaarmo.getToppings();

                    for (Topping topping : ingredientesPizza) {
                        textArea2.append("- " + topping.getNombre() + "\n");
                        precioTotalPizza += topping.getPrice();

                        try {
                            Thread.sleep(1000); // Simula el proceso de preparación
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                    }

                    textArea2.append("La Pizza está Lista!\n");
                    textArea2.append("Precio Total: " + precioTotalPizza);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese primero el nombre de la pizza o los Ingredientes");
                }
            }
        });

    }

    private void mostrarIngredientes() {
        StringBuilder ingredientes = new StringBuilder();
        double precioTotal = 0;

        for (Topping topping : ingredientesSeleccionados) {
            ingredientes.append(topping.getNombre()).append(" - ").append(topping.getPrice()).append("\n");
            precioTotal += topping.getPrice();
        }

        textArea1.setText(ingredientes.toString());
        lblprecio.setText(String.valueOf((pizzaSeleccionada != null ? pizzaSeleccionada.calculatePrice() : pyolaarmo.calculatePrice()) + precioTotal));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frmPizza pizzaForm = new frmPizza();
        frame.setContentPane(pizzaForm.panel1);

        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}

