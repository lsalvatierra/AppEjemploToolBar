package com.example.luisangel.appejemplotoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        getSupportActionBar().setTitle("ToolBar Nuevo");
        //tb.setSubtitle("Hola mundo");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        String mensaje ="";
        if(id == R.id.opcion_agregar){
            mensaje ="Click en agregar";
        }else if(id == R.id.opcion_eliminar){
            mensaje ="Click en eliminar";
        }else if(id == R.id.opcion_modificar){
            mensaje ="Click en modificar";
        }else if(id == R.id.opcion_listar){
            mensaje ="Click en listar";
        }else if(id == R.id.opcion_buscar){
            mensaje ="Click en buscar";
        }
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
