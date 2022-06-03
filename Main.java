//Metodo main do programa
import java.util.*;

public class Main {

    public static int getGabarito(String linha){
        linha.toLowerCase();
        if(linha.charAt(0)=='s'){
            return 1;
        }else if(linha.charAt(0)=='n'){
            return 0;
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        String[] Respostas= new String[10];

        System.out.println("====================== QUIZ TOTALMENTE ALEATORIO DO DAVI ====================== \n");
        System.out.println("REGRAS: \n * Basta digitar qualquer caractere entre 'a' e 'd' e pressionar ENTER (Letras maiusculas são validas também!) \n");
        System.out.println(" * Ao concluir as 8 perguntas, você receberá o seu resultado e terá a opção de ver o gabarito! \n");
        System.out.println("================================= BOM JOGO!! :) ================================= \n");

        int corretas=0;
        int resp=0;

        Scanner linha=new Scanner(System.in);

        Method m1 = new P1(); //PERGUNTA 01
        do{
            m1.getPergunta();
            Respostas[1]=linha.nextLine();
            resp=m1.pegaResposta(Respostas[1]);
        }while(resp==-1);
        corretas+=resp;
        resp=0;
        
        Method m2 = new P2(); //PERGUNTA 02
        do{
            m2.getPergunta();
            Respostas[2]=linha.nextLine();
            resp=m2.pegaResposta(Respostas[2]);
        }while(resp==-1);
        corretas+=resp;
        resp=0;

        Method m3 = new P3(); //PERGUNTA 03
        do{
            m3.getPergunta();
            Respostas[3]=linha.nextLine();
            resp=m3.pegaResposta(Respostas[3]);
        }while(resp==-1);
        corretas+=resp;
        resp=0;

        Method m4 = new P4(); //PERGUNTA 04
        do{
            m4.getPergunta();
            Respostas[4]=linha.nextLine();
            resp=m4.pegaResposta(Respostas[4]);
        }while(resp==-1);
        corretas+=resp;
        resp=0;

        Method m5 = new P5(); //PERGUNTA 05
        do{
            m5.getPergunta();
            Respostas[5]=linha.nextLine();
            resp=m5.pegaResposta(Respostas[5]);
        }while(resp==-1);
        corretas+=resp;
        resp=0;

        Method m6 = new P6(); //PERGUNTA 06
        do{
            m6.getPergunta();
            Respostas[6]=linha.nextLine();
            resp=m6.pegaResposta(Respostas[6]);
        }while(resp==-1);
        corretas+=resp;
        resp=0;

        Method m7 = new P7(); //PERGUNTA 07
        do{
            
            m7.getPergunta();
            Respostas[7]=linha.nextLine();
            resp=m7.pegaResposta(Respostas[7]);
        }while(resp==-1);
        corretas+=resp;
        resp=0;

        Method m8 = new P8(); //PERGUNTA 08
        do{
            m8.getPergunta();
            Respostas[8]=linha.nextLine();
            resp=m8.pegaResposta(Respostas[8]);
        }while(resp==-1);
        corretas+=resp;
        resp=0;

        
        System.out.println(" \nPONTUAÇÃO FINAL: \n");
        System.out.println("Usuário: "+System.getProperty("user.name")+"\n"); //obtem o nome do usuario
        System.out.println("Acertos:" + corretas +" \n");
        System.out.println("Erros:" + (8-corretas) +" \n");

        int gabarito=0;
        do{
            System.out.println("Gostaria de ver o gabarito? S/N \t");
            gabarito=getGabarito(linha.nextLine()); //Checa a resposta se o usuario deseja ou nao o gabarito
        }while(gabarito==-1);

        if(gabarito==1){
            m1.getResp();
            m2.getResp();
            m3.getResp();
            m4.getResp();
            m5.getResp();
            m6.getResp();
            m7.getResp();
            m8.getResp();
        }

        System.out.println("OBRIGADO POR JOGAR!! :)");
        linha.close();
      
    }
    
}
