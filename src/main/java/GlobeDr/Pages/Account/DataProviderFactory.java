package GlobeDr.Pages.Account;

import GlobeDr.Pages.BaseGlobeDrPage;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import java.util.HashMap;

public class DataProviderFactory extends BaseGlobeDrPage {
   public DataProviderFactory(By locator, String pageName, boolean assertOpen) {
      super(locator, pageName, assertOpen);
   }

   @DataProvider(name = "user")
    public static Object[][] datauser(){
       Object[][] oUser = new Object[1][];
       HashMap<String, String> user = new HashMap<String, String>();

       //Info
       user.put("ID","0963259524");
       user.put("Pass","123456");
       user.put("Name","Tuan");
       user.put("NameSubAccount","con trai");
       user.put("Title","GlobeDr");
       user.put("AvatarImage","Wolverine.PNG");
       user.put("Email","ngonam@demo.globedr.com");
       user.put("DOB","16/12/1990");
       user.put("Gender","Nam");
       user.put("PhoneNumber","0963269526");
       user.put("WorkPhoneNumber","19006880");
       user.put("MeasurementUnit","VN (kg/m)");
       user.put("Country","Việt Nam");
       user.put("City","Thành phố Hồ Chí Minh");
       user.put("District","Quận Tân Bình");
       user.put("Ward","Phường 10");
       user.put("Address","5B Đ. P. Quang, Phường 2, Tân Bình, Thành phố Hồ Chí Minh");
       user.put("CompanyName","GlobeDr");
       user.put("CompanyAddress","73 Rạch Bùng Binh, P.9, Q.3, Tp.HCM");
       user.put("CompanyTaxCode","");

       //ShareMainAccount
      user.put("MainAccount","Tuan");
      user.put("SubAccount","con trai");
      user.put("Friend","Tuấn Trần");
      user.put("ShareMethod_View&Edit","Xem & chỉnh sửa");
      user.put("ShareMethod_View","Chỉ xem");
      user.put("ShareMethod_Unshare","Dừng chia sẻ");

        //CreateSubAccount
       user.put("InsuranceCode","GD02356525989");
       user.put("CMND_CCCD","0247654321");
       user.put("FullName","Ngô Sắn Khoai");
       user.put("AvatarImageSub","BlackWidow.PNG");
       user.put("DayofBirth","10/10/2020");
       user.put("PhoneNumberSub","090900000");
       user.put("GenderSub","Nữ");
       user.put("AddressSub","100 Trần Công An, Thành phố Biên Hòa, Đồng Nai, Việt Nam");
       user.put("CountrySub","Việt Nam");
       user.put("CitySub","Thành phố Hồ Chí Minh");
       user.put("DistrictSub","Quận Tân Bình");
       user.put("WardSub","Phường 10");
       user.put("Hight","180");
       user.put("Weight","60");
       user.put("Relationship","Con");

       //UpdateAccount
       user.put("InsuranceCodeNew","GD0111111111");
       user.put("CMND_CCCDNew","123456555");
       user.put("FullNameNew","Khoai Lang Nướng");
       user.put("AvatarImageNew","Spiderman.PNG");
       user.put("DayofBirthNew","01/01/2021");
       user.put("PhoneNumberNew","02873006880");
       user.put("GenderNew","Nam");
       user.put("AddressNew","150 Trần Công An, Thành phố Biên Hòa, Đồng Nai, Việt Nam");
       user.put("CountryNew","Việt Nam");
       user.put("CityNew","Tỉnh Đồng Nai");
       user.put("DistrictNew","Thành phố Biên Hòa");
       user.put("WardNew","Phường Tân Phong");
       user.put("HightNew","170");
       user.put("WeightNew","50");
       user.put("RelationshipNew","Họ hàng");

       //Feature
       user.put("appointment","Đặt hẹn khám");
       user.put("orderDrug","Đặt thuốc theo đơn");
       user.put("medicalTest","Xét nghiệm");
       user.put("selectMainAccount","Tuan24");
       user.put("selectOrgMedicalTest","Diag");
       user.put("selectMethodSampleTest","Tại phòng xét nghiệm");
       user.put("selectDateOrderMedicalTest","10/07/2023");
       user.put("selectNameMedicalTest","Amylase");


       //Appointment
       user.put("orgTrungVuong","BỆNH VIỆN TRƯNG VƯƠNG");
       user.put("orgNguyenTriPhuong","Bệnh Viện Nguyễn Tri Phương");
       user.put("serviceFirsttimeexamination","[1] Khám lần đầu - Không BHYT");
       user.put("serviceReexamination","Tái khám");
       user.put("speciatly","");
       user.put("dayExamination","T2");
       user.put("examinationSession","Buổi chiều");
       user.put("doctor","BS Tâm");


       //Payoo
       user.put("Credit Card","Thẻ nội địa");
       user.put("Visa","Thẻ quốc tế (VISA,Master,JCB,Amex)");
       user.put("QR code","Quét mã QR,Ví điện tử");
       user.put("At store","Tại cửa hàng gần nhà");
       user.put("iDCardBank","4111-1111-1111-1111");
       user.put("CardHolderName","Vu Thuy My");
       user.put("cardMonth","05");
       user.put("cardYear","25");
       user.put("cardCVV","787");

       oUser[0] = new Object[] {user};
       return oUser;
   }

   @DataProvider(name = "org")
   public static Object[][] dataorg(){
      Object[][] oOrg = new Object[1][];
      HashMap<String, String> dporg = new HashMap<String, String>();

      dporg.put("orgId","0987654322");
      dporg.put("orgPass","123456");
      dporg.put("ManageHospital/Clinic","Quản lý bệnh viện/phòng khám");
      dporg.put("OrgTrungVuong","");
      dporg.put("OrgNguyenTriPhuong","Bệnh Viện Nguyễn Tri Phương");
      dporg.put("OrgDiag","Diag");
      dporg.put("AppointmentList","Danh sách lịch khám");
      dporg.put("MedicalTestOrder","Danh sách xét nghiệm");
      dporg.put("PrescriptionPrices","");
      dporg.put("AssignSamplingStaff","Chỉ định nhân viên");
      dporg.put("nameStaffDiag","AD TRƯNG VƯƠNG");
      dporg.put("sendTestResults","Gửi kết quả xét nghiệm");
      dporg.put("testResult","DA LAY MAU.pdf");

      oOrg[0] = new Object[] {dporg};
      return oOrg;
   }

   @DataProvider(name = "staffOrg")
   public static Object[][] datastaff(){
      Object[][] oStaff = new Object[1][];
      HashMap<String, String> dpstaff = new HashMap<String, String>();

      dpstaff.put("staffID","0963259523");
      dpstaff.put("staffPass","123456");
      dpstaff.put("sampled","Đổi trạng thái (Đã lấy mẫu)");
      dpstaff.put("noteSampled","Đã lấy mẫu xong");
      oStaff[0] = new  Object[] {dpstaff};
      return oStaff;
   }



   @DataProvider(name = "mergedDataProvider")
    public static Object[][] mergedDataProvider(){
       HashMap<String, String> dpProvider = new HashMap<String, String>();
      dpProvider.putAll((HashMap<String, String>)datauser()[0][0]);
      dpProvider.putAll((HashMap<String, String>)dataorg()[0][0]);
      dpProvider.putAll((HashMap<String, String>)datastaff()[0][0]);

       Object[][] o = new Object[1][];
       o[0] = new Object[] {dpProvider};
       return o;
   }


}
