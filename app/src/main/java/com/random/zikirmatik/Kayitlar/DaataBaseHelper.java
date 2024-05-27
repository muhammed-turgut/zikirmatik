package com.random.zikirmatik.Kayitlar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DaataBaseHelper extends SQLiteOpenHelper {
    public static final String dataBaseName="zikirmatikKayit.db";

    public DaataBaseHelper(Context context){
        super(context,"zikirmatikKayit.db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {
        MyDatabase.execSQL("CREATE TABLE kayitlar(kayitTarihi PRIMARY KEY,kayitAdi TEXT,kayit TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDatabase, int oldVersion, int newVersion) {
        MyDatabase.execSQL("DROP TABLE IF EXİSTS kayitlar");
    }

    public boolean insertData(String kayitTarihi, String kayitAdi,String  kayit){
        SQLiteDatabase MyDataBase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("kayitAdi",kayitAdi);
        contentValues.put("kayitTarihi",kayitTarihi);
        contentValues.put("kayit",kayit);
        long result=MyDataBase.insert("kayitlar",null,contentValues);
        if (result==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public Cursor getdata(){
        SQLiteDatabase MyDataBase=this.getWritableDatabase();
        Cursor cursor =MyDataBase.rawQuery("SELECT * FROM kayitlar ",null);
        return cursor;
    }

}

