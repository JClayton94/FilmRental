package QA.Sakila.VideoRental.springBootModel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "film_list")
@EntityListeners(AuditingEntityListener.class)
public class DataModel implements Serializable {

	public DataModel() {

	}

	public DataModel(Long FID, @NotBlank String title, String description, String category, double price,
			Integer length, String rating, String actors, Date lastUpdate) {
		this.FID = FID;
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.length = length;
		this.rating = rating;
		this.actors = actors;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FID;

	@NotBlank
	private String title;

	private String description;

	private String category;
	
	private double price;

	private Integer length;
	
	private String rating;

	private String actors;
	
	public Long getFID() {
		return FID;
	}



	public void setFID(Long FID) {
		this.FID = FID;
	}

	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
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


	



	public Integer getLength() {
		return length;
	}



	public void setLength(Integer length) {
		this.length = length;
	}




	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}


}
