@>nul MD ".\dist
javac -d dist src/task1.java
java -cp dist task1
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist