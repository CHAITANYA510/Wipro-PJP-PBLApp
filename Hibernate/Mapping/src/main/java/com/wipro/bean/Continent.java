package com.wipro.bean;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="continent")
public class Continent {
	
	@Id
	@Column(name="continent_name", length=10)
	private String continent_name;
	
	@ElementCollection
    @CollectionTable(name = "countries_mapping", joinColumns = {@JoinColumn(name = "contient_name", referencedColumnName = "continent_name")})
    @MapKeyColumn(name = "country_name")
    @Column(name = "capital")
	private Map<String,String> countries;

	public Continent() {
		
	}

	public Continent(String continent_name, Map<String, String> countries) {
		super();
		this.continent_name = continent_name;
		this.countries = countries;
	}

	public String getContinent_name() {
		return continent_name;
	}

	public void setContinent_name(String cname) {
		this.continent_name = cname;
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Continent [cname=" + continent_name + ", countries=" + countries + "]";
	}
	
}
