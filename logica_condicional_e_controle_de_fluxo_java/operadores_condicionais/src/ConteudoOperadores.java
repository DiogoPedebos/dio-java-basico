/*
 * Conceituação
 * 
 * "Sao simbolos especias quais sao capazes de realizar
 * comparacoes entre determinados operados
 * e, em seguida, retornar um resultado"
 * 
 * tipos: 
 *  - similaridade: igual, diferente
 *  - tamanho: maior, maior igual, menor,
 *             menor igual.
 * 
 *  1º exercicio - criar um simples projeto para realizar
 * comparações e utilizar tipo de dados.
 * 
 * 
 *  ATENÇÃO: vai ser passado só o conteúdo mais complexo
 * 
 * Operadores lógicos ---------------------------
 * 
 *  Tipos:
 *    - Conjunção - simbologia && - terminologia and(1)
 *    - Disjunção - simb || - term or(ou)
 *    - Disjunção exclusiva - simb ^ - term xor
 *    - Negação - simb ! - term inverção
 */

public class ConteudoOperadores {

    // // 1º exercicio - resolucao
    // public static void main(String[] args) throws Exception {

    //     int i1 = 10;
    //     int i2 = 20;
    //     float f1 = 4.5f;
    //     float f2 = 3.5f;
    //     double d1 = 59.6d;
    //     char c1 = 'x';
    //     char c2 = 'y';
    //     String s1 = "Fulano";
    //     String s2 = "Fulano";
    //     String s3 = "Cicrano";
    //     boolean b1 = true;
    //     boolean b2 = false;

    //     long l1 = 1597L;
    //     long l2 = 8997L;
    //     byte y1 = 1;
    //     short h1 = 25;

    //     System.out.println("i1 == i2 " + (i1 == i2));
    //     System.out.println("i1 != i2 " + (i1 != i2));
    //     System.out.println("i1 > i2 " + (i1 > i2));
    //     System.out.println("i1 <= i2 " + (i1 <= i2));

    //     System.out.println("f1 == f2 " + (i1 == i2));
    //     System.out.println("f1 != f2 " + (i1 != i2));
    //     System.out.println("f1 > f2 " + (i1 >= i2));
    //     System.out.println("f1 <= f2 " + (i1 < i2));

    //     System.out.println("");
    // }

    // Exemplo de processo intermediário
    // public static void main(String[] args) {
        
    //     double salarioMensal = 11893.58d;
    //     double mediaSalario = 10500d;

    //     int quantidadeDependentes = 4;
    //     int mediaDependetes = 2;

    //     // Fórmula completa
    //     System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependetes));

    //     // Primeira simplificação - utilização do processo intermediário
    //     boolean salarioBaixo = salarioMensal < mediaSalario;
    //     boolean muitosDependentes = quantidadeDependentes < mediaDependetes;

    //     // Fórmula reduzida
    //     System.out.println((salarioBaixo) && (muitosDependentes));

    //     // Segunda simplificação
    //     boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

    //     // Fórmula reduzida x2
    //     System.out.println("Recebe auxilio " + recebeAuxilio);
    // }


/*
 * Controle de fluxo
 *      São estruturas que tem a capacidade de direcionar o fluxo de execução
 *      do código
 * Tipos:
 *      Decisão - if, if-else, if-else-if, switch e operador ternário
 *      Repetição - for, while e do while
 *      Interrupção - break, continue e retun 
 * 
 * Boas práticas
 *      * Switch é para valores exatos e if para expressões booleanas
 *      * Evitar usar o default do switch para "cases genéricas"
 *      * Evitar muitos if's aninhados
 *      * Usar a processos intermediários
 */
    // public static void main(String[] args) {

    //     String teste = "vazio";

    //     if (teste == "vazio") {
    //         System.out.println("Verdadeiro")
    //     }


    //     switch (escolha) {
    //         case 1:
    //             System.out.println("Escolheu 1");
    //             break;
        
    //         default:
    //             break;
    //     }

    //     while (condicao) {
    //         System.out.println("Continuo imprimindo até a condisão ser satisfeita");
    //     }

    //     for (int i = 0; i < 4; i++) {
    //         System.out.println("Imprimo três vezes pois foram 3 repetições ou 4 se for <=");
    //     }
    // }
}
