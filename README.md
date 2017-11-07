# Slang

Ecrire une méthode qui transforme une phrase en entrée, en permutant les moitiés de chaque mot, à condition que le mot fasse au moins 6 caractères.

Ex : La maison près de la fontaine => la sonmai près de la ainefont

Optionnel, uniquement si la première version fonctionne : la césure devra se faire sur la consonne la plus proche du centre du mot.

Ex : la maison près de la fontaine => la sonmai près de la tainefon

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar SlangTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore SlangTest
