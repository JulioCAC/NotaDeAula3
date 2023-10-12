import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para obter detalhes de carro ou 2 para obter detalhes de moto");
        int opcao = sc.nextInt();
        if (opcao == 1){
            Carro c = new Carro();
            System.out.println("Marca do carro: ");
            c.setMarca(sc.next());
            System.out.println("Modelo do carro: ");
            c.setModelo(sc.next());
            System.out.println("Ano do carro: ");
            c.setAnoFabricado(sc.nextInt());
            System.out.println("Numero de portas do carro: ");
            c.setNumPortas(sc.nextInt());
            c.imprimirDetalhes();
        }
         else if (opcao == 2){
            Moto m = new Moto();
            System.out.println("Marca da moto: ");
            m.setMarca(sc.next());
            System.out.println("Modelo da moto: ");
            m.setModelo(sc.next());
            System.out.println("Ano da moto: ");
            m.setAnoFabricado(sc.nextInt());
            System.out.println("Numero de cilindradas da moto: ");
            m.setCilindradas(sc.nextInt());
            m.imprimirDetalhes();

        }
        else{
            System.out.println("opção inválida");
        }  
    }
}
