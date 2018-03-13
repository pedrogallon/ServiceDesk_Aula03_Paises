package br.usjt.devweb.servicedesk_aula03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ListarPaisesActivity extends Activity {
    ArrayList<Pais> paises;
    ArrayList<Pais> listaTodos;
    ListView listView;
    Activity context;
    public static final String PAIS = "br.usjt.devweb.servicedesk_aula03.pais";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_chamados);
        Intent intent = getIntent();
        String cont = intent.getStringExtra(MainActivity.CONT);
        listaTodos = listarTodosPaises();
        paises = listarPaises(listaTodos, cont);
        listView = findViewById(R.id.lista_chamados);
        ArrayAdapter<Pais> adapter = new ArrayAdapter<Pais>(this, android.R.layout.simple_list_item_1, paises);
        listView.setAdapter(adapter);
        context = this;
        listView.setOnItemClickListener(
            new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Pais pais = paises.get(position);
                    Intent intent1 = new Intent(context , DetalhePaisActivity.class);
                    intent1.putExtra(PAIS, pais);
                    startActivity(intent1);

                }
            }
        );

    }
    private ArrayList<Pais> listarTodosPaises(){
        ArrayList<Pais> list = new ArrayList<>();

        return list;
    }

    private ArrayList<Pais> listarPaises(ArrayList<Pais> listaTodos, String cont){
        ArrayList<Pais> listaPaises = new ArrayList<>();
        for(Pais pais:listaTodos){
            if (pais.getRegiao().toUpperCase() == cont){
                listaPaises.add(pais);
            }
        }
        return listaPaises;
    }
}
