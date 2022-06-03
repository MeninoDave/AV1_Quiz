public class P2 extends Method {
    private String perg = "Quem foi o responsável pelo Plano Piloto de Brasilia?";
    private String resp= "Lucio Costa";
    private String curiosidade= "Quem fez o desenho urbanístico de Brasília foi Lúcio Costa, Oscar Niemeyer foi o arquiteto responsável pelas edificações oficiais do Governo e Burle Marx fez o paisagismo da nova capital.";

    public P2(){
        super.setPergunta(perg);
        super.setResp(resp);
        super.setCuriosity(curiosidade);
        super.options=new String[4];
        options[0]="Oscar Niemeyer";
        options[1]="Lucio Costa";
        options[2]="Roberto Burle Marx";
        options[3]="Le Corbusier";
    }
}
