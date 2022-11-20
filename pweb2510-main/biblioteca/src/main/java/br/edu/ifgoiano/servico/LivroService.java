package br.edu.ifgoiano.servico;

import java.util.List;

import br.edu.ifgoiano.entidade.Livro;

public interface LivroService {
	public List<Livro> listarLivros();

	public Livro obterLivro(Long id);

	public void alterarLivro(Livro livro);

	void deletarLivro(Long id);
}