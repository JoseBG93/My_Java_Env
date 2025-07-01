#!/bin/bash

# Check if a file name was provided
if [ $# -eq 0 ]; then
    echo "Usage: ./run_java.sh <filename> [package]"
    echo "Examples:"
    echo "  ./run_java.sh ArrayOperations classes"
    echo "  ./run_java.sh calculator Exercises" 
    echo "  ./run_java.sh basic_lessons classes"
    exit 1
fi

# Get the filename without extension
filename=$1
if [[ $filename == *.java ]]; then
    filename=${filename%.java}
fi

# Get the package (default to 'classes' if not provided)
package=${2:-classes}

# Change to the Java source directory
cd /home/jose/My_Projects/myJavaEnv/src/main/java

# Compile the file
echo "Compiling $filename.java from package $package..."
javac com/holamundocourse/$package/$filename.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Running $filename..."
    java com.holamundocourse.$package.$filename
else
    echo "Compilation failed!"
    exit 1
fi 