package lanchonete;
public class Cozinheiro {

        public void adicionarLanceNoBalcao(){
            System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");


        }
        public void adicionarSucoNoBalcao(){
            System.out.println("ADICIONANDO SUCO NO BALCAO");
        }
        public void adicionarComboNoBalcao(){
            adicionarLanceNoBalcao();
            adicionarSucoNoBalcao();
        }
        public void prepararLanche(){
            System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
        }
        public void pedirParaTrocarGas(Atendente meuAmigo){
            meuAmigo.trocarGas();
        }
        public void pedirParaTrocarGas(Atendente meuAmigo){
            meuAmigo.trocarGas();
        }

        public void pedirParaTrocarGas(Almoxarife almoxarife){
            almoxarife.entregarIngredientes();
        }
}
