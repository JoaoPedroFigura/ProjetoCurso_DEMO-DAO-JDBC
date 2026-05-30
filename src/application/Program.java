package application;

import Dao.DaoFactory;
import Dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    static void main() {

        System.out.println("=== TEST 1: seler findById ===");

        SellerDao sellerDao = new DaoFactory().createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);


    }



}
