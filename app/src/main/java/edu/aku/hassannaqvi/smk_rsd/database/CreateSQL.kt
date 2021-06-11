package edu.aku.hassannaqvi.smk_rsd.database

import edu.aku.hassannaqvi.smk_rsd.core.MainApp.PROJECT_NAME
import edu.aku.hassannaqvi.smk_rsd.data.model.Form
import edu.aku.hassannaqvi.smk_rsd.models.*

object CreateSQL {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + Form.FormsTable.TABLE_NAME + "("
            + Form.FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Form.FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + Form.FormsTable.COLUMN_UID + " TEXT,"
            + Form.FormsTable.COLUMN_USERNAME + " TEXT,"
            + Form.FormsTable.COLUMN_SYSDATE + " TEXT,"
            + Form.FormsTable.COLUMN_ISTATUS + " TEXT,"
            + Form.FormsTable.COLUMN_ISTATUS96x + " TEXT,"
            + Form.FormsTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + Form.FormsTable.COLUMN_DEVICEID + " TEXT,"
            + Form.FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + Form.FormsTable.COLUMN_SYNCED + " TEXT,"
            + Form.FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + Form.FormsTable.COLUMN_APPVERSION + " TEXT,"
            /*+ Form.FormsTable.COLUMN_HF_CODE + " TEXT,"
            + Form.FormsTable.COLUMN_HF_NAME + " TEXT,"
            + Form.FormsTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + Form.FormsTable.COLUMN_TEHSIL_NAME + " TEXT,"
            + Form.FormsTable.COLUMN_LHW_CODE + " TEXT,"
            + Form.FormsTable.COLUMN_LHW_NAME + " TEXT,"
            + Form.FormsTable.COLUMN_KHANDAN_NUMBER + " TEXT,"
            + Form.FormsTable.COLUMN_SA + " TEXT,"
            + Form.FormsTable.COLUMN_SB + " TEXT"*/
            + " );")








    const val SQL_CREATE_USERS = ("CREATE TABLE " + Users.UsersTable.TABLE_NAME + "("
            + Users.UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Users.UsersTable.COLUMN_USERNAME + " TEXT,"
            + Users.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + Users.UsersTable.COLUMN_FULLNAME + " TEXT,"
            + Users.UsersTable.COLUMN_DIST_ID + " TEXT"
            + " );")

    const val SQL_CREATE_DISTRICTS = ("CREATE TABLE " + Districts.TableDistricts.TABLE_NAME + "("
            + Districts.TableDistricts.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Districts.TableDistricts.COLUMN_DISTRICT_NAME + " TEXT,"
            + Districts.TableDistricts.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")




    const val SQL_CREATE_VERSIONAPP = "CREATE TABLE " + VersionApp.VersionAppTable.TABLE_NAME + " (" +
            VersionApp.VersionAppTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            VersionApp.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
            VersionApp.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
            VersionApp.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
            ");"




    const val SQL_CREATE_RSD_HF = ("CREATE TABLE " + RsdHF.TablersdHF.TABLE_NAME + "("
            + RsdHF.TablersdHF.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + RsdHF.TablersdHF.COLUMN_PRO_ID + " TEXT,"
            + RsdHF.TablersdHF.COLUMN_DIST_ID + " TEXT,"
            + RsdHF.TablersdHF.COLUMN_TEHSIL_ID + " TEXT,"
            + RsdHF.TablersdHF.COLUMN_UC_ID + " TEXT,"
            + RsdHF.TablersdHF.COLUMN_HF_CODE + " TEXT"
            + " );")
}