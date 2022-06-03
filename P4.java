public class P4 extends Method {
    private String perg = "Qual era a capital da Rússia no final do período imperial?";
    private String resp= "São Petersburgo";
    private String curiosidade= "São Petersburgo foi capital da Rússia de 1723 até 1917, na qual após a Revolução Russa, a capital voltou a ser Moscou";

    public P4(){
        super.setPergunta(perg);
        super.setResp(resp);
        super.setCuriosity(curiosidade);
        super.options=new String[4];
        options[0]="São Petersburgo";
        options[1]="Moscou";
        options[2]="Vladivostok";
        options[3]="Volgogrado";
    }
}
