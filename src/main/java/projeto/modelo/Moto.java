public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(int ano, String marca, int cilindrada){
        super(ano, marca);
        this.cilindrada = cilindrada;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }

    @Override
     public void mover() {
        System.out.println("A moto está movendo");
    }


    @Override
    public String toString(){
        return "Ano: " + getAno() + ", Marca: " + getMarca() + ", Cilindradas: " + cilindrada;

}