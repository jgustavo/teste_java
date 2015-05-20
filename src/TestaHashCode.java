import java.util.HashMap;


public class TestaHashCode {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		aluno.setIdade(0);
		aluno.setNome("Jose");
		
		Aluno aluno2 = new Aluno();
		aluno2.setIdade(0);
		aluno2.setNome("Jose");

		HashMap<Aluno, String> hashMap = new HashMap<Aluno,String>();
		
		hashMap.put(aluno, "Aluno1");
		
		String string = hashMap.get(aluno2);
		
		System.out.println(aluno.hashCode());
		System.out.println(string);
		
		Aluno aluno3 = aluno;
		System.out.println(aluno.getNome());
		aluno3.setNome("Joao");
		System.out.println(aluno.getNome());
		

	}

}
