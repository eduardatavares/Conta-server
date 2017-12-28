package com.sistema.conta.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.conta.model.Conta;
import com.sistema.conta.service.ContaService;

@CrossOrigin
@RestController
@RequestMapping("/conta")
public class ContaController {

	@Autowired
	private ContaService contaService;
	
	@PostMapping
	public Conta salvar(@RequestBody Conta conta) {
		return contaService.salvar(conta);
	}
	
	@PutMapping
	public Conta alterar(@RequestBody Conta conta) {
		return contaService.salvar(conta);
	}
	
	@DeleteMapping("{id}")
	public void deletar(@PathVariable("id") Integer id) {
		 contaService.deletar(id);
	}
	
	@GetMapping("{id}")
	public Conta buscar(@PathVariable Integer id) {
		return contaService.buscar(id);
	}
	
	@GetMapping
	public List<Conta> listar(@PathParam("status") Integer status) {
		return contaService.listar(status);
	}
	
}
