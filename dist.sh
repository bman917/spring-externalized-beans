#!/bin/bash
rm -rf dist
mkdir dist
find . -name "*0.0.1-SNAPSHOT.jar" -exec cp -rv {} dist/. \;

