import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
   //     Aluno[] vetor = null;
        int opcao;

        do {

            opcao = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(""
                    + "1 - Criar um vetor.\n" + "2 - Adicionar um aluno.\n"
                    + "3 - Mostrar o tamanho da lista.\n"
                    + "4 - Ver se determinado aluno esta na lista.\n"
                    + "5 - Pega um posição.\n"
                    + "6 - Verifica se a posição está ocupada.\n"
                    + "7 - Verifica se a posição é valida. \n"
                    + "8 - Adiciona um aluno na posição desejada.\n"
                    + "9 - Remove uma posição.\n" + "10 - Garanta espaço.\n"
                    + "11 - Remove alunos repetidos.\n" + "12 - Limpa lista.\n"
                    + "13 - Retorna o primeiro indice de um aluno.\n"
                    + "14 - Retorna o ultimo indice de um aluno.\n"
                    + "15 - Sair"));

            switch (opcao) {
            case 1:
                int tamanhoVetor = Integer.parseInt(javax.swing.JOptionPane
                        .showInputDialog("Digite um tamanho do vetor."));

                lista.setVetor(new Aluno[tamanhoVetor]);
                break;
            case 2:
                for (int i = 0; i < lista.tamanho(); i++) {
                    String nome = (javax.swing.JOptionPane
                            .showInputDialog("Digite um nome para o aluno."));
                    int idade = Integer.parseInt(javax.swing.JOptionPane
                            .showInputDialog("Digite uma idade."));
                    lista.inserirDadosAluno(nome, idade);

                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Tamanho da lista: "
                        + lista.tamanho());
                break;
            case 4:
                String nome = (javax.swing.JOptionPane
                        .showInputDialog("Procurar aluno por nome:"));
                JOptionPane.showMessageDialog(null, "O aluno esta na lista? "
                        + lista.contemOtimizado(nome));
                break;
            case 5:
                int posicao = Integer.parseInt(javax.swing.JOptionPane
                        .showInputDialog("Pegar aluno da posição:"));
                JOptionPane.showMessageDialog(null, "O Aluno esta na lista: "
                        + lista.pegaOtimizado(posicao));
                break;
            case 6:
                posicao = Integer.parseInt(javax.swing.JOptionPane
                        .showInputDialog("Digite uma posição:"));
                JOptionPane.showMessageDialog(null, "A posição esta ocupada: "
                        + lista.posicaoOcupada(posicao));
                break;
            case 7:
                posicao = Integer.parseInt(javax.swing.JOptionPane
                        .showInputDialog("Digite uma posição:"));
                JOptionPane.showMessageDialog(null, "A posição esta valida: "
                        + lista.posicaoValida(posicao));
                break;
            case 8:
                posicao = Integer.parseInt(javax.swing.JOptionPane
                        .showInputDialog("Digite uma posição:"));
                nome = (javax.swing.JOptionPane
                        .showInputDialog("Digite o nome que deseja adicionar:"));
                int idade = Integer
                        .parseInt(javax.swing.JOptionPane
                                .showInputDialog("Digite a idade que deseja adicionar:"));
                lista.adicionaPosicao(posicao, nome, idade);

                break;
            case 9:
                posicao = Integer.parseInt(javax.swing.JOptionPane
                        .showInputDialog("Digite uma posição a ser removida:"));
                lista.remove(posicao);
                break;
            case 10:
                lista.garantaEspaco();
                break;
            case 11:
                nome = (javax.swing.JOptionPane
                        .showInputDialog("Aluno repetido a ser removido:"));
                lista.removeRepetidos(nome);
                break;
            case 12:
                lista.limpaLista();
                break;
            case 13:
                nome = (javax.swing.JOptionPane
                        .showInputDialog("Digite o nome do aluno a ser retornado:"));
                lista.retornaPrimeiroIndice(nome);
                ;
                break;
            case 14:
                nome = (javax.swing.JOptionPane
                        .showInputDialog("Digite o nome do aluno a ser retornado:"));
                lista.retornaUltimoIndice(nome);
                break;
            case 15:
                JOptionPane.showMessageDialog(null, "Fim da execuÃ§Ã£o!");
                break;
            }

        } while (opcao != 15);

    }

}
