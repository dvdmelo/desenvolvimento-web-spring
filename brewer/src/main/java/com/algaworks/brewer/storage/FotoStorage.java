package com.algaworks.brewer.storage;

import org.springframework.web.multipart.MultipartFile;

public interface FotoStorage {

	public String salvarTemporariamente(MultipartFile[] file);

	public byte[] recuperarFotoTemporaria(String nome);
	
	public byte[] recuperar(String nome);	

	public void salvar(String foto);
	
}
