import java.io.IOException;

public class Exemplo {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Little People!");

        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; // incrementa ch
        System.out.println("ch is now " + ch);
        ch = 90; // da a ch o valor Z
        System.out.println("ch is now " + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        // Demonstra sequências de escape em strings.
        System.out.println("\nFirst line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        // Demonstra valores booleanos.
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        // um valor booleano pode controlar a instrução if
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed. ");
        // o resultado de um operador relacional é um valor booleano
        System.out.println("10 > 9 is " + (10 > 9));

        // Demonstra o escopo de bloco.
        int m; // conhecida pelo código dentro de main()
        m = 10;
        if(m == 10) { // inicia novo escopo
            int n = 20; // conhecida apenas nesse bloco
            //tanto m quanto n são conhecidas aqui.
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;
        }
        // m ainda é conhecida aqui.
        System.out.println("m is " + m);

        // Demonstra o tempo de vida de uma variavel.
        for(int i = 0; i < 3; i++) {
            int j = -1; // y será unicializada sempre que entrarmos no bloco
            System.out.println("j is: " + j); // essa linha sempre exibe -1
            j = 100;
            System.out.println("j is now: " + j);
        }
         // Demonstra o operador %
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        System.out.println("\nResult and remainder of 10 / 3: " + iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);

        // Demonstra os operadores relacionais e lógicos
        int i, j; boolean b1, b2;
        i = 10;
        j = 11;
        if(i < j) System.out.println("\ni < j");
        if(i <=j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;
        if(b1 & b2)
            System.out.println("This won't execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");

        //pré-incremento (++x) :
        int x = 5;
        int resultado = ++x; // pré incremento: incrementa x antes de usa-lo em qualquer operação
        System.out.println("\nx: " + x); // Output: x: 6
        System.out.println("resultado: " + resultado); // Output: resultado: 6

        // Pós-incremento (x++)
        x = 5;
        resultado = x++; // Pós-incremento: usa o valor atual de x e depois o incrementa
        System.out.println("\nx: " + x); // Output: x: 6 (incrementado após a atribuição)
        System.out.println("resultado: " + resultado); // Output: resultado: 5 (valor antes do incremento)

        // Declaração do enum
        enum DiaDaSemana {
            SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
        }
        // Uso so enum
        DiaDaSemana dia = DiaDaSemana.QUARTA;

        // Exemplo de uso do switch-case com enum
        switch (dia) {
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                System.out.println("Dia de trabalho.");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("final de semana.");
                break;


        }
    }
}