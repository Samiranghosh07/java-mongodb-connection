package packagedemo1;

import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 


public class listAllCollections {

	public static void main(String[] args) {
		
		
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      MongoDatabase database = mongo.getDatabase("test"); 
	   
	      for (String name : database.listCollectionNames()) { 
	         System.out.println(name); 
	      } 

	}

}
