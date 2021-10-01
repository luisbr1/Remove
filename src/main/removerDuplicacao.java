//package main;
//
//import java.io.IOException;
//
//public class removerDuplicacao {
//
//    public static void main(String[] args) throws IOException  {
//        {
//            String[] textos = new String[3];
//            textos[0] = "oo ratoato roeuoeu aa roupaoupa dodo reiei dee romaoma";
//            textos[1] = "banana";
//            textos[2] = "a bananeira tem banana";
//
//            for (String texto : textos) {
//                var palavras = texto.split(" ");
//                var inicio = palavras[0].length() == 2 ? palavras[0].substring(0, 1) : palavras[0].substring(0, (palavras[0].length() -1));
//                var fim = palavras[0].length() == 2 ? palavras[0].substring(1, 1) : palavras[0].substring((palavras[0].length() / 2), palavras[0].length() / 2);
//
//                if ((palavras[0].length() > 1) && (inicio != fim)) {
//                    for (var palavra : palavras) {
//                        String palavraCorreta;
//                        if (palavra.length() == 4)  // só existe para resolver o dodo
//                            palavraCorreta = palavra.substring(0, (palavra.length() / 2));
//                        else
//                            palavraCorreta = palavra.substring(0, (palavra.length() / 2) + (palavra.length() > 2 ? 1 : 0));
//                        if (palavras[palavras.length-1] != palavra)
//                            System.out.print(palavraCorreta + " ");
//                        else
//                            System.out.print(palavraCorreta + ".");
//                    }
//                } else
//                    System.out.print(texto + ".");
//
//            }
//        }
//    }
//}
