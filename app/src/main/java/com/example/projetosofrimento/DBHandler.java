package com.example.projetosofrimento;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    // creating a constant variables for our database.
    // below variable is for our database name.
    private static final String DB_NAME = "testedb";

    // below int is our database version
    private static final int DB_VERSION = 1;

    // below variable is for our table name.
    private static final String TABLE_NAME = "ocorrencias";

    // below variable is for our id column.
    private static final String ID_COL = "id";

    // below variable is for our course name column
    private static final String CATEGORIA_COL = "categoria";

    // below variable id for our course duration column.
    private static final String LUGAR_COL = "lugar";

    // below variable for our course description column.
    private static final String DESCRICAO_COL = "Descricao";

    // below variable is for our course tracks column.
    private static final String HORA_COL = "Hora";

    private static final String DIA_COL = "dia";

    // creating a constructor for our database handler.
    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    // below method is for creating a database by running a sqlite query
    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + CATEGORIA_COL + " TEXT,"
                + LUGAR_COL + " TEXT,"
                + DESCRICAO_COL + " TEXT,"
                + HORA_COL + " TEXT,"
                + DIA_COL + " TEXT)";

        // at last we are calling a exec sql
        // method to execute above sql query
        db.execSQL(query);
    }

    // this method is use to add new course to our sqlite database.
    public void addNovaOcorrencia(String categoriaOcorrencia, String lugarOcorrencia, String descricaoOcorrencia, String horaOcorrencia, String diaOcorrencia) {

        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        SQLiteDatabase db = this.getWritableDatabase();

        // on below line we are creating a
        // variable for content values.
        ContentValues values = new ContentValues();

        // on below line we are passing all values
        // along with its key and value pair.
        values.put(CATEGORIA_COL, categoriaOcorrencia);
        values.put(LUGAR_COL, lugarOcorrencia);
        values.put(DESCRICAO_COL, descricaoOcorrencia);
        values.put(HORA_COL, horaOcorrencia);
        values.put(DIA_COL, diaOcorrencia);

        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values);

        // at last we are closing our
        // database after adding database.
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}