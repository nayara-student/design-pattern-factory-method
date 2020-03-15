
public class Fornecedora extends EmpresaFornecedora {
	@Override
	public IndustriaMateriaPrima criarPedido(String uf, String descricao) {
		if(descricao.equals("calcario") && uf.equals("GO")) {
			return new IndustriaCalbras(uf, descricao);
		}else if (descricao.equals("gesso") && uf.equals("GO")) {
			return new IndustriaNutrion(uf, descricao);
		}else if (descricao.equals("calcario") && uf.equals("TO")) {
			return new IndustriaHipercal(uf, descricao);
		}else if (descricao.equals("gesso") && uf.equals("TO")) {
		return new IndustriaConsube(uf, descricao);
		}
		return null;
	}
	

}
