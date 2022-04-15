import java.util.Random;
import java.util.Scanner;
//https://github.com/jefersonrgomes/Java-Wipro-Bootcamp/tree/master/src/main/java/aula02/atividades

public class Atividade01 {
/***
 Atividade 1
    Grupo 06
        Benivaldo Honorio
        Wesley Fernandes
        Viviane Viana
        Natalie Bozzon
        Jeferson Gomes
 Escreva um programa Java que
 [x] Gera um n�mero aleat�rio (rand�mico) entre 0 e 10 (incluindo estes dois valores)
 [x] Pe�a ao usu�rio para adivinh�-lo.
 [x] Use um la�o while para registrar as tentativas feitas
 [x] E a cada tentativa, d� dicas informando se o n�mero gerado � maior ou menor que a tentativa feita.
 [x] Finalmente mostre a quantidade de tentativas feitas at� que o n�mero fosse acertado.
 HELPERS:
 Recebendo valores em java com m�todo Scanner(): https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
 Usando numeros randomicos em java com m�todo Random(): https://www.devmedia.com.br/numeros-aleatorios-em-java-a-classe-java-util-random/26355
 ***/
public static void main(String[] args) {

    Random random = new Random();
    int numero = random.nextInt(0,10);
    int count = 0;
    boolean acertou = false;

    while(!acertou){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um palpite");
        int numeroTentativa = sc.nextInt();

        if(numero == numeroTentativa) {
            System.out.println("Aha voce Acertou !");

            acertou = true;
        }
        else if(numero < numeroTentativa) {
            System.out.println(" Beeem o numero digitado � menor do que o que voc� informou");
        }
        else if(numero > numeroTentativa) {
            System.out.println(" Beeem o numero digitado � maior do que o que voc� informou");
        }
    }
    }
}