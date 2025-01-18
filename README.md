# Conversor de Monedas 💱

Este proyecto es un **Conversor de Monedas** desarrollado en **Java**, que permite convertir entre distintas monedas utilizando datos actualizados desde una API de tasas de cambio.

## 🚀 Características

- 🌐 **Conversión de monedas en tiempo real** usando la API de tasas de cambio.
- 📋 **Listado de monedas disponibles** directamente desde la API.
- 📂 **Historial de conversiones** almacenado en un archivo JSON.
- 🔍 **Consulta de países** asociados a cada moneda desde una base de datos interna.

## 🛠️ Tecnologías Utilizadas

- **Java 17+**
- **Gson** para el parseo de JSON
- **HTTPURLConnection** para la conexión con la API

## 📖 Uso

1. **Menú principal:**
   ```
   ============================
       CONVERSOR DE MONEDAS
   ============================
   1. Convertir
   2. Consultar país
   3. Salir
   ```

2. **Opción 1: Convertir**
   - Se muestra la lista de monedas disponibles en formato:
     ```
     [USD, EUR, JPY, MXN, ...]
     ```
   - Se solicita:
     - Moneda de origen
     - Moneda de destino
     - Cantidad a convertir

3. **Opción 2: Consultar país**
   - Muestra la lista de monedas y sus países:
     ```
     1. USD - Estados Unidos
     2. MXN - México
     3. EUR - Unión Europea
     ```

4. **Opción 3: Salir**
   - Finaliza el programa con el mensaje:
     ```
     Gracias por usar la aplicación :)
     ```

## 📝 Historial de Conversiones

- Cada conversión se guarda en el archivo `historial_conversiones.json` con el siguiente formato:

```json
[
  {
    "origen": "USD",
    "destino": "EUR",
    "cantidad": 100,
    "resultado": 85.5
  }
]
```

**Desarrollado por:** *Rubi Portuguez*

¡Espero que te sea útil! 😊
