public class Gerente extends Funcionario {
    String departamento;
    double bonus;
    public double getBonus() {
        return bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void calcularBonus(){
        bonus = salario * 0.1;
    }
    
    
}
