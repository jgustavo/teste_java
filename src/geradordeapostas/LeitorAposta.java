package geradordeapostas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LeitorAposta implements ILeitorAposta {

	@Override
	public Set<Aposta> lerApostas(String nomeArquivo) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(nomeArquivo));
		TreeSet<Aposta> setAposta = new TreeSet<Aposta>();
		while (scanner.hasNext()) {
			String next = scanner.next();
			String[] split = next.split(",");
			TreeSet<Integer> set = new TreeSet<Integer>();
			Aposta aposta = new ApostaConcreta();
			for (int i = 2; i < split.length; i++) {
				set.add(Integer.valueOf(split[i]));
			}
		//	System.out.println(set);
			aposta.setDezenas(set);

/*			Integer[] i = { 25, 27, 29, 37, 50, 51 };
			TreeSet minhaAposta = new TreeSet(Arrays.asList(i));

			if (set.equals(minhaAposta)) {
				System.out.println("Acertou!" + set + " = " + minhaAposta);
			}*/
			
			setAposta.add(aposta);

		}

		scanner.close();
		return setAposta;
	}

	public static void main(String[] args) throws FileNotFoundException {

		LeitorAposta leitorAposta = new LeitorAposta();
		leitorAposta.lerApostas("Book1.csv");

	}

}
