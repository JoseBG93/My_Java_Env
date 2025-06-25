// BLOQUE 1: DECLARACIÓN DEL PAQUETE E IMPORTACIONES
// ===================================================

// Esta línea indica en qué "carpeta" o paquete está nuestro archivo
// Los paquetes son como carpetas que organizan nuestras clases de Java
package com.holamundocourse.classes;

// IMPORTACIONES: Aquí "traemos" clases que están en otras partes de Java
// Es como decir "necesito usar estas herramientas que ya existen"

// Esta importación nos permite trabajar con fechas y horas
import java.time.LocalDateTime;

// Esta importación nos permite formatear (dar formato) a las fechas
// Por ejemplo: convertir "2024-01-15T14:30:25" a "15/01/2024 14:30:25"
import java.time.format.DateTimeFormatter;

// Esta importación nos permite leer datos que escribe el usuario
import java.util.Scanner;

// CONCEPTOS CLAVE: VISIBILIDAD EN JAVA (Modificadores de Acceso)
// =============================================================
//
// Cuando decimos "desde cualquier lugar", nos referimos a CUALQUIER ARCHIVO 
// del proyecto Java, no solo el mismo archivo. Existen 4 niveles:
//
// 🌍 PUBLIC - Acceso GLOBAL (desde cualquier archivo del proyecto)
//    ├── Ejemplo: public class MiClase
//    ├── Puede ser usada desde cualquier archivo .java del proyecto
//    └── Es como una "biblioteca pública" - todos pueden entrar
//
// 🏠 PRIVATE - Acceso SOLO dentro de la MISMA CLASE
//    ├── Ejemplo: private int edad;
//    ├── Solo puede ser usado dentro de la misma clase
//    └── Es como tu "habitación privada" - solo tú puedes entrar
//
// 👨‍👩‍👧‍👦 PROTECTED - Acceso dentro del MISMO PAQUETE + clases hijas
//    ├── Ejemplo: protected String nombre;
//    ├── Accesible desde el mismo paquete y clases que heredan
//    └── Es como "solo para la familia"
//
// 📦 DEFAULT (sin palabra) - Acceso dentro del MISMO PAQUETE
//    ├── Ejemplo: int numero; (sin public, private, protected)
//    ├── Solo clases del mismo paquete pueden acceder
//    └── Es como "solo para los vecinos del barrio"
//
// EJEMPLOS PRÁCTICOS:
// ==================
// 
// Archivo1.java:                    Archivo2.java:
// public class Archivo1 {           public class Archivo2 {
//   public int publico = 1;           public void ejemplo() {
//   private int privado = 2;            Archivo1 obj = new Archivo1();
//   protected int protegido = 3;        
//   int porDefecto = 4;                 obj.publico;    ✅ SÍ puede acceder
// }                                     obj.privado;    ❌ NO puede acceder
//                                       obj.protegido;  ✅/❌ Depende del paquete
//                                       obj.porDefecto; ✅/❌ Depende del paquete
//                                   }
//                                 }

// BLOQUE 2: DECLARACIÓN DE LA CLASE Y MÉTODO MAIN
// ===============================================

// DECLARACIÓN DE LA CLASE
// public = visible desde CUALQUIER ARCHIVO del proyecto Java (no solo este archivo)
// class = palabra clave que indica que estamos creando una clase
// option_selector = nombre de nuestra clase (debe coincidir con el nombre del archivo)
public class basic_lessons {
    
    // MÉTODO MAIN - EL PUNTO DE ENTRADA DEL PROGRAMA
    // =============================================
    // public = accesible desde CUALQUIER ARCHIVO del proyecto
    // static = pertenece a la clase, no a una instancia específica
    // void = este método no devuelve ningún valor
    // main = nombre especial que Java busca para iniciar el programa
    // String[] args = parámetros que puede recibir el programa desde la línea de comandos
    //
    // EXPLICACIÓN DETALLADA DE "String[] args":
    // ========================================
    //
    // 🔤 String = tipo de dato para texto (palabras, frases)
    // 📦 [] = indica que es un ARRAY (lista/arreglo) de Strings
    // 🏷️ args = nombre de la variable (viene de "arguments" = argumentos)
    //
    // ¿PARA QUÉ SIRVE?
    // ===============
    // Permite que tu programa reciba información desde la consola cuando lo ejecutas
    //
    // EJEMPLO PRÁCTICO:
    // ================
    // En la consola escribes: java option_selector Juan 25 Madrid
    //                                          ↑    ↑  ↑
    //                                     args[0] args[1] args[2]
    //
    // Dentro del programa:
    // args[0] = "Juan"     (primer argumento)
    // args[1] = "25"       (segundo argumento) 
    // args[2] = "Madrid"   (tercer argumento)
    // args.length = 3      (total de argumentos recibidos)
    //
    // CASOS DE USO REALES:
    // ===================
    // • java MiPrograma archivo.txt     → procesar un archivo específico
    // • java Calculadora 5 + 3         → calcular 5 + 3
    // • java Saludo Juan                → saludar a Juan
    // • java MiApp --debug              → ejecutar en modo debug
    //
    // NOTA IMPORTANTE:
    // ===============
    // • Si no pasas argumentos, args será un array vacío (longitud 0)
    // • args SIEMPRE son String, aunque escribas números
    // • Si quieres usar números, debes convertirlos: Integer.parseInt(args[0])
    //
    // ❓ PREGUNTA FRECUENTE: ¿ES OBLIGATORIO EL MÉTODO main?
    // =====================================================
    //
    // 🚨 RESPUESTA: ¡NO! El método main NO es obligatorio en todas las clases
    //
    // CUÁNDO SÍ NECESITAS main:
    // ========================
    // ✅ Cuando quieres que la clase sea EJECUTABLE (punto de entrada del programa)
    // ✅ Cuando es la clase "principal" que inicia todo
    // ✅ Solo necesitas UN main por programa (en una sola clase)
    //
    // CUÁNDO NO NECESITAS main:
    // =========================
    // ❌ Clases que solo definen objetos (como Persona, Coche, Calculadora)
    // ❌ Clases que solo tienen métodos utilitarios
    // ❌ Clases que son usadas por otras clases pero no ejecutan por sí solas
    //
    // EJEMPLOS:
    // =========
    //
    // CLASE CON main (EJECUTABLE):
    // ---------------------------
    // public class MiPrograma {
    //     public static void main(String[] args) {  ← SÍ necesita main
    //         // Código que se ejecuta al iniciar
    //     }
    // }
    //
    // CLASE SIN main (SOLO DEFINICIÓN):
    // ---------------------------------
    // public class Persona {  ← NO necesita main
    //     private String nombre;
    //     private int edad;
    //     
    //     public void saludar() {
    //         System.out.println("Hola, soy " + nombre);
    //     }
    // }
    //
    // CLASE UTILITARIA SIN main:
    // --------------------------
    // public class Matematicas {  ← NO necesita main
    //     public static int sumar(int a, int b) {
    //         return a + b;
    //     }
    // }
    //
    // ANALOGÍA:
    // ========
    // • Clase CON main = Coche con motor (puede arrancar solo)
    // • Clase SIN main = Rueda, motor, asiento (componentes que usa el coche)
    //
    // REGLA DE ORO:
    // ============
    // Solo la clase que quieres que "arranque" el programa necesita main
    // Las demás son "herramientas" que usa esa clase principal
    //
    // ❓ PREGUNTA SOBRE ACCESIBILIDAD DE MÉTODOS:
    // ==========================================
    //
    // 🤔 ¿Los métodos públicos pueden usarse desde cualquier archivo?
    // RESPUESTA: Depende si son STATIC o NO-STATIC
    //
    // 📊 DIFERENCIAS CLAVE:
    // ====================
    //
    // 🔄 MÉTODOS NO-STATIC (de instancia):
    // -----------------------------------
    // • Necesitas CREAR UN OBJETO para usarlos
    // • Ejemplo: saludar() en la clase Persona
    //
    // Desde cualquier archivo:
    // Persona juan = new Persona("Juan", 25);  ← Crear objeto
    // juan.saludar();                          ← Usar método del objeto
    //
    // ⚡ MÉTODOS STATIC (de clase):
    // -----------------------------
    // • Se usan DIRECTAMENTE con el nombre de la clase
    // • NO necesitas crear objeto
    // • Ejemplo: sumar() en la clase Calculadora
    //
    // Desde cualquier archivo:
    // int resultado = Calculadora.sumar(5, 3); ← Uso directo, sin objeto
    //
    // 📝 RESUMEN PRÁCTICO:
    // ===================
    //
    // ARCHIVO: MiPrograma.java
    // ------------------------
    // public class MiPrograma {
    //     public static void main(String[] args) {
    //         
    //         // ✅ MÉTODO STATIC - Uso directo
    //         int suma = Calculadora.sumar(10, 5);
    //         
    //         // ✅ MÉTODO NO-STATIC - Necesito crear objeto
    //         Persona maria = new Persona("María", 30);
    //         maria.saludar();
    //         
    //         // ❌ ESTO NO FUNCIONA (método no-static sin objeto):
    //         // Persona.saludar(); ← ERROR!
    //     }
    // }
    //
    // 🎯 ANALOGÍAS:
    // =============
    // • STATIC = Máquina expendedora (usas directamente, sin dueño)
    // • NO-STATIC = Teléfono personal (necesitas que alguien lo tenga)
    //
    // 🏷️ IDENTIFICACIÓN VISUAL:
    // =========================
    // public static void sumar()    ← STATIC: uso directo
    // public void saludar()         ← NO-STATIC: necesitas objeto
    //
    // ✅ CONFIRMACIÓN DE ENTENDIMIENTO CORRECTO:
    // =========================================
    //
    // 🎯 FÓRMULA PARA USO "LIBRE" DESDE CUALQUIER ARCHIVO:
    // public + static = Acceso universal y directo
    //
    // • public = "Puerta abierta" (accesible desde cualquier archivo)
    // • static = "Pertenece a la clase" (no necesitas crear objeto)
    //
    // 🏛️ ¿QUÉ SIGNIFICA REALMENTE "STATIC"?
    // ====================================
    //
    // STATIC = "DE LA CLASE", no "de los objetos individuales"
    //
    // ANALOGÍA DEL EDIFICIO:
    // =====================
    // • Clase = Edificio entero
    // • Objetos = Apartamentos individuales dentro del edificio
    // • static = Elementos COMPARTIDOS del edificio (ascensor, portero, lobby)
    // • no-static = Elementos PROPIOS de cada apartamento (cocina, baño)
    //
    // EJEMPLO PRÁCTICO:
    // ================
    //
    // public class Contador {
    //     // STATIC - Compartido por TODA la clase
    //     public static int totalContadores = 0;
    //     
    //     // NO-STATIC - Propio de cada objeto
    //     public int miNumero;
    //     
    //     public Contador() {
    //         totalContadores++;  // Se incrementa para TODOS
    //         miNumero = totalContadores;  // Cada objeto tiene su propio número
    //     }
    //     
    //     // MÉTODO STATIC - Se puede usar sin crear objeto
    //     public static int getTotalContadores() {
    //         return totalContadores;
    //     }
    //     
    //     // MÉTODO NO-STATIC - Necesitas objeto para usarlo
    //     public int getMiNumero() {
    //         return miNumero;
    //     }
    // }
    //
    // USO DESDE OTRO ARCHIVO:
    // ======================
    // 
    // // STATIC - Uso directo, sin objeto
    // int total = Contador.getTotalContadores();  ✅ Funciona
    // 
    // // NO-STATIC - Necesitas objeto
    // Contador c1 = new Contador();
    // int numero = c1.getMiNumero();  ✅ Funciona
    //
    // 📊 RESUMEN DE COMBINACIONES:
    // ============================
    // public static    = Uso libre desde cualquier archivo (sin objeto)
    // public no-static = Uso desde cualquier archivo (con objeto)
    // private static   = Solo dentro de la misma clase (sin objeto)
    // private no-static= Solo dentro de la misma clase (con objeto)
    //
    // 🎯 TU CONCLUSIÓN ES PERFECTA:
    // =============================
    // "public static" = Máxima libertad de uso
    // • public = Acceso desde cualquier archivo
    // • static = Uso directo sin crear objetos
    //
    // ✅ DEFINICIÓN PERFECTA DEL ESTUDIANTE:
    // =====================================
    // "static permite utilizar un método sin necesidad de crear una instancia"
    // 
    // 🎯 CONFIRMACIÓN: ¡COMPLETAMENTE CORRECTO!
    //
    // STATIC = Sin instancia (sin objeto)
    // NO-STATIC = Con instancia (con objeto)
    //
    // 📝 TERMINOLOGÍA TÉCNICA:
    // ========================
    // • INSTANCIA = OBJETO creado a partir de una clase
    // • new NombreClase() = Crear una instancia/objeto
    //
    // 🔄 COMPARACIÓN DIRECTA:
    // =======================
    //
    // CON STATIC (sin instancia):
    // ---------------------------
    // Math.max(10, 5);           ← Uso directo, sin crear objeto
    // System.out.println("Hola"); ← Uso directo, sin crear objeto
    // Integer.parseInt("25");     ← Uso directo, sin crear objeto
    //
    // SIN STATIC (con instancia):
    // ---------------------------
    // Scanner sc = new Scanner(System.in);  ← Crear instancia/objeto
    // sc.nextInt();                         ← Usar método del objeto
    //
    // ArrayList<String> lista = new ArrayList<>();  ← Crear instancia
    // lista.add("elemento");                        ← Usar método del objeto
    //
    // 🏭 ANALOGÍA DE LA FÁBRICA:
    // ==========================
    // • STATIC = Máquina que funciona sola (no necesita operador)
    // • NO-STATIC = Máquina que necesita operador específico
    //
    // Ejemplo:
    // • Calculadora.sumar(5, 3) = Máquina automática ← STATIC
    // • juan.caminar() = Juan debe existir primero ← NO-STATIC
    //
    // 💡 ¿POR QUÉ EXISTE STATIC?
    // ==========================
    // Para funciones "utilitarias" que no dependen de datos específicos:
    // • Operaciones matemáticas (Math.max, Math.min)
    // • Conversiones (Integer.parseInt, String.valueOf)
    // • Utilidades generales (System.out.println)
    //
    // ¿POR QUÉ EXISTE NO-STATIC?
    // ===========================
    // Para acciones que dependen de datos específicos del objeto:
    // • persona.caminar() ← Depende de las piernas de ESA persona
    // • coche.acelerar() ← Depende del motor de ESE coche específico
    public static void main(String[] args) {
        
        // BLOQUE 3: MANEJO DE FECHAS Y TIEMPO
        // ===================================
        
        // Crear un objeto que represente la fecha y hora actual
        // LocalDateTime = clase para fechas y horas sin zona horaria
        // now() = método estático que obtiene el momento actual
        LocalDateTime now = LocalDateTime.now();
        
        // Crear un formateador para cambiar cómo se ve la fecha
        // DateTimeFormatter = clase para formatear fechas y horas
        // ofPattern() = método que define el patrón de formato
        // "yyyy-MM-dd HH:mm:ss" = año-mes-día hora:minuto:segundo  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Imprimir la fecha en formato "crudo" (como la maneja Java internamente)
        System.out.println(now);
        
        // Imprimir la fecha con formato personalizado (más legible)
        // now.format(formatter) = aplicar el formato definido arriba
        System.out.println("Hora actual: " + now.format(formatter));
        
        // BLOQUE 4: SCANNER Y MÉTODOS DE ANIMACIÓN
        // ========================================
        
        // CREACIÓN DE SCANNER (INSTANCIA NO-STATIC)
        // =========================================
        // Scanner = clase para leer datos que escribe el usuario
        // userOption = nombre de la variable (podría ser cualquier nombre)
        // new Scanner(System.in) = crear una INSTANCIA para leer desde el teclado
        // System.in = flujo de entrada estándar (el teclado)
        //
        // ¡AQUÍ VEMOS EL CONCEPTO DE INSTANCIA EN ACCIÓN!
        // • Scanner NO es static → necesitamos crear objeto con "new"
        // • Una vez creado, podemos usar métodos como nextInt(), nextLine(), etc.
        Scanner userOption = new Scanner(System.in);
        
        // LLAMADAS A MÉTODOS DE ANIMACIÓN
        // ==============================
        // Estos métodos están definidos MÁS ABAJO en el código
        // Son métodos STATIC PRIVADOS de nuestra propia clase
        // Como son static: los usamos directamente sin crear objeto
        // Como son privados: solo los podemos usar dentro de esta clase
        
        // printWithDelay = método que imprime texto letra por letra con retraso
        // Parámetros: (texto, milisegundos_de_retraso_por_letra)
        printWithDelay("Este es un selector de opciones simple.", 50);
        printWithDelay("\nPuedes elegir una de las siguientes opciones:", 50);
        
        // pauseFor = método que hace una pausa/espera
        // Parámetro: milisegundos_de_pausa
        pauseFor(500);  // Pausa 500ms = 0.5 segundos
        
        // Mostrar opciones con efectos de animación
        printWithDelay("\n1. Opción A", 30);  // 30ms por letra = más rápido
        pauseFor(300);                        // Pausa entre opciones
        printWithDelay("\n2. Opción B", 30);
        pauseFor(300);
        printWithDelay("\n3. Opción C", 30);
        
        // Pausa dramática antes de pedir la elección del usuario
        pauseFor(800);  // 800ms = 0.8 segundos
        printWithDelay("\n\n¿Cuál es tu elección? (1-3): ", 40);
        
        // LECTURA DE ENTRADA DEL USUARIO
        // =============================
        // userOption.nextInt() = método NO-STATIC del objeto Scanner
        // Espera a que el usuario escriba un número y presione Enter
        // El programa se "congela" aquí hasta que el usuario responda
        int userChoice = userOption.nextInt();
        
        // RESPUESTA ANIMADA AL USUARIO
        // ===========================
        pauseFor(300);  // Pequeña pausa antes de procesar
        printWithDelay("\nProcesando tu selección", 60);  // Texto más lento
        
        // printDots = método que imprime puntos animados (como "cargando...")
        printDots(3, 500);  // 3 puntos, 500ms entre cada punto
        
        // Mostrar resultado final con animación
        // getOptionLetter(userChoice) = llama a OTRO método para convertir número a letra
        printWithDelay("\n¡Excelente! Has seleccionado la Opción " + getOptionLetter(userChoice), 40);
        
        // IMPORTANTE: Cerrar el Scanner
        // ============================
        // userOption.close() = liberar los recursos del Scanner
        // Es buena práctica cerrar los Scanner cuando ya no los necesites
        userOption.close();
    }
    
    // BLOQUE 5: MÉTODOS DE ANIMACIÓN (STATIC PRIVADOS)
    // ================================================
    
    // MÉTODO 1: printWithDelay - Efecto máquina de escribir
    // ====================================================
    // private = solo se puede usar dentro de esta clase
    // static = se usa directamente sin crear objeto
    // void = no devuelve nada
    // printWithDelay = nombre del método
    // (String text, int delayMs) = parámetros que recibe
    //
    // 📝 EXPLICACIÓN DE PARÁMETROS (para aclarar punto 2):
    // ===================================================
    // PARÁMETROS = "ingredientes" que necesita el método para funcionar
    // Es como una receta de cocina:
    //
    // Receta: "Hacer sandwich"
    // Ingredientes: pan, jamón, queso ← Estos son los "parámetros"
    // 
    // Método: printWithDelay
    // Parámetros: text (el texto), delayMs (velocidad) ← Estos son los "ingredientes"
    //
    // CUANDO LLAMAMOS EL MÉTODO:
    // printWithDelay("Hola mundo", 100);
    //                    ↑         ↑
    //                  text    delayMs
    // 
    // Java "sustituye":
    // String text = "Hola mundo";  ← Parámetro 1
    // int delayMs = 100;           ← Parámetro 2
    private static void printWithDelay(String text, int delayMs) {
        
        // BUCLE FOR-EACH: recorre cada letra del texto
        // ===========================================
        // text.toCharArray() = convierte el texto en un array de caracteres
        // for (char c : array) = "para cada carácter c en el array"
        // char = tipo de dato para un solo carácter ('a', 'b', '!', etc.)
        //
        // 🔄 ACLARACIÓN FOR-EACH vs FOR TRADICIONAL (punto 3):
        // ===================================================
        // FOR-EACH: Para recorrer TODOS los elementos de una colección
        // • No necesitas saber cuántos elementos hay
        // • No necesitas índices (posiciones)
        // • Más simple y legible
        // • Ejemplo: for (char c : texto) ← "para cada char c en texto"
        //
        // FOR TRADICIONAL: Para control preciso de iteraciones
        // • Cuando necesitas el índice/posición
        // • Cuando no quieres recorrer todo
        // • Para bucles que no son de colecciones
        // • Ejemplo: for (int i = 0; i < 10; i++) ← "desde 0 hasta 10"
        //
        // ANALOGÍA:
        // • FOR-EACH = "Lee cada página del libro" (todas las páginas)
        // • FOR TRADICIONAL = "Lee desde página 5 hasta página 20" (control específico)
        for (char c : text.toCharArray()) {
            
            // Imprimir UN solo caráacter (sin salto de línea)
            System.out.print(c);
            
            // System.out.flush() = forzar que se muestre inmediatamente
            // Sin esto, Java puede "guardar" los caracteres y mostrarlos todos juntos
            System.out.flush();
            
            // BLOQUE TRY-CATCH: manejo de errores
            // ===================================
            // 🛡️ ACLARACIÓN TRY-CATCH (punto 4):
            // ==================================
            // TRY-CATCH NO es sobre visibilidad entre clases
            // Es sobre MANEJO DE EXCEPCIONES que pueden ocurrir
            //
            // ¿QUÉ ES UNA EXCEPCIÓN?
            // • Error que puede ocurrir mientras el programa se ejecuta
            // • Thread.sleep() puede ser interrumpido por el sistema operativo
            // • Si no manejamos la excepción, el programa se crashea
            //
            // ANALOGÍA:
            // • TRY = "Intenta hacer esto"
            // • CATCH = "Si algo sale mal, haz esto otro"
            // • Como tener un plan B si tu plan A falla
            //
            // EJEMPLO DE LA VIDA REAL:
            // try {
            //     cortarPan();  ← Puede fallar si no hay cuchillo
            // } catch (NoHayCuchilloException e) {
            //     usarManos(); ← Plan B si no hay cuchillo
            // }
            try {
                // Thread.sleep(delayMs) = pausar el programa por X milisegundos
                // Thread = hilo de ejecución del programa
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                // Si algo interrumpe el sleep, ejecutar este código
                Thread.currentThread().interrupt();
                break;  // Salir del bucle
            }
        }
    }
    
    // MÉTODO 2: printDots - Efecto de puntos de carga
    // ===============================================
    private static void printDots(int count, int delayMs) {
        
        // BUCLE FOR TRADICIONAL: repetir X veces
        // ======================================
        // int i = 0 = variable contador, empieza en 0
        // i < count = condición: mientras i sea menor que count
        // i++ = incrementar i en 1 después de cada iteración
        for (int i = 0; i < count; i++) {
            
            // Imprimir un punto sin salto de línea
            System.out.print(".");
            System.out.flush();  // Mostrar inmediatamente
            
            // Pausa entre puntos
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    
    // MÉTODO 3: pauseFor - Pausa simple
    // =================================
    private static void pauseFor(int milliseconds) {
        try {
            // Pausar por la cantidad de milisegundos especificada
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // Manejo de errores si la pausa es interrumpida
            Thread.currentThread().interrupt();
        }
    }
    
    // MÉTODO 4: getOptionLetter - Convertir número a letra
    // ===================================================
    // String = tipo de retorno (devuelve texto)
    // getOptionLetter = nombre del método
    // (int choice) = parámetro que recibe (número de opción)
    private static String getOptionLetter(int choice) {
        
        // SWITCH STATEMENT: seleccionar según el valor
        // ===========================================
        // switch (choice) = evaluar la variable choice
        switch (choice) {
            case 1: return "A";      // Si choice es 1, devolver "A"
            case 2: return "B";      // Si choice es 2, devolver "B"  
            case 3: return "C";      // Si choice es 3, devolver "C"
            default: return "Inválida";  // Si es cualquier otro valor
        }
        
        // NOTA: Este método DEVUELVE un valor (String)
        // Por eso usamos "return" en lugar de System.out.println()
        // El valor devuelto se usa en: getOptionLetter(userChoice)
    }
}