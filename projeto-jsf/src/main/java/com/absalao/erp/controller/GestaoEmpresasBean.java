package com.absalao.erp.controller;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.absalao.erp.model.Empresa;
import com.absalao.erp.model.TipoEmpresa;

@Named
@RequestScoped
public class GestaoEmpresasBean implements Serializable {
     	private static final long serialVersionID = 1L;
     	
     private Empresa empresa = new Empresa();	
     
     public void salvar() {
    	 System.out.println("Razão Social: " + empresa.getRazaoSocial() + " - Nome Fantasia: " + empresa.getNomeFantasia() 
    	 					+ " - Tipo empresa: " + empresa.getTipo());
     }
     
     public Empresa getEmpresa() {
		return empresa;
	 }
     
     public TipoEmpresa[] getTiposEmpresa() {
    	 return TipoEmpresa.values();
     }
    
	
}
