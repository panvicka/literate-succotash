package com.ev.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CollectionParameter {
	
	@Id
	@GeneratedValue
	@Column(name = "PARAMETER_COLLECTION_ID")
	int parSetparId;	
	
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "COLLECTION_ID")
	private Collection collection;
		
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "PAR_ID")
	private Parameter parameter;
	
	int parameterValue;

	public int getParSetparId() {
		return parSetparId;
	}

	public void setParSetparId(int parSetparId) {
		this.parSetparId = parSetparId;
	}

	public Collection getParameterSet() {
		return collection;
	}

	public void setParameterSet(Collection parameterSet) {
		this.collection = parameterSet;
	}

	public Parameter getParameter() {
		return parameter;
	}

	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}

	public int getParameterValue() {
		return parameterValue;
	}

	public void setParameterValue(int parameterValue) {
		this.parameterValue = parameterValue;
	}
	
	
	


 


	

}
