package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.ContaRepository;
import br.com.caelum.financas.util.JPAUtil;

public class TestaListagemConta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		
		ContaRepository repository = new ContaRepository(manager);
		
		List<Conta> lista = repository.lista();
		
		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
		
		manager.close();
		
	}

}
