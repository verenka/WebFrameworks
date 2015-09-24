
package webf.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webf.beans package. 
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

    private final static QName _Login_QNAME = new QName("http://webservice.webf/", "login");
    private final static QName _LoginResponseType_QNAME = new QName("http://webservice.webf/", "loginResponseType");
    private final static QName _CreateNewCourse_QNAME = new QName("http://webservice.webf/", "createNewCourse");
    private final static QName _CreateNewCourseResponse_QNAME = new QName("http://webservice.webf/", "createNewCourseResponse");
    private final static QName _GetRole_QNAME = new QName("http://webservice.webf/", "getRole");
    private final static QName _GetAllCourses_QNAME = new QName("http://webservice.webf/", "getAllCourses");
    private final static QName _GetRoleResponse_QNAME = new QName("http://webservice.webf/", "getRoleResponse");
    private final static QName _GetCoursesResponse_QNAME = new QName("http://webservice.webf/", "getCoursesResponse");
    private final static QName _GetCourses_QNAME = new QName("http://webservice.webf/", "getCourses");
    private final static QName _DeleteCourse_QNAME = new QName("http://webservice.webf/", "deleteCourse");
    private final static QName _GetCourseDetail_QNAME = new QName("http://webservice.webf/", "getCourseDetail");
    private final static QName _LoginResponse_QNAME = new QName("http://webservice.webf/", "loginResponse");
    private final static QName _GetAllCoursesResponse_QNAME = new QName("http://webservice.webf/", "getAllCoursesResponse");
    private final static QName _GetCourseDetailResponse_QNAME = new QName("http://webservice.webf/", "getCourseDetailResponse");
    private final static QName _SaveCourseDetail_QNAME = new QName("http://webservice.webf/", "saveCourseDetail");
    private final static QName _SaveCourseDetailResponse_QNAME = new QName("http://webservice.webf/", "saveCourseDetailResponse");
    private final static QName _DeleteCourseResponse_QNAME = new QName("http://webservice.webf/", "deleteCourseResponse");
    private final static QName _Hello_QNAME = new QName("http://webservice.webf/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://webservice.webf/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webf.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetCourses }
     * 
     */
    public GetCourses createGetCourses() {
        return new GetCourses();
    }

    /**
     * Create an instance of {@link DeleteCourse }
     * 
     */
    public DeleteCourse createDeleteCourse() {
        return new DeleteCourse();
    }

    /**
     * Create an instance of {@link GetCourseDetail }
     * 
     */
    public GetCourseDetail createGetCourseDetail() {
        return new GetCourseDetail();
    }

    /**
     * Create an instance of {@link CreateNewCourse }
     * 
     */
    public CreateNewCourse createCreateNewCourse() {
        return new CreateNewCourse();
    }

    /**
     * Create an instance of {@link CreateNewCourseResponse }
     * 
     */
    public CreateNewCourseResponse createCreateNewCourseResponse() {
        return new CreateNewCourseResponse();
    }

    /**
     * Create an instance of {@link GetRole }
     * 
     */
    public GetRole createGetRole() {
        return new GetRole();
    }

    /**
     * Create an instance of {@link GetAllCourses }
     * 
     */
    public GetAllCourses createGetAllCourses() {
        return new GetAllCourses();
    }

    /**
     * Create an instance of {@link GetRoleResponse }
     * 
     */
    public GetRoleResponse createGetRoleResponse() {
        return new GetRoleResponse();
    }

    /**
     * Create an instance of {@link GetCoursesResponse }
     * 
     */
    public GetCoursesResponse createGetCoursesResponse() {
        return new GetCoursesResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponseType }
     * 
     */
    public LoginResponseType createLoginResponseType() {
        return new LoginResponseType();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SaveCourseDetail }
     * 
     */
    public SaveCourseDetail createSaveCourseDetail() {
        return new SaveCourseDetail();
    }

    /**
     * Create an instance of {@link SaveCourseDetailResponse }
     * 
     */
    public SaveCourseDetailResponse createSaveCourseDetailResponse() {
        return new SaveCourseDetailResponse();
    }

    /**
     * Create an instance of {@link DeleteCourseResponse }
     * 
     */
    public DeleteCourseResponse createDeleteCourseResponse() {
        return new DeleteCourseResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetAllCoursesResponse }
     * 
     */
    public GetAllCoursesResponse createGetAllCoursesResponse() {
        return new GetAllCoursesResponse();
    }

    /**
     * Create an instance of {@link GetCourseDetailResponse }
     * 
     */
    public GetCourseDetailResponse createGetCourseDetailResponse() {
        return new GetCourseDetailResponse();
    }

    /**
     * Create an instance of {@link CourseType }
     * 
     */
    public CourseType createCourseType() {
        return new CourseType();
    }

    /**
     * Create an instance of {@link CourseListType }
     * 
     */
    public CourseListType createCourseListType() {
        return new CourseListType();
    }

    /**
     * Create an instance of {@link CourseDetailRequest }
     * 
     */
    public CourseDetailRequest createCourseDetailRequest() {
        return new CourseDetailRequest();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link LoginRequestType }
     * 
     */
    public LoginRequestType createLoginRequestType() {
        return new LoginRequestType();
    }

    /**
     * Create an instance of {@link LoginResponse2 }
     * 
     */
    public LoginResponse2 createLoginResponse2() {
        return new LoginResponse2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "loginResponseType")
    public JAXBElement<LoginResponseType> createLoginResponseType(LoginResponseType value) {
        return new JAXBElement<LoginResponseType>(_LoginResponseType_QNAME, LoginResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "createNewCourse")
    public JAXBElement<CreateNewCourse> createCreateNewCourse(CreateNewCourse value) {
        return new JAXBElement<CreateNewCourse>(_CreateNewCourse_QNAME, CreateNewCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "createNewCourseResponse")
    public JAXBElement<CreateNewCourseResponse> createCreateNewCourseResponse(CreateNewCourseResponse value) {
        return new JAXBElement<CreateNewCourseResponse>(_CreateNewCourseResponse_QNAME, CreateNewCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "getRole")
    public JAXBElement<GetRole> createGetRole(GetRole value) {
        return new JAXBElement<GetRole>(_GetRole_QNAME, GetRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCourses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "getAllCourses")
    public JAXBElement<GetAllCourses> createGetAllCourses(GetAllCourses value) {
        return new JAXBElement<GetAllCourses>(_GetAllCourses_QNAME, GetAllCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "getRoleResponse")
    public JAXBElement<GetRoleResponse> createGetRoleResponse(GetRoleResponse value) {
        return new JAXBElement<GetRoleResponse>(_GetRoleResponse_QNAME, GetRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoursesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "getCoursesResponse")
    public JAXBElement<GetCoursesResponse> createGetCoursesResponse(GetCoursesResponse value) {
        return new JAXBElement<GetCoursesResponse>(_GetCoursesResponse_QNAME, GetCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "getCourses")
    public JAXBElement<GetCourses> createGetCourses(GetCourses value) {
        return new JAXBElement<GetCourses>(_GetCourses_QNAME, GetCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "deleteCourse")
    public JAXBElement<DeleteCourse> createDeleteCourse(DeleteCourse value) {
        return new JAXBElement<DeleteCourse>(_DeleteCourse_QNAME, DeleteCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "getCourseDetail")
    public JAXBElement<GetCourseDetail> createGetCourseDetail(GetCourseDetail value) {
        return new JAXBElement<GetCourseDetail>(_GetCourseDetail_QNAME, GetCourseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCoursesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "getAllCoursesResponse")
    public JAXBElement<GetAllCoursesResponse> createGetAllCoursesResponse(GetAllCoursesResponse value) {
        return new JAXBElement<GetAllCoursesResponse>(_GetAllCoursesResponse_QNAME, GetAllCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "getCourseDetailResponse")
    public JAXBElement<GetCourseDetailResponse> createGetCourseDetailResponse(GetCourseDetailResponse value) {
        return new JAXBElement<GetCourseDetailResponse>(_GetCourseDetailResponse_QNAME, GetCourseDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCourseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "saveCourseDetail")
    public JAXBElement<SaveCourseDetail> createSaveCourseDetail(SaveCourseDetail value) {
        return new JAXBElement<SaveCourseDetail>(_SaveCourseDetail_QNAME, SaveCourseDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCourseDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "saveCourseDetailResponse")
    public JAXBElement<SaveCourseDetailResponse> createSaveCourseDetailResponse(SaveCourseDetailResponse value) {
        return new JAXBElement<SaveCourseDetailResponse>(_SaveCourseDetailResponse_QNAME, SaveCourseDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "deleteCourseResponse")
    public JAXBElement<DeleteCourseResponse> createDeleteCourseResponse(DeleteCourseResponse value) {
        return new JAXBElement<DeleteCourseResponse>(_DeleteCourseResponse_QNAME, DeleteCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.webf/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
