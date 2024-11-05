SHELL:=/bin/bash

test:
	make clean
	find src/test -name "*.java" > ./sources.txt
	javac -cp src/main:src/test:junit-platform-console-standalone-1.10.2.jar -Xlint:unchecked @sources.txt
	rm sources.txt
	java -jar junit-platform-console-standalone-1.10.2.jar execute --class-path src/main:src/test --select-package roundbracket
	make clean
clean:
	find . -name "*.class" -exec rm {} \;
	find . -name "*.java~" -exec rm {} \;
