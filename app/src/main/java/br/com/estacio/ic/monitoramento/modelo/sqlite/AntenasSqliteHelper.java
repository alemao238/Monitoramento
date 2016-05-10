package br.com.estacio.ic.monitoramento.modelo.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jluca on 08/05/2016.
 */
public class AntenasSqliteHelper extends SQLiteOpenHelper {
    public static final int VERSION = 1;
    public static final String DATA_BASE = "antenas";
    public static final String TABLE = "antena";
    public static final String CELL_ID_COL = "cell_id";
    public static final String LAT_COL = "lat";
    public static final String LON_COL = "lon";

    public AntenasSqliteHelper(Context context) {
        super(context, DATA_BASE, null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                String.format(
                        "CREATE TABLE %s (" +
                                "   %s INTEGER  NOT NULL PRIMARY KEY" +
                                "  ,%s REAL NOT NULL" +
                                "  ,%s REAL NOT NULL" +
                                ");", TABLE, CELL_ID_COL, LAT_COL, LON_COL)
        );

        ContentValues cv = new ContentValues();
        cv.put(AntenasSqliteHelper.CELL_ID_COL, 8063);
        cv.put(AntenasSqliteHelper.LAT_COL, -3.948129);
        cv.put(AntenasSqliteHelper.LON_COL, -38.436702);
        db.insert(AntenasSqliteHelper.TABLE, null, cv);
        cv.clear();

        cv.put(AntenasSqliteHelper.CELL_ID_COL, 1497);
        cv.put(AntenasSqliteHelper.LAT_COL, -3.792527);
        cv.put(AntenasSqliteHelper.LON_COL, -38.480016);
        db.insert(AntenasSqliteHelper.TABLE, null, cv);
        cv.clear();

        cv.put(AntenasSqliteHelper.CELL_ID_COL, 2347);
        cv.put(AntenasSqliteHelper.LAT_COL, -3.770898);
        cv.put(AntenasSqliteHelper.LON_COL, -38.48287);
        db.insert(AntenasSqliteHelper.TABLE, null, cv);
        cv.clear();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //
    }

}

