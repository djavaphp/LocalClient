
package com.sales.wb.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import com.sales.wb.service.imp.MasterServiceImpService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.13
 * 2014-03-19T14:33:30.626+05:30
 * Generated source version: 2.6.13
 * 
 */
public final class MasterService_MasterServiceImpPort_Client {

    private static final QName SERVICE_NAME = new QName("http://imp.service.wb.sales.com/", "MasterServiceImpService");

    private MasterService_MasterServiceImpPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = MasterServiceImpService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        MasterServiceImpService ss = new MasterServiceImpService(wsdlURL, SERVICE_NAME);
        MasterService port = ss.getMasterServiceImpPort();  
        
        {
        System.out.println("Invoking createEmployee...");
        com.sales.wb.service.EmployeeMasterVO _createEmployee_arg0 = new com.sales.wb.service.EmployeeMasterVO();
        _createEmployee_arg0.setEmpID(Long.valueOf(6000737287289661158l));
        _createEmployee_arg0.setEmpName("EmpName1781058575");
        _createEmployee_arg0.setIsActive(Boolean.valueOf(true));
        com.sales.wb.service.Resp _createEmployee__return = port.createEmployee(_createEmployee_arg0);
        System.out.println("createEmployee.result=" + _createEmployee__return);


        }
        {
        System.out.println("Invoking helloworld...");
        java.lang.String _helloworld__return = port.helloworld();
        System.out.println("helloworld.result=" + _helloworld__return);


        }
        {
        System.out.println("Invoking getRetailerDtl...");
        com.sales.wb.service.GetRetailerResp _getRetailerDtl__return = port.getRetailerDtl();
        System.out.println("getRetailerDtl.result=" + _getRetailerDtl__return);


        }
        {
        System.out.println("Invoking getCompanyDetail...");
        com.sales.wb.service.GetCompanyResp _getCompanyDetail__return = port.getCompanyDetail();
        System.out.println("getCompanyDetail.result=" + _getCompanyDetail__return);


        }
        {
        System.out.println("Invoking createArea...");
        com.sales.wb.service.AreaVO _createArea_arg0 = new com.sales.wb.service.AreaVO();
        _createArea_arg0.setAreaCode("AreaCode658398729");
        _createArea_arg0.setAreaID(Long.valueOf(1346655016510072416l));
        _createArea_arg0.setAreaName("AreaName-2146223770");
        java.util.List<com.sales.wb.service.RetailerVO> _createArea_arg0RetailerList = new java.util.ArrayList<com.sales.wb.service.RetailerVO>();
        com.sales.wb.service.RetailerVO _createArea_arg0RetailerListVal1 = new com.sales.wb.service.RetailerVO();
        com.sales.wb.service.AreaVO _createArea_arg0RetailerListVal1AreaVO = new com.sales.wb.service.AreaVO();
        _createArea_arg0RetailerListVal1AreaVO.setAreaCode("AreaCode-761012666");
        _createArea_arg0RetailerListVal1AreaVO.setAreaID(Long.valueOf(263016552175191624l));
        _createArea_arg0RetailerListVal1AreaVO.setAreaName("AreaName1017072083");
        java.util.List<com.sales.wb.service.RetailerVO> _createArea_arg0RetailerListVal1AreaVORetailerList = new java.util.ArrayList<com.sales.wb.service.RetailerVO>();
        _createArea_arg0RetailerListVal1AreaVO.getRetailerList().addAll(_createArea_arg0RetailerListVal1AreaVORetailerList);
        _createArea_arg0RetailerListVal1.setAreaVO(_createArea_arg0RetailerListVal1AreaVO);
        _createArea_arg0RetailerListVal1.setIsActive(Boolean.valueOf(true));
        _createArea_arg0RetailerListVal1.setRetailerID(Long.valueOf(-6094939172299968585l));
        _createArea_arg0RetailerListVal1.setRetailerName("RetailerName237414801");
        _createArea_arg0RetailerListVal1.setShopAddress("ShopAddress1610559827");
        _createArea_arg0RetailerListVal1.setShopName("ShopName-1468542527");
        _createArea_arg0RetailerListVal1.setShopPhoneNumber("ShopPhoneNumber273690215");
        _createArea_arg0RetailerList.add(_createArea_arg0RetailerListVal1);
        _createArea_arg0.getRetailerList().addAll(_createArea_arg0RetailerList);
        com.sales.wb.service.Resp _createArea__return = port.createArea(_createArea_arg0);
        System.out.println("createArea.result=" + _createArea__return);


        }
        {
        System.out.println("Invoking updateRetailer...");
        com.sales.wb.service.RetailerVO _updateRetailer_arg0 = new com.sales.wb.service.RetailerVO();
        com.sales.wb.service.AreaVO _updateRetailer_arg0AreaVO = new com.sales.wb.service.AreaVO();
        _updateRetailer_arg0AreaVO.setAreaCode("AreaCode1956921341");
        _updateRetailer_arg0AreaVO.setAreaID(Long.valueOf(1699214501646480117l));
        _updateRetailer_arg0AreaVO.setAreaName("AreaName1261281820");
        java.util.List<com.sales.wb.service.RetailerVO> _updateRetailer_arg0AreaVORetailerList = new java.util.ArrayList<com.sales.wb.service.RetailerVO>();
        com.sales.wb.service.RetailerVO _updateRetailer_arg0AreaVORetailerListVal1 = new com.sales.wb.service.RetailerVO();
        com.sales.wb.service.AreaVO _updateRetailer_arg0AreaVORetailerListVal1AreaVO = new com.sales.wb.service.AreaVO();
        _updateRetailer_arg0AreaVORetailerListVal1AreaVO.setAreaCode("AreaCode294682414");
        _updateRetailer_arg0AreaVORetailerListVal1AreaVO.setAreaID(Long.valueOf(-138059899574143167l));
        _updateRetailer_arg0AreaVORetailerListVal1AreaVO.setAreaName("AreaName395037484");
        java.util.List<com.sales.wb.service.RetailerVO> _updateRetailer_arg0AreaVORetailerListVal1AreaVORetailerList = new java.util.ArrayList<com.sales.wb.service.RetailerVO>();
        _updateRetailer_arg0AreaVORetailerListVal1AreaVO.getRetailerList().addAll(_updateRetailer_arg0AreaVORetailerListVal1AreaVORetailerList);
        _updateRetailer_arg0AreaVORetailerListVal1.setAreaVO(_updateRetailer_arg0AreaVORetailerListVal1AreaVO);
        _updateRetailer_arg0AreaVORetailerListVal1.setIsActive(Boolean.valueOf(false));
        _updateRetailer_arg0AreaVORetailerListVal1.setRetailerID(Long.valueOf(8525100305060477995l));
        _updateRetailer_arg0AreaVORetailerListVal1.setRetailerName("RetailerName-215344319");
        _updateRetailer_arg0AreaVORetailerListVal1.setShopAddress("ShopAddress-194605500");
        _updateRetailer_arg0AreaVORetailerListVal1.setShopName("ShopName196198857");
        _updateRetailer_arg0AreaVORetailerListVal1.setShopPhoneNumber("ShopPhoneNumber1378861260");
        _updateRetailer_arg0AreaVORetailerList.add(_updateRetailer_arg0AreaVORetailerListVal1);
        _updateRetailer_arg0AreaVO.getRetailerList().addAll(_updateRetailer_arg0AreaVORetailerList);
        _updateRetailer_arg0.setAreaVO(_updateRetailer_arg0AreaVO);
        _updateRetailer_arg0.setIsActive(Boolean.valueOf(true));
        _updateRetailer_arg0.setRetailerID(Long.valueOf(-3433988129820950294l));
        _updateRetailer_arg0.setRetailerName("RetailerName1162143136");
        _updateRetailer_arg0.setShopAddress("ShopAddress1077760030");
        _updateRetailer_arg0.setShopName("ShopName1983064779");
        _updateRetailer_arg0.setShopPhoneNumber("ShopPhoneNumber-2111926906");
        com.sales.wb.service.Resp _updateRetailer__return = port.updateRetailer(_updateRetailer_arg0);
        System.out.println("updateRetailer.result=" + _updateRetailer__return);


        }
        {
        System.out.println("Invoking blockRetailer...");
        java.lang.Long _blockRetailer_arg0 = Long.valueOf(-4949854435212840638l);
        com.sales.wb.service.Resp _blockRetailer__return = port.blockRetailer(_blockRetailer_arg0);
        System.out.println("blockRetailer.result=" + _blockRetailer__return);


        }
        {
        System.out.println("Invoking createBillBook...");
        com.sales.wb.service.BillBookVo _createBillBook_arg0 = new com.sales.wb.service.BillBookVo();
        _createBillBook_arg0.setBillBookId(Long.valueOf(9135402739218708199l));
        _createBillBook_arg0.setBillBookNum("BillBookNum2099195016");
        _createBillBook_arg0.setEndRange("EndRange-1842843282");
        _createBillBook_arg0.setStartRange("StartRange-1069436113");
        com.sales.wb.service.Resp _createBillBook__return = port.createBillBook(_createBillBook_arg0);
        System.out.println("createBillBook.result=" + _createBillBook__return);


        }
        {
        System.out.println("Invoking blockItem...");
        java.lang.Long _blockItem_arg0 = Long.valueOf(877131516769644163l);
        com.sales.wb.service.Resp _blockItem__return = port.blockItem(_blockItem_arg0);
        System.out.println("blockItem.result=" + _blockItem__return);


        }
        {
        System.out.println("Invoking blockEmployee...");
        java.lang.Long _blockEmployee_arg0 = Long.valueOf(-8387917839711306765l);
        com.sales.wb.service.Resp _blockEmployee__return = port.blockEmployee(_blockEmployee_arg0);
        System.out.println("blockEmployee.result=" + _blockEmployee__return);


        }
        {
        System.out.println("Invoking createRetailer...");
        com.sales.wb.service.RetailerVO _createRetailer_arg0 = new com.sales.wb.service.RetailerVO();
        com.sales.wb.service.AreaVO _createRetailer_arg0AreaVO = new com.sales.wb.service.AreaVO();
        _createRetailer_arg0AreaVO.setAreaCode("AreaCode-1179715738");
        _createRetailer_arg0AreaVO.setAreaID(Long.valueOf(-2484750140330303440l));
        _createRetailer_arg0AreaVO.setAreaName("AreaName302115537");
        java.util.List<com.sales.wb.service.RetailerVO> _createRetailer_arg0AreaVORetailerList = new java.util.ArrayList<com.sales.wb.service.RetailerVO>();
        com.sales.wb.service.RetailerVO _createRetailer_arg0AreaVORetailerListVal1 = new com.sales.wb.service.RetailerVO();
        com.sales.wb.service.AreaVO _createRetailer_arg0AreaVORetailerListVal1AreaVO = new com.sales.wb.service.AreaVO();
        _createRetailer_arg0AreaVORetailerListVal1AreaVO.setAreaCode("AreaCode499986563");
        _createRetailer_arg0AreaVORetailerListVal1AreaVO.setAreaID(Long.valueOf(-7887786062393443354l));
        _createRetailer_arg0AreaVORetailerListVal1AreaVO.setAreaName("AreaName-948738700");
        java.util.List<com.sales.wb.service.RetailerVO> _createRetailer_arg0AreaVORetailerListVal1AreaVORetailerList = new java.util.ArrayList<com.sales.wb.service.RetailerVO>();
        _createRetailer_arg0AreaVORetailerListVal1AreaVO.getRetailerList().addAll(_createRetailer_arg0AreaVORetailerListVal1AreaVORetailerList);
        _createRetailer_arg0AreaVORetailerListVal1.setAreaVO(_createRetailer_arg0AreaVORetailerListVal1AreaVO);
        _createRetailer_arg0AreaVORetailerListVal1.setIsActive(Boolean.valueOf(false));
        _createRetailer_arg0AreaVORetailerListVal1.setRetailerID(Long.valueOf(-2626935445501169113l));
        _createRetailer_arg0AreaVORetailerListVal1.setRetailerName("RetailerName1133257862");
        _createRetailer_arg0AreaVORetailerListVal1.setShopAddress("ShopAddress1921733617");
        _createRetailer_arg0AreaVORetailerListVal1.setShopName("ShopName-1119113564");
        _createRetailer_arg0AreaVORetailerListVal1.setShopPhoneNumber("ShopPhoneNumber466312265");
        _createRetailer_arg0AreaVORetailerList.add(_createRetailer_arg0AreaVORetailerListVal1);
        _createRetailer_arg0AreaVO.getRetailerList().addAll(_createRetailer_arg0AreaVORetailerList);
        _createRetailer_arg0.setAreaVO(_createRetailer_arg0AreaVO);
        _createRetailer_arg0.setIsActive(Boolean.valueOf(true));
        _createRetailer_arg0.setRetailerID(Long.valueOf(830244155843584862l));
        _createRetailer_arg0.setRetailerName("RetailerName569116251");
        _createRetailer_arg0.setShopAddress("ShopAddress1401961750");
        _createRetailer_arg0.setShopName("ShopName525819372");
        _createRetailer_arg0.setShopPhoneNumber("ShopPhoneNumber1327514078");
        com.sales.wb.service.Resp _createRetailer__return = port.createRetailer(_createRetailer_arg0);
        System.out.println("createRetailer.result=" + _createRetailer__return);


        }
        {
        System.out.println("Invoking updateEmployee...");
        com.sales.wb.service.EmployeeMasterVO _updateEmployee_arg0 = new com.sales.wb.service.EmployeeMasterVO();
        _updateEmployee_arg0.setEmpID(Long.valueOf(1155233423989685625l));
        _updateEmployee_arg0.setEmpName("EmpName-548614682");
        _updateEmployee_arg0.setIsActive(Boolean.valueOf(true));
        com.sales.wb.service.Resp _updateEmployee__return = port.updateEmployee(_updateEmployee_arg0);
        System.out.println("updateEmployee.result=" + _updateEmployee__return);


        }
        {
        System.out.println("Invoking updateArea...");
        com.sales.wb.service.AreaVO _updateArea_arg0 = new com.sales.wb.service.AreaVO();
        _updateArea_arg0.setAreaCode("AreaCode-1688475242");
        _updateArea_arg0.setAreaID(Long.valueOf(-3082320604541141755l));
        _updateArea_arg0.setAreaName("AreaName1810251307");
        java.util.List<com.sales.wb.service.RetailerVO> _updateArea_arg0RetailerList = new java.util.ArrayList<com.sales.wb.service.RetailerVO>();
        com.sales.wb.service.RetailerVO _updateArea_arg0RetailerListVal1 = new com.sales.wb.service.RetailerVO();
        com.sales.wb.service.AreaVO _updateArea_arg0RetailerListVal1AreaVO = new com.sales.wb.service.AreaVO();
        _updateArea_arg0RetailerListVal1AreaVO.setAreaCode("AreaCode-1053555343");
        _updateArea_arg0RetailerListVal1AreaVO.setAreaID(Long.valueOf(-2992346085914293865l));
        _updateArea_arg0RetailerListVal1AreaVO.setAreaName("AreaName1332007113");
        java.util.List<com.sales.wb.service.RetailerVO> _updateArea_arg0RetailerListVal1AreaVORetailerList = new java.util.ArrayList<com.sales.wb.service.RetailerVO>();
        _updateArea_arg0RetailerListVal1AreaVO.getRetailerList().addAll(_updateArea_arg0RetailerListVal1AreaVORetailerList);
        _updateArea_arg0RetailerListVal1.setAreaVO(_updateArea_arg0RetailerListVal1AreaVO);
        _updateArea_arg0RetailerListVal1.setIsActive(Boolean.valueOf(false));
        _updateArea_arg0RetailerListVal1.setRetailerID(Long.valueOf(6471882322060170672l));
        _updateArea_arg0RetailerListVal1.setRetailerName("RetailerName-929448517");
        _updateArea_arg0RetailerListVal1.setShopAddress("ShopAddress212731252");
        _updateArea_arg0RetailerListVal1.setShopName("ShopName169949657");
        _updateArea_arg0RetailerListVal1.setShopPhoneNumber("ShopPhoneNumber1763759440");
        _updateArea_arg0RetailerList.add(_updateArea_arg0RetailerListVal1);
        _updateArea_arg0.getRetailerList().addAll(_updateArea_arg0RetailerList);
        com.sales.wb.service.Resp _updateArea__return = port.updateArea(_updateArea_arg0);
        System.out.println("updateArea.result=" + _updateArea__return);


        }
        {
        System.out.println("Invoking getAllEmployee...");
        com.sales.wb.service.GetEmployeeMasterResp _getAllEmployee__return = port.getAllEmployee();
        System.out.println("getAllEmployee.result=" + _getAllEmployee__return);


        }
        {
        System.out.println("Invoking getAllPaymentModes...");
        com.sales.wb.service.GetPaymentModeResp _getAllPaymentModes__return = port.getAllPaymentModes();
        System.out.println("getAllPaymentModes.result=" + _getAllPaymentModes__return);


        }
        {
        System.out.println("Invoking getAllBillBookdtl...");
        com.sales.wb.service.GetAllBillBookDtlResp _getAllBillBookdtl__return = port.getAllBillBookdtl();
        System.out.println("getAllBillBookdtl.result=" + _getAllBillBookdtl__return);


        }
        {
        System.out.println("Invoking updateBillbook...");
        com.sales.wb.service.BillBookVo _updateBillbook_arg0 = new com.sales.wb.service.BillBookVo();
        _updateBillbook_arg0.setBillBookId(Long.valueOf(-2472384957682057180l));
        _updateBillbook_arg0.setBillBookNum("BillBookNum-517422708");
        _updateBillbook_arg0.setEndRange("EndRange737630917");
        _updateBillbook_arg0.setStartRange("StartRange-376761515");
        com.sales.wb.service.Resp _updateBillbook__return = port.updateBillbook(_updateBillbook_arg0);
        System.out.println("updateBillbook.result=" + _updateBillbook__return);


        }
        {
        System.out.println("Invoking getAllItemMasterDtl...");
        com.sales.wb.service.GetItemMasterResp _getAllItemMasterDtl__return = port.getAllItemMasterDtl();
        System.out.println("getAllItemMasterDtl.result=" + _getAllItemMasterDtl__return);


        }
        {
        System.out.println("Invoking updateItem...");
        com.sales.wb.service.ItemMasterVO _updateItem_arg0 = new com.sales.wb.service.ItemMasterVO();
        _updateItem_arg0.setActive(Boolean.valueOf(false));
        _updateItem_arg0.setItemCode("ItemCode-1353552113");
        _updateItem_arg0.setItemId(Long.valueOf(-1041310843833701831l));
        _updateItem_arg0.setItemName("ItemName642767456");
        com.sales.wb.service.Resp _updateItem__return = port.updateItem(_updateItem_arg0);
        System.out.println("updateItem.result=" + _updateItem__return);


        }
        {
        System.out.println("Invoking getAreaMasterDtl...");
        com.sales.wb.service.GetAreaDtlResp _getAreaMasterDtl__return = port.getAreaMasterDtl();
        System.out.println("getAreaMasterDtl.result=" + _getAreaMasterDtl__return);


        }
        {
        System.out.println("Invoking createItem...");
        com.sales.wb.service.ItemMasterVO _createItem_arg0 = new com.sales.wb.service.ItemMasterVO();
        _createItem_arg0.setActive(Boolean.valueOf(true));
        _createItem_arg0.setItemCode("ItemCode-498518527");
        _createItem_arg0.setItemId(Long.valueOf(8461640077401404498l));
        _createItem_arg0.setItemName("ItemName-550586566");
        com.sales.wb.service.Resp _createItem__return = port.createItem(_createItem_arg0);
        System.out.println("createItem.result=" + _createItem__return);


        }

        System.exit(0);
    }

}
