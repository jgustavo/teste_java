import javax.swing.JOptionPane;

public class Lista {

    Aluno[] vetor = null;
    int valor;
    int totalValores = 0;

    public void inserirDadosAluno(String nome, int idade) {
        for (int i = 0; i < 0; i++) {
            vetor[i].setNome(nome);
            vetor[i].setIdade(idade);

        }
        this.totalValores++;
    }

    public void adiciona(Aluno aluno) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = aluno;
                break;
            }
        }
    }

    public void adicionaOtimizado(Aluno aluno) {
        this.vetor[this.totalValores] = aluno;
        this.totalValores++;
    }

    public int tamanho() {
        return totalValores;
    }

    public boolean contem(String nome) {
        for (int i = 0; i < vetor.length; i++) {
            if (nome == vetor[i].getNome()) {
                return true;

            }
        }
        return false;
    }

    public boolean contemOtimizado(String nome) {
        for (int i = 0; i < totalValores ; i++) {
            if (nome.equals(vetor[i].getNome())) {
                return true;
            }

        }
        return false;
    }

    public void setVetor(Aluno[] vetor) {
		this.vetor = vetor;
	}

	public String pega(int posicao) {
        return vetor[posicao - 1].getNome();
    }

    public boolean posicaoOcupada(int posicao) {
        return (posicao >= 0 && posicao < this.totalValores);
    }

    public String pegaOtimizado(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException(
                    " A posiÁ„o digitada È invalida ");
        }
        return vetor[posicao - 1].getNome();
    }

    public boolean posicaoValida(int posicao) {
        return (posicao >= 0 && posicao <= this.totalValores);
    }

    public void adicionaPosicao(int posicao, String nome, int idade) {
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = totalValores - 1; i >= posicao; i--) {
            this.vetor[i + 1] = this.vetor[i];
        }
        Aluno alunoNovo = new Aluno();
        alunoNovo.setIdade(idade);
        alunoNovo.setNome(nome);

        this.vetor[posicao] = alunoNovo;
        this.totalValores++;
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inv√°lida");
        }
        for (int i = posicao; i < this.totalValores - 1; i++) {
            this.vetor[i] = this.vetor[i + 1];
        }
        this.totalValores--;
    }

    public void garantaEspaco() {
        if (this.totalValores == this.vetor.length) {
            Aluno[] novoVetor = new Aluno[this.vetor.length * 2];
            for (int i = 0; i < this.vetor.length; i++) {
                novoVetor[i] = this.vetor[i];
            }
            this.vetor = novoVetor;
        }
    }

    public void removeRepetidos(String nome) {
        for (int i = 0; i < this.totalValores; i++) {
            if (vetor[i].getNome() == nome) {
                this.vetor[i] = this.vetor[i + 1];
                for (int j = i + 1; j < totalValores; j++) {
                    this.vetor[j] = this.vetor[j + 1];
                }
                this.totalValores--;
            }
        }
    }

    public void limpaLista() {
        for (int i = 0; i < totalValores; i++) {
            vetor[i] = null;
            this.totalValores--;
        }
    }

    public void retornaPrimeiroIndice(String nome) {
        for (int i = 0; i < totalValores; i++) {
            if (vetor[i].getNome() == nome) {
                JOptionPane.showMessageDialog(null, "Indice: " + i);
                break;
            }
        }
    }

    public void retornaUltimoIndice(String nome) {
        int indice = 0;
        for (int i = 0; i < totalValores; i++) {
            if (vetor[i].getNome() == nome) {
                indice = i;
            }
        }
        JOptionPane.showMessageDialog(null, "Indice: " + indice);
    }

}