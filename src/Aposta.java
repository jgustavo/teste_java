import java.util.List;
public abstract class Aposta {
	private List<Integer> dezenas;
	public List<Integer> getDezenas() {
		return dezenas;
	}
	public void setDezenas(List<Integer> dezenas) {
		this.dezenas = dezenas;
	}
}
