import java.util.Random;
import java.util.Scanner;
public class busca_sequencial {
    public static void main(String[]args){
        //criar vetor
        int vetor[] = new int[5];
        //criar for
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random()*101);
            while(vetor[i] > 3){
            vetor[i] = (int)(Math.random()*101);
            }
        }
        //importa, para pedir do usuário
        Scanner tcl= new Scanner(System.in);
        System.out.println("digite o valor...");
        int valor = tcl.nextInt();
        boolean encontrado = false;
        for(int i=0;i<vetor.length;i++){
            if (vetor[i]==valor){
                System.out.println("valor encontrado!");
                encontrado = true;
                break;
            }
        }
        if(encontrado == false){
            System.out.println("valor infelismente não encontrado");
        }
    }
}
