package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardClient,carReservation,
            cardMaintance,cardsales,cardacessories,cardCatalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        cardClient = findViewById(R.id.cardClient);
        carReservation = findViewById(R.id.cardReservation);
        cardMaintance = findViewById(R.id.cardMaintence);
        cardsales = findViewById(R.id.cardSales);
        cardacessories = findViewById(R.id.cardAccessories);
        cardCatalog = findViewById(R.id.cardCatalog);

        cardClient.setOnClickListener(this);
        carReservation.setOnClickListener(this);
        cardMaintance.setOnClickListener(this);
        cardsales.setOnClickListener(this);
        cardacessories.setOnClickListener(this);
        cardCatalog.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    }
}