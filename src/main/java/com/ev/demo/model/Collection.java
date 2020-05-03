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
@Table(name = "COLLECTIONS")
public class Collection {
	@Id
	@GeneratedValue
	@Column(name = "COLLECTION_ID")
	private Integer collId;
	private Integer pULTCollId;
	private String description;
	
	//@OneToMany(mappedBy = "collectionofpar")
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "collection", orphanRemoval = true)
	private List<CollectionParameter> CollectionParameter = new ArrayList<>();

	//private  CollectionParameter  CollectionParameter;

	public Integer getpSetId() {
		return collId;
	}

	public void setpSetId(Integer pSetId) {
		this.collId = pSetId;
	}

	public Integer getpULTCollId() {
		return pULTCollId;
	}

	public void setpULTCollId(Integer pULTCollId) {
		this.pULTCollId = pULTCollId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<CollectionParameter> getCollectionParameter() {
		return CollectionParameter;
	}

	public void setCollectionParameter(List<CollectionParameter> collectionParameter) {
		CollectionParameter = collectionParameter;
	}

 

	
	
}
