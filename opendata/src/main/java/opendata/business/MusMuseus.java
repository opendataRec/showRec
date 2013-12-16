package opendata.business;

// Generated 01/12/2013 11:24:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MusMuseus generated by hbm2java
 */
@Entity
@Table(name = "mus_museus", catalog = "opendata")
public class MusMuseus implements java.io.Serializable {

	private MusMuseusId id;

	public MusMuseus() {
	}

	public MusMuseus(MusMuseusId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "nome", column = @Column(name = "_nome", nullable = false)),
			@AttributeOverride(name = "descricao", column = @Column(name = "descricao", nullable = false, length = 65535)),
			@AttributeOverride(name = "bairro", column = @Column(name = "bairro", nullable = false)),
			@AttributeOverride(name = "logradouro", column = @Column(name = "logradouro", nullable = false)),
			@AttributeOverride(name = "latitude", column = @Column(name = "latitude", nullable = false)),
			@AttributeOverride(name = "longitude", column = @Column(name = "longitude", nullable = false)),
			@AttributeOverride(name = "telefone", column = @Column(name = "telefone")),
			@AttributeOverride(name = "site", column = @Column(name = "site")) })
	public MusMuseusId getId() {
		return this.id;
	}

	public void setId(MusMuseusId id) {
		this.id = id;
	}

}
