package pbru.ket.laksika.itpbru;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by lap324-11 on 6/7/2016 AD.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public MyManage(Context context) {


        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();
    }   //Constructor

}   //Main Class
