/*
Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
Utilize variáveis para representar os valores das temperaturas
e imprima no console o valor convertido de Celsius para Fahrenheit.

Depois de finalizar, testar e conferir que seu programa foi executado com sucesso,
crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
*/

public class Main {
    public static void main(String[] args) {
        double celsius = 23.4;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Hoje a máxima será de " + celsius + "ºC (ou " + fahrenheit + "ºF).\n");

        int fahrenheitNumeroInteiro = (int) fahrenheit;
        System.out.println("A temperatura inteira em Fahrenheit é " + fahrenheitNumeroInteiro + "ºF.");
    }
}