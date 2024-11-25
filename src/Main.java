import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Coletar o nome do produto
        System.out.print("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase();
        //Retornar o valor do produto

        switch (nomeProduto){
            case "banana":
                System.out.println("R$9,50");
                break;
            case "manga":
                System.out.println("R$12,80");
                break;
            case "abacate":
                System.out.println("R$16,10");
        }
    }
}