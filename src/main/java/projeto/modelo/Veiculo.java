package modelo;

public class Veiculo {

    private int ano;
    private String marca;

    public Veiculo(int ano, String marca) {
        this.ano = ano;
        this.marca = marca;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

      public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void acelerar(){
        System.out.println("O veiculo está acelerando");
    }

    public void mover() {
        System.out.println("O veiculo está movendo");
    }

    @Override
    public String toString(){
        return "Ano: " + ano + ", Marca: " + marca;
    }


}