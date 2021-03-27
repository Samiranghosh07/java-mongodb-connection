package packagedemo1;

import com.mongodb.client.FindIterable; 
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 
import com.mongodb.client.model.Filters; 
import com.mongodb.client.model.Updates; 
import java.util.Iterator; 
import org.bson.Document;  
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 


public class updateDocuments {

	public static void main(String[] args) {
		
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		MongoDatabase database = mongo.getDatabase("test");
		
		// Retrieving a collection 
	      MongoCollection<Document> collection = database.getCollection("sampleCollection");
	      System.out.println("Collection myCollection selected successfully"); 
	      
	      collection.updateOne(Filters.eq("title", 1), Updates.set("likes", 150));       
	      System.out.println("Document update successfully...");  
	      
	      // Retrieving the documents after updation 
	      // Getting the iterable object
	      FindIterable<Document> iterDoc = collection.find(); 
	      int i = 1; 
	      // Getting the iterator 
	      Iterator it = iterDoc.iterator(); 
	      while (it.hasNext()) {  
	         System.out.println(it.next());  
	         i++; 
	      }     

	}

}
