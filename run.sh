#!/bin/bash
java -cp "./dist/*" -Dloader.main=com.example.demo.HelloApplication org.springframework.boot.loader.PropertiesLauncher
