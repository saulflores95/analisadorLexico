package analisadorLexico;

public abstract class Lexer {
	static final char EOF = (char)-1;
	static final int EOF_TYPE = 1;
	String input; // input string
	int index = 0; // index into input of current char
	char c; // current char
	
	//Constructor
	public Lexer(String d) {
		this.input = d;
		c = input.charAt(index);
	}
	//	Move one character; detect 'end of file'
	public void consume() {
		index++;
		if(index >= input.length())
			c = EOF;
		else
			c = input.charAt(index);
	}
	//	Ensure x is next character on the input stream
	public void match(char x) {
		if(c == x)
			consume();
		else 
			throw new Error("Expecting: " + x + "; Found: " + c);
	}
	public abstract Token nextToken();
	public abstract String getTokenName(int tokenType);
}
