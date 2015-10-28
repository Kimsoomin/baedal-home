package baedalOrder;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import baedalLogin.LoginDAO;
import global.Constants;
import global.DAO;
import global.DatabaseFactory;
import global.Vendor;

public class OrderDAO extends DAO{
	private Connection con;
	private Statement stmt;
	private ResultSet res;
	
	
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	
	public OrderDAO() {
	con = DatabaseFactory.getDatabase(Vendor.ORACLE, Constants.ORACLE_ID, Constants.ORACLE_PASSWORD).getConnection();
	}
	
	@Override
	public void selectOrderMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectOrderMenu() {
	
		
	}


}
