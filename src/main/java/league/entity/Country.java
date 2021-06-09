package league.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	private Integer countryId;
	private String countryName;
	private String countryLogo;

	public Country() {
		super();
	}

	public Country(Integer countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryLogo() {
		return countryLogo;
	}

	public void setCountryLogo(String countryLogo) {
		this.countryLogo = countryLogo;
	}
}