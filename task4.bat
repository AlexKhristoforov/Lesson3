@>nul MD ".\dist
javac -d dist src/task4.java
java -cp dist task4
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist