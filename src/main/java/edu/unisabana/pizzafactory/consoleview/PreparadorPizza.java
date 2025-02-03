package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {
    public static void main(String args[]) {
        try {
            Ingrediente[] ingredientes = {
                    new Ingrediente("queso", 1),
                    new Ingrediente("jamon", 2)
            };

            // Aquí seleccionamos el tipo de pizza a fabricar
            PizzaFactory factory = new PizzaDelgadaFactory();
            PizzaPreparator preparador = new PizzaPreparator(factory);

            preparador.prepararPizza(ingredientes, Tamano.MEDIANA);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparación de la Pizza", ex);
        }
    }
}
