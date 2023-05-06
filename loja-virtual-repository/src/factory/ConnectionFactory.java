package factory;
import java.sql.Connection;
import com.mchange.v2.c3p0.*;
import java.sql.SQLException;
import javax.sql.DataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/loja_virtual?serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("1234");
		
		comboPooledDataSource.setMaxPoolSize(15); // limita a quanitdade de conexoes por pool
		
		this.dataSource = comboPooledDataSource;
	}
	public Connection conn() throws SQLException{
		
		return this.dataSource.getConnection() ;
	}
}
