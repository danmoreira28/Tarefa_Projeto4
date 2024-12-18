package br.com.danilo.dao;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.generic.jpa.GenericJpaDAO;
import br.com.danilo.domain.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}