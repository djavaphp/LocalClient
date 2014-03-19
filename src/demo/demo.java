package demo;

import com.sales.wb.service.GetAllBillBookDtlResp;
import com.sales.wb.service.imp.MasterServiceImpService;




public class demo {

	public static void main(String ar[]){
			/*stub genrated from MasterServiceImpservice. to use Apache Cxf. Select Project -> Properties 
			-> Project Facate -> select cxf , dynamic web  and , java -> choose server.          

*/		  //Create a new simple Communication Party and set mandatory attributes

		  MasterServiceImpService party = new MasterServiceImpService();

		  //Do something with the response

		  System.out.println(  party.getMasterServiceImpPort().helloworld() );
		  GetAllBillBookDtlResp resp = party.getMasterServiceImpPort().getAllBillBookdtl();
		  System.out.println(resp.getBillBookList().size());
		  System.out.println(resp.getResp().getRespMsg());

	}
}
