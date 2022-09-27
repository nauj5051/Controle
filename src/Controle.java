import java.io.IOException;
import java.util.Scanner;
public class Controle {
    int aumentarCanal = getCanais();
    public  int volume ;
    private int canais ;
    private boolean botaoFrente = true;
    private boolean botaoTras = true ;
   
    public boolean getBotaoFrente(){
        return botaoFrente;
    }
    
    public void setBotaoFrente(Boolean botaoFrente){
        this.botaoFrente = botaoFrente;
    }
    
    public boolean getBotaoTras(){
        return botaoTras;
    }
    
    public void setBotaoTras(Boolean botaoTras){
        this.botaoTras = botaoTras;
    }

    public int getCanais() {
        return canais;
    }
    
     public void setCanais(int canais) {
        this.canais = canais;   
    }

     public void aumentarvolume(int volume){
        this.volume = volume;
            if( volume >= 0 && volume <= 10 ){
            System.out.println("o som da sua TV está no volume baixo");
            }
            else if (volume >= 11 && volume <= 50){
            System.out.println("o som da sua TV está no volume ideal");
            }
            else if (volume >= 51 && volume <= 100){
            System.out.println("o som da sua TV está muito alto");
            }
            else if (volume > 100){
            System.out.println("impossível definir esse volume, digite um valor menor");
            }
    }
     public void mudarcanal(int mudarDecanal){
        Scanner digiteCanal = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO DO CANAL QUE VOCÊ QUER:");
        mudarDecanal = digiteCanal.nextInt();
        setCanais(mudarDecanal);
        if(mudarDecanal == 2){
            System.out.println("CANAL 2: SBT");
        }
        else if(mudarDecanal == 4){
            System.out.println("CANAL : BAND");
        }
        else if(mudarDecanal == 6){
            System.out.println("CANAL 6: REDE TV");
        }
        else if(mudarDecanal == 9){
            System.out.println("CANAL 9: RECORD");
        }
        else if(mudarDecanal == 13){
            System.out.println("CANAL 13: GLOBO");
        }
        else if (mudarDecanal != 2 && mudarDecanal != 4 && mudarDecanal != 6 && mudarDecanal != 9 && mudarDecanal != 13){
            System.out.println("CANAL INDISPONÍVEL, TENTE OUTRO");
        }
    }
    public void mudarCanalbotao() throws IOException{
        Scanner digiteres = new Scanner(System.in);
        System.out.println("DESEJA MUDAR DE CANAL?");
        String respostaS = digiteres.nextLine();
        if(respostaS.equals("SIM")){
        aumentarCanal = getCanais() + 1;
    } 
    if (aumentarCanal == 3 || aumentarCanal == 5 || aumentarCanal == 7 || aumentarCanal == 8 || aumentarCanal == 9 || aumentarCanal == 10 || aumentarCanal == 11 || aumentarCanal == 12){
        System.out.println("SEU CANAL É O: " +aumentarCanal + ", E NÃO ESTÁ DISPONÍVEL, DESEJA CONTINUAR MUDANDO?" );
        String resposta = digiteres.nextLine();
        System.out.flush();  
        while (resposta.equals("SIM")){
            aumentarCanal ++ ;
            if(aumentarCanal == 2){
                System.out.println("SEU CANAL É O 2 : SBT, DESEJA MUDAR DE CANAL?");
            }
            else if(aumentarCanal == 4){
                System.out.println("SEU CANAL É O 4 : BAND, DESEJA MUDAR DE CANAL?");
            }
            else if(aumentarCanal == 6){
                System.out.println("SEU CANAL É O 6 : REDE TV, DESEJA MUDAR DE CANAL?");
            }
            else if(aumentarCanal == 9){
                System.out.println("SEU CANAL É O 9 : RECORD, DESEJA MUDAR DE CANAL?");
            }
            else if(aumentarCanal == 13){
                System.out.println("SEU CANAL É O 13 : GLOBO, DESEJA MUDAR DE CANAL?");
            }
            else if (aumentarCanal != 2 && aumentarCanal != 4 && aumentarCanal != 6 && aumentarCanal != 9 && aumentarCanal != 13){            
            System.out.println("SEU CANAL É O: " + aumentarCanal + " E ELE NÃO EXISTE, DESEJA MUDAR DE CANAL NOVAMENTE? ");
            }
            resposta = digiteres.nextLine();
            if (resposta.equals("NÃO")) {        
            break;
            }
        } 
    }
     
    }
}




    