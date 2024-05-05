public class TIposVariaveis {
    public static void main(String[] args) throws Exception {
        


        // Casting (conversão de tipo de variável)
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        //Mundando de valor

        int numeroQualquer = 5;
        numeroQualquer = 10;

        System.out.println(numeroQualquer);

        //Constantes são sempre declaradas em caixa alta e utilizam a palavara chave final na declaração.
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
