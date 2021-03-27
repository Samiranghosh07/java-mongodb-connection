package packagedemo1;

import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;  
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  


public class dropCollection {

	public static void main(String[] args) {
		
		
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      MongoDatabase database = mongo.getDatabase("test");  
	      MongoCollection<Document> collection = database.getCollection("sampleCollection");
	      System.out.println("Collection sampleCollection selected successfully"); 
	      collection.drop(); 
	      System.out.println("Collection dropped successfully");

	}

}
