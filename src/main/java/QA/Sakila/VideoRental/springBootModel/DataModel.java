package QA.Sakila.VideoRental.springBootModel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "film")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"lastUpdate"}, allowGetters = true)
public class DataModel implements Serializable {

	public DataModel() {

	}

	public DataModel(Long filmId, @NotBlank String title, String description, Integer releaseYear, Long languageId,
			String originalLanguage, Integer rentalDuration, double rentalRate, Integer length, double replacementCost,
			String rating, String specialFeatures, Date lastUpdate) {
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.originalLanguage = originalLanguage;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		this.lastUpdate = lastUpdate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long filmId;

	@NotBlank
	private String title;

	private String description;

	private Integer releaseYear;

	private Long languageId;

	private String originalLanguage;

	private Integer rentalDuration;

	private double rentalRate;

	private Integer length;

	private double replacementCost;

	private String rating;

	private String specialFeatures;

	@Column(nullable = false, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date lastUpdate;

	public Long getFilmID() {
		return filmId;
	}



	public void setFilmID(Long filmId) {
		this.filmId = filmId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getdescription() {
		return description;
	}



	public void setdescription(String description) {
		this.description = description;
	}



	public Integer getReleaseYear() {
		return releaseYear;
	}



	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}



	public Long getLanguageID() {
		return languageId;
	}



	public void setLanguageID(Long languageID) {
		this.languageId = languageID;
	}



	public String getOriginalLanguage() {
		return originalLanguage;
	}



	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}



	public Integer getRentalDuration() {
		return rentalDuration;
	}



	public void setRentalDuration(Integer rentalDuration) {
		this.rentalDuration = rentalDuration;
	}



	public double getRentalRate() {
		return rentalRate;
	}



	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}



	public Integer getLength() {
		return length;
	}



	public void setLength(Integer length) {
		this.length = length;
	}



	public double getReplacementCost() {
		return replacementCost;
	}



	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}



	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}



	public String getSpecialFeatures() {
		return specialFeatures;
	}



	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}



	public Date getLastUpdate() {
		return lastUpdate;
	}



	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}


}
