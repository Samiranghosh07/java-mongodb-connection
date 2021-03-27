package packagedemo1;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.MongoClient;


public class insertDocument {

	public static void main(String[] args) {
		
		// Creating a Mongo client
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
		// Accessing the database
		MongoDatabase database = mongo.getDatabase("test");
		
		// Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		System.out.println("Collection sampleCollection selected successfully");
		Document document = new Document("title", "Neo4j")
		.append("description", "database")
		.append("likes", 50)
		.append("url", "http://www.sampledatabase.com/neo4j/")
		.append("by", "devneo4j");
		
		//Inserting document into the collection
		
		collection.insertOne(document);
		System.out.println("Document inserted successfully");

	}

}
