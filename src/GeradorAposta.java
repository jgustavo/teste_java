import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GeradorAposta implements IGeradorAposta{

	@Override
	public List<Aposta> geraApostas(int quantidadeDeApostas) {
		
		ArrayList<Aposta> apostas = new ArrayList<Aposta>();
		
		for (int i =1;i <quantidadeDeApostas;i++) {
			Aposta aposta = new ApostaConcreta();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j=1;j<=6;j++) {
				list.add(Integer.valueOf((int) Math.round(Math.random()*60)));
			}
			aposta.setDezenas(list);
			apostas.add(aposta);
		}
		return apostas;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		GeradorAposta geradorAposta = new GeradorAposta();
		List<Aposta> geraApostas = geradorAposta.geraApostas(100);
		
		File fileOutputStream = new File("saida.txt");
		PrintStream printStream = new PrintStream(fileOutputStream);
		
		
		
		for (Aposta a:geraApostas) {
			System.out.println(a.getDezenas().toString());
			printStream.println(a.getDezenas().toString());
		}
		

	}


}
