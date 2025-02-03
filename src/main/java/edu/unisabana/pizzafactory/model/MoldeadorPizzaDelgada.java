
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class MoldeadorPizzaDelgada extends Moldeador {
    @Override
    public void moldearPizzaPequena() {
        System.out.println("Moldeando pizza delgada pequeña...");
    }

    @Override
    public void moldearPizzaMediana() {
        System.out.println("Moldeando pizza delgada mediana...");
    }
}