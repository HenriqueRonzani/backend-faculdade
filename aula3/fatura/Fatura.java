public class Fatura
{
	private String numero;
	private String descricao;
	private Integer quantidade;
	private Double precoPorItem;
	
	public Fatura(String numero, String descricao, Integer quantidade, Double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoPorItem = preco;
	}

	public String getNumero() {
    return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoPorItem() {
		return precoPorItem;
	}

	public void setPrecoPorItem(Double precoPorItem) {
		this.precoPorItem = precoPorItem;
	}

	public Double getTotalFatura() {
		Double total = this.precoPorItem * this.quantidade;
		if (total < 0) {
			return total;
		}
		return 0.0;
	}
}
