package application;
import java.util.Date;
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
		
		System.out.println("\n=========== TEST 2 ========= FIND BY DEPARTMENT");
		Department department = new Department(2, null);
		List<Seller> listById = sellerDao.findByDepartment(department);
		listById.stream().forEach(System.out::println);
		
		System.out.println("\n=========== TEST 3 ========= FIND ALL");
		List<Seller> listAll = sellerDao.findAll();
		listAll.stream().forEach(System.out::println);
		
		/*System.out.println("\n=========== TEST 4 ========= INSERT SELLER");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000, department);
		sellerDao.insert(newSeller);
		System.out.println("Data inserted. New ID: " + newSeller.getId());*/
		
		System.out.println("\n=========== TEST 5 ========= UPDATE SELLER");
		seller.setId(1);
		seller.setName("Bruce Black");
		seller.setDepartment(department);
		sellerDao.update(seller);
		
		
	}

}
