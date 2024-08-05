package com.absalao.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.absalao.erp.model.Empresa;
import com.absalao.erp.repository.Empresas;
import com.absalao.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Empresas empresas;
	
	@Transacional
	public void salvar(Empresa empresa) {
		empresas.salvar(empresa);
	}
	
	@Transacional
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}
	

}
