package com.santi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JDBCUtil {
	final static String CLASS_NAME = "com.mysql.jdbc.Driver";// 连接字符串
	final static String URL = "jdbc:mysql://localhost:3306/studnetgrade";// 连接字符串
	final static String USERNAME = "root";// 用户名
	final static String pwd = "2770085055";// 数据库密码
//	javax.sql.DataSource 主要是用来获取数据库连接 Connetion的。
	private static DataSource dataSource;
//	保证Connection对象是同一个
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
//	加载驱动
	static {
		try {
////			方法二
//			Properties properties = new Properties();
//			properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream(URL));
//			DataSource ds = DruidDataSourceFactory.createDataSource(properties);
//			方法一
			Class.forName(CLASS_NAME);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	建立连接
	public static Connection getConnection() {
		Connection con = threadLocal.get();
		if (con == null) {
			try {
				con = DriverManager.getConnection(URL, USERNAME, pwd);
				// 将连接对象放到线程共享对象
				threadLocal.set(con);
//				设置自动提交
				con.setAutoCommit(false);
//			con=dataSource.getConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}

//	提交
	public static void commit() {
		Connection con = threadLocal.get();
		if (con != null) {
			try {
				con.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//	回滚
	public static void rollback() {
		Connection con = threadLocal.get();
		if (con != null) {
			try {
				con.rollback();
				;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//	关闭
	public static void release() {
		Connection con = threadLocal.get();
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		threadLocal.remove();
	}

//	两个关闭
	public static void cloes(Connection con, PreparedStatement ps) {
		try {
			if (con != null)
				con.close();
			if (ps != null)
				ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	两个关闭
	public static void cloess(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if (con != null)
				con.close();
			if (ps != null)
				ps.close();
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
