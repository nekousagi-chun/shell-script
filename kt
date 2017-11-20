#!/bin/sh
name=`basename $1 .kt`
args=`echo ${@} | cut -d " " -f 2-`
kotlinc $1 -include-runtime -d $name.jar && \
java -jar $name.jar $args
