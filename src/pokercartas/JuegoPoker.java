package pokercartas;

public class JuegoPoker {
    public static final int NADA = 0;
    public static final int PAREJA = 1;
    public static final int TRIO = 2;
    public static final int POKER = 3;
    public static final int REPOKER = 4;

    public JuegoPoker() {
    }
    
    public static int getCombinacion(CartaFrancesa carta1, CartaFrancesa carta2, 
            CartaFrancesa carta3, CartaFrancesa carta4, CartaFrancesa carta5){
       if(carta1.getNumero()!=carta2.getNumero() && carta1.getNumero()!=
               carta3.getNumero() && carta1.getNumero()!=carta4.getNumero()
               && carta1.getNumero()!=carta5.getNumero()){
           return NADA;
       }
       if(carta1.getNumero()== carta2.getNumero() || carta1.getNumero()==
               carta3.getNumero() || carta1.getNumero()==carta4.getNumero()
               || carta1.getNumero()== carta5.getNumero()){
           return PAREJA;
       } 
       return -1;
        /*return 2;
        return 3;
        return 4;*/
        
    }
}
