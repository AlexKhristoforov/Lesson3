@>nul MD ".\dist
javac -d dist src/task3.java
java -cp dist task3
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist