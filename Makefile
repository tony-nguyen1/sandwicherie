all: compile run

compile: ./src/main/java/app/Application.java #compile tous ce dont on a besoin
	echo "Compilation ..."
	javac -cp ./src ./src/main/java/app/Application.java 
	echo "... compilé."
	
run:
	echo "Lancement ..."
	java -cp ./src main.java.app.Application

clean:
	rm ./src/main/java/app/*.class
	rm ./src/main/java/customException/*.class
	rm ./src/main/java/inter/*.class
	rm ./src/main/java/nomAliment/*.class
	rm ./src/main/java/sandwich/*.class
	