@>nul MD ".\dist
javac -d dist src/task5.java
java -cp dist task5
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist