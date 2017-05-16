package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.ContaRepository;
import br.com.caelum.financas.util.JPAUtil;

public class TestInsereConta {

	
	public static void main (String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		ContaRepository repository = new ContaRepository(manager);
		long inicio = System.currentTimeMillis();
		
		Conta conta = new Conta();
		conta.setTitular("José Ribeiro");
		conta.setBanco("BaNDO DO bRASIL");
		conta.setNumero("123456-6");
		conta.setAgencia("0999");
		
		manager.getTransaction().begin();
		repository.adicionar(conta);
		manager.getTransaction().commit();
		manager.close();
		
		long fim = System.currentTimeMillis();
		System.out.println("Conta gravada com sucesso em: " + (fim - inicio) + "ms");
	}
	
}
