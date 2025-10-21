/******************************************************************************

                            Matheus Eduardo Marinho de Miranda Hermenegildo
                            RA:42520116

*******************************************************************************/

public class ArattaiGrowthTracker {

    public static void main(String[] args) {
        int[] downloadsDiarios = {850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000};
        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};

        // for para ler o array downloadsDiarios
        int totalDownloads = 0;
        for (int i = 0; i < downloadsDiarios.length; i++) {
            totalDownloads += downloadsDiarios[i];
        }
        System.out.println("[R2] Total de Downloads na Semana: " + totalDownloads + "\n");

        // ver pico e minimo
        int pico = downloadsDiarios[0];
        int minimo = downloadsDiarios[0];
        int indicePico = 0;
        int indiceMinimo = 0;

        for (int i = 1; i < downloadsDiarios.length; i++) {
            if (downloadsDiarios[i] > pico) {
                pico = downloadsDiarios[i];
                indicePico = i;
            }
            if (downloadsDiarios[i] < minimo) {
                minimo = downloadsDiarios[i];
                indiceMinimo = i;
            }
        }

        System.out.println("[R3] Análise de Extremos:\n");
        System.out.println("Dia de Pico de Downloads: " + diasDaSemana[indicePico] + " com " + pico + " downloads.");
        System.out.println("Dia de Mínimo de Downloads: " + diasDaSemana[indiceMinimo] + " com " + minimo + " downloads.\n");

        // analisando as metas
        int metaDiaria = 1000000;
        int diasAcimaDaMeta = 0;

        System.out.println("[R4] Análise de Metas (Meta Diária: " + metaDiaria + "):\n");

        for (int i = 0; i < downloadsDiarios.length; i++) {
            if (downloadsDiarios[i] > metaDiaria) {
                System.out.println("> " + diasDaSemana[i] + ": SUCESSO! (" + downloadsDiarios[i] + " downloads)");
                diasAcimaDaMeta++;
            } else {
                System.out.println("> " + diasDaSemana[i] + ": Não atingiu. (" + downloadsDiarios[i] + " downloads)");
            }
        }

        System.out.println("\n[Relatório Final] O Arattai superou a meta diária em " + diasAcimaDaMeta + " dias esta semana.");
    }
}