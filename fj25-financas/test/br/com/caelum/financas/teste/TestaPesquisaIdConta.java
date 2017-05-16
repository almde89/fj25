package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.ContaRepository;
import br.com.caelum.financas.util.JPAUtil;

public class TestaPesquisaIdConta {

	public static void main (String [] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		ContaRepository repository = new ContaRepository(manager);
		
		Conta encontrada = repository.busca(4);
		
		System.out.println(encontrada.getTitular());
		
		manager.close();
		
	}
	
}
