package com.sistema.conta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.conta.model.Conta;
import com.sistema.conta.repository.ContaRepository;

@Service
public class ContaService {

	@Autowired
	private ContaRepository contaRepository;

	public Conta salvar(Conta conta) {
		return contaRepository.save(conta);
	}

	public Conta alterar(Conta conta) {
		return contaRepository.save(conta);
	}

	public void deletar(Integer id) {
		contaRepository.delete(id);
	}

	public Conta buscar(Integer id) {
		return contaRepository.findOne(id);
	}

	public List<Conta> listar(Integer status) {
		if (status == -1) {
			return (List<Conta>) contaRepository.findAll();
		} else {
			boolean pago = false;
			if (status == 1) {
				pago = true;
			}
			return (List<Conta>) contaRepository.findByStatus(pago);
		}

	}

}
