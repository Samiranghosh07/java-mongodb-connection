package packagedemo1;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;


public class retrieveAllDocumnets {

	public static void main(String[] args) {
		
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		MongoDatabase database = mongo.getDatabase("test");
		
		// Retrieving a collection
				MongoCollection<Document> collection = database.getCollection("sampleCollection");
				System.out.println("Collection sampleCollection selected successfully");
				Document document1 = new Document("title", "Elasticsearch")
				.append("description", "database")
				.append("likes", 120)
				.append("url", "http://www.elasticsearch.com/es/")
				.append("by", "develk");
				Document document2 = new Document("title", "CouchDB")
				.append("description", "database")
				.append("likes", 200)
				.append("url", "http://www.couchdb.com/cdb/")
				.append("by", "devcodb");
				List<Document> list = new ArrayList<Document>();
				list.add(document1);
				list.add(document2);
				collection.insertMany(list);
				
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
