# ejerciciosJava
Prueba técnica Java
### Ejercicio 1 - Cálculo de fechas y etapas

**Objetivo:**
Determinar la diferencia de días entre dos fechas dadas y calcular tres etapas consecutivas a partir de una fecha de inicio.

**Fecha de inicio:** 01/04/2025
**Fecha de fin:** 26/05/2025

#### Paso 1: Calcular la diferencia de días

Se usa la clase `LocalDate` de `java.time` para definir las fechas y `ChronoUnit.DAYS.between()` para obtener la diferencia total en días.

```java
long diasDiferencia = ChronoUnit.DAYS.between(inicio, fin);
```

#### Paso 2: Definir las etapas

* **Etapa 1:** 13 días a partir del 01/04/2025
* **Etapa 2:** 28 días inmediatamente después de la etapa 1
* **Etapa 3:** 14 días inmediatamente después de la etapa 2

Cada etapa se calcula sumando días a la fecha de inicio o fin de la etapa anterior usando `plusDays()`.

---

### Ejercicio 2 - Hilos concurrentes

**Objetivo:**
Crear 6 hilos que impriman palabras diferentes para formar la frase:

> "En Banco Azteca Sueñas Decides Logras"

Cada hilo debe:

* Imprimir su parte de la frase
* Indicar desde qué hilo se imprime
* Esperar un tiempo proporcional a su identificador antes de imprimir (1 seg, 2 seg, etc.)

#### Implementación:

Se usa la clase `Thread` para crear hilos individuales, con la lógica de `Thread.sleep(id * 1000)` para introducir el retardo.

```java
Thread.sleep(id * 1000); // Tiempo proporcional
```

Esto permite que los mensajes se impriman de forma escalonada y ordenada por identificador de hilo.

**Resultado esperado (en consola):**

```
Thread 1: En
Thread 2: Banco
Thread 3: Azteca
Thread 4: Sueñas
Thread 5: Decides
Thread 6: Logras
```

