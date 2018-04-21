compiler:
	java -jar java-cup-11a.jar -parser MiniJavaParser -symbols SymTable parser_src.cup
	jflex lexer_src.flex
	javac -cp .\;.*\;java-cup-11a.jar Main.java
	@rm -f MiniJavaLexer.java~

# delete all class files
# and jflex and javacup output
clean:
	@rm -rf *.class
	@rm -rf MiniJava*
	@rm -rf *.class~
	@rm -rf SymTable.*
	@rm -rf syntaxtree/*.class
	@rm -rf visitor/*.class
