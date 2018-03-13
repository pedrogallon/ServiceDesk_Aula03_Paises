package br.usjt.devweb.servicedesk_aula03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends Activity {
    public static final String CONT = "br.usjt.devweb.servicedesk_aula03.MainActivity";
    private Spinner spinnerCont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerCont = findViewById(R.id.selecionar_continente);
        System.out.println("ACTIVYTYMAIN");
    }

    public void buscarChamados(View view) {
        String cont = spinnerCont.getSelectedItem().toString().toUpperCase();
        Intent intent = new Intent(this, ListarPaisesActivity.class);
        intent.putExtra(CONT, cont);
        startActivity(intent);
    }
}
