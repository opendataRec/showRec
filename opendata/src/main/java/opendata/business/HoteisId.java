package opendata.business;

// Generated 01/12/2013 11:24:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HoteisId generated by hbm2java
 */
@Embeddable
public class HoteisId implements java.io.Serializable {

	private String nome;
	private String endereco;
	private String telefone;
	private String site;
	private String latitude;
	private String longitude;

	public HoteisId() {
	}

	public HoteisId(String nome, String endereco, String telefone, String site,
			String latitude, String longitude) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.site = site;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Column(name = "nome")
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "endereco")
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "telefone")
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "site")
	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	@Column(name = "latitude")
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude")
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HoteisId))
			return false;
		HoteisId castOther = (HoteisId) other;

		return ((this.getNome() == castOther.getNome()) || (this.getNome() != null
				&& castOther.getNome() != null && this.getNome().equals(
				castOther.getNome())))
				&& ((this.getEndereco() == castOther.getEndereco()) || (this
						.getEndereco() != null
						&& castOther.getEndereco() != null && this
						.getEndereco().equals(castOther.getEndereco())))
				&& ((this.getTelefone() == castOther.getTelefone()) || (this
						.getTelefone() != null
						&& castOther.getTelefone() != null && this
						.getTelefone().equals(castOther.getTelefone())))
				&& ((this.getSite() == castOther.getSite()) || (this.getSite() != null
						&& castOther.getSite() != null && this.getSite()
						.equals(castOther.getSite())))
				&& ((this.getLatitude() == castOther.getLatitude()) || (this
						.getLatitude() != null
						&& castOther.getLatitude() != null && this
						.getLatitude().equals(castOther.getLatitude())))
				&& ((this.getLongitude() == castOther.getLongitude()) || (this
						.getLongitude() != null
						&& castOther.getLongitude() != null && this
						.getLongitude().equals(castOther.getLongitude())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNome() == null ? 0 : this.getNome().hashCode());
		result = 37 * result
				+ (getEndereco() == null ? 0 : this.getEndereco().hashCode());
		result = 37 * result
				+ (getTelefone() == null ? 0 : this.getTelefone().hashCode());
		result = 37 * result
				+ (getSite() == null ? 0 : this.getSite().hashCode());
		result = 37 * result
				+ (getLatitude() == null ? 0 : this.getLatitude().hashCode());
		result = 37 * result
				+ (getLongitude() == null ? 0 : this.getLongitude().hashCode());
		return result;
	}

}
