#!/bin/bash
echo "Enter the plug-in : "
read plugin

echo "The goals of the $plugin are :-  "

eval mvn help:describe -Dplugin=org.apache.maven.plugins:maven-$plugin-plugin\
                  -Ddetail=true