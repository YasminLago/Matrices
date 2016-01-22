package exemplomatriz;
//Yasmin

import java.util.Scanner;

public class MetodosMatriz {

    int[][] notas = new int[3][4];
    float[] notasMedias = new float[3];
    float[] mediaModulos = new float[4];
    String[] nomes={"aa","bb","cc"};
    String[] modulos={"Programacion","CD","BD","LM"};

    //Cargar matriz: int[][]notaM={{7,9,5,4},{5,5,5,5},{6,7,8,9}};

    public void cargarMatriz() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                notas[f][c] = pedirNota();
            }
        }
    }

    public void amosarMatriz() {
        for (int f = 0; f < notas.length; f++) {
            System.out.print("| ");
            for (int c = 0; c < notas[f].length; c++) {
                System.out.print(notas[f][c] + " ");
            }
            System.out.print("|");
            System.out.print("\n");

        }
    }

    public int pedirNota() {
        int nota;
        do{
        Scanner nt = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        nota = nt.nextInt();
        if(nota<1||nota>10)
            System.out.println("Nota erronea");
        }while(nota<1||nota>10);
        return nota;
    }

    public void calcularnotaMedia() {
        for (int f = 0; f < notas.length; f++) {
            float acumulador = 0;
            for (int c = 0; c < notas[f].length; c++) {
                //notasMedias[f]=;
                acumulador = acumulador + notas[f][c];
            }
            notasMedias[f] = acumulador / notas[f].length;
        }
    }

    public void amosarMediaMatriz() {
      calcularnotaMedia();
      calcularMediaModulos();
        for (int f = 0; f < notas.length; f++) {
            System.out.print("| ");
            for (int c = 0; c < notas[f].length; c++) {
                System.out.print(notas[f][c] + " ");
            }
            System.out.print("| " + notasMedias[f] + " |" + "\n");
            for (f=0;f<mediaModulos.length;f++){
            System.out.print(mediaModulos[f] + "  ");
        }}
    }

    public void calcularMediaModulos() {

        for (int f = 0; f < notas.length; f++) {//fila
            for (int c = 0; c < notas[f].length; c++) {//columna
                mediaModulos[c] = mediaModulos[c] + notas[f][c];
            }
            for (int c = 0; c < mediaModulos.length; c++) {
                mediaModulos[c] = mediaModulos[c] / notas.length;
            }
        }
    }
    public void amosarTodo(){
        for(int n=0;n<nomes.length;n++){
            
            for (int f = 0; f < notas.length; f++) {
                
            System.out.print(nomes[n]+"| ");
             for(int m=0;m<modulos.length;m++){
            for (int c = 0; c < notas[f].length; c++) {
               
                    
                
                System.out.print(notas[f][c] + " ");
               System.out.print(modulos[m]);
            }
            System.out.print("|");
            System.out.print("\n");}
            
        }}
                
        
            
}
}
