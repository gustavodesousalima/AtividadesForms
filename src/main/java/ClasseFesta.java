public class ClasseFesta {
    public static void main(String[] args) {
        abstract class FestaAniversario {

            private String nomeAniversariante;
            private String dataFesta;
            private String local;
            private int numConvidados;
            private double orcamento;

            public FestaAniversario(String nomeAniversariante, String dataFesta, String local, int numConvidados, double orcamento) {
                this.nomeAniversariante = nomeAniversariante;
                this.dataFesta = dataFesta;
                this.local = local;
                this.numConvidados = numConvidados;
                this.orcamento = orcamento;
            }

            public String getNomeAniversariante() {
                return nomeAniversariante;
            }

            public void setNomeAniversariante(String nomeAniversariante) {
                this.nomeAniversariante = nomeAniversariante;
            }

            public String getDataFesta() {
                return dataFesta;
            }

            public void setDataFesta(String dataFesta) {
                this.dataFesta = dataFesta;
            }

            public String getLocal() {
                return local;
            }

            public void setLocal(String local) {
                this.local = local;
            }

            public int getNumConvidados() {
                return numConvidados;
            }

            public void setNumConvidados(int numConvidados) {
                this.numConvidados = numConvidados;
            }

            public double getOrcamento() {
                return orcamento;
            }

            public void setOrcamento(double orcamento) {
                this.orcamento = orcamento;
            }


            public abstract void exibirInformacoes();
        }


        class FestaAniversarioInfantil extends FestaAniversario {

            public FestaAniversarioInfantil(String nomeAniversariante, String dataFesta, String local, int numConvidados, double orcamento) {
                super(nomeAniversariante, dataFesta, local, numConvidados, orcamento);
            }


            public void exibirInformacoes() {
                System.out.println("Nome do Aniversariante: " + getNomeAniversariante());
                System.out.println("Data da Festa: " + getDataFesta());
                System.out.println("Local da Festa: " + getLocal());
                System.out.println("Número de Convidados: " + getNumConvidados());
                System.out.println("Orçamento da Festa: R$ " + getOrcamento());
            }
        }

        FestaAniversarioInfantil festa = new FestaAniversarioInfantil(
                "Gustavo de Sousa Lima",
                "29/08/2002",
                "Salão de Festas Grajaú",
                10,
                500
        );

        festa.exibirInformacoes();
    }
}
