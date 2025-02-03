package edu.unisabana.pizzafactory.model;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaPreparator {
    private final Amasador amasador;
    private final Moldeador moldeador;
    private final Horneador horneador;

    public PizzaPreparator(PizzaFactory factory) {
        this.amasador = factory.crearAmasador();
        this.moldeador = factory.crearMoldeador();
        this.horneador = factory.crearHorneador();
    }

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam) throws ExcepcionParametrosInvalidos {
        amasador.amasar();

        if (tam == Tamano.PEQUENA) {
            moldeador.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANA) {
            moldeador.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }

        aplicarIngredientes(ingredientes);
        horneador.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PizzaPreparator.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES: {0}", Arrays.toString(ingredientes));

        // Simulación de comunicación con el microcontrolador
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println("Enviando al microcontrolador: Añadir " + ingrediente.getCantidad() + " de " + ingrediente.getNombre());
            // Aquí se debería enviar el comando real al hardware
        }
    }
}
