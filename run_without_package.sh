#!/bin/bash

# Check if a file name was provided
if [ $# -eq 0 ]; then
    echo "Usage: ./run_without_package.sh <filename.java>"
    echo "Example: ./run_without_package.sh HelloWorld.java"
    exit 1
fi

# Get the filename
file_name=$1

# Compile the file
echo "Compiling $file_name..."
javac "$file_name"

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Running ${file_name%.java}..."
    java "${file_name%.java}"
else
    echo "Compilation failed!"
    exit 1
fi 