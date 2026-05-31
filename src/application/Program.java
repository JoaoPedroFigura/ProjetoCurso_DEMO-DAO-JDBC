package application;

import Dao.DaoFactory;
import Dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    static void main() {

        System.out.println("=== TEST 1: seler findById ===");

        SellerDao sellerDao = new DaoFactory().createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("=== TEST 2: seler findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: seler findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }
        System.out.println("=== TEST 4: seler findAll ===");
        Seller newSeller = new Seller(null, "Greg", "gred@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());

        System.out.println("=== TEST 5: seler Update ===");

        seller = sellerDao.findById(1);
        seller.setName("Martha Whaine");
        sellerDao.update(seller);
        System.out.println("Update completed");

    }

}
