package validate;

import java.util.ArrayList;

public class ValidaPalavras {

    public void validar(String palavraC,String palavraE) {
        String palavraCerta = palavraC;
        String palavraEnviada = palavraE;

        ArrayList<Character> certaCortada = separarChars(palavraCerta);
        ArrayList<Character> enviadaCortada = separarChars(palavraEnviada);

        ArrayList<Character> caracteresEquivalentes = new ArrayList<>();
        ArrayList<Boolean> posicaoCorreta = new ArrayList<>();

        for (int i = 0; i < Math.min(certaCortada.size(), enviadaCortada.size()); i++) {
            char cCerta = certaCortada.get(i);
            char cEnviada = enviadaCortada.get(i);

            if (cCerta == cEnviada) {
                caracteresEquivalentes.add(cCerta);
                posicaoCorreta.add(true);
            } else if (certaCortada.contains(cEnviada)) {
                caracteresEquivalentes.add(cEnviada);
                posicaoCorreta.add(false);
            }
        }

        if (caracteresEquivalentes.size() > 0 && posicaoCorreta.size() > 0) {
            for (int i = 0; i < caracteresEquivalentes.size(); i++) {
                if (posicaoCorreta.get(i)) {
                    System.out.printf("O char %s está na palavra e na posição correta.\n", caracteresEquivalentes.get(i));
                } else {
                    System.out.printf("O char %s está na palavra, mas não na posição correta.\n", caracteresEquivalentes.get(i));
                }
            }

        }
    }

    public static ArrayList<Character> separarChars(String palavra) {
        ArrayList<Character> lista = new ArrayList<>();

        for (int i = 0; i < palavra.length(); i++) {
            lista.add(palavra.charAt(i));
        }

        return lista;
    }
}