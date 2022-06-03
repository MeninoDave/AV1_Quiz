public class P1 extends Method{
    private String perg = "Em O Senhor dos Aneis, quantos aneis do Poder foram criados no total?";
    private String resp= "20";
    private String curiosidade= "Três Anéis para os Reis-Elfos sob este céu | Sete para os Senhores-Anões em seus rochosos corredores | Nove para os Homens Mortais fadados ao eterno sono | Um para o Senhor do Escuro em seu escuro trono | Na Terra de Mordor onde as Sombras se deitam.";

    public P1(){
        super.setPergunta(perg);
        super.setResp(resp);
        super.setCuriosity(curiosidade);
        super.options=new String[4];
        options[0]="12";
        options[1]="23";
        options[2]="1";
        options[3]="20";
    }
        
}
    

