package dev.d3snik.EncurtaURL.Links;

import java.time.LocalDateTime;

public class LinkResponse {
	
	
	private Double id;
	private String urlLong;
	private String urlEncurtada;
	private LocalDateTime urlCreatedOn;
	
	public LinkResponse(Double id, String urlLong, String urlEncurtada, LocalDateTime urlCreatedOn) {
		super();
		this.id = id;
		this.urlLong = urlLong;
		this.urlEncurtada = urlEncurtada;
		this.urlCreatedOn = urlCreatedOn;
	}
	public Double getId() {
		return id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public String getUrlLong() {
		return urlLong;
	}
	public void setUrlLong(String urlLong) {
		this.urlLong = urlLong;
	}
	public String getUrlEncurtada() {
		return urlEncurtada;
	}
	public void setUrlEncurtada(String urlEncurtada) {
		this.urlEncurtada = urlEncurtada;
	}
	public LocalDateTime getUrlCreatedOn() {
		return urlCreatedOn;
	}
	public void setUrlCreatedOn(LocalDateTime urlCreatedOn) {
		this.urlCreatedOn = urlCreatedOn;
	}
	
	
	
	
}