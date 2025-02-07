#!/bin/bash

if ! [ -x "$(command -v java)" ]; then
  echo "Error:Java not installed." >&2
  exit 1
fi

# Give necessary permissions to the .jar
chmod +r ./validator.jar

# Run the validator.jar file
java -jar validator.jar