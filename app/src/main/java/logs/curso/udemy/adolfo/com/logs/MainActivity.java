package logs.curso.udemy.adolfo.com.logs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/***
 * Logs
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    //Los logs tienen la siguiente prioridad
    //V: Detalle (prioridad más baja)
    //D: Depuración
    //I: Información
    //W: Advertencia
    //E: Error
    //A: Aserción

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //v: detalle
    public void createLogVerbose(View view){
        Log.v(TAG,"log verbose creado");
    }

    //d: depuracion
    public void createLogDebug(View view){
        Log.d(TAG,"Log debug creado");
    }

    //i: informacion
    public void createLogInfo(View view){
        Log.i(TAG,"Log info creado");
    }

    //w: advertencia
    public void createLogWarning(View view){
        Log.w(TAG,"Log warning creado");
    }

    //e: error
    public void createLogError(View view){
        Log.e(TAG,"Log error creado");
    }

}
