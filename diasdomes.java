import java.io.*;
import java.util.*;

public class diasdomes {

    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        out.write("Digite o mês (nome ou número):\n");
        out.flush();
        String entrada = leia.readLine().trim().toLowerCase();

        int mes = 1;
        int dias = 1;
        

        switch (entrada) {
            case "1": case "janeiro": mes = 1; break;
            case "2": case "fevereiro": mes = 2; break;
            case "3": case "março": case "marco": mes = 3; break;
            case "4": case "abril": mes = 4; break;
            case "5": case "maio": mes = 5; break;
            case "6": case "junho": mes = 6; break;
            case "7": case "julho": mes = 7; break;
            case "8": case "agosto": mes = 8; break;
            case "9": case "setembro": mes = 9; break;
            case "10": case "outubro": mes = 10; break;
            case "11": case "novembro": mes = 11; break;
            case "12": case "dezembro": mes = 12; break;
            default:
                out.write("Mês inválido.\n");
                out.flush();
                return;
        }
        if (mes == 2) {
            out.write("Digite o ano:\n");
            out.flush();
            int ano = Integer.parseInt(leia.readLine());

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                dias = 29;
            } else {
                dias = 28;
            }
        } else {
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dias = 30;

        
            }
        }

        out.write("Quantidade de dias: " + dias + "\n");
        out.flush();
    }
}
