import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\nOlá!");

        int numero, soma=0;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDígite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("\nResultado da soma dos números positivos:" +soma);
        System.out.println("\n\t______FIM_________");


        }
    }
