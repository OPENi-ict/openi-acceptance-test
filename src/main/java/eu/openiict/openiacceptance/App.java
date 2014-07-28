package eu.openiict.openiacceptance;

import com.wordnik.client.ApiException;
import com.wordnik.client.api.CloudletsApi;
import com.wordnik.client.model.Cloudlet;
import com.wordnik.client.model.CloudletStatus;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ApiException
    {
      System.out.println( "Hello World!" );
        
        
      final CloudletsApi cloudletsAPI = new CloudletsApi();
      
      final Cloudlet c = new Cloudlet();
      
      c.setAlias   ( "dmc"       );
      c.setUsername( "dmccarthy" );
      
      
      System.out.println( "Cloudlet     : " + c );
      
      final CloudletStatus status = cloudletsAPI.createCloudlet( c );
      
     // System.out.println( "status     : " + status                 );
      System.out.println( "cloudlet id: " + status.getValue());
      //System.out.println( "result     : " + status.getData());
    }
}
