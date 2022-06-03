public class P8 extends Method {
    private String perg = "Qual a resposta para a Vida, o Universo e Tudo mais?";
    private String resp= "42";
    private String curiosidade= "'Até mais! E obrigado pelos peixes!'";

    public P8(){
        super.setPergunta(perg);
        super.setResp(resp);
        super.setCuriosity(curiosidade);
        super.options=new String[4];
        options[0]="“Ainda que eu falasse a língua dos homens…”";
        options[1]="42";
        options[2]="”Só sei que nada sei”";
        options[3]="”Todo homem nasce bom, a sociedade que o corrompe”";
    }
}
