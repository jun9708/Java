package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.CustomerDTO;
import com.mysql.cj.protocol.Resultset;

public class CustomerDAO extends DBHelper {
	//싱글톤
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}



	//CRUD메서드

	//회원등록
	public void insertCustomer(CustomerDTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, dto.getCustId());
			psmt.setString(2, dto.getCustName());
			psmt.setString(3, dto.getCustHp());
			psmt.setString(4, dto.getCustAddr());
			psmt.executeUpdate();
			close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//회원 조회
	public CustomerDTO selectCustomer(String custId) {
		try {

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void selectCustomers() {
		try {

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateCustomer() {
		try {

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteCustomer() {
		try {

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
