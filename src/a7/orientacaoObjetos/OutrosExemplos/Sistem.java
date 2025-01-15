package a7.orientacaoObjetos.OutrosExemplos;

import java.util.Scanner;

    public class Sistem {
        public static void main(String[] args) {
            String nome = null;
            Integer idade = null;
            Double peso = null;

            String parametrosConcatenados = "Severino;87;86.5";

            Scanner sc = new Scanner(parametrosConcatenados);
            sc.useDelimiter(";");

            int index = 0;
            while (sc.hasNext()) {

                if (index == 0)
                    nome = sc.next();
                else if (index == 1)
                    idade = Integer.valueOf(sc.next());
                else
                    peso = Double.valueOf(sc.next());

                index++;

            }

                System.out.println("Nome: " + nome);
                System.out.println("Idade " + idade);
                System.out.println("Peso " + peso);


            }

        }


