package lista7_7;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista7_7 {
    public static void main(String[] args) {
        final int LIMITEMAX = 1000;
        final int LINHA = 10;
//        final int COLUNA = 5;
        int vet[][] = new int [LINHA][LINHA];
        int cont;
        for(int x = 0; x < LINHA; x++){
            for(int y = 0; y < LINHA; y++){
                do{
                    do{
                        vet[x][y] = (int) (Math.random() * (LIMITEMAX+1));
                    }while(vet[x][y] % 2 != 0);
                    cont = 0;
                    for(int x1 = 0; x1 <= x; x1++){
                        if(x == x1){
                            for(int y1 = 0; y1 < y; y1++){
                                if(vet[x][y] == vet[x1][y1]){
                                    cont++;
                                }
                            }
                        } else{
                            for(int y1 = 0; y1 < LINHA; y1++){
                                if(vet[x][y] == vet[x1][y1]){
                                    cont++;
                                }
                            }
                        }
                    }
                }while(cont != 0);
            }
        }
        String vetorOriginal = "";
        for (int x = 0; x < LINHA; x++) {
            vetorOriginal += Arrays.toString(vet[x]) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz gerada: \n"+vetorOriginal);
    }    
}
