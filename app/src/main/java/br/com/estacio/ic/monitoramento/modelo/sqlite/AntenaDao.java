package br.com.estacio.ic.monitoramento.modelo.sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.com.estacio.ic.monitoramento.modelo.Antena;

public class AntenaDao {

    private AntenasSqliteHelper helper;

    public AntenaDao(Context context) {
        helper = new AntenasSqliteHelper(context);
    }

    public Antena getAntena(int id) {
        SQLiteDatabase db = helper.getReadableDatabase();
        String sql = String.format("SELECT * FROM %s WHERE ? = ?;", AntenasSqliteHelper.TABLE);

        Cursor cursor = db.rawQuery(sql, new String[] {
                AntenasSqliteHelper.CELL_ID_COL,
                String.valueOf(id)}
        );

        Antena antena = null;
        if (cursor.moveToNext()) {
            double lat = cursor.getDouble(cursor.getColumnIndex(AntenasSqliteHelper.LAT_COL));
            double lon = cursor.getDouble(cursor.getColumnIndex(AntenasSqliteHelper.LON_COL));

            antena = new Antena();
            antena.setId(id);
            antena.setLat(lat);
            antena.setLon(lon);
        }
        cursor.close();
        db.close();
        return antena;
    }

    public List<Antena> getLista() {
        SQLiteDatabase db = helper.getReadableDatabase();
        String sql = String.format("SELECT * FROM %s;", AntenasSqliteHelper.TABLE);

        Cursor cursor = db.rawQuery(sql, null);
        List<Antena> list = new ArrayList<>();
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex(AntenasSqliteHelper.CELL_ID_COL));
            double lat = cursor.getDouble(cursor.getColumnIndex(AntenasSqliteHelper.LAT_COL));
            double lon = cursor.getDouble(cursor.getColumnIndex(AntenasSqliteHelper.LON_COL));

            Antena antena = new Antena();
            antena.setId(id);
            antena.setLat(lat);
            antena.setLon(lon);

            list.add(antena);
        }
        cursor.close();
        db.close();
        return list;
    }

}

