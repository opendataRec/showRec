package opendata.business;

// Generated 01/12/2013 11:24:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CalcadasId generated by hbm2java
 */
@Embeddable
public class CalcadasId implements java.io.Serializable {

	private String rpa;
	private String viaPrincipal;
	private String extensao;
	private String larguraAmbosLados;

	public CalcadasId() {
	}

	public CalcadasId(String rpa, String viaPrincipal, String extensao,
			String larguraAmbosLados) {
		this.rpa = rpa;
		this.viaPrincipal = viaPrincipal;
		this.extensao = extensao;
		this.larguraAmbosLados = larguraAmbosLados;
	}

	@Column(name = "rpa")
	public String getRpa() {
		return this.rpa;
	}

	public void setRpa(String rpa) {
		this.rpa = rpa;
	}

	@Column(name = "via_principal")
	public String getViaPrincipal() {
		return this.viaPrincipal;
	}

	public void setViaPrincipal(String viaPrincipal) {
		this.viaPrincipal = viaPrincipal;
	}

	@Column(name = "extensao")
	public String getExtensao() {
		return this.extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	@Column(name = "largura_ambos_lados")
	public String getLarguraAmbosLados() {
		return this.larguraAmbosLados;
	}

	public void setLarguraAmbosLados(String larguraAmbosLados) {
		this.larguraAmbosLados = larguraAmbosLados;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CalcadasId))
			return false;
		CalcadasId castOther = (CalcadasId) other;

		return ((this.getRpa() == castOther.getRpa()) || (this.getRpa() != null
				&& castOther.getRpa() != null && this.getRpa().equals(
				castOther.getRpa())))
				&& ((this.getViaPrincipal() == castOther.getViaPrincipal()) || (this
						.getViaPrincipal() != null
						&& castOther.getViaPrincipal() != null && this
						.getViaPrincipal().equals(castOther.getViaPrincipal())))
				&& ((this.getExtensao() == castOther.getExtensao()) || (this
						.getExtensao() != null
						&& castOther.getExtensao() != null && this
						.getExtensao().equals(castOther.getExtensao())))
				&& ((this.getLarguraAmbosLados() == castOther
						.getLarguraAmbosLados()) || (this
						.getLarguraAmbosLados() != null
						&& castOther.getLarguraAmbosLados() != null && this
						.getLarguraAmbosLados().equals(
								castOther.getLarguraAmbosLados())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRpa() == null ? 0 : this.getRpa().hashCode());
		result = 37
				* result
				+ (getViaPrincipal() == null ? 0 : this.getViaPrincipal()
						.hashCode());
		result = 37 * result
				+ (getExtensao() == null ? 0 : this.getExtensao().hashCode());
		result = 37
				* result
				+ (getLarguraAmbosLados() == null ? 0 : this
						.getLarguraAmbosLados().hashCode());
		return result;
	}

}
