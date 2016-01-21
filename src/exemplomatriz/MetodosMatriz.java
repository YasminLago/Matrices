package exemplomatriz;
//Yasmin

import java.util.Scanner;

public class MetodosMatriz {
    int[][]notas=new int[3][4];
    int[]notasMedias=new int[3];
    int[]mediaModulos=new int[4];
    //Cargar matriz: int[][]notaM={{7,9,5,4},{5,5,5,5},{6,7,8,9}};
    public void cargarMatriz(){
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                notas[f][c]=pedirNota();
            }
        }
    }
    public void amosarMatriz(){
         for(int f=0;f<notas.length;f++){
             System.out.print("| ");
            for(int c=0;c<notas[f].length;c++){
            System.out.print(notas[f][c]+" ");
            }
            System.out.print("|");
            System.out.print("\n");
            
        }
    }
    public int pedirNota() {
        Scanner nt = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        int nota = nt.nextInt();
        return nota;
    }
    public void calcularnotaMedia(){
         for(int f=0;f<notas.length;f++){
             int acumulador=0;
            for(int c=0;c<notas[f].length;c++){
                //notasMedias[f]=;
                acumulador=acumulador+notas[f][c];
            }
            notasMedias[f]=acumulador/notas[f].length;
        }
    }
     public void amosarMediaMatriz(){
         calcularnotaMedia();
         for(int f=0;f<notas.length;f++){
             System.out.print("| ");
            for(int c=0;c<notas[f].length;c++){
            System.out.print(notas[f][c]+" ");
            }           
            System.out.print("| "+notasMedias[f]+" |"+"\n");
        }    
    }
     public void calcularMediaModulos(){
        
         for(int f=0;f<notas.length;f++){
             
            for(int c=0;c<notas[f].length;c++){
                mediaModulos[c]=mediaModulos[c]+notas[c][f];
                //notasMedias[f]=;
                acumulador=acumulador+notas[f][c];
            }
            notasMedias[f]=acumulador/notas[f].length;
            System.out.println("+++"+mediaModulos[f]);
         }
    }
}

  

