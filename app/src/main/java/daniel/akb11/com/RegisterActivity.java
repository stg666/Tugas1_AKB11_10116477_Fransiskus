package daniel.akb11.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    //Tgl. Buat : 6 April 2019
    //Nama      : Fransiskus Xaverius Daniel Sitanggang
    //Kelas     : AKB-11
    //NIM       : 10116477

    EditText txt_nama, txt_umur;
    Button btn_next;
    // private Object RegisterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txt_nama = (EditText) findViewById(R.id.etNama);
        txt_umur = (EditText) findViewById(R.id.etUmur);
        btn_next = (Button) findViewById(R.id.btnSelanjutnya);

        final String Nama = "kamu";

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = txt_nama.getText().toString();
                String usia = txt_umur.getText().toString();

                boolean isEmpty = false;
                if (TextUtils.isEmpty(nama)) {
                    isEmpty = true;
                    txt_nama.setError("Nama harus diisi terlebih dahulu");
                } else if (TextUtils.isEmpty(usia)) {
                    isEmpty = true;
                    txt_umur.setError("Umur harus diisi terlebih dahulu");
                } else if (TextUtils.isEmpty(nama) && TextUtils.isEmpty(usia)) {
                    isEmpty = true;
                    txt_nama.setError("Nama harus diisi terlebih dahulu");
                    txt_umur.setError("Umur harus diisi terlebih dahulu");
                } else {
                    Intent next = new Intent(RegisterActivity.this, MasukActivity.class);
                    next.putExtra(Nama, nama);
                    startActivity(next);

                }
            }
        });
    }
}
