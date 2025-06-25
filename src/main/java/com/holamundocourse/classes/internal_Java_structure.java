package com.holamundocourse.classes;

// ESTRUCTURA INTERNA DE JAVA: LA GRAN BIBLIOTECA
// ===============================================
// 
// Java está organizado como una biblioteca gigante con diferentes secciones:
//
// 🏛️ PAQUETES PRINCIPALES DE JAVA:
//
// 1. java.lang - EL NÚCLEO (se importa automáticamente)
//    ├── String (textos)
//    ├── System (system.out.println)
//    ├── Math (operaciones matemáticas)
//    ├── Object (clase padre de todas)
//    └── Thread (manejo de hilos)
//
// 2. java.util - UTILIDADES Y HERRAMIENTAS
//    ├── Scanner (leer entrada del usuario)
//    ├── ArrayList (listas dinámicas)
//    ├── HashMap (mapas/diccionarios)
//    ├── Collections (utilidades para colecciones)
//    └── Random (números aleatorios)
//
// 3. java.time - FECHAS Y TIEMPO (Java 8+)
//    ├── LocalDateTime (fecha y hora local)
//    ├── DateTimeFormatter (formatear fechas)
//    ├── LocalDate (solo fechas)
//    ├── LocalTime (solo tiempo)
//    └── ZonedDateTime (fechas con zona horaria)
//
// 4. java.io - ENTRADA Y SALIDA DE DATOS
//    ├── File (manejo de archivos)
//    ├── FileReader (leer archivos)
//    ├── FileWriter (escribir archivos)
//    └── BufferedReader (lectura eficiente)
//
// 5. java.net - CONEXIONES DE RED
//    ├── URL (direcciones web)
//    ├── Socket (conexiones de red)
//    └── HttpURLConnection (conexiones HTTP)
//
// 6. javax.swing - INTERFACES GRÁFICAS (ventanas)
//    ├── JFrame (ventanas)
//    ├── JButton (botones)
//    └── JTextField (campos de texto)
//
// ⚡ REGLA ESPECIAL: java.lang se importa AUTOMÁTICAMENTE
//    Por eso podemos usar String, System.out.println sin importar nada
//
// 📚 EXPLICACIÓN DETALLADA: La Organización de Java
//
// 1. ¿Cómo está organizado Java?
//    Java funciona como una biblioteca municipal gigante con diferentes secciones:
//
//    BIBLIOTECA JAVA
//    ├── java.lang (Sección básica - SIEMPRE disponible)
//    ├── java.util (Sección de herramientas útiles)
//    ├── java.time (Sección de relojes y calendarios)
//    ├── java.io (Sección de lectura/escritura de archivos)
//    ├── java.net (Sección de internet y redes)
//    └── javax.swing (Sección de ventanas y botones)
//
// 2. Los Paquetes Más Importantes:
//
//    🔥 java.lang - EL CORAZÓN DE JAVA
//    - Se importa automáticamente (no necesitas escribir import java.lang.*)
//    - Contiene lo más básico que necesitas:
//      • String - para textos
//      • System - por eso funciona System.out.println()
//      • Math - operaciones matemáticas
//      • Integer, Double - números
//
//    🛠️ java.util - LA CAJA DE HERRAMIENTAS
//    - Utilidades que usas frecuentemente:
//      • Scanner - leer entrada del usuario
//      • ArrayList - listas que crecen y decrecen
//      • HashMap - como un diccionario (clave-valor)
//      • Random - números aleatorios
//
//    🕐 java.time - EL ESPECIALISTA EN TIEMPO
//    - Nuevo desde Java 8 (reemplazó las viejas clases de fecha)
//    - Especializados en fechas y tiempo:
//      • LocalDateTime - fecha + hora
//      • DateTimeFormatter - formatear fechas
//      • LocalDate - solo fechas
//      • LocalTime - solo tiempo
//
// 3. ¿Por qué esta organización?
//    Imagina que Java fuera una ferretería:
//    - java.lang = Herramientas básicas (martillo, destornillador) - siempre las tienes
//    - java.util = Herramientas útiles (taladro, sierra) - las traes cuando las necesitas
//    - java.time = Herramientas de precisión (cronómetro, reloj) - especialistas en tiempo
//    - java.io = Herramientas de carpintería (para trabajar con archivos)
//
// 4. La Regla de Oro:
//    ❌ NO necesitas escribir esto:
//    import java.lang.String;
//    import java.lang.System;
//
//    ✅ Pero SÍ necesitas escribir esto:
//    import java.util.Scanner;
//    import java.time.LocalDateTime;

public class internal_Java_structure {
    // Esta clase solo contiene documentación sobre la estructura de Java
    // No tiene código ejecutable, solo comentarios educativos
    
    public static void main(String[] args) {
        System.out.println("Esta clase contiene documentación sobre la estructura interna de Java.");
        System.out.println("Revisa los comentarios arriba para entender cómo está organizado Java.");
    }
} 