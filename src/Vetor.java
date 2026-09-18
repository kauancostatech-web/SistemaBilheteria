public class Vetor {

    private Ingresso[] ingressos;
    private int tamanho;

    public Vetor(int capacidade) {
        ingressos = new Ingresso[capacidade];
        tamanho = 0;
    }

    public Ingresso pesquisar(int codigo) {
        for (int i = 0; i < tamanho; i++) {
            if (codigo == ingressos[i].getIngresso()) {
                return ingressos[i];
            }
        }
        return null;
    }

    public void adicionar(Ingresso ingresso) {

        if (tamanho < ingressos.length) {
            ingressos[tamanho] = ingresso;
            tamanho++;
        } else {
            System.out.println("Não há mais espaço para cadastrar ingressos.");
        }
    }

    public void validarIngresso(int codigo) {

        Ingresso ingressoEncontrado = pesquisar(codigo);

        if (ingressoEncontrado == null) {

            System.out.println("Ingresso inexistente");

        } else {

            System.out.println("Ingresso encontrado com sucesso");

            if (ingressoEncontrado.getStatus().equals("ATIVO")) {

                System.out.println("Entrada autorizada");

                ingressoEncontrado.setStatus("UTILIZADO");

            } else if (ingressoEncontrado.getStatus().equals("UTILIZADO")) {

                System.out.println("Entrada negada: ingresso já utilizado");

            } else if (ingressoEncontrado.getStatus().equals("CANCELADO")) {

                System.out.println("Entrada negada: ingresso cancelado");
            }
        }

    }
    public void cancelarIngresso(int codigo) {

        Ingresso ingressoEncontrado = pesquisar(codigo);

        if (ingressoEncontrado == null) {

            System.out.println("Ingresso inexistente");

        } else {

            if (ingressoEncontrado.getStatus().equals("ATIVO")) {

                ingressoEncontrado.setStatus("CANCELADO");

                System.out.println("Ingresso cancelado com sucesso.");
                System.out.println("Reembolso solicitado.");

            } else if (ingressoEncontrado.getStatus().equals("UTILIZADO")) {

                System.out.println("Não é possível cancelar um ingresso já utilizado.");

            } else if (ingressoEncontrado.getStatus().equals("CANCELADO")) {

                System.out.println("Este ingresso já está cancelado.");
            }
        }
    }
}