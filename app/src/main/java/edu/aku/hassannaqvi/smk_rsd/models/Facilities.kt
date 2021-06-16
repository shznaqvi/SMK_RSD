package edu.aku.hassannaqvi.smk_rsd.models

import android.database.Cursor
import android.provider.BaseColumns
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject
import kotlin.jvm.Throws

/**
 * Created by Muhammad Hussain on 6/16/2021.
 */
class Facilities {
    var district = StringUtils.EMPTY
    var district_code = StringUtils.EMPTY
    var facility = StringUtils.EMPTY
    var facility_code = StringUtils.EMPTY
    var username = StringUtils.EMPTY

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Facilities {
        district = jsonObject.getString(FacilityTable.COLUMN_DISTRICT)
        district_code = jsonObject.getString(FacilityTable.COLUMN_DISTRICT_CODE)
        facility = jsonObject.getString(FacilityTable.COLUMN_FACILITY_NAME)
        facility_code = jsonObject.getString(FacilityTable.COLUMN_FACILITY_CODE)
        username = jsonObject.getString(FacilityTable.COLUMN_USERNAME)
        return this
    }

    fun hydrate(cursor: Cursor): Facilities {
        district = cursor.getString(cursor.getColumnIndex(FacilityTable.COLUMN_DISTRICT))
        district_code = cursor.getString(cursor.getColumnIndex(FacilityTable.COLUMN_DISTRICT_CODE))
        facility = cursor.getString(cursor.getColumnIndex(FacilityTable.COLUMN_FACILITY_NAME))
        facility_code = cursor.getString(cursor.getColumnIndex(FacilityTable.COLUMN_FACILITY_CODE))
        username = cursor.getString(cursor.getColumnIndex(FacilityTable.COLUMN_USERNAME))
        return this
    }


    object FacilityTable : BaseColumns {
        const val TABLE_NAME = "facilities"
        const val _ID = "_id"
        const val COLUMN_DISTRICT = "district"
        const val COLUMN_DISTRICT_CODE = "district_code"
        const val COLUMN_FACILITY_NAME = "facility_name"
        const val COLUMN_FACILITY_CODE = "facility_code"
        const val COLUMN_USERNAME = "username"
    }
}