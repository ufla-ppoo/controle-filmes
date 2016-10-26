/**
*	MANUTENCAO DO SISTEMA REALIZADA POR:
*	Valdeci Soares da Silva Junior
*                       &
*        Arlen Mendes
*	Site: conexusecia.com.br
*	Contato: (35) 9_9195-8111 - Tim + Whatsapp
*	E-mail: contato@conexusecia.com.br
*/

package br.ufla.dcc.ppoo.servicos;

import br.ufla.dcc.ppoo.dao.FilmeDAO;
import br.ufla.dcc.ppoo.dao.lista.FilmeDAOLista;
import br.ufla.dcc.ppoo.i18n.I18N;
import br.ufla.dcc.ppoo.modelo.Filme;
import java.util.List;


/**
 * Classe que representa a os cadastros de filmes. Permite
 * o funcionamento dos botões da tela principals.
 * 
 * @author Valdeci e Arlen
 */
public class GerenciadorFilmes {

    private final FilmeDAO repositorioFilme;
    

    public GerenciadorFilmes() {
        repositorioFilme
                = FilmeDAOLista.obterInstancia();
            }

    public List<Filme> getListaFilme(){
    return repositorioFilme.getListaFilmes();
    }

    public void cadastrarFilme(Filme filme){

        repositorioFilme.adicionarFilme(filme);
    }
    public void editarFilme(Filme filme,int a) {
        repositorioFilme.editarFilme(filme,a);
    }
    
    public void deletarFilme (Filme filme, int a){
        repositorioFilme.deletarFilme(filme, a);
    }
}
