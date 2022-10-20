package com.santi.StudentDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.santi.util.JDBCUtil;


public class BaseDao {
	// 使用 DbUtils 操作数据库
	private QueryRunner queryRunner = new QueryRunner();

	/***
	 * 执行： Insert\Update\Delete 语句
	 * 
	 * @param sql  执行的 sql 语句
	 * @param args sql 对应的参数值
	 * @return 如果返回 0,说明执行失败;返回其他表示影响的行数
	 */
	public int executeUpdate(String sql, Object... args) {
		Connection connection = JDBCUtil.getConnection();
		try {
			return queryRunner.update(connection, sql, args);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			JDBCUtil.commit();
		}
	}

	/***
	 * 查询返回一个 javaBean 的 sql 语句 **
	 * 
	 * @param cls  返回的对象类型 *
	 * @param sql  执行的 sql 语句
	 * @param args sql 对应的参数值 *
	 * @param <T>  返回的类型的泛型 * @return
	 */
	public <T> T executeQueryForObject(Class<T> cls, String sql, Object... args) {
		Connection connection = JDBCUtil.getConnection();
		try {
			return queryRunner.query(connection, sql, new BeanHandler<T>(cls), args);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			JDBCUtil.commit();
		}
	}

	/***
	 * 查询返回多个 javaBean 的 sql 语句 **
	 * 
	 * @param cls  返回的对象类型 *
	 * @param sql  执行的 sql 语句
	 * @param args sql 对应的参数值 *
	 * @param <T>  返回的类型的泛型 *
	 * @return
	 */
	public <T> List<T> executeQueryForList(Class<T> cls, String sql, Object... args) {
		Connection connection = JDBCUtil.getConnection();
		try {
			return queryRunner.query(connection, sql, new BeanListHandler<T>(cls), args);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			JDBCUtil.commit();
		}
	}

	/***
	 * 查询返回多个 javaBean 的 sql 语句 **
	 * 
	 * @param cls  返回的对象类型 *
	 * @param sql  执行的 sql 语句
	 * @param args sql 对应的参数值 *
	 * @param <T>  返回的类型的泛型 *
	 * @return
	 */
	public Object executeQueryForSingleValue(String sql, Object... args) {
		Connection connection = JDBCUtil.getConnection();
		try {
			return queryRunner.query(connection, sql, new ScalarHandler(), args);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			JDBCUtil.commit();
		}
	}
	
	/***
	 * 查询返回多个 javaBean 的 sql 语句 **
	 * 
	 * @param cls  返回的对象类型 *
	 * @param sql  执行的 sql 语句
	 * @param args sql 对应的参数值 *
	 * @param <T>  返回的类型的泛型 *
	 * @return
	 */
	public List<Map<String, Object>> executeQueryForMap(String sql, Object... args) {
		Connection connection = JDBCUtil.getConnection();
		try {
			return queryRunner.query(connection, sql, new MapListHandler(), args);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			JDBCUtil.commit();
		}
	}
}
