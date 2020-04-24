#!/bin/sh

cd functionality/src/main/java/com/TeamYBB/springboot/letmein_functionality

javac Database.java
java Database

cd ../../../../../../../

mvn spring-boot:run
