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
    *
    * */

}
