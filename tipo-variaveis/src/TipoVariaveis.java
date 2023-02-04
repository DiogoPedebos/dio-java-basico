public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        byte exemplo1 = 127;
        short exemplo2 = 32767;
        int exemplo3 = 2147483647;
        // long exemplo4 = 9223372036854775808; 

        System.out.println(exemplo1 + " " + exemplo2 + " " + exemplo3 + " ");
        System.out.println("float 4 bytes e double 8 bytes");
        
        // Armazenar valorem como cpf/rg/cep que comecem com 0 podem não ser armazenados corretamente:
        long cpf = 02222222222;
        System.out.println("\n" + cpf + " Primeira impressão do cpf\n");

        // Possível solução:
        String cpfTexto = "02222222222";
        System.out.println(cpfTexto + " Segunda impressão do cpf\n");

        // Exemplo de constante:
        final double VALOR_DE_PI = 3.24;
        System.out.println(VALOR_DE_PI);
    }
}
