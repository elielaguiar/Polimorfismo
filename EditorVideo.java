public class EditorVideo extends Funcionario{
    
    public EditorVideo(String nome, String cpf) {
        super(nome, cpf);
        setSalario(2500);
    }

    public double getBonificacao(){
        return 150;
    }
}
