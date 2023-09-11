public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa marcos = new Pessoa("Marcos", "123");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf() +"-"+marcos.getEndereco());
    }
}
