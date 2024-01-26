package sub6;

public class SQL {
	public static final String INSERT_USER = "insert into `user2` values(?,?,?,?)";
	public static final String SELECT_USERS = "select * from `user2`";
	public static final String SELECT_USER = "select * from `user2` where `uid` = ?";
	public static final String UPDATE_USER = "update `user2` set "
			+ "`name`=?,"
			+ "`birth`=?,"
			+ "`addr`=? "
			+ "where `uid` = ?";
	public static final String DELETE_USER = "delete from `user2` where `uid` = ?";
}
