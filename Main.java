public class Main {

    public static void main(String[] args) {

        Flor[] flores = new Flor[3];
        flores[0] = new Flor("Rosa", 1.0, 0);
        flores[1] = new Flor("Estrelicia", 2.5, 0);
        flores[2] = new Flor("Margarida", 0.5, 0);

        Florista dameRosas = new Florista("Da-me Rosas", flores, flores[0]);

        System.out.println("Vão ser compradas 500 Rosas. O stock existente é:");
        System.out.println(dameRosas.compraFlor("Rosa", 500));
        System.out.println("Vão ser vendidas 250 Rosas. O valor da venda é:");
        System.out.println(dameRosas.vendeFlor("Rosa", 250) + "€");
        System.out.println("O stock de Rosas existente é:");
        System.out.println(dameRosas.verFlor("Rosa"));
        System.out.println();
        System.out.println("Vão ser compradas 500 Estrelicias. O stock existente é:");
        System.out.println(dameRosas.compraFlor("Estrelicia", 500));
        System.out.println("Vão ser vendidas 250 Estrelicias. O valor da venda é:");
        System.out.println(dameRosas.vendeFlor("Estrelicia", 250) + "€");
        System.out.println("O stock de Estrelicias Existente é:");
        System.out.println(dameRosas.verFlor("Estrelicia"));
        System.out.println();
        System.out.println("Vão ser compradas 500 Margaridas. O stock existente é:");
        System.out.println(dameRosas.compraFlor("Margarida", 500));
        System.out.println("Vão ser vendidas 250 Margaridas. O valor da venda é:");
        System.out.println(dameRosas.vendeFlor("Margarida", 250) + "€");
        System.out.println("O stock de Margaridas existente é:");
        System.out.println(dameRosas.verFlor("Margarida"));
        System.out.println();
        System.out.println("A flor de eleição da florista é:");
        System.out.println(dameRosas.getFlorEleita().getNome());
        System.out.println();
        System.out.println(dameRosas.listaInventarioLoja());
    }
}
