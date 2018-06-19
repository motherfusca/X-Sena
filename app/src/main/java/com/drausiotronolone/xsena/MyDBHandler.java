package com.drausiotronolone.xsena;

import java.io.IOException;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by dtronolone on 1/21/15.
 */
public class MyDBHandler extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "jogosDB.db";
    private static final String TABLE_JOGOS = "jogos";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_JOGO = "jogo";

    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory,
                       int version)
    {
        super(context, DATABASE_NAME,factory,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String CREATE_JOGOS_TABLE = "CREATE TABLE " + TABLE_JOGOS + "(" + COLUMN_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_JOGO + " TEXT" + ")";

        db.execSQL(CREATE_JOGOS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_JOGOS);

        onCreate(db);
    }

    public void addJogo(Jogo jogo)
    {
        ContentValues values = new ContentValues();
        values.put(COLUMN_JOGO, jogo.getJogo());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_JOGOS, null, values);

        db.close();
    }

    public boolean deleteJogo(String jogoSelecionado)
    {
        boolean result = false;

        String query = "Select * FROM " + TABLE_JOGOS + " WHERE " + COLUMN_JOGO + " = \""
                + jogoSelecionado + "\"";

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        Jogo jogo = new Jogo();

        if (cursor.moveToFirst()) {
            jogo.setId(Integer.parseInt(cursor.getString(0)));
            db.delete(TABLE_JOGOS, COLUMN_ID + " = ?",
                    new String[] { String.valueOf(jogo.getID()) });
            cursor.close();
            result = true;
        }

        db.close();

        return result;
    }

    public ArrayList<String> getStrings()
    {
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "Select * FROM " + TABLE_JOGOS;
        ArrayList<String> meusJogos = new ArrayList<String>();

        Cursor mCursor = db.rawQuery(query, null);


            mCursor.moveToFirst();

            if (mCursor.moveToFirst()) {
                do {
                    meusJogos.add(mCursor.getString(1)); //<< pass column index here instead of i

                } while (mCursor.moveToNext());
            }

        db.close();

        return meusJogos;

    }

}
