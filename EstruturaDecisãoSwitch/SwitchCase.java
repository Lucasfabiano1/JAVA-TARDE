package EstruturaDecisãoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner (System.in);
    public void Letra (){
        // 1. receber a letra digitada pelo usuario
        System.out.println("Insira uma letra");
        String Letra = sc.nextLine();
        //
        String TipoLetra = "";
        switch (Letra){
            case "a": TipoLetra= "vogal";
            break;
            case "e": TipoLetra= "vogal";
            break;
            case "i": TipoLetra= "vogal";
            break;
            case "o": TipoLetra= "vogal";
            break;
            case "u": TipoLetra= "vogal";
            break;
            default: TipoLetra = "Consoante";
            break;
        }
        System.out.println(Letra + " é uma " + TipoLetra);
    }

    public void mes() {
        System.out.println("Informe um número de 1 a 12 para determinar o mês");
        int numero = sc.nextInt();
        String MesEscolhido = "";
        switch (numero){
            case 1 : MesEscolhido = "janeiro";
            break;
            case 2 : MesEscolhido = "Fevereiro";
            break;
            case 3 : MesEscolhido = "Março";
            break;
            case 4 : MesEscolhido = "Abril";
            break;
            case 5 : MesEscolhido = "Maio";
            break;
            case 6 : MesEscolhido = "Junho";
            break;
            case 7 : MesEscolhido = "Julho";
            break;
            case 8 : MesEscolhido = "Agosto";
            break;
            case 9 : MesEscolhido = "Setembro";
            break;
            case 10 : MesEscolhido = "Outubro";
            break;
            case 11 : MesEscolhido = "Novembro";
            break;
            case 12 : MesEscolhido = "Dezembro";
            break;
            default : MesEscolhido = "Número não encontrado";
        }
        System.out.println("O mês referente ao número escolhido foi " + MesEscolhido);
    }
}

