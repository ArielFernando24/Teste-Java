

/**
 *
 * @author ariel
 */
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    //sem implementação na classe mãe, mas nas classes filhos pode ser implementado
    public abstract double getBonificacao();//metodo sem corpo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
