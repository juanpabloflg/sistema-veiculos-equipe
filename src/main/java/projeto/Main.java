package projeto;



import java.util.ArrayList;
import java.util.List;

import projeto.modelo.Carro;
import projeto.modelo.Moto;
import projeto.modelo.Veiculo;


public class Main {
    public static void main(String[] args) {
   

        
        Carro carro = new Carro("Fiat", 2023, 4);
        Moto moto = new Moto("Yamaha", 2022, 160);

        // Testando métodos individuais e exibindo informações
        System.out.println("--- Testando Carro ---");
        System.out.println(carro);

        carro.mover(); // Chama o método sobrescrito do Carro

        System.out.println("\n--- Testando Moto ---");
        System.out.println(moto);
        moto.mover(); // Chama o método sobrescrito da Moto

       System.out.println("Demonstração do polimorfismo:");

        // Criando uma lista do tipo da Superclasse
        List<Veiculo> veiculos = new ArrayList<>();

        // Adicionando instâncias de Carro e Moto na lista de Veiculos
        veiculos.add(new Carro("Chevrolet", 2024, 4));
        veiculos.add(new Moto("Yamaha", 2015, 130));
        veiculos.add(new Carro("Volkswagen", 2010, 2));

        // Percorrendo a lista e aplicando polimorfismo no método mover()
        for (Veiculo v : veiculos) {
            System.out.println("Carro: " + carro);
            System.out.println("Moto: " + moto);
            

            v.mover();

    }

}