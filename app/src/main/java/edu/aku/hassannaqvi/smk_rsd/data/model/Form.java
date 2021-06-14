package edu.aku.hassannaqvi.smk_rsd.data.model;

import android.database.Cursor;
import android.provider.BaseColumns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;

import edu.aku.hassannaqvi.smk_rsd.BR;
import edu.aku.hassannaqvi.smk_rsd.core.MainApp;


public class Form extends BaseObservable {

    private final String TAG = "Form";

    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;


    //Not saving in DB
    private final LocalDate localDate = null;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String districtCode = StringUtils.EMPTY;
    private String districtName = StringUtils.EMPTY;
    private String hfCode = StringUtils.EMPTY;
    private String hfName = StringUtils.EMPTY;
    private String reportingMonth = StringUtils.EMPTY;
    private String reportingYear = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;
    // SECTION VARIABLES
    private String sA = StringUtils.EMPTY;
    private String sB = StringUtils.EMPTY;
    private String sC = StringUtils.EMPTY;
    private String sD = StringUtils.EMPTY;
    private String sE = StringUtils.EMPTY;
    // FIELD VARIABLES
    private String mhr01 = StringUtils.EMPTY;
    private String mhr0197 = StringUtils.EMPTY;
    private String mhr02 = StringUtils.EMPTY;
    private String mhr0297 = StringUtils.EMPTY;
    private String mhr03 = StringUtils.EMPTY;
    private String mhr0397 = StringUtils.EMPTY;
    private String mhr04 = StringUtils.EMPTY;
    private String mhr0497 = StringUtils.EMPTY;
    private String mhr05 = StringUtils.EMPTY;
    private String mhr0597 = StringUtils.EMPTY;
    private String epi01 = StringUtils.EMPTY;
    private String epi0197 = StringUtils.EMPTY;
    private String shf01 = StringUtils.EMPTY;
    private String shf0197 = StringUtils.EMPTY;
    private String shf02 = StringUtils.EMPTY;
    private String shf0297 = StringUtils.EMPTY;
    private String obs01 = StringUtils.EMPTY;
    private String obs01a = StringUtils.EMPTY;
    private String obs01ax = StringUtils.EMPTY;
    private String obs01b = StringUtils.EMPTY;
    private String obs02 = StringUtils.EMPTY;
    private String obs02a = StringUtils.EMPTY;
    private String obs02ax = StringUtils.EMPTY;
    private String obs02b = StringUtils.EMPTY;
    private String obs03 = StringUtils.EMPTY;
    private String obs03a = StringUtils.EMPTY;
    private String obs03ax = StringUtils.EMPTY;
    private String obs03b = StringUtils.EMPTY;
    private String obs04 = StringUtils.EMPTY;
    private String obs04a = StringUtils.EMPTY;
    private String obs04ax = StringUtils.EMPTY;
    private String obs04b = StringUtils.EMPTY;
    private String obs05 = StringUtils.EMPTY;
    private String obs05a = StringUtils.EMPTY;
    private String obs05ax = StringUtils.EMPTY;
    private String obs05b = StringUtils.EMPTY;
    private String obs06 = StringUtils.EMPTY;
    private String obs06a = StringUtils.EMPTY;
    private String obs06ax = StringUtils.EMPTY;
    private String obs06b = StringUtils.EMPTY;
    private String obs07 = StringUtils.EMPTY;
    private String obs07a = StringUtils.EMPTY;
    private String obs07ax = StringUtils.EMPTY;
    private String obs07b = StringUtils.EMPTY;
    private String obs08 = StringUtils.EMPTY;
    private String obs08a = StringUtils.EMPTY;
    private String obs08ax = StringUtils.EMPTY;
    private String obs08b = StringUtils.EMPTY;
    private String obs09 = StringUtils.EMPTY;
    private String obs09a = StringUtils.EMPTY;
    private String obs09ax = StringUtils.EMPTY;
    private String obs09b = StringUtils.EMPTY;
    private String obs10 = StringUtils.EMPTY;
    private String obs10a = StringUtils.EMPTY;
    private String obs10ax = StringUtils.EMPTY;
    private String obs10b = StringUtils.EMPTY;
    private String obs11 = StringUtils.EMPTY;
    private String obs11a = StringUtils.EMPTY;
    private String obs11ax = StringUtils.EMPTY;
    private String obs11b = StringUtils.EMPTY;
    private String obs12 = StringUtils.EMPTY;
    private String obs12a = StringUtils.EMPTY;
    private String obs12ax = StringUtils.EMPTY;
    private String obs12b = StringUtils.EMPTY;
    private String obs13 = StringUtils.EMPTY;
    private String obs13a = StringUtils.EMPTY;
    private String obs13ax = StringUtils.EMPTY;
    private String obs13b = StringUtils.EMPTY;
    private String obs14 = StringUtils.EMPTY;
    private String obs14a = StringUtils.EMPTY;
    private String obs14ax = StringUtils.EMPTY;
    private String obs14b = StringUtils.EMPTY;
    private String obs15 = StringUtils.EMPTY;
    private String obs15a = StringUtils.EMPTY;
    private String obs15ax = StringUtils.EMPTY;
    private String obs15b = StringUtils.EMPTY;
    private String obs16 = StringUtils.EMPTY;
    private String obs16a = StringUtils.EMPTY;
    private String obs16ax = StringUtils.EMPTY;
    private String obs16b = StringUtils.EMPTY;
    private String obs17 = StringUtils.EMPTY;
    private String obs17a = StringUtils.EMPTY;
    private String obs17ax = StringUtils.EMPTY;
    private String obs17b = StringUtils.EMPTY;
    private String obs18 = StringUtils.EMPTY;
    private String obs18a = StringUtils.EMPTY;
    private String obs18ax = StringUtils.EMPTY;
    private String obs18b = StringUtils.EMPTY;
    private String obs19 = StringUtils.EMPTY;
    private String obs19a = StringUtils.EMPTY;
    private String obs19ax = StringUtils.EMPTY;
    private String obs19b = StringUtils.EMPTY;
    private String obs20 = StringUtils.EMPTY;
    private String obs20a = StringUtils.EMPTY;
    private String obs20ax = StringUtils.EMPTY;
    private String obs20b = StringUtils.EMPTY;
    private String fpr01 = StringUtils.EMPTY;
    private String fpr0197 = StringUtils.EMPTY;
    private String fpr02 = StringUtils.EMPTY;
    private String fpr0297 = StringUtils.EMPTY;
    private String fpr03 = StringUtils.EMPTY;
    private String fpr0397 = StringUtils.EMPTY;
    private String fpr04 = StringUtils.EMPTY;
    private String fpr0497 = StringUtils.EMPTY;
    private String fpr05 = StringUtils.EMPTY;
    private String fpr0597 = StringUtils.EMPTY;
    private String fpr06 = StringUtils.EMPTY;
    private String fpr0697 = StringUtils.EMPTY;
    private String fpr07 = StringUtils.EMPTY;
    private String fpr0797 = StringUtils.EMPTY;
    private String fpr08 = StringUtils.EMPTY;
    private String fpr0897 = StringUtils.EMPTY;
    private String fpr09 = StringUtils.EMPTY;
    private String fpr0997 = StringUtils.EMPTY;
    private String fpr10 = StringUtils.EMPTY;
    private String fpr1097 = StringUtils.EMPTY;
    private String fpr11 = StringUtils.EMPTY;
    private String fpr1197 = StringUtils.EMPTY;
    private String cfp01 = StringUtils.EMPTY;
    private String cfp0197 = StringUtils.EMPTY;
    private String cfp02 = StringUtils.EMPTY;
    private String cfp0297 = StringUtils.EMPTY;
    private String cfp03 = StringUtils.EMPTY;
    private String cfp0397 = StringUtils.EMPTY;
    private String str01s = StringUtils.EMPTY;
    private String str01d = StringUtils.EMPTY;
    private String str01m = StringUtils.EMPTY;
    private String str02s = StringUtils.EMPTY;
    private String str02d = StringUtils.EMPTY;
    private String str02m = StringUtils.EMPTY;
    private String str03s = StringUtils.EMPTY;
    private String str03d = StringUtils.EMPTY;
    private String str03m = StringUtils.EMPTY;
    private String str04s = StringUtils.EMPTY;
    private String str04d = StringUtils.EMPTY;
    private String str04m = StringUtils.EMPTY;
    private String str05s = StringUtils.EMPTY;
    private String str05d = StringUtils.EMPTY;
    private String str05m = StringUtils.EMPTY;
    private String str06s = StringUtils.EMPTY;
    private String str06d = StringUtils.EMPTY;
    private String str06m = StringUtils.EMPTY;
    private String str07s = StringUtils.EMPTY;
    private String str07d = StringUtils.EMPTY;
    private String str07m = StringUtils.EMPTY;
    private String str08s = StringUtils.EMPTY;
    private String str08d = StringUtils.EMPTY;
    private String str08m = StringUtils.EMPTY;
    private String str09s = StringUtils.EMPTY;
    private String str09d = StringUtils.EMPTY;
    private String str09m = StringUtils.EMPTY;


    public Form() {

    }

    @Bindable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (projectName != projectName)
            this.projectName = projectName;

        //TODO: Update field in layout
        // notifyPropertyChanged(BR.layoutFieldName);
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    @Bindable
    public String getUid() {
        return uid;
    }

    public Form setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public Form setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Form setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getDistrictCode() {
        return districtCode;
    }

    public Form setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    @Bindable
    public String getDistrictName() {
        return districtName;
    }

    public Form setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    @Bindable
    public String getHfCode() {
        return hfCode;
    }

    public Form setHfCode(String hfCode) {
        this.hfCode = hfCode;
        return this;
    }

    @Bindable
    public String getHfName() {
        return hfName;
    }

    public Form setHfName(String hfName) {
        this.hfName = hfName;
        return this;
    }

    @Bindable
    public String getReportingMonth() {
        return reportingMonth;
    }

    public Form setReportingMonth(String reportingMonth) {
        this.reportingMonth = reportingMonth;
        return this;
    }

    @Bindable
    public String getReportingYear() {
        return reportingYear;
    }

    public Form setReportingYear(String reportingYear) {
        this.reportingYear = reportingYear;
        return this;
    }

    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Form setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Form setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Form setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Form setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Bindable
    public String getiStatus() {
        return iStatus;
    }

    public Form setiStatus(String iStatus) {
        this.iStatus = iStatus;
        return this;
    }

    @Bindable
    public String getiStatus96x() {
        return iStatus96x;
    }

    public Form setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        return this;
    }

    @Bindable
    public String getSynced() {
        return synced;
    }

    public Form setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Form setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    @Bindable
    public String getsA() {
        return sA;
    }

    public Form setsA(String sA) {
        this.sA = sA;
        return this;
    }

    @Bindable
    public String getsB() {
        return sB;
    }

    public Form setsB(String sB) {
        this.sB = sB;
        return this;
    }

    @Bindable
    public String getsC() {
        return sC;
    }

    public Form setsC(String sC) {
        this.sC = sC;
        return this;
    }

    @Bindable
    public String getsD() {
        return sD;
    }

    public Form setsD(String sD) {
        this.sD = sD;
        return this;
    }

    @Bindable
    public String getsE() {
        return sE;
    }

    public Form setsE(String sE) {
        this.sE = sE;
        return this;
    }

    @Bindable
    public String getMhr01() {
        return mhr01;
    }

    public void setMhr01(String mhr01) {
        this.mhr01 = mhr01;
        notifyPropertyChanged(BR.mhr01);
    }

    @Bindable
    public String getMhr01a() {
        return mhr01a;
    }

    public void setMhr01a(String mhr01a) {
        this.mhr01a = mhr01a;
        notifyPropertyChanged(BR.mhr01a);
    }

    @Bindable
    public String getMhr01ax() {
        return mhr01ax;
    }

    public void setMhr01ax(String mhr01ax) {
        this.mhr01ax = mhr01ax;
        notifyPropertyChanged(BR.mhr01ax);
    }

    @Bindable
    public String getMhr0197() {
        return mhr0197;
    }

    public void setMhr0197(String mhr0197) {
        this.mhr0197 = mhr0197;
        notifyPropertyChanged(BR.mhr01b);
    }

    @Bindable
    public String getMhr02() {
        return mhr02;
    }

    public void setMhr02(String mhr02) {
        this.mhr02 = mhr02;
        notifyPropertyChanged(BR.mhr02);
    }

    @Bindable
    public String getMhr02a() {
        return mhr02a;
    }

    public void setMhr02a(String mhr02a) {
        this.mhr02a = mhr02a;
        notifyPropertyChanged(BR.mhr02a);
    }

    @Bindable
    public String getMhr02ax() {
        return mhr02ax;
    }

    public void setMhr02ax(String mhr02ax) {
        this.mhr02ax = mhr02ax;
        notifyPropertyChanged(BR.mhr02ax);
    }

    @Bindable
    public String getMhr0297() {
        return mhr0297;
    }

    public void setMhr0297(String mhr0297) {
        this.mhr0297 = mhr0297;
        notifyPropertyChanged(BR.mhr02b);
    }

    @Bindable
    public String getMhr03() {
        return mhr03;
    }

    public void setMhr03(String mhr03) {
        this.mhr03 = mhr03;
        notifyPropertyChanged(BR.mhr03);
    }

    @Bindable
    public String getMhr03a() {
        return mhr03a;
    }

    public void setMhr03a(String mhr03a) {
        this.mhr03a = mhr03a;
        notifyPropertyChanged(BR.mhr03a);
    }

    @Bindable
    public String getMhr03ax() {
        return mhr03ax;
    }

    public void setMhr03ax(String mhr03ax) {
        this.mhr03ax = mhr03ax;
        notifyPropertyChanged(BR.mhr03ax);
    }

    @Bindable
    public String getMhr0397() {
        return mhr0397;
    }

    public void setMhr0397(String mhr0397) {
        this.mhr0397 = mhr0397;
        notifyPropertyChanged(BR.mhr03b);
    }

    @Bindable
    public String getMhr04() {
        return mhr04;
    }

    public void setMhr04(String mhr04) {
        this.mhr04 = mhr04;
        notifyPropertyChanged(BR.mhr04);
    }

    @Bindable
    public String getMhr04a() {
        return mhr04a;
    }

    public void setMhr04a(String mhr04a) {
        this.mhr04a = mhr04a;
        notifyPropertyChanged(BR.mhr04a);
    }

    @Bindable
    public String getMhr04ax() {
        return mhr04ax;
    }

    public void setMhr04ax(String mhr04ax) {
        this.mhr04ax = mhr04ax;
        notifyPropertyChanged(BR.mhr04ax);
    }

    @Bindable
    public String getMhr0497() {
        return mhr0497;
    }

    public void setMhr0497(String mhr0497) {
        this.mhr0497 = mhr0497;
        notifyPropertyChanged(BR.mhr04b);
    }

    @Bindable
    public String getMhr05() {
        return mhr05;
    }

    public void setMhr05(String mhr05) {
        this.mhr05 = mhr05;
        notifyPropertyChanged(BR.mhr05);
    }

    @Bindable
    public String getMhr05a() {
        return mhr05a;
    }

    public void setMhr05a(String mhr05a) {
        this.mhr05a = mhr05a;
        notifyPropertyChanged(BR.mhr05a);
    }

    @Bindable
    public String getMhr05ax() {
        return mhr05ax;
    }

    public void setMhr05ax(String mhr05ax) {
        this.mhr05ax = mhr05ax;
        notifyPropertyChanged(BR.mhr05ax);
    }

    @Bindable
    public String getMhr0597() {
        return mhr0597;
    }

    public void setMhr0597(String mhr0597) {
        this.mhr0597 = mhr0597;
        notifyPropertyChanged(BR.mhr05b);
    }

    @Bindable
    public String getEpi01() {
        return epi01;
    }

    public void setEpi01(String epi01) {
        this.epi01 = epi01;
        notifyPropertyChanged(BR.epi01);
    }

    @Bindable
    public String getEpi01a() {
        return epi01a;
    }

    public void setEpi01a(String epi01a) {
        this.epi01a = epi01a;
        notifyPropertyChanged(BR.epi01a);
    }

    @Bindable
    public String getEpi01ax() {
        return epi01ax;
    }

    public void setEpi01ax(String epi01ax) {
        this.epi01ax = epi01ax;
        notifyPropertyChanged(BR.epi01ax);
    }

    @Bindable
    public String getEpi0197() {
        return epi0197;
    }

    public void setEpi0197(String epi0197) {
        this.epi0197 = epi0197;
        notifyPropertyChanged(BR.epi01b);
    }

    @Bindable
    public String getShf01() {
        return shf01;
    }

    public void setShf01(String shf01) {
        this.shf01 = shf01;
        notifyPropertyChanged(BR.shf01);
    }

    @Bindable
    public String getShf01a() {
        return shf01a;
    }

    public void setShf01a(String shf01a) {
        this.shf01a = shf01a;
        notifyPropertyChanged(BR.shf01a);
    }

    @Bindable
    public String getShf01ax() {
        return shf01ax;
    }

    public void setShf01ax(String shf01ax) {
        this.shf01ax = shf01ax;
        notifyPropertyChanged(BR.shf01ax);
    }

    @Bindable
    public String getShf0197() {
        return shf0197;
    }

    public void setShf0197(String shf0197) {
        this.shf0197 = shf0197;
        notifyPropertyChanged(BR.shf01b);
    }

    @Bindable
    public String getShf02() {
        return shf02;
    }

    public void setShf02(String shf02) {
        this.shf02 = shf02;
        notifyPropertyChanged(BR.shf02);
    }

    @Bindable
    public String getShf02a() {
        return shf02a;
    }

    public void setShf02a(String shf02a) {
        this.shf02a = shf02a;
        notifyPropertyChanged(BR.shf02a);
    }

    @Bindable
    public String getShf02ax() {
        return shf02ax;
    }

    public void setShf02ax(String shf02ax) {
        this.shf02ax = shf02ax;
        notifyPropertyChanged(BR.shf02ax);
    }

    @Bindable
    public String getShf0297() {
        return shf0297;
    }

    public void setShf0297(String shf0297) {
        this.shf0297 = shf0297;
        notifyPropertyChanged(BR.shf02b);
    }

    @Bindable
    public String getObs01() {
        return obs01;
    }

    public void setObs01(String obs01) {
        this.obs01 = obs01;
        notifyPropertyChanged(BR.obs01);
    }

    @Bindable
    public String getObs01a() {
        return obs01a;
    }

    public void setObs01a(String obs01a) {
        this.obs01a = obs01a;
        notifyPropertyChanged(BR.obs01a);
    }

    @Bindable
    public String getObs01ax() {
        return obs01ax;
    }

    public void setObs01ax(String obs01ax) {
        this.obs01ax = obs01ax;
        notifyPropertyChanged(BR.obs01ax);
    }

    @Bindable
    public String getObs01b() {
        return obs01b;
    }

    public void setObs01b(String obs01b) {
        this.obs01b = obs01b;
        notifyPropertyChanged(BR.obs01b);
    }

    @Bindable
    public String getObs02() {
        return obs02;
    }

    public void setObs02(String obs02) {
        this.obs02 = obs02;
        notifyPropertyChanged(BR.obs02);
    }

    @Bindable
    public String getObs02a() {
        return obs02a;
    }

    public void setObs02a(String obs02a) {
        this.obs02a = obs02a;
        notifyPropertyChanged(BR.obs02a);
    }

    @Bindable
    public String getObs02ax() {
        return obs02ax;
    }

    public void setObs02ax(String obs02ax) {
        this.obs02ax = obs02ax;
        notifyPropertyChanged(BR.obs02ax);
    }

    @Bindable
    public String getObs02b() {
        return obs02b;
    }

    public void setObs02b(String obs02b) {
        this.obs02b = obs02b;
        notifyPropertyChanged(BR.obs02b);
    }

    @Bindable
    public String getObs03() {
        return obs03;
    }

    public void setObs03(String obs03) {
        this.obs03 = obs03;
        notifyPropertyChanged(BR.obs03);
    }

    @Bindable
    public String getObs03a() {
        return obs03a;
    }

    public void setObs03a(String obs03a) {
        this.obs03a = obs03a;
        notifyPropertyChanged(BR.obs03a);
    }

    @Bindable
    public String getObs03ax() {
        return obs03ax;
    }

    public void setObs03ax(String obs03ax) {
        this.obs03ax = obs03ax;
        notifyPropertyChanged(BR.obs03ax);
    }

    @Bindable
    public String getObs03b() {
        return obs03b;
    }

    public void setObs03b(String obs03b) {
        this.obs03b = obs03b;
        notifyPropertyChanged(BR.obs03b);
    }

    @Bindable
    public String getObs04() {
        return obs04;
    }

    public void setObs04(String obs04) {
        this.obs04 = obs04;
        notifyPropertyChanged(BR.obs04);
    }

    @Bindable
    public String getObs04a() {
        return obs04a;
    }

    public void setObs04a(String obs04a) {
        this.obs04a = obs04a;
        notifyPropertyChanged(BR.obs04a);
    }

    @Bindable
    public String getObs04ax() {
        return obs04ax;
    }

    public void setObs04ax(String obs04ax) {
        this.obs04ax = obs04ax;
        notifyPropertyChanged(BR.obs04ax);
    }

    @Bindable
    public String getObs04b() {
        return obs04b;
    }

    public void setObs04b(String obs04b) {
        this.obs04b = obs04b;
        notifyPropertyChanged(BR.obs04b);
    }

    @Bindable
    public String getObs05() {
        return obs05;
    }

    public void setObs05(String obs05) {
        this.obs05 = obs05;
        notifyPropertyChanged(BR.obs05);
    }

    @Bindable
    public String getObs05a() {
        return obs05a;
    }

    public void setObs05a(String obs05a) {
        this.obs05a = obs05a;
        notifyPropertyChanged(BR.obs05a);
    }

    @Bindable
    public String getObs05ax() {
        return obs05ax;
    }

    public void setObs05ax(String obs05ax) {
        this.obs05ax = obs05ax;
        notifyPropertyChanged(BR.obs05ax);
    }

    @Bindable
    public String getObs05b() {
        return obs05b;
    }

    public void setObs05b(String obs05b) {
        this.obs05b = obs05b;
        notifyPropertyChanged(BR.obs05b);
    }

    @Bindable
    public String getObs06() {
        return obs06;
    }

    public void setObs06(String obs06) {
        this.obs06 = obs06;
        notifyPropertyChanged(BR.obs06);
    }

    @Bindable
    public String getObs06a() {
        return obs06a;
    }

    public void setObs06a(String obs06a) {
        this.obs06a = obs06a;
        notifyPropertyChanged(BR.obs06a);
    }

    @Bindable
    public String getObs06ax() {
        return obs06ax;
    }

    public void setObs06ax(String obs06ax) {
        this.obs06ax = obs06ax;
        notifyPropertyChanged(BR.obs06ax);
    }

    @Bindable
    public String getObs06b() {
        return obs06b;
    }

    public void setObs06b(String obs06b) {
        this.obs06b = obs06b;
        notifyPropertyChanged(BR.obs06b);
    }

    @Bindable
    public String getObs07() {
        return obs07;
    }

    public void setObs07(String obs07) {
        this.obs07 = obs07;
        notifyPropertyChanged(BR.obs07);
    }

    @Bindable
    public String getObs07a() {
        return obs07a;
    }

    public void setObs07a(String obs07a) {
        this.obs07a = obs07a;
        notifyPropertyChanged(BR.obs07a);
    }

    @Bindable
    public String getObs07ax() {
        return obs07ax;
    }

    public void setObs07ax(String obs07ax) {
        this.obs07ax = obs07ax;
        notifyPropertyChanged(BR.obs07ax);
    }

    @Bindable
    public String getObs07b() {
        return obs07b;
    }

    public void setObs07b(String obs07b) {
        this.obs07b = obs07b;
        notifyPropertyChanged(BR.obs07b);
    }

    @Bindable
    public String getObs08() {
        return obs08;
    }

    public void setObs08(String obs08) {
        this.obs08 = obs08;
        notifyPropertyChanged(BR.obs08);
    }

    @Bindable
    public String getObs08a() {
        return obs08a;
    }

    public void setObs08a(String obs08a) {
        this.obs08a = obs08a;
        notifyPropertyChanged(BR.obs08a);
    }

    @Bindable
    public String getObs08ax() {
        return obs08ax;
    }

    public void setObs08ax(String obs08ax) {
        this.obs08ax = obs08ax;
        notifyPropertyChanged(BR.obs08ax);
    }

    @Bindable
    public String getObs08b() {
        return obs08b;
    }

    public void setObs08b(String obs08b) {
        this.obs08b = obs08b;
        notifyPropertyChanged(BR.obs08b);
    }

    @Bindable
    public String getObs09() {
        return obs09;
    }

    public void setObs09(String obs09) {
        this.obs09 = obs09;
        notifyPropertyChanged(BR.obs09);
    }

    @Bindable
    public String getObs09a() {
        return obs09a;
    }

    public void setObs09a(String obs09a) {
        this.obs09a = obs09a;
        notifyPropertyChanged(BR.obs09a);
    }

    @Bindable
    public String getObs09ax() {
        return obs09ax;
    }

    public void setObs09ax(String obs09ax) {
        this.obs09ax = obs09ax;
        notifyPropertyChanged(BR.obs09ax);
    }

    @Bindable
    public String getObs09b() {
        return obs09b;
    }

    public void setObs09b(String obs09b) {
        this.obs09b = obs09b;
        notifyPropertyChanged(BR.obs09b);
    }

    @Bindable
    public String getObs10() {
        return obs10;
    }

    public void setObs10(String obs10) {
        this.obs10 = obs10;
        notifyPropertyChanged(BR.obs10);
    }

    @Bindable
    public String getObs10a() {
        return obs10a;
    }

    public void setObs10a(String obs10a) {
        this.obs10a = obs10a;
        notifyPropertyChanged(BR.obs10a);
    }

    @Bindable
    public String getObs10ax() {
        return obs10ax;
    }

    public void setObs10ax(String obs10ax) {
        this.obs10ax = obs10ax;
        notifyPropertyChanged(BR.obs10ax);
    }

    @Bindable
    public String getObs10b() {
        return obs10b;
    }

    public void setObs10b(String obs10b) {
        this.obs10b = obs10b;
        notifyPropertyChanged(BR.obs10b);
    }

    @Bindable
    public String getObs11() {
        return obs11;
    }

    public void setObs11(String obs11) {
        this.obs11 = obs11;
        notifyPropertyChanged(BR.obs11);
    }

    @Bindable
    public String getObs11a() {
        return obs11a;
    }

    public void setObs11a(String obs11a) {
        this.obs11a = obs11a;
        notifyPropertyChanged(BR.obs11a);
    }

    @Bindable
    public String getObs11ax() {
        return obs11ax;
    }

    public void setObs11ax(String obs11ax) {
        this.obs11ax = obs11ax;
        notifyPropertyChanged(BR.obs11ax);
    }

    @Bindable
    public String getObs11b() {
        return obs11b;
    }

    public void setObs11b(String obs11b) {
        this.obs11b = obs11b;
        notifyPropertyChanged(BR.obs11b);
    }

    @Bindable
    public String getObs12() {
        return obs12;
    }

    public void setObs12(String obs12) {
        this.obs12 = obs12;
        notifyPropertyChanged(BR.obs12);
    }

    @Bindable
    public String getObs12a() {
        return obs12a;
    }

    public void setObs12a(String obs12a) {
        this.obs12a = obs12a;
        notifyPropertyChanged(BR.obs12a);
    }

    @Bindable
    public String getObs12ax() {
        return obs12ax;
    }

    public void setObs12ax(String obs12ax) {
        this.obs12ax = obs12ax;
        notifyPropertyChanged(BR.obs12ax);
    }

    @Bindable
    public String getObs12b() {
        return obs12b;
    }

    public void setObs12b(String obs12b) {
        this.obs12b = obs12b;
        notifyPropertyChanged(BR.obs12b);
    }

    @Bindable
    public String getObs13() {
        return obs13;
    }

    public void setObs13(String obs13) {
        this.obs13 = obs13;
        notifyPropertyChanged(BR.obs13);
    }

    @Bindable
    public String getObs13a() {
        return obs13a;
    }

    public void setObs13a(String obs13a) {
        this.obs13a = obs13a;
        notifyPropertyChanged(BR.obs13a);
    }

    @Bindable
    public String getObs13ax() {
        return obs13ax;
    }

    public void setObs13ax(String obs13ax) {
        this.obs13ax = obs13ax;
        notifyPropertyChanged(BR.obs13ax);
    }

    @Bindable
    public String getObs13b() {
        return obs13b;
    }

    public void setObs13b(String obs13b) {
        this.obs13b = obs13b;
        notifyPropertyChanged(BR.obs13b);
    }

    @Bindable
    public String getObs14() {
        return obs14;
    }

    public void setObs14(String obs14) {
        this.obs14 = obs14;
        notifyPropertyChanged(BR.obs14);
    }

    @Bindable
    public String getObs14a() {
        return obs14a;
    }

    public void setObs14a(String obs14a) {
        this.obs14a = obs14a;
        notifyPropertyChanged(BR.obs14a);
    }

    @Bindable
    public String getObs14ax() {
        return obs14ax;
    }

    public void setObs14ax(String obs14ax) {
        this.obs14ax = obs14ax;
        notifyPropertyChanged(BR.obs14ax);
    }

    @Bindable
    public String getObs14b() {
        return obs14b;
    }

    public void setObs14b(String obs14b) {
        this.obs14b = obs14b;
        notifyPropertyChanged(BR.obs14b);
    }

    @Bindable
    public String getObs15() {
        return obs15;
    }

    public void setObs15(String obs15) {
        this.obs15 = obs15;
        notifyPropertyChanged(BR.obs15);
    }

    @Bindable
    public String getObs15a() {
        return obs15a;
    }

    public void setObs15a(String obs15a) {
        this.obs15a = obs15a;
        notifyPropertyChanged(BR.obs15a);
    }

    @Bindable
    public String getObs15ax() {
        return obs15ax;
    }

    public void setObs15ax(String obs15ax) {
        this.obs15ax = obs15ax;
        notifyPropertyChanged(BR.obs15ax);
    }

    @Bindable
    public String getObs15b() {
        return obs15b;
    }

    public void setObs15b(String obs15b) {
        this.obs15b = obs15b;
        notifyPropertyChanged(BR.obs15b);
    }

    @Bindable
    public String getObs16() {
        return obs16;
    }

    public void setObs16(String obs16) {
        this.obs16 = obs16;
        notifyPropertyChanged(BR.obs16);
    }

    @Bindable
    public String getObs16a() {
        return obs16a;
    }

    public void setObs16a(String obs16a) {
        this.obs16a = obs16a;
        notifyPropertyChanged(BR.obs16a);
    }

    @Bindable
    public String getObs16ax() {
        return obs16ax;
    }

    public void setObs16ax(String obs16ax) {
        this.obs16ax = obs16ax;
        notifyPropertyChanged(BR.obs16ax);
    }

    @Bindable
    public String getObs16b() {
        return obs16b;
    }

    public void setObs16b(String obs16b) {
        this.obs16b = obs16b;
        notifyPropertyChanged(BR.obs16b);
    }

    @Bindable
    public String getObs17() {
        return obs17;
    }

    public void setObs17(String obs17) {
        this.obs17 = obs17;
        notifyPropertyChanged(BR.obs17);
    }

    @Bindable
    public String getObs17a() {
        return obs17a;
    }

    public void setObs17a(String obs17a) {
        this.obs17a = obs17a;
        notifyPropertyChanged(BR.obs17a);
    }

    @Bindable
    public String getObs17ax() {
        return obs17ax;
    }

    public void setObs17ax(String obs17ax) {
        this.obs17ax = obs17ax;
        notifyPropertyChanged(BR.obs17ax);
    }

    @Bindable
    public String getObs17b() {
        return obs17b;
    }

    public void setObs17b(String obs17b) {
        this.obs17b = obs17b;
        notifyPropertyChanged(BR.obs17b);
    }

    @Bindable
    public String getObs18() {
        return obs18;
    }

    public void setObs18(String obs18) {
        this.obs18 = obs18;
        notifyPropertyChanged(BR.obs18);
    }

    @Bindable
    public String getObs18a() {
        return obs18a;
    }

    public void setObs18a(String obs18a) {
        this.obs18a = obs18a;
        notifyPropertyChanged(BR.obs18a);
    }

    @Bindable
    public String getObs18ax() {
        return obs18ax;
    }

    public void setObs18ax(String obs18ax) {
        this.obs18ax = obs18ax;
        notifyPropertyChanged(BR.obs18ax);
    }

    @Bindable
    public String getObs18b() {
        return obs18b;
    }

    public void setObs18b(String obs18b) {
        this.obs18b = obs18b;
        notifyPropertyChanged(BR.obs18b);
    }

    @Bindable
    public String getObs19() {
        return obs19;
    }

    public void setObs19(String obs19) {
        this.obs19 = obs19;
        notifyPropertyChanged(BR.obs19);
    }

    @Bindable
    public String getObs19a() {
        return obs19a;
    }

    public void setObs19a(String obs19a) {
        this.obs19a = obs19a;
        notifyPropertyChanged(BR.obs19a);
    }

    @Bindable
    public String getObs19ax() {
        return obs19ax;
    }

    public void setObs19ax(String obs19ax) {
        this.obs19ax = obs19ax;
        notifyPropertyChanged(BR.obs19ax);
    }

    @Bindable
    public String getObs19b() {
        return obs19b;
    }

    public void setObs19b(String obs19b) {
        this.obs19b = obs19b;
        notifyPropertyChanged(BR.obs19b);
    }

    @Bindable
    public String getObs20() {
        return obs20;
    }

    public void setObs20(String obs20) {
        this.obs20 = obs20;
        notifyPropertyChanged(BR.obs20);
    }

    @Bindable
    public String getObs20a() {
        return obs20a;
    }

    public void setObs20a(String obs20a) {
        this.obs20a = obs20a;
        notifyPropertyChanged(BR.obs20a);
    }

    @Bindable
    public String getObs20ax() {
        return obs20ax;
    }

    public void setObs20ax(String obs20ax) {
        this.obs20ax = obs20ax;
        notifyPropertyChanged(BR.obs20ax);
    }

    @Bindable
    public String getObs20b() {
        return obs20b;
    }

    public void setObs20b(String obs20b) {
        this.obs20b = obs20b;
        notifyPropertyChanged(BR.obs20b);
    }

    @Bindable
    public String getFpr01() {
        return fpr01;
    }

    public void setFpr01(String fpr01) {
        this.fpr01 = fpr01;
        notifyPropertyChanged(BR.fpr01);
    }

    @Bindable
    public String getFpr0197() {
        return fpr0197;
    }

    public void setFpr0197(String fpr0197) {
        this.fpr0197 = fpr0197;
        notifyPropertyChanged(BR.fpr0197);
    }

    @Bindable
    public String getFpr02() {
        return fpr02;
    }

    public void setFpr02(String fpr02) {
        this.fpr02 = fpr02;
        notifyPropertyChanged(BR.fpr02);
    }

    @Bindable
    public String getFpr0297() {
        return fpr0297;
    }

    public void setFpr0297(String fpr0297) {
        this.fpr0297 = fpr0297;
        notifyPropertyChanged(BR.fpr0297);
    }

    @Bindable
    public String getFpr03() {
        return fpr03;
    }

    public void setFpr03(String fpr03) {
        this.fpr03 = fpr03;
        notifyPropertyChanged(BR.fpr03);
    }

    @Bindable
    public String getFpr0397() {
        return fpr0397;
    }

    public void setFpr0397(String fpr0397) {
        this.fpr0397 = fpr0397;
        notifyPropertyChanged(BR.fpr0397);
    }

    @Bindable
    public String getFpr04() {
        return fpr04;
    }

    public void setFpr04(String fpr04) {
        this.fpr04 = fpr04;
        notifyPropertyChanged(BR.fpr04);
    }

    @Bindable
    public String getFpr0497() {
        return fpr0497;
    }

    public void setFpr0497(String fpr0497) {
        this.fpr0497 = fpr0497;
        notifyPropertyChanged(BR.fpr0497);
    }

    @Bindable
    public String getFpr05() {
        return fpr05;
    }

    public void setFpr05(String fpr05) {
        this.fpr05 = fpr05;
        notifyPropertyChanged(BR.fpr05);
    }

    @Bindable
    public String getFpr0597() {
        return fpr0597;
    }

    public void setFpr0597(String fpr0597) {
        this.fpr0597 = fpr0597;
        notifyPropertyChanged(BR.fpr0597);
    }

    @Bindable
    public String getFpr06() {
        return fpr06;
    }

    public void setFpr06(String fpr06) {
        this.fpr06 = fpr06;
        notifyPropertyChanged(BR.fpr06);
    }

    @Bindable
    public String getFpr0697() {
        return fpr0697;
    }

    public void setFpr0697(String fpr0697) {
        this.fpr0697 = fpr0697;
        notifyPropertyChanged(BR.fpr0697);
    }

    @Bindable
    public String getFpr07() {
        return fpr07;
    }

    public void setFpr07(String fpr07) {
        this.fpr07 = fpr07;
        notifyPropertyChanged(BR.fpr07);
    }

    @Bindable
    public String getFpr0797() {
        return fpr0797;
    }

    public void setFpr0797(String fpr0797) {
        this.fpr0797 = fpr0797;
        notifyPropertyChanged(BR.fpr0797);
    }

    @Bindable
    public String getFpr08() {
        return fpr08;
    }

    public void setFpr08(String fpr08) {
        this.fpr08 = fpr08;
        notifyPropertyChanged(BR.fpr08);
    }

    @Bindable
    public String getFpr0897() {
        return fpr0897;
    }

    public void setFpr0897(String fpr0897) {
        this.fpr0897 = fpr0897;
        notifyPropertyChanged(BR.fpr0897);
    }

    @Bindable
    public String getFpr09() {
        return fpr09;
    }

    public void setFpr09(String fpr09) {
        this.fpr09 = fpr09;
        notifyPropertyChanged(BR.fpr09);
    }

    @Bindable
    public String getFpr0997() {
        return fpr0997;
    }

    public void setFpr0997(String fpr0997) {
        this.fpr0997 = fpr0997;
        notifyPropertyChanged(BR.fpr997);
    }

    @Bindable
    public String getFpr10() {
        return fpr10;
    }

    public void setFpr10(String fpr10) {
        this.fpr10 = fpr10;
        notifyPropertyChanged(BR.fpr10);
    }

    @Bindable
    public String getFpr1097() {
        return fpr1097;
    }

    public void setFpr1097(String fpr1097) {
        this.fpr1097 = fpr1097;
        notifyPropertyChanged(BR.fpr1097);
    }

    @Bindable
    public String getFpr11() {
        return fpr11;
    }

    public void setFpr11(String fpr11) {
        this.fpr11 = fpr11;
        notifyPropertyChanged(BR.fpr11);
    }

    @Bindable
    public String getFpr1197() {
        return fpr1197;
    }

    public void setFpr1197(String fpr1197) {
        this.fpr1197 = fpr1197;
        notifyPropertyChanged(BR.fpr1197);
    }

    @Bindable
    public String getCfp01() {
        return cfp01;
    }

    public void setCfp01(String cfp01) {
        this.cfp01 = cfp01;
        notifyPropertyChanged(BR.cfp01);
    }

    @Bindable
    public String getCfp0197() {
        return cfp0197;
    }

    public void setCfp0197(String cfp0197) {
        this.cfp0197 = cfp0197;
        notifyPropertyChanged(BR.cfp01a);
    }

    @Bindable
    public String getCfp01ax() {
        return cfp01ax;
    }

    public void setCfp01ax(String cfp01ax) {
        this.cfp01ax = cfp01ax;
        notifyPropertyChanged(BR.cfp01ax);
    }

    @Bindable
    public String getCfp01b() {
        return cfp01b;
    }

    public void setCfp01b(String cfp01b) {
        this.cfp01b = cfp01b;
        notifyPropertyChanged(BR.cfp01b);
    }

    @Bindable
    public String getCfp02() {
        return cfp02;
    }

    public void setCfp02(String cfp02) {
        this.cfp02 = cfp02;
        notifyPropertyChanged(BR.cfp02);
    }

    @Bindable
    public String getCfp02a() {
        return cfp02a;
    }

    public void setCfp02a(String cfp02a) {
        this.cfp02a = cfp02a;
        notifyPropertyChanged(BR.cfp02a);
    }

    @Bindable
    public String getCfp02ax() {
        return cfp02ax;
    }

    public void setCfp02ax(String cfp02ax) {
        this.cfp02ax = cfp02ax;
        notifyPropertyChanged(BR.cfp02ax);
    }

    @Bindable
    public String getCfp0297() {
        return cfp0297;
    }

    public void setCfp0297(String cfp0297) {
        this.cfp0297 = cfp0297;
        notifyPropertyChanged(BR.cfp02b);
    }

    @Bindable
    public String getCfp03() {
        return cfp03;
    }

    public void setCfp03(String cfp03) {
        this.cfp03 = cfp03;
        notifyPropertyChanged(BR.cfp03);
    }

    @Bindable
    public String getCfp03a() {
        return cfp03a;
    }

    public void setCfp03a(String cfp03a) {
        this.cfp03a = cfp03a;
        notifyPropertyChanged(BR.cfp03a);
    }

    @Bindable
    public String getCfp03ax() {
        return cfp03ax;
    }

    public void setCfp03ax(String cfp03ax) {
        this.cfp03ax = cfp03ax;
        notifyPropertyChanged(BR.cfp03ax);
    }

    @Bindable
    public String getCfp0397() {
        return cfp0397;
    }

    public void setCfp0397(String cfp0397) {
        this.cfp0397 = cfp0397;
        notifyPropertyChanged(BR.cfp03b);
    }

    @Bindable
    public String getStr01s() {
        return str01s;
    }

    public void setStr01s(String str01s) {
        this.str01s = str01s;
        notifyPropertyChanged(BR.str01s);
    }

    @Bindable
    public String getStr01d() {
        return str01d;
    }

    public void setStr01d(String str01d) {
        this.str01d = str01d;
        notifyPropertyChanged(BR.str01d);
    }

    @Bindable
    public String getStr01m() {
        return str01m;
    }

    public void setStr01m(String str01m) {
        this.str01m = str01m;
        notifyPropertyChanged(BR.str01m);
    }

    @Bindable
    public String getStr02s() {
        return str02s;
    }

    public void setStr02s(String str02s) {
        this.str02s = str02s;
        notifyPropertyChanged(BR.str02s);
    }

    @Bindable
    public String getStr02d() {
        return str02d;
    }

    public void setStr02d(String str02d) {
        this.str02d = str02d;
        notifyPropertyChanged(BR.str02d);
    }

    @Bindable
    public String getStr02m() {
        return str02m;
    }

    public void setStr02m(String str02m) {
        this.str02m = str02m;
        notifyPropertyChanged(BR.str02m);
    }

    @Bindable
    public String getStr03s() {
        return str03s;
    }

    public void setStr03s(String str03s) {
        this.str03s = str03s;
        notifyPropertyChanged(BR.str03s);
    }

    @Bindable
    public String getStr03d() {
        return str03d;
    }

    public void setStr03d(String str03d) {
        this.str03d = str03d;
        notifyPropertyChanged(BR.str03d);
    }

    @Bindable
    public String getStr03m() {
        return str03m;
    }

    public void setStr03m(String str03m) {
        this.str03m = str03m;
        notifyPropertyChanged(BR.str03m);
    }

    @Bindable
    public String getStr04s() {
        return str04s;
    }

    public void setStr04s(String str04s) {
        this.str04s = str04s;
        notifyPropertyChanged(BR.str04s);
    }

    @Bindable
    public String getStr04d() {
        return str04d;
    }

    public void setStr04d(String str04d) {
        this.str04d = str04d;
        notifyPropertyChanged(BR.str04d);
    }

    @Bindable
    public String getStr04m() {
        return str04m;
    }

    public void setStr04m(String str04m) {
        this.str04m = str04m;
        notifyPropertyChanged(BR.str04m);
    }

    @Bindable
    public String getStr05s() {
        return str05s;
    }

    public void setStr05s(String str05s) {
        this.str05s = str05s;
        notifyPropertyChanged(BR.str05s);
    }

    @Bindable
    public String getStr05d() {
        return str05d;
    }

    public void setStr05d(String str05d) {
        this.str05d = str05d;
        notifyPropertyChanged(BR.str05d);
    }

    @Bindable
    public String getStr05m() {
        return str05m;
    }

    public void setStr05m(String str05m) {
        this.str05m = str05m;
        notifyPropertyChanged(BR.str05m);
    }

    @Bindable
    public String getStr06s() {
        return str06s;
    }

    public void setStr06s(String str06s) {
        this.str06s = str06s;
        notifyPropertyChanged(BR.str06s);
    }

    @Bindable
    public String getStr06d() {
        return str06d;
    }

    public void setStr06d(String str06d) {
        this.str06d = str06d;
        notifyPropertyChanged(BR.str06d);
    }

    @Bindable
    public String getStr06m() {
        return str06m;
    }

    public void setStr06m(String str06m) {
        this.str06m = str06m;
        notifyPropertyChanged(BR.str06m);
    }

    @Bindable
    public String getStr07s() {
        return str07s;
    }

    public void setStr07s(String str07s) {
        this.str07s = str07s;
        notifyPropertyChanged(BR.str07s);
    }

    @Bindable
    public String getStr07d() {
        return str07d;
    }

    public void setStr07d(String str07d) {
        this.str07d = str07d;
        notifyPropertyChanged(BR.str07d);
    }

    @Bindable
    public String getStr07m() {
        return str07m;
    }

    public void setStr07m(String str07m) {
        this.str07m = str07m;
        notifyPropertyChanged(BR.str07m);
    }

    @Bindable
    public String getStr08s() {
        return str08s;
    }

    public void setStr08s(String str08s) {
        this.str08s = str08s;
        notifyPropertyChanged(BR.str08s);
    }

    @Bindable
    public String getStr08d() {
        return str08d;
    }

    public void setStr08d(String str08d) {
        this.str08d = str08d;
        notifyPropertyChanged(BR.str08d);
    }

    @Bindable
    public String getStr08m() {
        return str08m;
    }

    public void setStr08m(String str08m) {
        this.str08m = str08m;
        notifyPropertyChanged(BR.str08m);
    }

    @Bindable
    public String getStr09s() {
        return str09s;
    }

    public void setStr09s(String str09s) {
        this.str09s = str09s;
        notifyPropertyChanged(BR.str09s);
    }

    @Bindable
    public String getStr09d() {
        return str09d;
    }

    public void setStr09d(String str09d) {
        this.str09d = str09d;
        notifyPropertyChanged(BR.str09d);
    }

    @Bindable
    public String getStr09m() {
        return str09m;
    }

    public void setStr09m(String str09m) {
        this.str09m = str09m;
        notifyPropertyChanged(BR.str09m);
    }


    public Form Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(FormsTable.COLUMN_ID);
        this.uid = jsonObject.getString(FormsTable.COLUMN_UID);
        this.userName = jsonObject.getString(FormsTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(FormsTable.COLUMN_SYSDATE);
        this.districtCode = jsonObject.getString(FormsTable.COLUMN_DISTRICT_CODE);
        this.districtName = jsonObject.getString(FormsTable.COLUMN_DISTRICT_NAME);
        this.hfCode = jsonObject.getString(FormsTable.COLUMN_HF_CODE);
        this.hfName = jsonObject.getString(FormsTable.COLUMN_HF_NAME);
        this.reportingMonth = jsonObject.getString(FormsTable.COLUMN_REPORTING_MONTH);
        this.reportingYear = jsonObject.getString(FormsTable.COLUMN_REPORTING_YEAR);
        this.deviceId = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(FormsTable.COLUMN_APPVERSION);
        this.endTime = jsonObject.getString(FormsTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(FormsTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);

        this.sA = jsonObject.getString(FormsTable.COLUMN_SA);
        this.sB = jsonObject.getString(FormsTable.COLUMN_SB);
        this.sC = jsonObject.getString(FormsTable.COLUMN_SC);
        this.sD = jsonObject.getString(FormsTable.COLUMN_SD);
        this.sE = jsonObject.getString(FormsTable.COLUMN_SE);

        return this;

    }


    public Form Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYSDATE));
        this.districtCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DISTRICT_CODE));
        this.districtName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DISTRICT_NAME));
        this.hfCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HF_CODE));
        this.hfName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HF_NAME));
        this.reportingMonth = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_REPORTING_MONTH));
        this.reportingYear = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_REPORTING_YEAR));
        this.deviceId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));
        this.endTime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA));

        sAHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA)));
        sBHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB)));
        sCHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC)));
        sDHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD)));
        sEHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form.class);
    }


    public String sAtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("hh01", hh01)
                    .put("hh01", hh01)
                    .put("hh0201", hh0201)
                    .put("hh0202", hh0202)
                    .put("hh03", hh03)
                    .put("hh04", hh04)
                    .put("hh05", hh05)
                    .put("hh06", hh06)
                    .put("hh07", hh07)
                    .put("hh08", hh08)
                    .put("hh09", hh09)
                    .put("hh10", hh10)
                    .put("hh11", hh11)
                    .put("hh12", hh12)
                    .put("hh13", hh13)
                    .put("hh14", hh14)
                    .put("hh15", hh15)
                    .put("hh16", hh16)
                    .put("hh17", hh17)
                    .put("hh1796x", hh1796x)
                    .put("hh18", hh18)
                    .put("hh19", hh19)
                    .put("hh20", hh20)
                    .put("hh2096x", hh2096x)
                    .put("hh21", hh21)
                    .put("hh22", hh22)
                    .put("hh23", hh23)
                    .put("hh24", hh24)
                    .put("hh25", hh25)
                    .put("hh25a", hh25a)
                    .put("hh26", hh26)
                    .put("hh2696x", hh2696x);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public String sBtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("pd01", pd01)
                    .put("pd02", pd02)
                    .put("pd03", pd03)
                    .put("pd04", pd04)
                    .put("pd05", pd05)
                    .put("pd0596x", pd0596x)
                    .put("pd06", pd06)
                    .put("pd06961x", pd06961x)
                    .put("pd06962x", pd06962x)
                    .put("pd07", pd07)
                    .put("pd0701x", pd0701x)
                    .put("pd08", pd08)
                    .put("pd08b", pd08b)
                    .put("pd08c", pd08c)
                    .put("pd08a01", pd08a01)
                    .put("pd08a02", pd08a02)
                    .put("pd08a03", pd08a03)
                    .put("pd08a04", pd08a04)
                    .put("pd08a05", pd08a05)
                    .put("pd08a06", pd08a06)
                    .put("pd08a07", pd08a07)
                    .put("pd08a08", pd08a08)
                    .put("pd08a09", pd08a09)
                    .put("pd08a96", pd08a96)
                    .put("pd08a96x", pd08a96x)
                    .put("pd09", pd09)
                    .put("pd10", pd10)
                    .put("pd1101", pd1101)
                    .put("pd1102", pd1102)
                    .put("pd12", pd12)
                    .put("pd1296x", pd1296x)
                    .put("pd13", pd13)
                    .put("pd13961x", pd13961x)
                    .put("pd13962x", pd13962x)
                    .put("pd14", pd14)
                    .put("pd1496x", pd1496x)
                    .put("pd15", pd15)
                    .put("pd16", pd16)
                    .put("pd1601", pd1601)
                    .put("pd1602", pd1602)
                    .put("pd1603", pd1603)
                    .put("pd1604", pd1604)
                    .put("pd1605", pd1605)
                    .put("pd1606", pd1606)
                    .put("pd1607", pd1607)
                    .put("pd1696", pd1696)
                    .put("pd1696x", pd1696x)
                    .put("pd17", pd17)
                    .put("pd1701x", pd1701x)
                    .put("pd1702x", pd1702x)
                    .put("pd1703x", pd1703x)
                    .put("pd18", pd18)
                    .put("pd19", pd19)
                    .put("pd20", pd20)
                    .put("pd2001", pd2001)
                    .put("pd2002", pd2002)
                    .put("pd2003", pd2003)
                    .put("pd2004", pd2004)
                    .put("pd2005", pd2005)
                    .put("pd2006", pd2006)
                    .put("pd2007", pd2007)
                    .put("pd2096", pd2096)
                    .put("pd2096x", pd2096x)
                    .put("pd21", pd21)
                    .put("pd2101x", pd2101x)
                    .put("pd2102x", pd2102x)
                    .put("pd2103x", pd2103x)
                    .put("pd22", pd22)

                    .put("pd23", pd23)
                    .put("pd2401", pd2401)

                    .put("pd2402", pd2402)

                    .put("pd2403", pd2403)

                    .put("pd2404", pd2404)

                    .put("pd2405", pd2405)

                    .put("pd2406", pd2406)

                    .put("pd2496", pd2496)

                    .put("pd2496x", pd2496x)
                    .put("pd2498", pd2498)
                    .put("pddate", pddate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public String sCtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("bf01", bf01)
                    .put("bf02", bf02)
                    .put("bf03", bf03)
                    .put("bf3y", bf3y)
                    .put("bf03m", bf03m)
                    .put("bf3d", bf3d)
                    .put("bf03a01", bf03a01)
                    .put("bf03a02", bf03a02)
                    .put("bf04", bf04)
                    .put("bf05", bf05)
                    .put("bf0502x", bf0502x)
                    .put("bf0503x", bf0503x)
                    .put("bf06", bf06)
                    .put("bf07", bf07)
                    .put("bf0796x", bf0796x)
                    .put("bf08", bf08)
                    .put("bf0901", bf0901)
                    .put("bf0902", bf0902)
                    .put("bf0903", bf0903)
                    .put("bf0904", bf0904)
                    .put("bf0905", bf0905)
                    .put("bf0906", bf0906)
                    .put("bf0907", bf0907)
                    .put("bf0908", bf0908)
                    .put("bf0909", bf0909)
                    .put("bf0910", bf0910)
                    .put("bf0999", bf0999)
                    .put("bf0996", bf0996)
                    .put("bf0996x", bf0996x)
                    .put("bf10", bf10)
                    .put("bf11", bf11)
                    .put("bf12", bf12)
                    .put("bf13", bf13)
                    .put("bf14a", bf14a)
                    .put("bf14b", bf14b)
                    .put("bf14b01x", bf14b01x)
                    .put("bf14c", bf14c)
                    .put("bf14c01x", bf14c01x)
                    .put("bf14d", bf14d)
                    .put("bf14e", bf14e)
                    .put("bf14e01x", bf14e01x)
                    .put("bf14f", bf14f)
                    .put("bf14f01x", bf14f01x)
                    .put("bf14g", bf14g)
                    .put("bf14h", bf14h)
                    .put("bf14i", bf14i)
                    .put("bf15a", bf15a)
                    .put("bf15b", bf15b)
                    .put("bf15c", bf15c)
                    .put("bf15d", bf15d)
                    .put("bf15e", bf15e)
                    .put("bf15f", bf15f)
                    .put("bf15g", bf15g)
                    .put("bf15h", bf15h)
                    .put("bf15i", bf15i)
                    .put("bf15j", bf15j)
                    .put("bf15k", bf15k)
                    .put("bf15l", bf15l)
                    .put("bf15m", bf15m)
                    .put("bf15n", bf15n)
                    .put("bf15o", bf15o)
                    //    .put("bf15p", bf15p)
                    .put("bf15q", bf15q)
                    .put("bf16", bf16)
                    .put("bf17", bf17)
                    .put("bf1701x", bf1701x)
                    .put("bf18", bf18)
                    .put("bf19", bf19)
                    .put("bf1996x", bf1996x)
                    .put("bf20", bf20)
                    .put("bfdate", bfdate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public String sDtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("cv01", cv01)
                    .put("cv02", cv02)
                    .put("cv03", cv03)
                    .put("cv04", cv04)
                    .put("cv0501", cv0501)
                    .put("cv0502", cv0502)
                    .put("cv0503", cv0503)
                    .put("cv0504", cv0504)
                    .put("cv0505", cv0505)
                    .put("cv0506", cv0506)
                    .put("cv0507", cv0507)
                    .put("cv0596", cv0596)
                    .put("cv0596x", cv0596x)
                    .put("cv0601", cv0601)
                    .put("cv0602", cv0602)
                    .put("cv0603", cv0603)
                    .put("cv0604", cv0604)
                    .put("cv0605", cv0605)
                    .put("cv0606", cv0606)
                    .put("cv0607", cv0607)
                    .put("cv0608", cv0608)
                    .put("cv0609", cv0609)
                    .put("cv0610", cv0610)
                    .put("cv0611", cv0611)
                    .put("cv0696", cv0696)
                    .put("cv0696x", cv0696x)
                    .put("cv07", cv07)
                    .put("cv0801", cv0801)
                    .put("cv0802", cv0802)
                    .put("cv0803", cv0803)
                    .put("cv0804", cv0804)
                    .put("cv0805", cv0805)
                    .put("cv0806", cv0806)
                    .put("cv0807", cv0807)
                    .put("cv0898", cv0898)
                    .put("cv0896", cv0896)
                    .put("cv0896x", cv0896x)
                    .put("cv0901", cv0901)
                    .put("cv0902", cv0902)
                    .put("cv0903", cv0903)
                    .put("cv0904", cv0904)
                    .put("cv0905", cv0905)
                    .put("cv0906", cv0906)
                    .put("cv0907", cv0907)
                    .put("cv0998", cv0998)
                    .put("cv0996", cv0996)
                    .put("cv0996x", cv0996x)
                    .put("cv1001", cv1001)
                    .put("cv1002", cv1002)
                    .put("cv1003", cv1003)
                    .put("cv1004", cv1004)
                    .put("cv1005", cv1005)
                    .put("cv1006", cv1006)
                    .put("cv1007", cv1007)
                    .put("cv1008", cv1008)
                    .put("cv1098", cv1098)
                    .put("cv1096", cv1096)
                    .put("cv1096x", cv1096x)
                    .put("cv11", cv11)
                    .put("cv12", cv12)
                    .put("cv1296x", cv1296x)
                    .put("cv13", cv13)
                    .put("cv14", cv14)
                    .put("cv15", cv15)
                    .put("cv16", cv16)
                    .put("cv1696x", cv1696x)
                    .put("cv17", cv17)
                    .put("cv18", cv18)
                    .put("cv1896x", cv1896x)
                    .put("cv19", cv19)
                    .put("cv1996x", cv1996x)
                    .put("cvdate", cvdate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public String sEtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("se01", se01)
                    .put("se0196x", se0196x)
                    .put("se02", se02)
                    .put("se0296x", se0296x)
                    .put("se03", se03)
                    .put("se0396x", se0396x)
                    .put("se04", se04)
                    .put("se0496x", se0496x)
                    .put("se05", se05)
                    .put("se0596x", se0596x)
                    .put("se06a", se06a)
                    .put("se07a", se07a)
                    .put("se08", se08)
                    .put("se0896x", se0896x)
                    .put("se09", se09)
                    .put("se10", se10)
                    .put("se1099x", se1099x)
                    .put("se11", se11)
                    .put("se1196x", se1196x)
                    .put("se12", se12)
                    .put("se1296x", se1296x)
                    .put("se13", se13)
                    .put("se14", se14)
                    .put("se15", se15)
                    .put("se16", se16)
                    .put("se17", se17)
                    .put("se1701", se1701)
                    .put("se1702", se1702)
                    .put("se1703", se1703)
                    .put("se1704", se1704)
                    .put("se1705", se1705)
                    .put("se1801", se1801)
                    .put("se1802", se1802)
                    .put("se1803", se1803)
                    .put("se1804", se1804)
                    .put("se1805", se1805)
                    .put("se1896", se1896)
                    .put("se189601x", se189601x)
                    .put("se19", se19)
                    .put("se1996x", se1996x)
                    .put("se2001", se2001)
                    .put("se2002", se2002)
                    .put("se2003", se2003)
                    .put("se2004", se2004)
                    .put("se2005", se2005)
                    .put("se2006", se2006)
                    .put("se2096", se2096)
                    .put("se2096x", se2096x)
                    .put("se2101", se2101)
                    .put("se2102", se2102)
                    .put("se2103", se2103)
                    .put("se2104", se2104)
                    .put("se2105", se2105)
                    .put("se2196", se2196)
                    .put("se2196x", se2196x)
                    .put("se2201", se2201)
                    .put("se2202", se2202)
                    .put("se2203", se2203)
                    .put("se2204", se2204)
                    .put("se2205", se2205)
                    .put("se2206", se2206)
                    .put("se2207", se2207)
                    .put("se2208", se2208)
                    .put("se2209", se2209)
                    .put("se2210", se2210)
                    .put("se2211", se2211)
                    .put("se2212", se2212)
                    .put("se2213", se2213)
                    .put("se2214", se2214)
                    .put("se2215", se2215)
                    .put("se2216", se2216)
                    .put("se2217", se2217)
                    .put("se2218", se2218)
                    .put("se23", se23)
                    .put("se24", se24)
                    .put("se25", se25)
                    .put("se26", se26)
                    .put("se27", se27)
                    .put("se2701", se2701)
                    .put("se2702", se2702)
                    .put("se2703", se2703)
                    .put("se2704", se2704)
                    .put("se28", se28)
                    .put("se2801", se2801)
                    .put("se2802", se2802)
                    .put("se2803", se2803)
                    .put("se29", se29)
                    .put("se30", se30)
                    .put("se3001", se3001)
                    .put("se3002", se3002)
                    .put("se3003", se3003)
                    .put("se3096", se3096)
                    .put("se3096x", se3096x)
                    .put("se31", se31)
                    .put("se3196x", se3196x)
                    .put("se32", se32)
                    .put("se3302", se3302)
                    .put("se3301", se3301)
                    .put("se3401", se3401)
                    .put("se3402", se3402)
                    .put("se35", se35)
                    .put("se36", se36)
                    .put("se37", se37)
                    .put("se3701", se3701)
                    .put("se3702", se3702)
                    .put("se3703", se3703)
                    .put("se3704", se3704)
                    .put("se3705", se3705)
                    .put("se3706", se3706)
                    .put("se3707", se3707)
                    .put("se3708", se3708)
                    .put("se3709", se3709)
                    .put("se3710", se3710)
                    .put("se3796", se3796)
                    .put("se3796x", se3796x)
                    .put("se38", se38)
                    .put("se39", se39)
                    .put("se40", se40)
                    .put("sedate", sedate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(FormsTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(FormsTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(FormsTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(FormsTable.COLUMN_DISTRICT_CODE, this.districtCode == null ? JSONObject.NULL : this.districtCode);
            json.put(FormsTable.COLUMN_DISTRICT_NAME, this.districtName == null ? JSONObject.NULL : this.districtName);
            json.put(FormsTable.COLUMN_HF_CODE, this.hfCode == null ? JSONObject.NULL : this.hfCode);
            json.put(FormsTable.COLUMN_HF_NAME, this.hfName == null ? JSONObject.NULL : this.hfName);
            json.put(FormsTable.COLUMN_REPORTING_MONTH, this.reportingMonth == null ? JSONObject.NULL : this.reportingMonth);
            json.put(FormsTable.COLUMN_REPORTING_YEAR, this.reportingYear == null ? JSONObject.NULL : this.reportingYear);
            json.put(FormsTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);
            json.put(FormsTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endTime == null ? JSONObject.NULL : this.endTime);
            json.put(FormsTable.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
            json.put(FormsTable.COLUMN_ISTATUS96x, this.iStatus96x == null ? JSONObject.NULL : this.iStatus96x);
            json.put(FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(FormsTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);

            json.put(FormsTable.COLUMN_SA, new JSONObject(sAtoString()));
            json.put(FormsTable.COLUMN_SB, new JSONObject(sBtoString()));
            json.put(FormsTable.COLUMN_SC, new JSONObject(sCtoString()));
            json.put(FormsTable.COLUMN_SD, new JSONObject(sDtoString()));
            json.put(FormsTable.COLUMN_SE, new JSONObject(sEtoString()));


            if (this.sA != null && !this.sA.isEmpty()) {
                json.put(FormsTable.COLUMN_SA, new JSONObject(this.sA));
            }

            if (this.sB != null && !this.sB.isEmpty()) {
                json.put(FormsTable.COLUMN_SB, new JSONObject(this.sB));
            }

            if (this.sC != null && !this.sC.isEmpty()) {
                json.put(FormsTable.COLUMN_SC, new JSONObject(this.sC));
            }

            if (this.sD != null && !this.sD.isEmpty()) {
                json.put(FormsTable.COLUMN_SD, new JSONObject(this.sD));
            }

            if (this.sE != null && !this.sE.isEmpty()) {
                json.put(FormsTable.COLUMN_SE, new JSONObject(this.sE));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void sAHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.hh01 = json.getString("hh01");
                this.hh0201 = json.getString("hh0201");
                this.hh0202 = json.getString("hh0202");
                this.hh03 = json.getString("hh03");
                this.hh04 = json.getString("hh04");
                this.hh05 = json.getString("hh05");
                this.hh06 = json.getString("hh06");
                this.hh07 = json.getString("hh07");
                this.hh08 = json.getString("hh08");
                this.hh09 = json.getString("hh09");
                this.hh10 = json.getString("hh10");
                this.hh11 = json.getString("hh11");
                this.hh12 = json.getString("hh12");
                this.hh13 = json.getString("hh13");
                this.hh14 = json.getString("hh14");
                this.hh15 = json.getString("hh15");
                this.hh16 = json.getString("hh16");
                this.hh17 = json.getString("hh17");
                this.hh1796x = json.getString("hh1796x");
                this.hh18 = json.getString("hh18");
                this.hh19 = json.getString("hh19");
                this.hh20 = json.getString("hh20");
                this.hh2096x = json.getString("hh2096x");
                this.hh21 = json.getString("hh21");
                this.hh22 = json.getString("hh22");
                this.hh23 = json.getString("hh23");
                this.hh24 = json.getString("hh24");
                this.hh25 = json.getString("hh25");
                this.hh25a = json.getString("hh25a");
                this.hh26 = json.getString("hh26");
                this.hh2696x = json.getString("hh2696x");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void sBHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.pd01 = json.getString("pd01");
                this.pd02 = json.getString("pd02");
                this.pd03 = json.getString("pd03");
                this.pd04 = json.getString("pd04");
                this.pd05 = json.getString("pd05");
                this.pd0596x = json.getString("pd0596x");
                this.pd06 = json.getString("pd06");
                this.pd06961x = json.getString("pd06961x");
                this.pd06962x = json.getString("pd06962x");
                this.pd07 = json.getString("pd07");
                this.pd0701x = json.getString("pd0701x");
                this.pd08 = json.getString("pd08");
                this.pd08a01 = json.getString("pd08a01");
                this.pd08a02 = json.getString("pd08a02");
                this.pd08a03 = json.getString("pd08a03");
                this.pd08a04 = json.getString("pd08a04");
                this.pd08a05 = json.getString("pd08a05");
                this.pd08a06 = json.getString("pd08a06");
                this.pd08a07 = json.getString("pd08a07");
                this.pd08a08 = json.getString("pd08a08");
                this.pd08a09 = json.getString("pd08a09");
                this.pd08a96 = json.getString("pd08a96");
                this.pd08a96x = json.getString("pd08a96x");
                this.pd08b = json.getString("pd08b");
                this.pd08c = json.getString("pd08c");
                this.pd09 = json.getString("pd09");
                this.pd10 = json.getString("pd10");
                this.pd1101 = json.getString("pd1101");
                this.pd1102 = json.getString("pd1102");
                this.pd12 = json.getString("pd12");
                this.pd1296x = json.getString("pd1296x");
                this.pd13 = json.getString("pd13");
                this.pd13961x = json.getString("pd13961x");
                this.pd13962x = json.getString("pd13962x");
                this.pd14 = json.getString("pd14");
                this.pd1496x = json.getString("pd1496x");
                this.pd15 = json.getString("pd15");
                this.pd16 = json.getString("pd16");
                this.pd1601 = json.getString("pd1601");
                this.pd1602 = json.getString("pd1602");
                this.pd1603 = json.getString("pd1603");
                this.pd1604 = json.getString("pd1604");
                this.pd1605 = json.getString("pd1605");
                this.pd1606 = json.getString("pd1606");
                this.pd1607 = json.getString("pd1607");
                this.pd1696 = json.getString("pd1696");
                this.pd1696x = json.getString("pd1696x");
                this.pd17 = json.getString("pd17");
                this.pd1701x = json.getString("pd1701x");
                this.pd1702x = json.getString("pd1702x");
                this.pd1703x = json.getString("pd1703x");
                this.pd18 = json.getString("pd18");
                this.pd19 = json.getString("pd19");
                this.pd20 = json.getString("pd20");
                this.pd2001 = json.getString("pd2001");
                this.pd2002 = json.getString("pd2002");
                this.pd2003 = json.getString("pd2003");
                this.pd2004 = json.getString("pd2004");
                this.pd2005 = json.getString("pd2005");
                this.pd2006 = json.getString("pd2006");
                this.pd2007 = json.getString("pd2007");
                this.pd2096 = json.getString("pd2096");
                this.pd2096x = json.getString("pd2096x");
                this.pd21 = json.getString("pd21");
                this.pd2101x = json.getString("pd2101x");
                this.pd2102x = json.getString("pd2102x");
                this.pd2103x = json.getString("pd2103x");
                this.pd22 = json.getString("pd22");
                this.pd23 = json.getString("pd23");
                this.pd2401 = json.getString("pd2401");
                this.pd2402 = json.getString("pd2402");
                this.pd2403 = json.getString("pd2403");
                this.pd2404 = json.getString("pd2404");
                this.pd2405 = json.getString("pd2405");
                this.pd2406 = json.getString("pd2406");
                this.pd2496 = json.getString("pd2496");
                this.pd2496x = json.getString("pd2496x");
                this.pd2498 = json.getString("pd2498");

                this.pddate = json.getString("pddate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void sCHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.bf01 = json.getString("bf01");
                this.bf02 = json.getString("bf02");
                this.bf03 = json.getString("bf03");
                this.bf3y = json.getString("bf3y");
                this.bf03m = json.getString("bf03m");
                this.bf3d = json.getString("bf3d");
                this.bf03a01 = json.getString("bf03a01");
                this.bf03a02 = json.getString("bf03a02");
                this.bf04 = json.getString("bf04");
                this.bf05 = json.getString("bf05");
                this.bf0502x = json.getString("bf0502x");
                this.bf0503x = json.getString("bf0503x");
                this.bf06 = json.getString("bf06");
                this.bf07 = json.getString("bf07");
                this.bf0796x = json.getString("bf0796x");
                this.bf08 = json.getString("bf08");
                this.bf0901 = json.getString("bf0901");
                this.bf0902 = json.getString("bf0902");
                this.bf0903 = json.getString("bf0903");
                this.bf0904 = json.getString("bf0904");
                this.bf0905 = json.getString("bf0905");
                this.bf0906 = json.getString("bf0906");
                this.bf0907 = json.getString("bf0907");
                this.bf0908 = json.getString("bf0908");
                this.bf0909 = json.getString("bf0909");
                this.bf0910 = json.getString("bf0910");
                this.bf0999 = json.getString("bf0999");
                this.bf0996 = json.getString("bf0996");
                this.bf0996x = json.getString("bf0996x");
                this.bf10 = json.getString("bf10");
                this.bf11 = json.getString("bf11");
                this.bf12 = json.getString("bf12");
                this.bf13 = json.getString("bf13");
                this.bf14a = json.getString("bf14a");
                this.bf14b = json.getString("bf14b");
                this.bf14b01x = json.getString("bf14b01x");
                this.bf14c = json.getString("bf14c");
                this.bf14c01x = json.getString("bf14c01x");
                this.bf14d = json.getString("bf14d");
                this.bf14e = json.getString("bf14e");
                this.bf14e01x = json.getString("bf14e01x");
                this.bf14f = json.getString("bf14f");
                this.bf14f01x = json.getString("bf14f01x");
                this.bf14g = json.getString("bf14g");
                this.bf14h = json.getString("bf14h");
                this.bf14i = json.getString("bf14i");
                this.bf15a = json.getString("bf15a");
                this.bf15b = json.getString("bf15b");
                this.bf15c = json.getString("bf15c");
                this.bf15d = json.getString("bf15d");
                this.bf15e = json.getString("bf15e");
                this.bf15f = json.getString("bf15f");
                this.bf15g = json.getString("bf15g");
                this.bf15h = json.getString("bf15h");
                this.bf15i = json.getString("bf15i");
                this.bf15j = json.getString("bf15j");
                this.bf15k = json.getString("bf15k");
                this.bf15l = json.getString("bf15l");
                this.bf15m = json.getString("bf15m");
                this.bf15n = json.getString("bf15n");
                this.bf15o = json.getString("bf15o");
                //      this.bf15p = json.getString("bf15p");
                this.bf15q = json.getString("bf15q");
                this.bf16 = json.getString("bf16");
                this.bf17 = json.getString("bf17");
                this.bf1701x = json.getString("bf1701x");
                this.bf18 = json.getString("bf18");
                this.bf19 = json.getString("bf19");
                this.bf1996x = json.getString("bf1996x");
                this.bf20 = json.getString("bf20");
                this.bfdate = json.getString("bfdate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void sDHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.cv01 = json.getString("cv01");
                this.cv02 = json.getString("cv02");
                this.cv03 = json.getString("cv03");
                this.cv04 = json.getString("cv04");
                this.cv0501 = json.getString("cv0501");
                this.cv0502 = json.getString("cv0502");
                this.cv0503 = json.getString("cv0503");
                this.cv0504 = json.getString("cv0504");
                this.cv0505 = json.getString("cv0505");
                this.cv0506 = json.getString("cv0506");
                this.cv0507 = json.getString("cv0507");
                this.cv0596 = json.getString("cv0596");
                this.cv0596x = json.getString("cv0596x");
                this.cv0601 = json.getString("cv0601");
                this.cv0602 = json.getString("cv0602");
                this.cv0603 = json.getString("cv0603");
                this.cv0604 = json.getString("cv0604");
                this.cv0605 = json.getString("cv0605");
                this.cv0606 = json.getString("cv0606");
                this.cv0607 = json.getString("cv0607");
                this.cv0608 = json.getString("cv0608");
                this.cv0609 = json.getString("cv0609");
                this.cv0610 = json.getString("cv0610");
                this.cv0611 = json.getString("cv0611");
                this.cv0696 = json.getString("cv0696");
                this.cv0696x = json.getString("cv0696x");
                this.cv07 = json.getString("cv07");
                this.cv0801 = json.getString("cv0801");
                this.cv0802 = json.getString("cv0802");
                this.cv0803 = json.getString("cv0803");
                this.cv0804 = json.getString("cv0804");
                this.cv0805 = json.getString("cv0805");
                this.cv0806 = json.getString("cv0806");
                this.cv0807 = json.getString("cv0807");
                this.cv0898 = json.getString("cv0898");
                this.cv0896 = json.getString("cv0896");
                this.cv0896x = json.getString("cv0896x");
                this.cv0901 = json.getString("cv0901");
                this.cv0902 = json.getString("cv0902");
                this.cv0903 = json.getString("cv0903");
                this.cv0904 = json.getString("cv0904");
                this.cv0905 = json.getString("cv0905");
                this.cv0906 = json.getString("cv0906");
                this.cv0907 = json.getString("cv0907");
                this.cv0998 = json.getString("cv0998");
                this.cv0996 = json.getString("cv0996");
                this.cv0996x = json.getString("cv0996x");
                this.cv1001 = json.getString("cv1001");
                this.cv1002 = json.getString("cv1002");
                this.cv1003 = json.getString("cv1003");
                this.cv1004 = json.getString("cv1004");
                this.cv1005 = json.getString("cv1005");
                this.cv1006 = json.getString("cv1006");
                this.cv1007 = json.getString("cv1007");
                this.cv1008 = json.getString("cv1008");
                this.cv1098 = json.getString("cv1098");
                this.cv1096 = json.getString("cv1096");
                this.cv1096x = json.getString("cv1096x");
                this.cv11 = json.getString("cv11");
                this.cv12 = json.getString("cv12");
                this.cv1296x = json.getString("cv1296x");
                this.cv13 = json.getString("cv13");
                this.cv14 = json.getString("cv14");
                this.cv15 = json.getString("cv15");
                this.cv16 = json.getString("cv16");
                this.cv1696x = json.getString("cv1696x");
                this.cv17 = json.getString("cv17");
                this.cv18 = json.getString("cv18");
                this.cv1896x = json.getString("cv1896x");
                this.cv19 = json.getString("cv19");
                this.cv1996x = json.getString("cv1996x");
                this.cvdate = json.getString("cvdate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void sEHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.se01 = json.getString("se01");
                this.se0196x = json.getString("se0196x");
                this.se02 = json.getString("se02");
                this.se0296x = json.getString("se0296x");
                this.se03 = json.getString("se03");
                this.se0396x = json.getString("se0396x");
                this.se04 = json.getString("se04");
                this.se0496x = json.getString("se0496x");
                this.se05 = json.getString("se05");
                this.se0596x = json.getString("se0596x");
                this.se06a = json.getString("se06a");
                this.se07a = json.getString("se07a");
                this.se08 = json.getString("se08");
                this.se0896x = json.getString("se0896x");
                this.se09 = json.getString("se09");
                this.se10 = json.getString("se10");
                this.se1099x = json.getString("se1099x");
                this.se11 = json.getString("se11");
                this.se1196x = json.getString("se1196x");
                this.se12 = json.getString("se12");
                this.se1296x = json.getString("se1296x");
                this.se13 = json.getString("se13");
                this.se14 = json.getString("se14");
                this.se15 = json.getString("se15");
                this.se16 = json.getString("se16");
                this.se17 = json.getString("se17");
                this.se1701 = json.getString("se1701");
                this.se1702 = json.getString("se1702");
                this.se1703 = json.getString("se1703");
                this.se1704 = json.getString("se1704");
                this.se1705 = json.getString("se1705");
                this.se1801 = json.getString("se1801");
                this.se1802 = json.getString("se1802");
                this.se1803 = json.getString("se1803");
                this.se1804 = json.getString("se1804");
                this.se1805 = json.getString("se1805");
                this.se1896 = json.getString("se1896");
                this.se189601x = json.getString("se189601x");
                this.se19 = json.getString("se19");
                this.se1996x = json.getString("se1996x");
                //      this.se20 = json.getString("se20");
                this.se2001 = json.getString("se2001");
                this.se2002 = json.getString("se2002");
                this.se2003 = json.getString("se2003");
                this.se2004 = json.getString("se2004");
                this.se2005 = json.getString("se2005");
                this.se2006 = json.getString("se2006");
                this.se2096 = json.getString("se2096");
                this.se2096x = json.getString("se2096x");
//                this.se21 = json.getString("se21");
                this.se2101 = json.getString("se2101");
                this.se2102 = json.getString("se2102");
                this.se2103 = json.getString("se2103");
                this.se2104 = json.getString("se2104");
                this.se2105 = json.getString("se2105");
                this.se2196 = json.getString("se2196");
                this.se2196x = json.getString("se2196x");
                this.se2201 = json.getString("se2201");
                this.se2202 = json.getString("se2202");
                this.se2203 = json.getString("se2203");
                this.se2204 = json.getString("se2204");
                this.se2205 = json.getString("se2205");
                this.se2206 = json.getString("se2206");
                this.se2207 = json.getString("se2207");
                this.se2208 = json.getString("se2208");
                this.se2209 = json.getString("se2209");
                this.se2210 = json.getString("se2210");
                this.se2211 = json.getString("se2211");
                this.se2212 = json.getString("se2212");
                this.se2213 = json.getString("se2213");
                this.se2214 = json.getString("se2214");
                this.se2215 = json.getString("se2215");
                this.se2216 = json.getString("se2216");
                this.se2217 = json.getString("se2217");
                this.se2218 = json.getString("se2218");
                this.se23 = json.getString("se23");
                this.se24 = json.getString("se24");
                this.se25 = json.getString("se25");
                this.se26 = json.getString("se26");
                this.se27 = json.getString("se27");
                this.se2701 = json.getString("se2701");
                this.se2702 = json.getString("se2702");
                this.se2703 = json.getString("se2703");
                this.se2704 = json.getString("se2704");
                this.se28 = json.getString("se28");
                this.se2801 = json.getString("se2801");
                this.se2802 = json.getString("se2802");
                this.se2803 = json.getString("se2803");
                this.se29 = json.getString("se29");
                this.se30 = json.getString("se30");
                this.se3001 = json.getString("se3001");
                this.se3002 = json.getString("se3002");
                this.se3003 = json.getString("se3003");
                this.se3096 = json.getString("se3096");
                this.se3096x = json.getString("se3096x");
                this.se31 = json.getString("se31");
                this.se3196x = json.getString("se3196x");
                this.se32 = json.getString("se32");
                this.se3302 = json.getString("se3302");
                this.se3301 = json.getString("se3301");
                this.se3401 = json.getString("se3401");
                this.se3402 = json.getString("se3402");
                this.se35 = json.getString("se35");
                this.se36 = json.getString("se36");
                this.se37 = json.getString("se37");
                this.se3701 = json.getString("se3701");
                this.se3702 = json.getString("se3702");
                this.se3703 = json.getString("se3703");
                this.se3704 = json.getString("se3704");
                this.se3705 = json.getString("se3705");
                this.se3706 = json.getString("se3706");
                this.se3707 = json.getString("se3707");
                this.se3708 = json.getString("se3708");
                this.se3709 = json.getString("se3709");
                this.se3710 = json.getString("se3710");
                this.se3796 = json.getString("se3796");
                this.se3796x = json.getString("se3796x");
                this.se38 = json.getString("se38");
                this.se39 = json.getString("se39");
                this.se40 = json.getString("se40");
                this.sedate = json.getString("sedate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public static abstract class FormsTable implements BaseColumns {
        public static final String TABLE_NAME = "Forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DISTRICT_CODE = "districtCode";
        public static final String COLUMN_DISTRICT_NAME = "districtName";
        public static final String COLUMN_HF_CODE = "hfCode";
        public static final String COLUMN_HF_NAME = "hfName";
        public static final String COLUMN_REPORTING_MONTH = "reportingMonth";
        public static final String COLUMN_REPORTING_YEAR = "reportingYear";
        public static final String COLUMN_SA = "sA";
        public static final String COLUMN_SB = "sB";
        public static final String COLUMN_SC = "sC";
        public static final String COLUMN_SD = "sD";
        public static final String COLUMN_SE = "sE";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_ISTATUS96x = "istatus96x";
        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";

    }
}
