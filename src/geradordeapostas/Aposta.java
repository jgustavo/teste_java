package geradordeapostas;
import java.util.Set;
public abstract class Aposta {
	private Set<Integer> dezenas;
	public Set<Integer> getDezenas() {
		return dezenas;
	}
	public void setDezenas(Set<Integer> dezenas) {
		this.dezenas = dezenas;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		
		return super.equals(obj);
	}
	
	
}
