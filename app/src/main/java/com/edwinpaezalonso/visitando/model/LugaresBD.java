package com.edwinpaezalonso.visitando.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LugaresBD extends SQLiteOpenHelper {
    public LugaresBD(Context contexto) {
        super(contexto, "lugares", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase bd){
        bd.execSQL("CREATE TABLE lugares ("+
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "nombre TEXT, "+
                "foto TEXT, "+
                "descripcion TEXT, "+
                "direccion TEXT, "+
                "informacion TEXT, "+
                "precio TEXT, "+
                "horario TEXT)");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Catedral Inmaculado Corazón de María', "+
                "'drawable/catedral.jpg', "+
                "'Ubicada en el Parque Simón Bolívar', "+
                "'Es la catedral de Girardot y pertenece a la Diócesis de Girardot" +
                "(Establecida por el Papa Pio XII el 29 de Mayo de 1.956)." +
                "Su construcción fue finalizada en el año 1.978 y su inauguraci8ón se" +
                "realizó el 16 de diciembre del mismo año. Su arquitectura tiene influencia " +
                "alemana, ya que se construyó con el apoyo de la Acción Episcopal Adveniat." +
                "El diseñador fue el arquitecto Andrés Díaz Piedrahita', "+
                "'Sin costo', "+
                "'Libre Acceso')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Hotel Unión', "+
                "'drawable/hotel_union.jpg', "+
                "'drawable/hotel_union.jpg', "+
                "'Cra 12 N° 17-03', "+
                "'Es la catedral de Girardot y pertenece a la Diócesis de Girardot" +
                "(Establecida por el Papa Pio XII el 29 de Mayo de 1.956)." +
                "Su construcción fue finalizada en el año 1.978 y su inauguraci8ón se" +
                "realizó el 16 de diciembre del mismo año. Su arquitectura tiene influencia " +
                "alemana, ya que se construyó con el apoyo de la Acción Episcopal Adveniat." +
                "El diseñador fue el arquitecto Andrés Díaz Piedrahita', "+
                "'Sin costo', "+
                "'Libre Acceso')");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldversion, int newversion){

    }
}