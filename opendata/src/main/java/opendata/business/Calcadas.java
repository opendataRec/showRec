package opendata.business;

// Generated 01/12/2013 11:24:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Calcadas generated by hbm2java
 */
@Entity
@Table(name = "calcadas", catalog = "opendata")
public class Calcadas implements java.io.Serializable {

	private CalcadasId id;

	public Calcadas() {
	}

	public Calcadas(CalcadasId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "rpa", column = @Column(name = "rpa")),
			@AttributeOverride(name = "viaPrincipal", column = @Column(name = "via_principal")),
			@AttributeOverride(name = "extensao", column = @Column(name = "extensao")),
			@AttributeOverride(name = "larguraAmbosLados", column = @Column(name = "largura_ambos_lados")) })
	public CalcadasId getId() {
		return this.id;
	}

	public void setId(CalcadasId id) {
		this.id = id;
	}

}
