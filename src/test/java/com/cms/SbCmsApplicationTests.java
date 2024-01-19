//package com.cms;
//
//import static org.testng.Assert.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cms.BEAN.Customer;
//import com.cms.DAO.CustomerDAO;
//import com.cms.controller.cmscontroller;
//
//@SpringBootTest
//class SbCmsApplicationTests {
//    @Autowired
//
//    cmscontroller controller;
//    CustomerDAO dao;
//    Customer customer;
//     String insert;
//        String update;
//        String delete;
//        String result;
//        String result1;
//    List<Customer> list = new ArrayList<Customer>();
//    List<Customer> list1 = new ArrayList<Customer>();
//    Customer c = new Customer(11, "Jeyandhan","jey@gmail.com", 98765862, "Rajapalayam");
//    Customer c1 = new Customer(12, "Sara","sara@gmail.com", 98645862, "Chennai");
//    Customer c2;
//    Customer c3;
//
////    @Test
////    @Order(1)
////    void contextLoads() {
////
////    }
//
//    @Test
//    @Order(1)
//    void testPerformInsert() {
//        insert = "Inserted";
//        result = controller.insert(c);
//        assertEquals(insert, result);
//    }
//
//    @Test
//    @Order(2)
//    void testPerformUpdate() {
//        update = "Updated";
//        result = controller.update(c1);
//        assertEquals(update, result);
//    }
//    @Test
//    @Order(3)
//    void testPerformDelete() {
//        delete="Deleted";
//        result=controller.delete(11);
//        result1=controller.delete(12);
//        assertEquals(delete,result);
//    }
//    
////    @Test
////    @Order(5)
////    void testGetAllCustomerDetails() {
////        list=controller.viewAllCustomer();
////        c2 = new Customer(122, "Dom", "Dom@gmail.com", 98763345, "madurai");
////        c3 = new Customer(123,"Mahesh", "mahesh@gmail.com", 98764345, "sivakasi");
////        list1.add(c2);
////        list1.add(c3);
////        list.equals(list1);
////    }
//
//}