package br.com.danilo.dao;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.generic.jpa.GenericJpaDAO;
import br.com.danilo.domain.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
