package packagedemo1;

import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;

public class createCollection {

	public static void main(String[] args) {
		
		// Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      
	    //Accessing the database 
	      MongoDatabase database = mongo.getDatabase("test");  
	      
	      //Creating a collection 
	      
	      database.createCollection("sampleCollection"); 
	      System.out.println("Collection created successfully"); 

	}

}
