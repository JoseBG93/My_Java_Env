#!/bin/bash

# Check if a class name was provided
if [ $# -eq 0 ]; then
    echo "Usage: ./run_with_package.sh <ClassName>"
    echo "Example: ./run_with_package.sh Arithmetic_Operations"
    exit 1
fi

# Get the class name
class_name=$1

# Change to the Java source directory
cd /home/jose/My_Projects/myJavaEnv/src/main/java

# Compile the file using the package path
echo "Compiling $class_name.java..."
javac com/holamundocourse/classes/$class_name.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Running $class_name..."
    java com.holamundocourse.classes.$class_name
else
    echo "Compilation failed!"
    exit 1
fi 