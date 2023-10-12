public class Carro extends Veiculo {
    private int numPortas;

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public void imprimirDetalhes(){
        System.out.println("Dados do carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricado);
        System.out.println("Numero de portas: " + numPortas);

    }
}
