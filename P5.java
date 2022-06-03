public class P5 extends Method{
    private String perg = "Qual o código hexadecimal para a cor azul? (0,0,255)?";
    private String resp= "0x0000FF";
    private String curiosidade= "0xFFFFFF é preto, 0xFF0000 é vermelho e 0x00FF00 é verde";

    public P5(){
        super.setPergunta(perg);
        super.setResp(resp);
        super.setCuriosity(curiosidade);
        super.options=new String[4];
        options[0]="0xFFFFFF";
        options[1]="0xFF0000";
        options[2]="0x0000FF";
        options[3]="0x00FF00";
    }
}
