package question37;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB接続用クラス
 *
 */
public class DbAccess {

	/**接続**/
	protected Connection con = null;
	/**ステートメント**/
	protected Statement stmt = null;
	/**結果セット**/
	protected ResultSet rset = null;


	/**
	 * DB接続メソッド
	 *
	 */
	protected void openDB() {

		//ユーザ名
		String user = "root";
		//パスワード
		String pass = "mizuking0";
		//データベース名
		String database = "jinkai";

		try {
			//
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
					+ database
					+"?serverTimezone=JST&useSSL=false" ,user,pass);
			//自動コミットをoffに
			con.setAutoCommit(false);
			//ステートメントの作成
			stmt = con.createStatement();
		} catch (SQLException e) {
			System.out.println("DB接続エラー:" + e.getMessage());
			//データベースアクセスをクローズする
			closeDB();
		}
	}


	/**
	 *
	 */
	protected void closeDB() {

		try {

			if(rset != null) {
				rset.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(con != null) {
				con.close();
			}

		} catch (SQLException e) {
			System.out.println("DB接続エラー:" + e.getMessage());
		}

	}






}
