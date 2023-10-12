import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para cadastrar um gerente ou 2 para cadastrar um diretor");
        int opcao = sc.nextInt();
        if (opcao == 1){
            Gerente g = new Gerente();
            System.out.println("Nome do gerente: ");
            g.setNome(sc.next());
            System.out.println("Salario do gerente: ");
            g.setSalario(sc.nextDouble());
            System.out.println("Departamento do gerente: ");
            g.setDepartamento(sc.next());
            g.calcularBonus();
            System.out.println("Dados do gerente:");
            System.out.println("Nome:" + g.getNome());
            System.out.println("Salario: " + g.getSalario());
            System.out.println("Departamneto: " + g.getDepartamento());
            System.out.println("Bonus: " + g.getBonus());
        }
        else if (opcao == 2){
            Diretor d = new Diretor();
            System.out.println("Nome do diretor: ");
            d.setNome(sc.next());
            System.out.println("Salario do diretor: ");
            d.setSalario(sc.nextDouble());
            System.out.println("Ações do diretor: ");
            d.setAcoes(sc.nextInt());
            
            System.out.println("Dados do Diretor:");
            System.out.println("Nome:" + d.getNome());
            System.out.println("Salario: " + d.getSalario());
            System.out.println("Ações: " + d.getAcoes());
            
        }
        else{
            System.out.println("opção inválida");
        }

    }
}
