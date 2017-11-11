package com.example.communicationlibrary;

/**
 * Klasa reprezentująca dane przesyłane pomiędzy urządzeniem a telefonem
 */

public class Data {
    private String type;
    private float acceleration;

    //Constants
    public static final String TYPE_DATA = "acc";
    public static final String TYPE_CONFIGURATION = "config";

    public Data() {
        type = null;
        acceleration = 0;
    }

    public Data(String type) {
        switch(type) {
            case Data.TYPE_DATA:
                type = Data.TYPE_DATA;
                break;
            case Data.TYPE_CONFIGURATION:
                type = Data.TYPE_CONFIGURATION;
                break;
            default:
                type = null;
        }
    }

    public Data(String type, String data) {
        switch(type) {
            case Data.TYPE_DATA:
                type = Data.TYPE_DATA;
                break;
            case Data.TYPE_CONFIGURATION:
                type = Data.TYPE_CONFIGURATION;
                break;
            default:
                type = null;
        }
    }
}
