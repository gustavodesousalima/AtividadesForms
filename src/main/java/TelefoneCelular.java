public class TelefoneCelular {
    public static void main(String[] args) {
        class Telefone {
            private String marca;
            private String modelo;
            private String cor;
            private double preco;
            private int armazenamento;

            public String getMarca() {
                return marca;
            }

            public void setMarca(String marca) {
                this.marca = marca;
            }

            public String getModelo() {
                return modelo;
            }

            public void setModelo(String modelo) {
                this.modelo = modelo;
            }

            public String getCor() {
                return cor;
            }

            public void setCor(String cor) {
                this.cor = cor;
            }


            public double getPreco() {
                return preco;
            }


            public void setPreco(double preco) {
                this.preco = preco;
            }

            public int getArmazenamento() {
                return armazenamento;
            }

            public void setArmazenamento(int armazenamento) {
                this.armazenamento = armazenamento;
            }


            public void exibirInformacoes() {
                System.out.println("Marca: " + getMarca());
                System.out.println("Modelo: " + getModelo());
                System.out.println("Cor: " + getCor());
                System.out.println("Preço: " + getPreco());
                System.out.println("Armazenamento: " + getArmazenamento() + "GB");
            }
        }

        Telefone telefone1 = new Telefone();
        telefone1.setMarca("Samsung");
        telefone1.setModelo("Galaxy");
        telefone1.setCor("Preto");
        telefone1.setPreco(1000);
        telefone1.setArmazenamento(128);
        telefone1.exibirInformacoes();
    }
}
