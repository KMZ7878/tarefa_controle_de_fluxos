package tarefa_controle_de_fluxos;
import java.util.Scanner;

public class alunos {

    public static void main(String args[]){
        
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Qual a nota o aluno tirou em Portugues?");
            int Portugues = s.nextInt();
            
            System.out.println("Qual a nota o aluno tirou em Matematica?");
            int Matematica = s.nextInt();

            System.out.println("Qual a nota o aluno tirou em Geografia?");
            int Geografia = s.nextInt();

            System.out.println("Qual a nota o aluno tirou em Inglês?");
            int Inglês= s.nextInt();

        
            double media = (Portugues + Inglês + Geografia + Matematica) / 4;
            System.out.println("A nota final do aluno é" + media + ".");

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            }
            if (media >= 5) {
                System.out.println("O aluno está de recuperação");
            }
            if (media < 5 ) {
                System.out.println("Aluno reprovado!");
                
            }
        }
    }
            
}

