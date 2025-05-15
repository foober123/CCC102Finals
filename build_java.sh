#!/bin/bash
javac -cp .:lib/flatlaf-3.6.jar -d bin $(find src -name "*.java")
