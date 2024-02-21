package tr.com.amet.uygulama10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Asker asker;
    public Tankci tankci;
    String mesaj = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asker = new Asker();
        tankci = new Tankci();
        TextView textViewMesaj = findViewById(R.id.textView2);
        Button buttonAsker = findViewById(R.id.btnAsker);
        Button buttonTankci = findViewById(R.id.btnTank);
        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tankci.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
    }
}