#!/bin/bash

# Check if a file name was provided
if [ $# -eq 0 ]; then
    echo "Usage: ./run_java.sh <filename>"
    echo "Example: ./run_java.sh arrays"
    exit 1
fi

# Get the filename without extension
filename=$1
if [[ $filename == *.java ]]; then
    filename=${filename%.java}
fi

# Change to the Java source directory
cd /home/jose/My_Projects/myJavaEnv/src/main/java

# Compile the file
echo "Compiling $filename.java..."
javac com/myjavaenv/$filename.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Running $filename..."
    java com.myjavaenv.$filename
else
    echo "Compilation failed!"
    exit 1
fi 