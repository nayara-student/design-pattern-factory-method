
public class IndustriaNutrion extends IndustriaMateriaPrima {
	public IndustriaNutrion(String uf, String descricao) {
		this.uf = uf;
		this.descricao = descricao;
		System.out.println("Pedido de "+descricao+" cadastrado na Industria Calbras \nRegiao de entrega: "+uf+"\n");	
	}
}
