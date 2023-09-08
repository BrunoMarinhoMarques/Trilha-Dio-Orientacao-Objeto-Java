package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(24);

        System.out.println("Nome: "+felipe.getNome()+"\nIdade: "+felipe.getIdade());
    }
}
