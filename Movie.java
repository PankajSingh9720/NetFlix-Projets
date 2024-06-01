/**
 * 
 */
package com.jspider.netflix_servlet_projects.dto;

import java.io.InputStream;
import java.time.LocalDate;

/**
 * @author {Pankaj Singh}
 *
 */
public class Movie {
	private int id;
	private String name;
	private LocalDate releasedYear;
	private String genresType;
	private String language;
	private String description;
	private String productionHouse;
	private String directorName;
	private String quality;
	private InputStream image;
	private String url;
	private String Type;
	private byte[] imageFetch;

	transient private byte[] imageFetch();

	public Movie() {
		super();
	}

	public Movie(String name, LocalDate releasedYear, String genresType, String language, String description,
			String productionHouse, String directorName, String quality, InputStream image, String url, String type) {
		super();
		this.name = name;
		this.releasedYear = releasedYear;
		this.genresType = genresType;
		this.language = language;
		this.description = description;
		this.productionHouse = productionHouse;
		this.directorName = directorName;
		this.quality = quality;
		this.image = image;
		this.url = url;
		Type = type;
	}

	public Movie(String name, LocalDate releasedYear, String genresType, String language, String description,
			String productionHouse, String directorName, String quality, String url, String type, byte[] imageFetch) {
		super();
		this.name = name;
		this.releasedYear = releasedYear;
		this.genresType = genresType;
		this.language = language;
		this.description = description;
		this.productionHouse = productionHouse;
		this.directorName = directorName;
		this.quality = quality;
		this.image = image;
		this.url = url;
		this.Type = type;
		this.imageFetch() =imageFetch;
	}

	public Movie(int id, String name, LocalDate releasedYear, String genresType, String language, String description,
			String productionHouse, String directorName, String quality, InputStream image, String url, String type) {
		super();
		this.id = id;
		this.name = name;
		this.releasedYear = releasedYear;
		this.genresType = genresType;
		this.language = language;
		this.description = description;
		this.productionHouse = productionHouse;
		this.directorName = directorName;
		this.quality = quality;
		this.image = image;
		this.url = url;
		Type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(LocalDate releasedYear) {
		this.releasedYear = releasedYear;
	}

	public String getGenresType() {
		return genresType;
	}

	public void setGenresType(String genresType) {
		this.genresType = genresType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductionHouse() {
		return productionHouse;
	}

	public void setProductionHouse(String productionHouse) {
		this.productionHouse = productionHouse;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String DirectorName) {
		this.directorName = directorName;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public InputStream getImage() {
		return image;
	}

	public void setImage(InputStream image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;

	}
	
	public byte[] getImageFetch() {
		
		return imageFetch();
		}
		
	
	public void setImageFetch(byte[] imageFetch) {
		
	this.imageFetch=imageFetch;
	}
	
}