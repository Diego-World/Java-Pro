package Oop;

public class OopNotes {
    /*
    *   Relacionamentos:
    *
    *   Unidirecional: A relação de carro e motor é unidirecional, um carro tem um motor e um motor tem um carro.
    *
    *   Biderecional: Na relação bidirecional nesse cenário o Motor recebe um carro como parâmetro que pode ser passado no construtor do carro
    *   Ex:
    *           Class Motor{
    *              Carro carro;
    *
    *              metodos...
    *            }
    *
    *           Class Carro{
    *              Motor motor;
    *
    *              Carro(){
    *               this.carro = new Motor(this);
    *               }
    *            }
    *
    *           * A relação bidirecional deve ser coerente e essa é uma estratégia de como implementar *
    *
    *   Relação UM PARA MUITOS, pode ser representado quando uma classe recebe um ou mais objetos como atributo através de uma estrutura de dados.
    *  ------------------------------------------------------------------------------------------------------------------------------------------
    * Notes: Quanto mais as classes forem DEPENDENTES (Acopladas) uma das outras, mais complexo é o trabalho sobre o app.
    *
    *
    *  Os paradigmas de programação são formas que foram criadas para estruturar o pensamento para pegar algo do mundo real, uma abstração e transformar em software.
    *
    *                                      + PARADIGMAS +
    *
    *  Programação não estruturada: Programação 'Macarrônica'
    *                               // Bloco que faz o pedido
    *   ---------- Sentença de código ------------------
    *   ---------- Sentença de código ------------------
    *                               // Bloco do pagamento'GO TO'--
    *   ---------- Sentença de código ------------------        |
    *   ---------- Sentença de código ------------------        |
    *   ---------- Sentença de código ------------------        |
    *   ---------- Sentença de código ------------------        |
    *   ---------- Sentença de código ------------------        |
    *   ---------- Sentença de código ------------------ <-------
    *
    *   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    *
    *  Programação Prodedural: surgimento da função e aperfeiçoamento das estruturas de controles (Edsger W. Dijkstra)
    *
    *  Programação Funcional:  Processamento paralelos e dados imutáveis (const).
    *
    *  Programação Orientada a Objetos: O foco é nos dados definidos pelas Classes, que possuem comportamentos. tendo como ator principal o objeto.
    *
    *                                                           OOP:
    *
    *   1° Princípio: Encapsulamento
    *
    *   Uma parte da complexidade de um objeto precisa estar protegida do mundo exterior;
    *
    *   A capsula do encapsulamento é um objeto.
    *
    *   O encapsulamento diminui a chance de acontecer problemas na relação do sistema.
    *
    *
    *
    *
    *   2° Princípio: Herança
    *    Re-uso de código
    *       Composição X Herança
    *
    * Composição é mais flexível
    *
    *
    * Composição = Tem um(a) = Carro TEM UM motor
    * Herança = É um(a) = Civic É UM carro
    *
    *
    * 
    *
    *   3° Princípio: Polimorfismo
    *    Usar conceito genérico para algo específico
    *
    *   4° Princípio: Abstração
    *       Trazer algo do mundo real para software, abstraindo as necessidades do negócio.
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */

}
