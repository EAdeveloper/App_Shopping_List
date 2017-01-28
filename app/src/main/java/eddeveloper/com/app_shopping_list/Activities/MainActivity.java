package eddeveloper.com.app_shopping_list.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eddeveloper.com.app_shopping_list.EnviarMensaje;
import eddeveloper.com.app_shopping_list.Fragments.rigth;
import eddeveloper.com.app_shopping_list.R;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String mensaje) {
        rigth derecha = (rigth)getFragmentManager().findFragmentById(R.id.derecha);
        derecha.ObtenerDatos(mensaje);
    }
}
