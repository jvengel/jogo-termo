import validate.ValidaPalavras;

import java.util.Scanner;

public class IniciaJogo {
    public void iniciaJogo(String palavara){
        String palavraCerta = palavara;
        int numeroRodadas = 0;
        boolean houveAcerto = false;
        Scanner input = new Scanner(System.in);

        while(numeroRodadas <= 6){
            System.out.println("Digite uma palavra: ");
            String palavra = input.nextLine();
            if (palavra.length() != 5) {
                System.out.println("A palavra deve ter 5 caracteres");
            } else {
                numeroRodadas++;
                if (palavra.equalsIgnoreCase(palavraCerta)){
                    System.out.println("Você acertou!");
                    houveAcerto = true;
                    break;
                } else {
                    ValidaPalavras valida = new ValidaPalavras();
                    valida.validar(palavraCerta, palavra);
                }
            }
        }
        if (!houveAcerto) {
            System.out.println("Você perdeu!");
        }
    }
}
