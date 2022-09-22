import java.util.Scanner;
public class Controle {
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
        setCanais(mudarDecanal);
        if(mudarDecanal == 2){
            System.out.println("CANAL 2: SBT");
        }
        else if(mudarDecanal == 4){
            System.out.println("CANAL : BAND");
        }
        else if(mudarDecanal == 9){
            System.out.println("CANAL 9: RECORD");
        }
        else if(mudarDecanal == 13){
            System.out.println("CANAL 13: GLOBO");
        }
        else if (mudarDecanal != 2 && mudarDecanal != 4 && mudarDecanal != 9 && mudarDecanal != 13){
            System.out.println("CANAL INDISPONÍVEL, TENTE OUTRO");
        }
    }
    public void mudarCanalbotao(){
        Scanner digite = new Scanner(System.in);
        int contarcanal = 2;
        if(getBotaoFrente()){
           while (contarcanal == 2) {
            System.out.println("SEU CANAL É O SBT DESEJA CONTINUAR?");
            String ss = digite.next();
            if(ss.equals("s")){
                System.out.println("OK, SEU CANAL É ESSE");
                break;
            }
            else{
                System.out.println("QUAL CANAL");
                String s1 = digite.next();
            }
           }
        }

    }
}
  