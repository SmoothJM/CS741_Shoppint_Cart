package cart.database;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
/*
 * This is a database utils class.
 * This class includes all properties of interaction between dao layer and database.
 * And this class uses the connection pool to connect database.
 *
 * @author Jianmu Deng
 * created on Dec 10, 2018
 */
public class DataSourceUtils {
private static BasicDataSource dbs = new BasicDataSource();
	
	static{
	dbs.setDriverClassName("com.mysql.jdbc.Driver");
	dbs.setUrl("jdbc:mysql://localhost:3306/cs741");
	dbs.setUsername("root");
	dbs.setPassword("deng");
	
	dbs.setMaxActive(50);
	dbs.setMaxIdle(30);
	dbs.setMinIdle(10);
	dbs.setInitialSize(20);
	}
	public static DataSource getBasicDataSource(){
		return dbs;
	}
}
