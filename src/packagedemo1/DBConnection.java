package packagedemo1;

import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 


public class DBConnection {

	public static void main(String[] args) {
		
        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
        
        // Accessing the database 
        
        MongoDatabase database = mongo.getDatabase("test"); 
        System.out.println("Connected to the database successfully");
        
        }

}
