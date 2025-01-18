package com.aluracursos.conversor.modelo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Base de datos interna con las monedas y sus países.
 */
public class BaseDeDatosMonedas {
    private static final Map<String, String> MONEDAS_PAISES = new LinkedHashMap<>();

    static {
        // Monedas y sus respectivos países
        MONEDAS_PAISES.put("AED", "United Arab Emirates");
        MONEDAS_PAISES.put("AFN", "Afghanistan");
        MONEDAS_PAISES.put("ALL", "Albania");
        MONEDAS_PAISES.put("AMD", "Armenia");
        MONEDAS_PAISES.put("ANG", "Netherlands Antilles");
        MONEDAS_PAISES.put("AOA", "Angola");
        MONEDAS_PAISES.put("ARS", "Argentina");
        MONEDAS_PAISES.put("AUD", "Australia");
        MONEDAS_PAISES.put("AWG", "Aruba");
        MONEDAS_PAISES.put("AZN", "Azerbaijan");
        MONEDAS_PAISES.put("BAM", "Bosnia and Herzegovina");
        MONEDAS_PAISES.put("BBD", "Barbados");
        MONEDAS_PAISES.put("BDT", "Bangladesh");
        MONEDAS_PAISES.put("BGN", "Bulgaria");
        MONEDAS_PAISES.put("BHD", "Bahrain");
        MONEDAS_PAISES.put("BIF", "Burundi");
        MONEDAS_PAISES.put("BMD", "Bermuda");
        MONEDAS_PAISES.put("BND", "Brunei");
        MONEDAS_PAISES.put("BOB", "Bolivia");
        MONEDAS_PAISES.put("BRL", "Brazil");
        MONEDAS_PAISES.put("BSD", "Bahamas");
        MONEDAS_PAISES.put("BTN", "Bhutan");
        MONEDAS_PAISES.put("BWP", "Botswana");
        MONEDAS_PAISES.put("BYN", "Belarus");
        MONEDAS_PAISES.put("BZD", "Belize");
        MONEDAS_PAISES.put("CAD", "Canada");
        MONEDAS_PAISES.put("CDF", "Democratic Republic of the Congo");
        MONEDAS_PAISES.put("CHF", "Switzerland");
        MONEDAS_PAISES.put("CLP", "Chile");
        MONEDAS_PAISES.put("CNY", "China");
        MONEDAS_PAISES.put("COP", "Colombia");
        MONEDAS_PAISES.put("CRC", "Costa Rica");
        MONEDAS_PAISES.put("CUP", "Cuba");
        MONEDAS_PAISES.put("CVE", "Cape Verde");
        MONEDAS_PAISES.put("CZK", "Czech Republic");
        MONEDAS_PAISES.put("DJF", "Djibouti");
        MONEDAS_PAISES.put("DKK", "Denmark");
        MONEDAS_PAISES.put("DOP", "Dominican Republic");
        MONEDAS_PAISES.put("DZD", "Algeria");
        MONEDAS_PAISES.put("EGP", "Egypt");
        MONEDAS_PAISES.put("ERN", "Eritrea");
        MONEDAS_PAISES.put("ETB", "Ethiopia");
        MONEDAS_PAISES.put("EUR", "European Union");
        MONEDAS_PAISES.put("FJD", "Fiji");
        MONEDAS_PAISES.put("FKP", "Falkland Islands");
        MONEDAS_PAISES.put("GBP", "United Kingdom");
        MONEDAS_PAISES.put("GEL", "Georgia");
        MONEDAS_PAISES.put("GHS", "Ghana");
        MONEDAS_PAISES.put("GIP", "Gibraltar");
        MONEDAS_PAISES.put("GMD", "The Gambia");
        MONEDAS_PAISES.put("GNF", "Guinea");
        MONEDAS_PAISES.put("GTQ", "Guatemala");
        MONEDAS_PAISES.put("GYD", "Guyana");
        MONEDAS_PAISES.put("HKD", "Hong Kong");
        MONEDAS_PAISES.put("HNL", "Honduras");
        MONEDAS_PAISES.put("HRK", "Croatia");
        MONEDAS_PAISES.put("HTG", "Haiti");
        MONEDAS_PAISES.put("HUF", "Hungary");
        MONEDAS_PAISES.put("IDR", "Indonesia");
        MONEDAS_PAISES.put("ILS", "Israel");
        MONEDAS_PAISES.put("INR", "India");
        MONEDAS_PAISES.put("IQD", "Iraq");
        MONEDAS_PAISES.put("IRR", "Iran");
        MONEDAS_PAISES.put("ISK", "Iceland");
        MONEDAS_PAISES.put("JMD", "Jamaica");
        MONEDAS_PAISES.put("JOD", "Jordan");
        MONEDAS_PAISES.put("JPY", "Japan");
        MONEDAS_PAISES.put("KES", "Kenya");
        MONEDAS_PAISES.put("KGS", "Kyrgyzstan");
        MONEDAS_PAISES.put("KHR", "Cambodia");
        MONEDAS_PAISES.put("KMF", "Comoros");
        MONEDAS_PAISES.put("KRW", "South Korea");
        MONEDAS_PAISES.put("KWD", "Kuwait");
        MONEDAS_PAISES.put("KZT", "Kazakhstan");
        MONEDAS_PAISES.put("LAK", "Laos");
        MONEDAS_PAISES.put("LBP", "Lebanon");
        MONEDAS_PAISES.put("LKR", "Sri Lanka");
        MONEDAS_PAISES.put("MAD", "Morocco");
        MONEDAS_PAISES.put("MDL", "Moldova");
        MONEDAS_PAISES.put("MGA", "Madagascar");
        MONEDAS_PAISES.put("MXN", "Mexico");
        MONEDAS_PAISES.put("MYR", "Malaysia");
        MONEDAS_PAISES.put("NOK", "Norway");
        MONEDAS_PAISES.put("NZD", "New Zealand");
        MONEDAS_PAISES.put("PEN", "Peru");
        MONEDAS_PAISES.put("PKR", "Pakistan");
        MONEDAS_PAISES.put("PLN", "Poland");
        MONEDAS_PAISES.put("PYG", "Paraguay");
        MONEDAS_PAISES.put("RUB", "Russia");
        MONEDAS_PAISES.put("SAR", "Saudi Arabia");
        MONEDAS_PAISES.put("SEK", "Sweden");
        MONEDAS_PAISES.put("SGD", "Singapore");
        MONEDAS_PAISES.put("THB", "Thailand");
        MONEDAS_PAISES.put("TRY", "Turkey");
        MONEDAS_PAISES.put("UAH", "Ukraine");
        MONEDAS_PAISES.put("USD", "United States");
        MONEDAS_PAISES.put("UYU", "Uruguay");
        MONEDAS_PAISES.put("VEF", "Venezuela");
        MONEDAS_PAISES.put("ZAR", "South Africa");
    }

    public static Map<String, String> obtenerMonedas() {
        return MONEDAS_PAISES;
    }
}
