package dev.d3snik.EncurtaURL.Links;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "links_person")
public class Link {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Double id;
	private String urlLong;
	private String urlEncurtada;
	private LocalDateTime urlCreatedOn;
		
	public Link(Double id, String urlLong, String urlEncurtada, LocalDateTime urlCreatedOn) {
		super();
		this.id = id;
		this.urlLong = urlLong;
		this.urlEncurtada = urlEncurtada;
		this.urlCreatedOn = urlCreatedOn;
	}
	
	public Link(Double id) {
		this.id = id;
		
		
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
