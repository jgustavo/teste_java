package geradordeapostas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		GeradorAposta geradorAposta = new GeradorAposta();
		Set<Aposta> geraApostas = geradorAposta.geraApostas(100);

		File file = new File("saida.txt");
		PrintStream printStream = new PrintStream(file);

		for (Aposta a : geraApostas) {
			System.out.println(a.getDezenas().toString());
			printStream.println(a.getDezenas().toString());
		}

		printStream.close();
		
		LeitorAposta leitorAposta = new LeitorAposta();
		Set<Aposta> lerApostas = leitorAposta.lerApostas("Book1.csv");
		
		Integer[] i = { 25, 27, 29, 37, 50, 51 };
		TreeSet<Integer> dezenas = new TreeSet<Integer>(Arrays.asList(i));
		Aposta minhaAposta = new ApostaConcreta();
		minhaAposta.setDezenas(dezenas);
//		geraApostas = new TreeSet<Aposta>();
		geraApostas.add(minhaAposta);
		
		ComparadorAposta comparadorAposta = new ComparadorAposta();
		
		boolean compara = comparadorAposta.compara(geraApostas, lerApostas);
		
		if (compara) {
			System.out.println("Achou");
		}
		else
			System.out.println("Não achou nada");

	}

}
