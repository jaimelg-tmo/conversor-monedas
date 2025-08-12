<<<<<<< HEAD
package com.alura.conversor;

import com.google.gson.JsonObject;

public class RespuestaConversion {

    private JsonObject tasas;

    public RespuestaConversion(JsonObject tasas) {
        this.tasas = tasas;
    }

    public double getTasa(String codigoMoneda) {
        if (!tasas.has(codigoMoneda)) {
            throw new IllegalArgumentException("Moneda no soportada: " + codigoMoneda);
        }
        return tasas.get(codigoMoneda).getAsDouble();
    }
=======
package com.alura.conversor;

import com.google.gson.JsonObject;

public class RespuestaConversion {

    private JsonObject tasas;

    public RespuestaConversion(JsonObject tasas) {
        this.tasas = tasas;
    }

    public double getTasa(String codigoMoneda) {
        if (!tasas.has(codigoMoneda)) {
            throw new IllegalArgumentException("Moneda no soportada: " + codigoMoneda);
        }
        return tasas.get(codigoMoneda).getAsDouble();
    }
>>>>>>> f58ab103d73d652322eb48fce6f9cf90d81f79bf
}