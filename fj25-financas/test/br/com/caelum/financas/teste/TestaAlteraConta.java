package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.ContaRepository;
import br.com.caelum.financas.util.JPAUtil;

public class TestaAlteraConta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		
		ContaRepository repository = new ContaRepository(manager);
		
		manager.getTransaction().begin();
		
		Conta conta = repository.busca(2);
		conta.setTitular("Joãzinho");
		
		manager.getTransaction().commit();
		manager.close();


	}

}
