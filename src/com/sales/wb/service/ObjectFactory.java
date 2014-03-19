
package com.sales.wb.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sales.wb.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloworldResponse_QNAME = new QName("http://service.wb.sales.com/", "helloworldResponse");
    private final static QName _GetAllEmployee_QNAME = new QName("http://service.wb.sales.com/", "getAllEmployee");
    private final static QName _GetAllItemMasterDtlResponse_QNAME = new QName("http://service.wb.sales.com/", "getAllItemMasterDtlResponse");
    private final static QName _GetAllBillBookdtlResponse_QNAME = new QName("http://service.wb.sales.com/", "getAllBillBookdtlResponse");
    private final static QName _GetAreaMasterDtl_QNAME = new QName("http://service.wb.sales.com/", "getAreaMasterDtl");
    private final static QName _UpdateBillbook_QNAME = new QName("http://service.wb.sales.com/", "updateBillbook");
    private final static QName _UpdateAreaResponse_QNAME = new QName("http://service.wb.sales.com/", "updateAreaResponse");
    private final static QName _GetRetailerDtlResponse_QNAME = new QName("http://service.wb.sales.com/", "getRetailerDtlResponse");
    private final static QName _GetAreaMasterDtlResponse_QNAME = new QName("http://service.wb.sales.com/", "getAreaMasterDtlResponse");
    private final static QName _CreateEmployee_QNAME = new QName("http://service.wb.sales.com/", "createEmployee");
    private final static QName _BlockItemResponse_QNAME = new QName("http://service.wb.sales.com/", "blockItemResponse");
    private final static QName _CreateRetailer_QNAME = new QName("http://service.wb.sales.com/", "createRetailer");
    private final static QName _BlockRetailer_QNAME = new QName("http://service.wb.sales.com/", "blockRetailer");
    private final static QName _CreateBillBook_QNAME = new QName("http://service.wb.sales.com/", "createBillBook");
    private final static QName _CreateAreaResponse_QNAME = new QName("http://service.wb.sales.com/", "createAreaResponse");
    private final static QName _UpdateEmployee_QNAME = new QName("http://service.wb.sales.com/", "updateEmployee");
    private final static QName _BlockEmployeeResponse_QNAME = new QName("http://service.wb.sales.com/", "blockEmployeeResponse");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://service.wb.sales.com/", "createEmployeeResponse");
    private final static QName _UpdateRetailerResponse_QNAME = new QName("http://service.wb.sales.com/", "updateRetailerResponse");
    private final static QName _UpdateItem_QNAME = new QName("http://service.wb.sales.com/", "updateItem");
    private final static QName _GetAllBillBookdtl_QNAME = new QName("http://service.wb.sales.com/", "getAllBillBookdtl");
    private final static QName _UpdateBillbookResponse_QNAME = new QName("http://service.wb.sales.com/", "updateBillbookResponse");
    private final static QName _UpdateEmployeeResponse_QNAME = new QName("http://service.wb.sales.com/", "updateEmployeeResponse");
    private final static QName _CreateItem_QNAME = new QName("http://service.wb.sales.com/", "createItem");
    private final static QName _CreateItemResponse_QNAME = new QName("http://service.wb.sales.com/", "createItemResponse");
    private final static QName _BlockEmployee_QNAME = new QName("http://service.wb.sales.com/", "blockEmployee");
    private final static QName _GetCompanyDetailResponse_QNAME = new QName("http://service.wb.sales.com/", "getCompanyDetailResponse");
    private final static QName _CreateBillBookResponse_QNAME = new QName("http://service.wb.sales.com/", "createBillBookResponse");
    private final static QName _CreateRetailerResponse_QNAME = new QName("http://service.wb.sales.com/", "createRetailerResponse");
    private final static QName _GetRetailerDtl_QNAME = new QName("http://service.wb.sales.com/", "getRetailerDtl");
    private final static QName _CreateArea_QNAME = new QName("http://service.wb.sales.com/", "createArea");
    private final static QName _GetAllPaymentModes_QNAME = new QName("http://service.wb.sales.com/", "getAllPaymentModes");
    private final static QName _GetAllPaymentModesResponse_QNAME = new QName("http://service.wb.sales.com/", "getAllPaymentModesResponse");
    private final static QName _BlockRetailerResponse_QNAME = new QName("http://service.wb.sales.com/", "blockRetailerResponse");
    private final static QName _GetAllItemMasterDtl_QNAME = new QName("http://service.wb.sales.com/", "getAllItemMasterDtl");
    private final static QName _UpdateItemResponse_QNAME = new QName("http://service.wb.sales.com/", "updateItemResponse");
    private final static QName _Helloworld_QNAME = new QName("http://service.wb.sales.com/", "helloworld");
    private final static QName _GetAllEmployeeResponse_QNAME = new QName("http://service.wb.sales.com/", "getAllEmployeeResponse");
    private final static QName _UpdateRetailer_QNAME = new QName("http://service.wb.sales.com/", "updateRetailer");
    private final static QName _BlockItem_QNAME = new QName("http://service.wb.sales.com/", "blockItem");
    private final static QName _GetCompanyDetail_QNAME = new QName("http://service.wb.sales.com/", "getCompanyDetail");
    private final static QName _UpdateArea_QNAME = new QName("http://service.wb.sales.com/", "updateArea");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sales.wb.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateRetailerResponse }
     * 
     */
    public UpdateRetailerResponse createUpdateRetailerResponse() {
        return new UpdateRetailerResponse();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link BlockEmployeeResponse }
     * 
     */
    public BlockEmployeeResponse createBlockEmployeeResponse() {
        return new BlockEmployeeResponse();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link CreateAreaResponse }
     * 
     */
    public CreateAreaResponse createCreateAreaResponse() {
        return new CreateAreaResponse();
    }

    /**
     * Create an instance of {@link CreateBillBook }
     * 
     */
    public CreateBillBook createCreateBillBook() {
        return new CreateBillBook();
    }

    /**
     * Create an instance of {@link BlockRetailer }
     * 
     */
    public BlockRetailer createBlockRetailer() {
        return new BlockRetailer();
    }

    /**
     * Create an instance of {@link CreateRetailer }
     * 
     */
    public CreateRetailer createCreateRetailer() {
        return new CreateRetailer();
    }

    /**
     * Create an instance of {@link UpdateEmployeeResponse }
     * 
     */
    public UpdateEmployeeResponse createUpdateEmployeeResponse() {
        return new UpdateEmployeeResponse();
    }

    /**
     * Create an instance of {@link UpdateBillbookResponse }
     * 
     */
    public UpdateBillbookResponse createUpdateBillbookResponse() {
        return new UpdateBillbookResponse();
    }

    /**
     * Create an instance of {@link GetAllBillBookdtl }
     * 
     */
    public GetAllBillBookdtl createGetAllBillBookdtl() {
        return new GetAllBillBookdtl();
    }

    /**
     * Create an instance of {@link UpdateItem }
     * 
     */
    public UpdateItem createUpdateItem() {
        return new UpdateItem();
    }

    /**
     * Create an instance of {@link UpdateBillbook }
     * 
     */
    public UpdateBillbook createUpdateBillbook() {
        return new UpdateBillbook();
    }

    /**
     * Create an instance of {@link UpdateAreaResponse }
     * 
     */
    public UpdateAreaResponse createUpdateAreaResponse() {
        return new UpdateAreaResponse();
    }

    /**
     * Create an instance of {@link GetAreaMasterDtl }
     * 
     */
    public GetAreaMasterDtl createGetAreaMasterDtl() {
        return new GetAreaMasterDtl();
    }

    /**
     * Create an instance of {@link GetAllBillBookdtlResponse }
     * 
     */
    public GetAllBillBookdtlResponse createGetAllBillBookdtlResponse() {
        return new GetAllBillBookdtlResponse();
    }

    /**
     * Create an instance of {@link HelloworldResponse }
     * 
     */
    public HelloworldResponse createHelloworldResponse() {
        return new HelloworldResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployee }
     * 
     */
    public GetAllEmployee createGetAllEmployee() {
        return new GetAllEmployee();
    }

    /**
     * Create an instance of {@link GetAllItemMasterDtlResponse }
     * 
     */
    public GetAllItemMasterDtlResponse createGetAllItemMasterDtlResponse() {
        return new GetAllItemMasterDtlResponse();
    }

    /**
     * Create an instance of {@link BlockItemResponse }
     * 
     */
    public BlockItemResponse createBlockItemResponse() {
        return new BlockItemResponse();
    }

    /**
     * Create an instance of {@link CreateEmployee }
     * 
     */
    public CreateEmployee createCreateEmployee() {
        return new CreateEmployee();
    }

    /**
     * Create an instance of {@link GetRetailerDtlResponse }
     * 
     */
    public GetRetailerDtlResponse createGetRetailerDtlResponse() {
        return new GetRetailerDtlResponse();
    }

    /**
     * Create an instance of {@link GetAreaMasterDtlResponse }
     * 
     */
    public GetAreaMasterDtlResponse createGetAreaMasterDtlResponse() {
        return new GetAreaMasterDtlResponse();
    }

    /**
     * Create an instance of {@link UpdateItemResponse }
     * 
     */
    public UpdateItemResponse createUpdateItemResponse() {
        return new UpdateItemResponse();
    }

    /**
     * Create an instance of {@link Helloworld }
     * 
     */
    public Helloworld createHelloworld() {
        return new Helloworld();
    }

    /**
     * Create an instance of {@link GetAllItemMasterDtl }
     * 
     */
    public GetAllItemMasterDtl createGetAllItemMasterDtl() {
        return new GetAllItemMasterDtl();
    }

    /**
     * Create an instance of {@link BlockRetailerResponse }
     * 
     */
    public BlockRetailerResponse createBlockRetailerResponse() {
        return new BlockRetailerResponse();
    }

    /**
     * Create an instance of {@link GetAllPaymentModesResponse }
     * 
     */
    public GetAllPaymentModesResponse createGetAllPaymentModesResponse() {
        return new GetAllPaymentModesResponse();
    }

    /**
     * Create an instance of {@link GetAllPaymentModes }
     * 
     */
    public GetAllPaymentModes createGetAllPaymentModes() {
        return new GetAllPaymentModes();
    }

    /**
     * Create an instance of {@link UpdateArea }
     * 
     */
    public UpdateArea createUpdateArea() {
        return new UpdateArea();
    }

    /**
     * Create an instance of {@link GetCompanyDetail }
     * 
     */
    public GetCompanyDetail createGetCompanyDetail() {
        return new GetCompanyDetail();
    }

    /**
     * Create an instance of {@link BlockItem }
     * 
     */
    public BlockItem createBlockItem() {
        return new BlockItem();
    }

    /**
     * Create an instance of {@link UpdateRetailer }
     * 
     */
    public UpdateRetailer createUpdateRetailer() {
        return new UpdateRetailer();
    }

    /**
     * Create an instance of {@link GetAllEmployeeResponse }
     * 
     */
    public GetAllEmployeeResponse createGetAllEmployeeResponse() {
        return new GetAllEmployeeResponse();
    }

    /**
     * Create an instance of {@link BlockEmployee }
     * 
     */
    public BlockEmployee createBlockEmployee() {
        return new BlockEmployee();
    }

    /**
     * Create an instance of {@link CreateItemResponse }
     * 
     */
    public CreateItemResponse createCreateItemResponse() {
        return new CreateItemResponse();
    }

    /**
     * Create an instance of {@link CreateItem }
     * 
     */
    public CreateItem createCreateItem() {
        return new CreateItem();
    }

    /**
     * Create an instance of {@link CreateArea }
     * 
     */
    public CreateArea createCreateArea() {
        return new CreateArea();
    }

    /**
     * Create an instance of {@link GetRetailerDtl }
     * 
     */
    public GetRetailerDtl createGetRetailerDtl() {
        return new GetRetailerDtl();
    }

    /**
     * Create an instance of {@link CreateRetailerResponse }
     * 
     */
    public CreateRetailerResponse createCreateRetailerResponse() {
        return new CreateRetailerResponse();
    }

    /**
     * Create an instance of {@link CreateBillBookResponse }
     * 
     */
    public CreateBillBookResponse createCreateBillBookResponse() {
        return new CreateBillBookResponse();
    }

    /**
     * Create an instance of {@link GetCompanyDetailResponse }
     * 
     */
    public GetCompanyDetailResponse createGetCompanyDetailResponse() {
        return new GetCompanyDetailResponse();
    }

    /**
     * Create an instance of {@link BillBookVo }
     * 
     */
    public BillBookVo createBillBookVo() {
        return new BillBookVo();
    }

    /**
     * Create an instance of {@link PaymentModeVo }
     * 
     */
    public PaymentModeVo createPaymentModeVo() {
        return new PaymentModeVo();
    }

    /**
     * Create an instance of {@link GetAllBillBookDtlResp }
     * 
     */
    public GetAllBillBookDtlResp createGetAllBillBookDtlResp() {
        return new GetAllBillBookDtlResp();
    }

    /**
     * Create an instance of {@link AreaVO }
     * 
     */
    public AreaVO createAreaVO() {
        return new AreaVO();
    }

    /**
     * Create an instance of {@link GetRetailerResp }
     * 
     */
    public GetRetailerResp createGetRetailerResp() {
        return new GetRetailerResp();
    }

    /**
     * Create an instance of {@link GetAreaDtlResp }
     * 
     */
    public GetAreaDtlResp createGetAreaDtlResp() {
        return new GetAreaDtlResp();
    }

    /**
     * Create an instance of {@link ItemMasterVO }
     * 
     */
    public ItemMasterVO createItemMasterVO() {
        return new ItemMasterVO();
    }

    /**
     * Create an instance of {@link Resp }
     * 
     */
    public Resp createResp() {
        return new Resp();
    }

    /**
     * Create an instance of {@link GetItemMasterResp }
     * 
     */
    public GetItemMasterResp createGetItemMasterResp() {
        return new GetItemMasterResp();
    }

    /**
     * Create an instance of {@link GetPaymentModeResp }
     * 
     */
    public GetPaymentModeResp createGetPaymentModeResp() {
        return new GetPaymentModeResp();
    }

    /**
     * Create an instance of {@link GetEmployeeMasterResp }
     * 
     */
    public GetEmployeeMasterResp createGetEmployeeMasterResp() {
        return new GetEmployeeMasterResp();
    }

    /**
     * Create an instance of {@link EmployeeMasterVO }
     * 
     */
    public EmployeeMasterVO createEmployeeMasterVO() {
        return new EmployeeMasterVO();
    }

    /**
     * Create an instance of {@link GetCompanyResp }
     * 
     */
    public GetCompanyResp createGetCompanyResp() {
        return new GetCompanyResp();
    }

    /**
     * Create an instance of {@link RetailerVO }
     * 
     */
    public RetailerVO createRetailerVO() {
        return new RetailerVO();
    }

    /**
     * Create an instance of {@link CompanyVo }
     * 
     */
    public CompanyVo createCompanyVo() {
        return new CompanyVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloworldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "helloworldResponse")
    public JAXBElement<HelloworldResponse> createHelloworldResponse(HelloworldResponse value) {
        return new JAXBElement<HelloworldResponse>(_HelloworldResponse_QNAME, HelloworldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAllEmployee")
    public JAXBElement<GetAllEmployee> createGetAllEmployee(GetAllEmployee value) {
        return new JAXBElement<GetAllEmployee>(_GetAllEmployee_QNAME, GetAllEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemMasterDtlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAllItemMasterDtlResponse")
    public JAXBElement<GetAllItemMasterDtlResponse> createGetAllItemMasterDtlResponse(GetAllItemMasterDtlResponse value) {
        return new JAXBElement<GetAllItemMasterDtlResponse>(_GetAllItemMasterDtlResponse_QNAME, GetAllItemMasterDtlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBillBookdtlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAllBillBookdtlResponse")
    public JAXBElement<GetAllBillBookdtlResponse> createGetAllBillBookdtlResponse(GetAllBillBookdtlResponse value) {
        return new JAXBElement<GetAllBillBookdtlResponse>(_GetAllBillBookdtlResponse_QNAME, GetAllBillBookdtlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAreaMasterDtl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAreaMasterDtl")
    public JAXBElement<GetAreaMasterDtl> createGetAreaMasterDtl(GetAreaMasterDtl value) {
        return new JAXBElement<GetAreaMasterDtl>(_GetAreaMasterDtl_QNAME, GetAreaMasterDtl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBillbook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateBillbook")
    public JAXBElement<UpdateBillbook> createUpdateBillbook(UpdateBillbook value) {
        return new JAXBElement<UpdateBillbook>(_UpdateBillbook_QNAME, UpdateBillbook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateAreaResponse")
    public JAXBElement<UpdateAreaResponse> createUpdateAreaResponse(UpdateAreaResponse value) {
        return new JAXBElement<UpdateAreaResponse>(_UpdateAreaResponse_QNAME, UpdateAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRetailerDtlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getRetailerDtlResponse")
    public JAXBElement<GetRetailerDtlResponse> createGetRetailerDtlResponse(GetRetailerDtlResponse value) {
        return new JAXBElement<GetRetailerDtlResponse>(_GetRetailerDtlResponse_QNAME, GetRetailerDtlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAreaMasterDtlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAreaMasterDtlResponse")
    public JAXBElement<GetAreaMasterDtlResponse> createGetAreaMasterDtlResponse(GetAreaMasterDtlResponse value) {
        return new JAXBElement<GetAreaMasterDtlResponse>(_GetAreaMasterDtlResponse_QNAME, GetAreaMasterDtlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createEmployee")
    public JAXBElement<CreateEmployee> createCreateEmployee(CreateEmployee value) {
        return new JAXBElement<CreateEmployee>(_CreateEmployee_QNAME, CreateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "blockItemResponse")
    public JAXBElement<BlockItemResponse> createBlockItemResponse(BlockItemResponse value) {
        return new JAXBElement<BlockItemResponse>(_BlockItemResponse_QNAME, BlockItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRetailer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createRetailer")
    public JAXBElement<CreateRetailer> createCreateRetailer(CreateRetailer value) {
        return new JAXBElement<CreateRetailer>(_CreateRetailer_QNAME, CreateRetailer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockRetailer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "blockRetailer")
    public JAXBElement<BlockRetailer> createBlockRetailer(BlockRetailer value) {
        return new JAXBElement<BlockRetailer>(_BlockRetailer_QNAME, BlockRetailer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBillBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createBillBook")
    public JAXBElement<CreateBillBook> createCreateBillBook(CreateBillBook value) {
        return new JAXBElement<CreateBillBook>(_CreateBillBook_QNAME, CreateBillBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createAreaResponse")
    public JAXBElement<CreateAreaResponse> createCreateAreaResponse(CreateAreaResponse value) {
        return new JAXBElement<CreateAreaResponse>(_CreateAreaResponse_QNAME, CreateAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateEmployee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "blockEmployeeResponse")
    public JAXBElement<BlockEmployeeResponse> createBlockEmployeeResponse(BlockEmployeeResponse value) {
        return new JAXBElement<BlockEmployeeResponse>(_BlockEmployeeResponse_QNAME, BlockEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRetailerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateRetailerResponse")
    public JAXBElement<UpdateRetailerResponse> createUpdateRetailerResponse(UpdateRetailerResponse value) {
        return new JAXBElement<UpdateRetailerResponse>(_UpdateRetailerResponse_QNAME, UpdateRetailerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateItem")
    public JAXBElement<UpdateItem> createUpdateItem(UpdateItem value) {
        return new JAXBElement<UpdateItem>(_UpdateItem_QNAME, UpdateItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBillBookdtl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAllBillBookdtl")
    public JAXBElement<GetAllBillBookdtl> createGetAllBillBookdtl(GetAllBillBookdtl value) {
        return new JAXBElement<GetAllBillBookdtl>(_GetAllBillBookdtl_QNAME, GetAllBillBookdtl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBillbookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateBillbookResponse")
    public JAXBElement<UpdateBillbookResponse> createUpdateBillbookResponse(UpdateBillbookResponse value) {
        return new JAXBElement<UpdateBillbookResponse>(_UpdateBillbookResponse_QNAME, UpdateBillbookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateEmployeeResponse")
    public JAXBElement<UpdateEmployeeResponse> createUpdateEmployeeResponse(UpdateEmployeeResponse value) {
        return new JAXBElement<UpdateEmployeeResponse>(_UpdateEmployeeResponse_QNAME, UpdateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createItem")
    public JAXBElement<CreateItem> createCreateItem(CreateItem value) {
        return new JAXBElement<CreateItem>(_CreateItem_QNAME, CreateItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createItemResponse")
    public JAXBElement<CreateItemResponse> createCreateItemResponse(CreateItemResponse value) {
        return new JAXBElement<CreateItemResponse>(_CreateItemResponse_QNAME, CreateItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "blockEmployee")
    public JAXBElement<BlockEmployee> createBlockEmployee(BlockEmployee value) {
        return new JAXBElement<BlockEmployee>(_BlockEmployee_QNAME, BlockEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getCompanyDetailResponse")
    public JAXBElement<GetCompanyDetailResponse> createGetCompanyDetailResponse(GetCompanyDetailResponse value) {
        return new JAXBElement<GetCompanyDetailResponse>(_GetCompanyDetailResponse_QNAME, GetCompanyDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBillBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createBillBookResponse")
    public JAXBElement<CreateBillBookResponse> createCreateBillBookResponse(CreateBillBookResponse value) {
        return new JAXBElement<CreateBillBookResponse>(_CreateBillBookResponse_QNAME, CreateBillBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRetailerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createRetailerResponse")
    public JAXBElement<CreateRetailerResponse> createCreateRetailerResponse(CreateRetailerResponse value) {
        return new JAXBElement<CreateRetailerResponse>(_CreateRetailerResponse_QNAME, CreateRetailerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRetailerDtl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getRetailerDtl")
    public JAXBElement<GetRetailerDtl> createGetRetailerDtl(GetRetailerDtl value) {
        return new JAXBElement<GetRetailerDtl>(_GetRetailerDtl_QNAME, GetRetailerDtl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "createArea")
    public JAXBElement<CreateArea> createCreateArea(CreateArea value) {
        return new JAXBElement<CreateArea>(_CreateArea_QNAME, CreateArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPaymentModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAllPaymentModes")
    public JAXBElement<GetAllPaymentModes> createGetAllPaymentModes(GetAllPaymentModes value) {
        return new JAXBElement<GetAllPaymentModes>(_GetAllPaymentModes_QNAME, GetAllPaymentModes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPaymentModesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAllPaymentModesResponse")
    public JAXBElement<GetAllPaymentModesResponse> createGetAllPaymentModesResponse(GetAllPaymentModesResponse value) {
        return new JAXBElement<GetAllPaymentModesResponse>(_GetAllPaymentModesResponse_QNAME, GetAllPaymentModesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockRetailerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "blockRetailerResponse")
    public JAXBElement<BlockRetailerResponse> createBlockRetailerResponse(BlockRetailerResponse value) {
        return new JAXBElement<BlockRetailerResponse>(_BlockRetailerResponse_QNAME, BlockRetailerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemMasterDtl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAllItemMasterDtl")
    public JAXBElement<GetAllItemMasterDtl> createGetAllItemMasterDtl(GetAllItemMasterDtl value) {
        return new JAXBElement<GetAllItemMasterDtl>(_GetAllItemMasterDtl_QNAME, GetAllItemMasterDtl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateItemResponse")
    public JAXBElement<UpdateItemResponse> createUpdateItemResponse(UpdateItemResponse value) {
        return new JAXBElement<UpdateItemResponse>(_UpdateItemResponse_QNAME, UpdateItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Helloworld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "helloworld")
    public JAXBElement<Helloworld> createHelloworld(Helloworld value) {
        return new JAXBElement<Helloworld>(_Helloworld_QNAME, Helloworld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getAllEmployeeResponse")
    public JAXBElement<GetAllEmployeeResponse> createGetAllEmployeeResponse(GetAllEmployeeResponse value) {
        return new JAXBElement<GetAllEmployeeResponse>(_GetAllEmployeeResponse_QNAME, GetAllEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRetailer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateRetailer")
    public JAXBElement<UpdateRetailer> createUpdateRetailer(UpdateRetailer value) {
        return new JAXBElement<UpdateRetailer>(_UpdateRetailer_QNAME, UpdateRetailer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "blockItem")
    public JAXBElement<BlockItem> createBlockItem(BlockItem value) {
        return new JAXBElement<BlockItem>(_BlockItem_QNAME, BlockItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "getCompanyDetail")
    public JAXBElement<GetCompanyDetail> createGetCompanyDetail(GetCompanyDetail value) {
        return new JAXBElement<GetCompanyDetail>(_GetCompanyDetail_QNAME, GetCompanyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wb.sales.com/", name = "updateArea")
    public JAXBElement<UpdateArea> createUpdateArea(UpdateArea value) {
        return new JAXBElement<UpdateArea>(_UpdateArea_QNAME, UpdateArea.class, null, value);
    }

}
