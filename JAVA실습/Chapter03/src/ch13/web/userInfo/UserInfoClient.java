package ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserName("LEE");
		userinfo.setUserId("QQQQ");
		userinfo.setPassword("qwer123");
		
		UserInfoDao userInfoDao = null;
		
		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		else{
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userinfo);
		userInfoDao.updateUserInfo(userinfo);
		userInfoDao.deleteUserInfo(userinfo);
	}

}
