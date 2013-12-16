package opendata.business;

// Generated 01/12/2013 11:24:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BarBaresrecifeId generated by hbm2java
 */
@Embeddable
public class BarBaresrecifeId implements java.io.Serializable {

	private String nome;
	private String endereco;
	private String telefone;
	private String especialidade;
	private String site;
	private String email;
	private String column7;

	public BarBaresrecifeId() {
	}

	public BarBaresrecifeId(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public BarBaresrecifeId(String nome, String endereco, String telefone,
			String especialidade, String site, String email, String column7) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.especialidade = especialidade;
		this.site = site;
		this.email = email;
		this.column7 = column7;
	}

	@Column(name = "nome", nullable = false)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "endereco", nullable = false)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "telefone", nullable = false)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "especialidade")
	public String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Column(name = "site")
	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "column_7")
	public String getColumn7() {
		return this.column7;
	}

	public void setColumn7(String column7) {
		this.column7 = column7;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BarBaresrecifeId))
			return false;
		BarBaresrecifeId castOther = (BarBaresrecifeId) other;

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
				&& ((this.getEspecialidade() == castOther.getEspecialidade()) || (this
						.getEspecialidade() != null
						&& castOther.getEspecialidade() != null && this
						.getEspecialidade()
						.equals(castOther.getEspecialidade())))
				&& ((this.getSite() == castOther.getSite()) || (this.getSite() != null
						&& castOther.getSite() != null && this.getSite()
						.equals(castOther.getSite())))
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())))
				&& ((this.getColumn7() == castOther.getColumn7()) || (this
						.getColumn7() != null && castOther.getColumn7() != null && this
						.getColumn7().equals(castOther.getColumn7())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNome() == null ? 0 : this.getNome().hashCode());
		result = 37 * result
				+ (getEndereco() == null ? 0 : this.getEndereco().hashCode());
		result = 37 * result
				+ (getTelefone() == null ? 0 : this.getTelefone().hashCode());
		result = 37
				* result
				+ (getEspecialidade() == null ? 0 : this.getEspecialidade()
						.hashCode());
		result = 37 * result
				+ (getSite() == null ? 0 : this.getSite().hashCode());
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getColumn7() == null ? 0 : this.getColumn7().hashCode());
		return result;
	}

}