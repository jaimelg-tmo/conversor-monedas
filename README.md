💱 Conversor de Monedas en Java (API ExchangeRate)

Este es un proyecto Java basado en consola que permite convertir entre distintas monedas utilizando la API ExchangeRate-API, con soporte para tasas en tiempo real y estructura modular en múltiples clases.

📁 Estructura del Proyecto

conversor/
├── Principal.java                // Punto de entrada del programa
├── Conversor.java               // Contiene el menú e interacción con el usuario
├── ConsultaConversion.java      // Realiza las solicitudes HTTP a la API
└── RespuestaConversion.java     // Clase no utilizada (puede eliminarse)

⚖️ Requisitos

Java 11 o superior

Gson (para parsear JSON)

Una clave válida de ExchangeRate-API (puedes conseguirla gratis)

🔑 Cómo configurar tu clave API

Reemplaza la línea en ConsultaConversion.java:

private static final String API_KEY = "TU_API_KEY_AQUI";

por tu clave real de ExchangeRate-API.

🌐 Monedas soportadas

La aplicación permite conversiones bidireccionales entre el Peso chileno (CLP) y las siguientes monedas:

Peso argentino (ARS)

Boliviano boliviano (BOB)

Real brasileño (BRL)

Peso colombiano (COP)

Dólar estadounidense (USD)

Dólar canadiense (CAD)

🧰 Ejecución

Compila todos los archivos Java dentro del paquete conversor.

Ejecuta Principal.java.

El programa mostrará un menú como este:

Sea bienvenido/a al Conversor de Moneda
1. CLP a ARS
2. ARS a CLP
3. CLP a BOB
...
12. CAD a CLP
13. Salir

Ingresa el número de la opción deseada.

Introduce la cantidad que quieres convertir.

El resultado será mostrado automáticamente.

📦 Librerías externas

Este programa utiliza:

HttpClient, HttpRequest y HttpResponse (desde Java 11)

Gson para el parseo de JSON:

Si usas Maven, puedes incluirla con:

<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10.1</version>
</dependency>

📌 Notas

La clase RespuestaConversion fue diseñada inicialmente para mapear respuestas JSON completas, pero ya no se necesita al utilizar el endpoint /pair de la API.

Puedes personalizar los nombres de las monedas para que se muestren completos en el menú (ya está implementado si seguiste las instrucciones anteriores).

✅ Futuras mejoras

Validación de entradas numéricas

Soporte para más monedas

Interfaz gráfica (Swing o JavaFX)

Registro de historial de conversiones

✍️ Autor

Desarrollado como ejercicio educativo para entender el consumo de APIs con Java moderno.
