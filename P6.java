public class P6 extends Method {
    private String perg = "Durante o seu lançamento para GameBoy em 1996, quantos pokémons originalmente existiam?";
    private String resp= "151";
    private String curiosidade= "Bulbasaur é o primeiro e Mew é o número 151. Nunca consegui pegar todos :(";

    public P6(){
        super.setPergunta(perg);
        super.setResp(resp);
        super.setCuriosity(curiosidade);
        super.options=new String[4];
        options[0]="142";
        options[1]="150";
        options[2]="167";
        options[3]="151";
    }
}
