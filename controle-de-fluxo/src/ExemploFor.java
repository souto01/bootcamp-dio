public class ExemploFor {
    public static void main(String[] args) {

        //Por dentro
        for (int aulas = 1 ; aulas <= 5; aulas++){
            System.out.println(aulas + " Aulas Concluídas");
        }
        
        //Por fora
        int carneirinhos = 1;
        for(; carneirinhos <= 10; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

        //for com arrays e coleções
        //em arrays o indice inicia em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice " + x + " é " + alunos[x]);
	}
	
        //Forma abreviada
	for(String aluno : alunos) {
	  System.out.println("Nome do aluno é: " + aluno);
	}


    }
}
