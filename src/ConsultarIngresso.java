import java.util.Scanner;

public class ConsultarIngresso {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(100);

        Ingresso ingresso1 = new Ingresso();
        ingresso1.setIngresso(101);
        ingresso1.setStatus("ATIVO");

        Ingresso ingresso2 = new Ingresso();
        ingresso2.setIngresso(102);
        ingresso2.setStatus("ATIVO");

        Ingresso ingresso3 = new Ingresso();
        ingresso3.setIngresso(103);
        ingresso3.setStatus("ATIVO");

        vetor.adicionar(ingresso1);
        vetor.adicionar(ingresso2);
        vetor.adicionar(ingresso3);

        ingresso1.setIngresso(101);
        ingresso1.setStatus("ATIVO");

        vetor.adicionar(ingresso1);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do ingresso: ");
        int codigo = sc.nextInt();

        vetor.validarIngresso(codigo);

        System.out.println("Status atual: " + ingresso1.getStatus());

        System.out.print("Digite o código do ingresso para cancelar: ");
        int codigoCancelamento = sc.nextInt();

        System.out.print("Deseja realmente cancelar o ingresso? (S/N): ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("S")) {

            vetor.cancelarIngresso(codigoCancelamento);

        } else {

            System.out.println("Cancelamento não realizado.");
        }
    }
}