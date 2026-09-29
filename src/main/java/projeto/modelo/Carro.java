package modelo;

public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(int ano, String marca, int quantidadePortas) {
        super(ano, marca);
        this.quantidadePortas = quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
    }

    @Override
    public String toString() {
        return "Ano: " + getAno() + ", Marca: " + getMarca() + ", Quantidade de portas: " + quantidadePortas;
    }

}