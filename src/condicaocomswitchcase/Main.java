package condicaocomswitchcase;

public class Main {
    public static void main(String[] args) {

        String sigla = "X";

        switch (sigla){
            case "P": {
                System.out.println("Pequeno");
                break; //A necessidade de colocar o break é dada pq se não tiver ele acha o resultado esperado e
                // executa todos os outros até achar o proximo break
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
            }

        }
    }
