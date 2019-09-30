package com.monos.recyclerviewejsem33;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.monos.recyclerviewejsem33.fragment.InicioFragment;
import com.monos.recyclerviewejsem33.interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments, InicioFragment.OnFragmentInteractionListener{

    Fragment fragmentInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,fragmentInicio).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void iniciarJuego() {
        Toast.makeText(getApplicationContext(), "Iniciando Wets", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void llamarAjustes() {
        Toast.makeText(getApplicationContext(), "Iniciando Yorkie", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void consultarRanking() {

                Intent intent = new Intent(this, ActivityAbout.class);
                startActivity(intent);

    }

    @Override
    public void consultarInstrucciones() {
        Toast.makeText(getApplicationContext(), "Iniciando Bulldog", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void gestionarUsuario() {
        Toast.makeText(getApplicationContext(), "Iniciando Border", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void consultarInformación() {
        Toast.makeText(getApplicationContext(), "Iniciando Chihuahua", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mAbout:
                Intent intent = new Intent(this, ActivityAbout.class);
                startActivity(intent);
                break;

            case R.id.mSettings:
                Intent i = new Intent(this, ActivitySettings.class);
                startActivity(i);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
