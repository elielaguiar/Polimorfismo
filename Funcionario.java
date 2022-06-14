public class Funcionario {
    private String nome;
    private double salario;
    private String cpf;

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 1400.0;
    }

    public double getBonificacao(){
        return this.salario * 0.05;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }





}
