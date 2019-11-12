package dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void increaseMoney(Integer id, Double money) {

		String sql = "update `account` set money = money + ? where id = ?";
		super.getJdbcTemplate().update(sql, money, id);
	}

	@Override
	public void decreaseMoney(Integer id, Double money) {
		String sql = "update `account` set money = money - ? where id = ?";
		super.getJdbcTemplate().update(sql, money, id);

	}

}
