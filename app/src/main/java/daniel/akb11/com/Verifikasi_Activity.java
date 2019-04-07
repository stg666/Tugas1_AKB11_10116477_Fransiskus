package daniel.akb11.com;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Verifikasi_Activity extends AppCompatActivity {

    //Tgl. Buat : 6 April 2019
    //Nama      : Fransiskus Xaverius Daniel Sitanggang
    //Kelas     : AKB-11
    //NIM       : 10116477

    private Button masuk;
    TextView txtKel,txtKode,txtPunya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi);
//        txtKel = (TextView) findViewById(R.id.txtKel);
//        txtKode = (TextView) findViewById(R.id.txtKode);
//        txtPunya = (TextView) findViewById(R.id.txtPunya);
//        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
//        Typeface customfont2=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
//        Typeface customfont3=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
//        txtKel.setTypeface(customfont);
//        txtKode.setTypeface(customfont2);
//        txtPunya.setTypeface(customfont3);
        masuk = (Button)findViewById(R.id.btnMasuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(masuk);
            }
        });
    }
}
