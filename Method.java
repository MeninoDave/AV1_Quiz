//Classe mae com os metodos para escrever e lancar na tela as perguntas e respostas do quiz
//@author:Davi Braga

public  abstract class Method{
    private String resp;
    private String pergunta;
    private String curiosity;
    protected String[] options;

    public int pegaResposta(String option){ //Metodo recursivo para receber a resposta. Serve para facilitar o codigo do main
        int resp=0;
        try{
            resp=getOption(option);
        }catch(Exception e){
            System.out.println(e);
            resp=-1;
        }
        return resp;
    }

    public void getResp(){ //Lanca a resposta
        System.out.println("Resposta Correta: "+this.resp+"\n"+this.curiosity +"\n \n");    
    }

    public void getPergunta(){ //Lanca a pergunta
        String resp="";
        char op = 'a';
        resp+=(this.pergunta +"\n");
        for(int i=0;i<4;i++){
            resp+=(op+") "+this.options[i]+"\n");
            op=(char)((int)op+1);
        }
        System.out.println(resp);
    }

    protected int getOption(String opt)throws Exception{ //Checa se a opcao esta dentro dos parametros validos. Caso nao esteja, lanca uma excecao
        opt=opt.toLowerCase();
        if (opt.length()>1){
            throw new Exception("APENAS CARACTERES SÃO VALIDOS! \n");
        }else if (97>opt.charAt(0) || opt.charAt(0)>100){
            throw new Exception("APENAS VALIDOS OS CARACTERS a,b,c,d,A,B,C,D \n");
        }else{
            return(isResp(options[(int)(opt.charAt(0)-97)]));
        }
    }

    protected void setPergunta(String p){ //Metodo para as classes filhas criarem a pergunta
        this.pergunta=p;
    }

    protected void setCuriosity(String c){ //Metodo para as classes filhas criarem a curiosidade
        this.curiosity=c;
    }

    protected void setResp(String r){ //Metodo para as classes filhas criarem a resposta
        this.resp=r;
    }

    protected int isResp(String resp){  //Checa se a resposta e verdadeira ou falsa.
        if(resp.equals(this.resp)){
            return 1;
        }else{
            return 0;
        }
        
    }
}

    