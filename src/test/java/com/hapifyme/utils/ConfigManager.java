package com.hapifyme.utils;

public class ConfigManager {
    public static final String BASE_URL = "https://test.hapifyme.com/api";

    public static String get(String key) {
        if (key.equals("BASE_URL")) {
            return BASE_URL;
        }
        return "";
    }
}