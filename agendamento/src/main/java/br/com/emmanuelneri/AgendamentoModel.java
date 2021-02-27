package br.com.emmanuelneri;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AgendamentoModel {
	private Long id;
	private String titulo;
	private Date data;
	private String dataFormatada;
	
	public AgendamentoModel(Long id, String titulo, Date data) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.data = data;
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.dataFormatada = formato.format(data);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDataFormatada() {
		return dataFormatada;
	}

	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}

	
}
