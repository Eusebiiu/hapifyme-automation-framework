package com.hapifyme.utils;

public class ConfigManager {
    // Aceasta este variabila pe care o ai deja
    public static final String BASE_URL = "https://test.hapifyme.com/api";

    // ADAUGĂ această metodă pentru ca BaseTest să o poată găsi
    public static String get(String key) {
        if (key.equals("BASE_URL")) {
            return BASE_URL;
        }
        return "";
    }
}