public class Designer extends Funcionario{
    
    public Designer(String nome, String cpf){
        super(nome, cpf);
        setSalario(2200);
    }

    public double getBonificacao(){
        return 200;
    }
}
