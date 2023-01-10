package application;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("========== TEST 1 ====== FIND BY ID");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller);
		
		System.out.println("=========== TEST 2 ========= FIND BY DEPARTMENT");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.stream().forEach(System.out::println);
	}

}
