package opendata.business;

// Generated 01/12/2013 11:24:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PonPontes generated by hbm2java
 */
@Entity
@Table(name = "pon_pontes", catalog = "opendata")
public class PonPontes implements java.io.Serializable {

	private PonPontesId id;

	public PonPontes() {
	}

	public PonPontes(PonPontesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "nome", column = @Column(name = "_nome", nullable = false)),
			@AttributeOverride(name = "descricao", column = @Column(name = "descricao", nullable = false, length = 65535)),
			@AttributeOverride(name = "bairro", column = @Column(name = "bairro", nullable = false)),
			@AttributeOverride(name = "latitude", column = @Column(name = "latitude", nullable = false)),
			@AttributeOverride(name = "longitude", column = @Column(name = "longitude", nullable = false)) })
	public PonPontesId getId() {
		return this.id;
	}

	public void setId(PonPontesId id) {
		this.id = id;
	}

}
