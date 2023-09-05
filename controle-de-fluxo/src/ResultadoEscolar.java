public class ResultadoEscolar {
    public static void main(String[] args) {

       //Usando If e Else
        int nota = 5;

        if (nota >= 7)
        System.out.println("APROVADO!");

        else if (nota >= 5 && nota < 7) 
        System.out.println("RECUPERAÇÃO");
               
        else 
        System.out.println("REPROVADO");

        //Usando condição ternária
        int nota1 = 9;
		String resultado = nota1 >=7 ? "APROVADO" : nota1 >=5 && nota1 <7 ? "RECUPERAÇÃO" : "REPROVADO";
		System.out.println(resultado);

    }
}
