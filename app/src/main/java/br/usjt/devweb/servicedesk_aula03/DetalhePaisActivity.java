package br.usjt.devweb.servicedesk_aula03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhePaisActivity extends Activity {
    TextView txtNome;
    TextView txtCodigo3;
    TextView txtCapital;
    TextView txtRegiao;
    TextView txtSubRegiao;
    TextView txtDemonimo;
    TextView txtPopulacao;
    TextView txtArea;
    TextView txtBandeira;
    TextView txtGini;
    TextView txtIdiomas;
    TextView txtMoedas;
    TextView txtDominios;
    TextView txtFusos;
    TextView txtFronteiras;
    TextView txtLatitude;
    TextView txtLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        txtNome = findViewById(R.id.chamado_nome);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListarPaisesActivity.PAIS);

        txtNome.setText(pais.getNome());
        txtCodigo3.setText(pais.getCodigo3());
        txtCapital.setText(pais.getCapital());
        txtRegiao.setText(pais.getRegiao());
        txtSubRegiao.setText(pais.getSubRegiao());
        txtDemonimo.setText(pais.getDemonimo());
        txtPopulacao.setText(pais.getPopulacao());
        txtArea.setText(pais.getArea());
        txtBandeira.setText(pais.getBandeira());
        txtGini.setText(String.valueOf(pais.getGini()));
        txtIdiomas.setText(pais.getIdiomas().toString());
        txtMoedas.setText(pais.getMoedas().toString());
        txtDominios.setText(pais.getDominios().toString());
        txtFusos.setText(pais.getFusos().toString());
        txtFronteiras.setText(pais.getFronteiras().toString());
        txtLatitude.setText(String.valueOf(pais.getLatitude()));
        txtLongitude.setText(String.valueOf(pais.getLongitude()));

    }
}
