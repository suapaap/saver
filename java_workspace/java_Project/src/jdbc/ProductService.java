package jdbc;

import java.util.List;

public class ProductService implements Service {

	private DAO dao;
	public ProductService() {
		dao = new ProductDAO();
	}
	@Override
	public int register(Product product) {
		System.out.println("서비스 성공!!");
		return dao.insert(product);
	}
	@Override
	public List<Product> list() {
		System.out.println("list를 가져왔습니다!!");
		return dao.selectList();
	}
	@Override
	public Product detail(int pno) {
		System.out.println("상세정보를 가져왔습니다!!");
		return dao.selectOne(pno);
	}
	@Override
	public int edit(Product product) {
		System.out.println("수정 완료!!");
		return dao.update(product);
	}
	@Override
	public int remove(int pno) {
		System.out.println("삭제 완료!!");
		return dao.delete(pno);
	}
}
