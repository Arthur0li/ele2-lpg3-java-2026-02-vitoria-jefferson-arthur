package business;

public class GeradorSenhaForte extends GeradorSenha {

    private int tamanho;

    public GeradorSenhaForte(int tamanho) {
        if (tamanho < 12) {
            throw new IllegalArgumentException("O tamanho mínimo da senha é 12 caracteres.");
            //comando de exceçao
        }

        this.tamanho = tamanho;
    }

    @Override
    public String gerarSenha() {
        // TODO implementar
        return null;
    }

}
