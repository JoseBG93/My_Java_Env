#!/bin/bash

# Función para compilar y ejecutar un archivo Java
run_java_file() {
    local file_path=$1
    local class_name=$(basename "$file_path" .java)
    
    echo "Compilando $file_path..."
    javac "$file_path"
    
    if [ $? -eq 0 ]; then
        echo "Ejecutando $class_name..."
        java -cp "$(dirname "$file_path")" "$class_name"
    else
        echo "Error al compilar $file_path"
    fi
}

# Verificar si se proporcionó un archivo como argumento
if [ $# -eq 0 ]; then
    echo "Uso: ./run.sh <ruta_del_archivo_java>"
    echo "Ejemplo: ./run.sh src/test/java/Curso\ YouTube\ \'Holamundo\'/Clases/arrays.java"
    exit 1
fi

run_java_file "$1" 