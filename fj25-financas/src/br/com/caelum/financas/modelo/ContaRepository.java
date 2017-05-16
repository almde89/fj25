package br.com.caelum.financas.modelo;

import java.util.List;

import javax.persistence.EntityManager;

public class ContaRepository {
	
	private EntityManager manager;
	
	public ContaRepository(EntityManager manager) {
		this.manager = manager;
	}

	public Conta busca (Integer id) {
		return this.manager.find(Conta.class, id);
	}
	
	public List<Conta> lista() {
		return this.manager.createQuery("select c from Conta c", Conta.class).getResultList();
	}
	
	public Integer adicionar (Conta conta) {
		this.manager.persist(conta);
		return conta.getId();
	}
	
	public void remove (Conta conta) {
		this.manager.remove(conta);
	}
}
