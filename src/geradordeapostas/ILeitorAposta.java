package geradordeapostas;

import java.io.FileNotFoundException;
import java.util.Set;

public interface ILeitorAposta {
	public Set<Aposta> lerApostas(String nomeArquivo) throws FileNotFoundException;
}
