package opendata.business;

// Generated 01/12/2013 11:24:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CtmgranderecifeLinhaparadatrajetoDado generated by hbm2java
 */
@Entity
@Table(name = "ctmgranderecife_linhaparadatrajeto_dado", catalog = "opendata")
public class CtmgranderecifeLinhaparadatrajetoDado implements
		java.io.Serializable {

	private CtmgranderecifeLinhaparadatrajetoDadoId id;

	public CtmgranderecifeLinhaparadatrajetoDado() {
	}

	public CtmgranderecifeLinhaparadatrajetoDado(
			CtmgranderecifeLinhaparadatrajetoDadoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "nomeLinha", column = @Column(name = "NOME_LINHA")),
			@AttributeOverride(name = "latitude", column = @Column(name = "LATITUDE")),
			@AttributeOverride(name = "longitude", column = @Column(name = "LONGITUDE")),
			@AttributeOverride(name = "codigoSentido", column = @Column(name = "CODIGO_SENTIDO")),
			@AttributeOverride(name = "nomeItinerario", column = @Column(name = "NOME_ITINERARIO")),
			@AttributeOverride(name = "itinerarioProvisorioAPartirDe", column = @Column(name = "ITINERARIO_PROVISORIO_A_PARTIR_DE")),
			@AttributeOverride(name = "itinerarioProvisorioDataInicio", column = @Column(name = "ITINERARIO_PROVISORIO_DATA_INICIO")),
			@AttributeOverride(name = "itinerarioProvisorioDataFim", column = @Column(name = "ITINERARIO_PROVISORIO_DATA_FIM")),
			@AttributeOverride(name = "codigoParada", column = @Column(name = "CODIGO_PARADA")),
			@AttributeOverride(name = "logradouro", column = @Column(name = "LOGRADOURO")),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO")),
			@AttributeOverride(name = "sentido", column = @Column(name = "SENTIDO")),
			@AttributeOverride(name = "ordemTpr", column = @Column(name = "ORDEM_TPR")),
			@AttributeOverride(name = "ordemPrt", column = @Column(name = "ORDEM_PRT")),
			@AttributeOverride(name = "codigoLinha", column = @Column(name = "CODIGO_LINHA")) })
	public CtmgranderecifeLinhaparadatrajetoDadoId getId() {
		return this.id;
	}

	public void setId(CtmgranderecifeLinhaparadatrajetoDadoId id) {
		this.id = id;
	}

}
