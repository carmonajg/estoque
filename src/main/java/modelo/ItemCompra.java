package modelo;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemCompra {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal quantidade;
	private BigDecimal valorUnitario;
	private StatusItemCompra status = StatusItemCompra.PENDENTE;
	@ManyToOne
	private PedidoCompra pedidoCompra;
	@ManyToOne
	private MovimentoCompra movimentoCompra;
	
	@Override
	public boolean equals(Object obj) {
		ItemCompra other = (ItemCompra) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public StatusItemCompra getStatus() {
		return status;
	}

	public void setStatus(StatusItemCompra status) {
		this.status = status;
	}
	
}