#!/bin/bash

# Check if a file name was provided
if [ $# -eq 0 ]; then
    echo "Usage: ./run.sh <filename>"
    echo "Example: ./run.sh arrays"
    exit 1
fi

# Get the filename without extension
filename=$1
if [[ $filename == *.java ]]; then
    filename=${filename%.java}
fi

# Compile and run
cd src/main/java
javac com/myjavaenv/$filename.java
java com.myjavaenv.$filename 