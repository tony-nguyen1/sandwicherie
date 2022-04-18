all: compile run

compile: ./src/main/java/app/Application.java #compile tous ce dont on a besoin
	# Compilation ...
	javac -cp ./src ./src/main/java/app/Application.java
	# ... compilé.

run:
	# Lancement ...
	java -cp ./src main.java.app.Application

clean:
	rm -v ./src/main/java/*/*.class
