package analisadorLexico;
/*
	Proposito:
		- Un lexer obtiene un flujo de tokens (unidades lexicars) a partir de un fluo de caracteres, reconociendo patrones lexicos.
		- Los lexers tambien son llamadas scanners, analizadores lexicos y tokenizers.
		- Cada token tiene dos atributos principales: 
			1. tipo
			2. texto
	Discusion
		- Para cosntruir un lexer a mano, ecribimos un metodo para cada definicion de token( regla lexica). 
		 Es decir, si tenemos una definicion de token T, debe existir un metodo T(). Estos metodos reconocen e lpatron expresado en la regla lexica asociada.
		
*/
public class Main {
	public static void main(String[] args) {
		String cadena = "], algo, [ , ], otra";
		ListLexer lexer = new ListLexer(cadena);
		Token token = null;
		do{
			token = lexer.nextToken();
			System.out.println(token);
		}while(token.type != Lexer.EOF_TYPE);
	}
}
