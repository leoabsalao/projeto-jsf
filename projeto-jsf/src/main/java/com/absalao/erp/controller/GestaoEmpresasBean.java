package com.absalao.erp.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.weld.context.ejb.Ejb;

import com.absalao.erp.model.Empresa;
import com.absalao.erp.repository.Empresas;
import com.absalao.erp.util.Transacional;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
     	private static final long serialVersionID = 1L;
     	
    @Inject
    private Empresas empresas;   	
     	  
	private List<Empresa> listaEmpresas;
	
	public void todasEmpresas() {
		listaEmpresas = empresas.todas();
	}

	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}
	
}
