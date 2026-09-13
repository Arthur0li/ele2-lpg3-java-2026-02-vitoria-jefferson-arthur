package business;

public class GeradorPin extends GeradorSenha {

    @Override
    public String gerarSenha() {

        while (true) {

            StringBuilder pin = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                pin.append(sortearCaractere(NUMEROS));
            }

            String resultado = pin.toString();

            // variavel q não permite todos os dígitos iguais
            boolean todosIguais = true;

            for (int i = 1; i < resultado.length(); i++) {
                if (resultado.charAt(i) != resultado.charAt(0)) {
                    todosIguais = false;
                    break;
                }
            }

            // nao permite as sequencias especificas
            boolean sequenciaProibida = resultado.equals("123456") || resultado.equals("654321");

            if (!todosIguais && !sequenciaProibida) {
                return resultado;
            }
        }
    }
}