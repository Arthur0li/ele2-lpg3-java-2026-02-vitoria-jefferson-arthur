Ex. 1 - ("Aula04_02"):
- crie uma primeira classe chamada Principal (onde terá a função "main"; pacote: "view");

- elabore uma segunda classe chamada Veiculo (abstrata) que deverá ficar num pacote chamado "business". Nela, deverão existir os atributos "modelo", "fabricante", "ano" e "velocidadeAtual". Além disso, deverão existir os métodos "acelerar", "desacelerar" e "parar", onde a velocidade sofrerá, respectivamente, o acréscimo de 5km/h, o decréscimo de 5km/h e a atribuição de 0km/h (desaceleração total);

- desenvolva uma terceira classe chamada Carro, que seja subclasse de Veiculo. Nela, inclua o atributo "quantidadePortas" (que deverá ser alimentado pelo usuário) e faça um polimorfismo do método "acelerar", de modo a aumentar a velocidade de 10km/h em 10km/h (não mais de 5km/h em 5km/h);

- crie uma quarta classe chamada Moto, também subclasse de Veiculo; ela deverá ter o atributo "descansoAcionado" (booleano) e um polimorfismo do método "acelerar", outro do método "desacelerar" e outro para método "parar": quando a velocidade for igual a 0, o atributo "descansoAcionado" deverá ser verdadeiro; quando a velocidade for maior que 0, o atributo deverá ir para falso;

- na classe Principal, permita ao usuário selecionar qual tipo de veículo ele quer utilizar (carro ou moto) e instancie o que for correspondente;

- aumente e diminua as velocidades a seu bel prazer, sempre exibindo a velocidade (e o modelo do veículo) a cada alteração (considere criar um método ou sobrescrever o método "toString" para exibir essas informações);

- (opcional) se preferir incrementar mais o exercício, permita ao usuário escolher quando acelerar e desacelarar.


Requisitos adicionais:
- utilize um construtor não-default na classe Veiculo com a seguinte assinatura: 
      public Veiculo(String modelo, String fabricante, int ano);

- implemente o encapsulamento (getters e setters) de modo que o valor da velocidade não possa ser alterado por alguma classe externa (alheia à regra de negócio), devendo ser alterada, apenas, pelos métodos de negócio ("acelerar", "desacelerar" e "parar");

- limite a faixa de velocidade dos veículos entre 0km/h a 180km/h.

- utilize os conceitos de downcasting e/ou upcasting obrigatoriamente na classe Principal.




Ex. 2 - ("Aula04_03") Usando o exercício sobre Veículos da aula anterior ("Aula04_02") como ponto de partida e o projeto "Aula04_01" (sobre composição/agregação) como conceito, crie um novo projeto ("Aula04_03") para cumprir os seguintes requisitos:

- crie uma nova classe chamada Motor, que deve ser associada a Carro e Moto usando composição. Esta classe deve ter os atributos "potencia" (valores de 50 a 500) e "tipo" (String), que deverão ser recebidos via construtor, além de sobrescrita do método "toString" para exibir suas características (potência e tipo).

- crie uma nova classe chamada Manutencao, que deve ser associada a Carro e Moto (via agregação). Esta classe deve ter os atributos "dataUltimaManutencao" (String) e "tipoServico" (String), que deverão receber valores via construtor e exibi-los via sobrescrita do método "toString" (para exibir informações sobre a manutenção).

Altere as classes do exercício anterior (Carro, Moto, Veiculo e/ou Principal), de modo a poder utilizar as novas classes Motor e Manutencao e, assim, ter mais informações sobre os veículos disponíveis.




