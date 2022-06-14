public class TesteReferencias {
    public static void main(String[] args) {
        
        /*Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);*/
        
        EditorVideo ev = new EditorVideo("Eliel Aguiar", "050.793.881-02");
        //ev.setSalario(2500.0);
        
        Designer d = new Designer("Caio Reis", "080.888.555-10");
        //d.setSalario(2000.0);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(ev);
        controle.registra(d);
        
        System.out.println(controle.getSoma());

        System.out.println("Nome: " + ev.getNome() + "\n" + "Salario: "+ ev.getSalario() + "\n");

        System.out.print("Nome: " + d.getNome() + "\n" + "Salário: "+ d.getSalario());
        
    }
        
}
