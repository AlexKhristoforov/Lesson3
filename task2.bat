@>nul MD ".\dist
javac -d dist src/task2.java
java -cp dist task2
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist