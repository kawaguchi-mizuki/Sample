package question37;

import java.sql.SQLException;

/**
 * SQL実行クラス
 *
 */
public class SqlExe extends DbAccess {

	public void dispItemList() {
		//DB接続
		openDB();
		//SQL文を設定
		String sql = "select item_table.ITEMID,item_table.ITEMNM,unit_table.UNITNM,sales_table.SALES_NM from item_table inner join unit_table on item_table.UNITID = unit_table.UNITID inner join sales_table on item_table.SALES_KEY = sales_table.SALES_KEY order by ITEMID;";

		try{
			//SQL実行
			rset = stmt.executeQuery(sql);
			//結果セットから値を取得し表示
			while(rset.next()) {
				System.out.println(rset.getInt(1) + " : "
				+ rset.getString(2) + " ( " + rset.getString(3) + " )" + rset.getString(4));
			}
		}catch(SQLException e) {
			System.out.println("SQLエラー:" + e.getMessage());
		}
		finally {
			//DB切断
			closeDB();
		}
	}


}
