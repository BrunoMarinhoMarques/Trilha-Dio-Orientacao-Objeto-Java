public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla()+"-"+e.getNome());
        }

        //selecionando um estado de forma especifica
        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
        System.out.println(eb.getNome()+"-"+eb.getSigla());
    }
}
