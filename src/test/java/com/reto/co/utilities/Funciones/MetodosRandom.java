package com.reto.co.utilities.Funciones;

import net.serenitybdd.annotations.Step;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class MetodosRandom {

    private static final Random random = new Random();

    // Método para generar un nombre aleatorio
    @Step("Generar nombre random")
    public static String generateRandomName() {
        String[] names = {"John", "Alice", "Michael", "Emma", "James", "Olivia", "William", "Sophia"};
        return names[random.nextInt(names.length)];
    }

    // Método para generar un país aleatorio
    public static String generateRandomCountry() {
        String[] countries = {"USA", "Canada", "UK", "Australia", "Germany", "France", "Japan"};
        return countries[random.nextInt(countries.length)];
    }

    // Método para generar una ciudad aleatoria
    public static String generateRandomCity() {
        String[] cities = {"New York", "Los Angeles", "London", "Paris", "Tokyo", "Sydney", "Berlin"};
        return cities[random.nextInt(cities.length)];
    }

    // Método para generar un número de tarjeta de crédito aleatorio
    public static @NotNull String generateRandomCreditCardNumber() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    // Método para generar un mes aleatorio (entre 1 y 12)
    public static int generateRandomMonth() {
        return random.nextInt(12) + 1;
    }

    // Método para generar un año aleatorio (entre 2022 y 2030)
    public static int generateRandomYear() {
        return random.nextInt(9) + 2022;
    }
}
