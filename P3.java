public class P3 extends Method {
    private String perg = "Qual o nome do último quadro pintado por Vincent Van Gogh?";
    private String resp= "Campo de trigo com corvos";
    private String curiosidade= "Van Gogh terminou Campo de trigo com corvos em 26 de julho de 1890, um dia antes de cometer suicídio :(";

    public P3(){
        super.setPergunta(perg);
        super.setResp(resp);
        super.setCuriosity(curiosidade);
        super.options=new String[4];
        options[0]="Noite Estrelada";
        options[1]="Quarto em Arles";
        options[2]="Autorretrato com a orelha enfaixada";
        options[3]="Campo de trigo com corvos";
    }
}
