import java.util.ArrayList;
import java.util.List;

import modelo.Carro;
import modelo.Moto;
import modelo.Veiculo;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro(2010, "Fiat", 4);
        Moto moto = new Moto(2022, "Yamaha", 160);

        System.out.println("Teste Carro");
        System.out.println(carro);
        carro.mover(); // Chama o metodo sobrescrito

        System.out.println("\nTeste Moto");
        System.out.println(moto);
        moto.mover(); // Chama o metodo sobrescrito
        
        List<Veiculo> veiculos = new ArrayList<>();
        // Adicionando objetos a lista veiculos
        veiculos.add(new Veiculo(2024, "Chevrolet"));
        veiculos.add(new Moto(2015, "Suzuki", 130));
        veiculos.add(new Carro(2002, "Volkswagen", 2));

        System.out.println("\nDemonstraçao do polimorfismo:");
        // Percorrendo a lista e aplicando polimorfismo no metodo mover()
        for (Veiculo v : veiculos) {
            System.out.println(v);

            v.mover();
            System.out.println();
        }

    }

}