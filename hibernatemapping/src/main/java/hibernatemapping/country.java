package hibernatemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="countries")
public class country {
	@Id
	private int id;
	@Column(unique = true)
	private String name;
	private String population;
	
	@OneToOne
	private Primeminister primeminister;

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

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public Primeminister getPrimeminister() {
		return primeminister;
	}

	public void setPrimeminister(Primeminister primeminister) {
		this.primeminister = primeminister;
	}
	

	
	
}
