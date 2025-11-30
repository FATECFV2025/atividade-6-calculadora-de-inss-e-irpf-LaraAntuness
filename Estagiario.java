public class Estagiario extends Contribuinte {

    public Estagiario(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        return 0;
    }

    @Override
    public double calcularIRPF() {
        return 0;
    }

    @Override
    public double calcularSalarioLiquido() {
        return getSalarioBruto();
    }
}
