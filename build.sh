#!/bin/bash

set -e

mkdir -p Fat/META-INF
cat <<EOL > Fat/META-INF/MANIFEST.MF
Manifest-Version: 1.0
Created-By: 21.0.1 (Oracle Corporation)
Main-Class: Main
EOL

echo "Compiling files"
cd src
javac -d ../out -cp ../lib *.java  

cd ../
cp -r lib/* Fat/
cp out/* Fat/

jar cvfm json.jar Fat/META-INF/MANIFEST.MF -C Fat .

echo "Build successful!"