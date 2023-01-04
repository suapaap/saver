package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class ProductDAO implements DAO {
	
	//DB와 연결
	private Connection conn;

	//SQL 구문을 실행시키는 기능을 갖는 객체
	private PreparedStatement pst;
	private String query=""; //query구문을 저장
	
	public ProductDAO() {
		DatabaseConnerctor dbc = DatabaseConnerctor.getInstance();
		conn = dbc.getConnection();
	}
	//sql 구문 처리

	@Override
	public int insert(Product product) {
		query = "insert into product (pname, price, madeby) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("입력 오류!!");
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<Product> selectList() {
		query = "select * from product order by pno desc";
		List<Product> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(
						new Product(
								rs.getInt("pno"),
								rs.getString("pname"),
								rs.getInt("price"),
								rs.getString("regdate"),
								rs.getString("madeby")
						));
			}
			return list;
		} catch (SQLException e) {
			System.out.println("출력 오류!!");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product selectOne(int pno) {
		query = "select * from product where pno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Product (rs.getInt("pno"), 
						rs.getString("pname"), rs.getInt("price"), rs.getString("regdate"), rs.getString("madeby"));
			}
		} catch (SQLException e) {
			System.out.println("출력 오류!!");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(Product product) {
		query = "update product set pname=?,price=?,regdate=now(),madeby=?"
				+ "where pno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			pst.setInt(4, product.getPno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("수정 오류!!");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int pno) {
		query = "delete from product where pno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("삭제 오류!!");
			e.printStackTrace();
		}
		return 0;
	}
}
