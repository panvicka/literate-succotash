package com.ev.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "PARAMETERS")
public class Parameter {

	@Id
	@GeneratedValue
	@Column(name = "PAR_ID")
	private Integer Id; 
		
	private Integer parULTId;
	private String description;
	private String category;

//	@OneToMany(mappedBy = "parameter")
//	private CollectionParameter CollectionParameter;
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "parameter", orphanRemoval = true)
	private List<CollectionParameter> CollectionParameter = new ArrayList<>();

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getParULTId() {
		return parULTId;
	}

	public void setParULTId(Integer parULTId) {
		this.parULTId = parULTId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<CollectionParameter> getCollectionParameter() {
		return CollectionParameter;
	}

	public void setCollectionParameter(List<CollectionParameter> collectionParameter) {
		CollectionParameter = collectionParameter;
	}

 

	
	


	
	
	
	
}
