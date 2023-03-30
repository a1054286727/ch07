package sec01.ex01;

public class MemberDAO {

	
	privatestaticfinal String driver = "oracle.jdbc.driver.OracleDriver";

	privatestaticfinal String url = "jdbc:oracle:thin:@localhost:1521:XE";

	privatestaticfinal String user = "scott";

	privatestaticfinal String pwd = "tiger";

	private Connection con;

	private Statement stmt;
	
	
	
}
