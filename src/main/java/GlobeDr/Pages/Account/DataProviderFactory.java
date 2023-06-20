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
       Object[][] o = new Object[1][];
       HashMap<String, String> user = new HashMap<String, String>();

       user.put("userId","0963259524");
       user.put("userPass","123456");
       user.put("appointment","Đặt hẹn khám");
       user.put("orderDrug","Đặt thuốc theo đơn");
       user.put("medicalTest","Xét nghiệm");
       user.put("selectMainAccount","Tuan24");
       user.put("selectOrgMedicalTest","Diag");
       user.put("selectMethodSampleTest","Tại phòng xét nghiệm");
       user.put("selectDateOrderMedicalTest","10/07/2023");
       user.put("selectNameMedicalTest","Amylase");
       o[0] = new Object[] {user};
       return o;
   }

   @DataProvider(name = "org")
   public static Object[][] dataorg(){
      Object[][] o = new Object[1][];
      HashMap<String, String> dporg = new HashMap<String, String>();

      dporg.put("orgId","0987654322");
      dporg.put("orgPass","123456");
      dporg.put("ManageHospital/Clinic","Quản lý bệnh viện/phòng khám");
      dporg.put("OrgTrungVuong","");
      dporg.put("OrgNguyenTriPhuong","");
      dporg.put("OrgDiag","Diag");
      dporg.put("AppointmentList","");
      dporg.put("MedicalTestOrder","Danh sách xét nghiệm");
      dporg.put("PrescriptionPrices","");
      dporg.put("AssignSamplingStaff","Chỉ định nhân viên");
      dporg.put("nameStaffDiag","AD TRƯNG VƯƠNG");



      o[0] = new Object[] {dporg};
      return o;
   }

//   @DataProvider(name = "feature")
//   public static Object[][] datafeature(){
//      Object[][] o = new Object[1][];
//      HashMap<String, String> dpfeature = new HashMap<String, String>();
//
//      dpfeature.put("Appointment","Đặt lịch hẹn");
//      dpfeature.put("MedicalTestOrder","");
//      dpfeature.put("PrescriptionPrices","");
//
//      o[0] = new Object[] {dpfeature};
//      return o;
//   }
//
//   @DataProvider(name = "medical")
//    public static Object[][] datamedical(){
//       Object[][] o = new Object[1][];
//       HashMap<String, String> dpmedical = new HashMap<String, String>();
//
//       dpmedical.put("feature","Xét nghiệm");
//       dpmedical.put("name","Tuan24");
//       dpmedical.put("org","Diag");
//       dpmedical.put("methodSampleTest","Tại phòng xét nghiệm");
//       dpmedical.put("dateOrderMedicalTest","10/07/2023");
//       dpmedical.put("nameTest","Amylase");
//
//       o[0] = new Object[] {dpmedical};
//       return o;
//   }



   @DataProvider(name = "mergedDataProvider")
    public static Object[][] mergedDataProvider(){
       HashMap<String, String> dpProvider = new HashMap<String, String>();
      dpProvider.putAll((HashMap<String, String>)datauser()[0][0]);
      dpProvider.putAll((HashMap<String, String>)dataorg()[0][0]);

       Object[][] o = new Object[1][];
       o[0] = new Object[] {dpProvider};
       return o;
   }


}
