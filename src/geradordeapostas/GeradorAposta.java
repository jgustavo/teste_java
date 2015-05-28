package geradordeapostas;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class GeradorAposta implements IGeradorAposta {

	@Override
	public Set<Aposta> geraApostas(int quantidadeDeApostas) {

		TreeSet<Aposta> apostas = new TreeSet<Aposta>();

		for (int i = 1; i <= quantidadeDeApostas; i++) {
			Aposta aposta = new ApostaConcreta();
			Set<Integer> set = new TreeSet<Integer>();
			Random random = new Random();
			for (int j = 1; set.size() < 6; j++) {
				set.add(random.nextInt(60)+1);
			}
			aposta.setDezenas(set);
			apostas.add(aposta);
		}
		return apostas;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		GeradorAposta geradorAposta = new GeradorAposta();
		Set<Aposta> geraApostas = geradorAposta.geraApostas(9);
		for (Aposta a: geraApostas) {
			System.out.println(a.getDezenas());
		}
		
		

	}

}
