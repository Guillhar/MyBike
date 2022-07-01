package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CatalagosActivity extends AppCompatActivity {
    RecyclerView idRecCatalago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalagos_layout);

        idRecCatalago = findViewById(R.id.idRecCatalago);

        //Montagem do layout que será na lista
        idRecCatalago.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        //Vai deixar a lista mais eficiente
        idRecCatalago.hasFixedSize();

        //executar a lista com o modelo
        idRecCatalago.setAdapter(adapter);

    }


}