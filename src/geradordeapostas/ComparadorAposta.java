package geradordeapostas;

import java.util.Set;

public class ComparadorAposta implements IComparadorAposta{

	@Override
	public boolean compara(Set<Aposta> set1, Set<Aposta> set2) {
		
		for (Aposta a: set1) {
			if (set2.contains(a)) {
				System.out.println(a.getDezenas() + " = ");
				return true;
			};
		}
		
		return false;
	}

}
