import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
}

Scanner leitor = new Scanner(System.in);
System.out.println("Digite seu peso em kgs:");
float peso= leitor.nextFloat();

System.out.println("Digite sua altura em metros:");
float altura = leitor.nextFloat();

System.out.printf("\n IMC \n");
System.out.printf("Divisão:" +(peso/(altura*altura)));

float IMC = peso(altura*altura);

if(IMC>40){System.out.println("\nobesidade mórbida");return;}
    if(IMC>=35){System.out.println("\nobesidade severa");return;}
        if(IMC>=30){System.out.println("\nobesidade grau 1");return;}
        if(IMC>=25){System.out.println("\nlevemente acima");return;}
        if(IMC>=18.6){System.out.println("\npeso ideal");return;}
        if(IMC>=0){System.out.println("\nabaixo do peso");return;}