public class TiposVariaveis {
  public static void main(String[] args) {
    double salarioMinimo = 2500;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;

    int numero = 5;
    /*
     * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
     * não é mais necessário, pois a variável já foi declarada anteriormente
     */
    numero = 10;
    System.out.print(numero);

    /*
     * ao usar a palavra reservada final, você determina que jamais
     * esta variavel poderá obter outro valor;
     * logo a linha 25 vai apresentar um erro de compilação
     * isso é considerado uma CONSTANTE na linguagem Java
     */
    final double VALOR_DE_PI = 3.14;

    // VALOR_DE_PI=3.15;
  }
}
