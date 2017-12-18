package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 */

//use database in this class
		ConnectDB connectDB = new ConnectDB();
		ArrayList<String> market = new ArrayList<>();
		market.add("Fish");
		market.add("Vegitables");
		market.add("Hardware");
		market.add("Furnitures");
		market.add("HouseHold products");
		market.add("Fruits");
		market.add("Tech");

		int nuMarketmOGrosery = market.size();
		market.remove("Fruits");

		boolean containsPeople= market.contains("HouseHold Products");

		//connectDB.InsertDataFromArryToMySql(market ,"Market list","Market");
		connectDB.readDataBase("Market list", "Maket");

		Iterator<String> it = market.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (String s : market) {
			System.out.println(s);
		}
	}
}
