package geradordeapostas;

import java.util.Set;

public class ApostaConcreta extends Aposta implements Comparable {

	@Override
	public int compareTo(Object arg0) {
		Aposta aposta = (Aposta) arg0;
		Set<Integer> dezenas1 = aposta.getDezenas();
		Set<Integer> dezenas2 = getDezenas();
		int equals = dezenas1.toString().compareTo(dezenas2.toString());
		//System.out.println(dezenas1 + " > " + dezenas2 + "?" + equals);
		// if (equals)
		// return 0;
		// else
		return equals;
	}

}
