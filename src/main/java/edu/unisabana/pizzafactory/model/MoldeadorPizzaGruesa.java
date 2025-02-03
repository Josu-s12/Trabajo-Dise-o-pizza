package edu.unisabana.pizzafactory.model;

public class MoldeadorPizzaGruesa extends Moldeador {
    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza gruesa pequeña...");
    }

    @Override
    public void moldearPizzaMediana() {
        System.out.println("Moldeando pizza gruesa mediana...");
    }
}
