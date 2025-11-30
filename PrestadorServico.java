public class PrestadorServico extends Contribuinte {

    public PrestadorServico(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        return 0;
    }

    @Override
    public double calcularIRPF() {
        return getSalarioBruto() * 0.15;
    }

    @Override
    public double calcularSalarioLiquido() {
        return getSalarioBruto() - calcularIRPF();
    }
}
