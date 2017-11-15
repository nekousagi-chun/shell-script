#!/bin/sh
name=`basename $1 .kt`
kotlinc $1 -include-runtime -d $name.jar && \
java -jar $name.jar
