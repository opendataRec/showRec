package opendata.business;

// Generated 01/12/2013 11:24:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Hoteis generated by hbm2java
 */
@Entity
@Table(name = "hoteis", catalog = "opendata")
public class Hoteis implements java.io.Serializable {

	private HoteisId id;

	public Hoteis() {
	}

	public Hoteis(HoteisId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "nome", column = @Column(name = "nome")),
			@AttributeOverride(name = "endereco", column = @Column(name = "endereco")),
			@AttributeOverride(name = "telefone", column = @Column(name = "telefone")),
			@AttributeOverride(name = "site", column = @Column(name = "site")),
			@AttributeOverride(name = "latitude", column = @Column(name = "latitude")),
			@AttributeOverride(name = "longitude", column = @Column(name = "longitude")) })
	public HoteisId getId() {
		return this.id;
	}

	public void setId(HoteisId id) {
		this.id = id;
	}

}
