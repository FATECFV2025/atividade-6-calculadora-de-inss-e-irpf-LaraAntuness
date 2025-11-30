public abstract class Contribuinte implements CalculadoraTributo {

    private String nome;
    private String cpf;
    private double salarioBruto;

    public Contribuinte(String nome, String cpf, double salarioBruto) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getSalarioBruto() { return salarioBruto; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }

    
    public void exibirResumo() {
        System.out.println("\nSOBRE O CONTRIBUINTE");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("INSS: R$ " + calcularINSS());
        System.out.println("IRPF: R$ " + calcularIRPF());
        System.out.println("Salário Líquido: R$ " + calcularSalarioLiquido());
    }
}
