public class P7 extends Method {
    private String perg = "O filme Blade Runner foi baseado em um livro escrito por Phillip K. Dick. Qual o nome desse livro?";
    private String resp= "Androides sonham com ovelhas elétricas?";
    private String curiosidade= "'Todos esses momentos se perderão no tempo, como lágrimas na chuva…'";

    public P7(){
        super.setPergunta(perg);
        super.setResp(resp);
        super.setCuriosity(curiosidade);
        super.options=new String[4];
        options[0]="Fundação";
        options[1]="O Homem do Castelo Alto";
        options[2]="Androides sonham com ovelhas elétricas?";
        options[3]="Além do Planeta Silencioso";
    }
}
