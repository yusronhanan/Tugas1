package id.sch.smktelkom_mlg.tugas01.xirpl1036.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAikido;
    RadioGroup rgJK, rgGolDar;
    Spinner spKelasBerat;
    EditText etNamaLengkap;
    CheckBox cbAngkatBeban, cbBerlari, cbBerenang;
    Button bOK;
    TextView tvForm, tvInstitut, tvJalan, tvNamaLengkap, tvJK, tvGolDar, tvHobi, tvKelasBerat, tvHasilNama, tvHasilJK, tvHasilGoldar, tvHasilHobi, tvHasilKB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //image
        imgAikido = (ImageView) findViewById(R.id.imageViewAikido);
        //radiogroup
        rgJK = (RadioGroup) findViewById(R.id.radioGroupJenisKelamin);
        rgGolDar = (RadioGroup) findViewById(R.id.radioGroupGolDar);
        //spinner
        spKelasBerat = (Spinner) findViewById(R.id.spinnerKelasBerat);
        //edit text
        etNamaLengkap = (EditText) findViewById(R.id.editTextNamaLengkap);
        //checkbox
        cbAngkatBeban = (CheckBox) findViewById(R.id.checkBoxAngkatBeban);
        cbBerlari = (CheckBox) findViewById(R.id.checkBoxBerlari);
        cbBerenang = (CheckBox) findViewById(R.id.checkBoxBerenang);
        //button
        bOK = (Button) findViewById(R.id.buttonOK);
        //textview
        tvForm = (TextView) findViewById(R.id.textViewFormulir);
        tvInstitut = (TextView) findViewById(R.id.textViewInstitut);
        tvJalan = (TextView) findViewById(R.id.textViewJalan);
        tvNamaLengkap = (TextView) findViewById(R.id.textViewNamaLengkap);
        tvJK = (TextView) findViewById(R.id.textViewJenisKelamin);
        tvGolDar = (TextView) findViewById(R.id.textViewGolDar);
        tvHobi = (TextView) findViewById(R.id.textViewHobi);
        tvKelasBerat = (TextView) findViewById(R.id.textViewKelasBerat);
        //textview hasil
        tvHasilNama = (TextView) findViewById(R.id.textViewHasilNama);
        tvHasilJK = (TextView) findViewById(R.id.textViewHasilJK);
        tvHasilGoldar = (TextView) findViewById(R.id.textViewHasilGolDar);
        tvHasilHobi = (TextView) findViewById(R.id.textViewHasilHobi);
        tvHasilKB = (TextView) findViewById(R.id.textViewHasilKB);


        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
        String hasil = null;

        //textview namalengkap
        tvHasilNama.setText("Nama Lengkap : " + etNamaLengkap.getText().toString());
        //radiobutton jeniskelamin
        if (rgJK.getCheckedRadioButtonId() != -1) {
            RadioButton rbJK = (RadioButton)
                    findViewById(rgJK.getCheckedRadioButtonId());
            hasil = rbJK.getText().toString();
        }
        if (hasil == null) {
            tvHasilJK.setText("Anda belum memilih jenis kelamin");
        } else {
            tvHasilJK.setText("Jenis kelamin anda : " + hasil);
        }
        //radiobutton goldar
        if (rgGolDar.getCheckedRadioButtonId() != -1) {
            RadioButton rbGolDar = (RadioButton)
                    findViewById(rgGolDar.getCheckedRadioButtonId());
            hasil = rbGolDar.getText().toString();
        }
        if (hasil == null) {
            tvHasilGoldar.setText("Anda belum memilih golongan daerah");
        } else {
            tvHasilGoldar.setText("Golongan darah anda : " + hasil);
        }
        //checkbox hobi
        String hasilCB = "Hobi Anda : \n";
        if (cbAngkatBeban.isChecked()) hasilCB += cbAngkatBeban.getText() + " , ";
        if (cbBerenang.isChecked()) hasilCB += cbBerenang.getText() + " , ";
        if (cbBerlari.isChecked()) hasilCB += cbBerlari.getText() + " , ";

        tvHasilHobi.setText(hasilCB);

        //spinner kelas berat

        tvHasilKB.setText("Kelas Berat : " + spKelasBerat.getSelectedItem().toString());


        if (isValid()) {

        }
    }

    private boolean isValid() {
        boolean valid = true;

        String namaLengkap = etNamaLengkap.getText().toString();

        String hasil = null;
        String kelasBerat = spKelasBerat.getSelectedItem().toString();

        if (namaLengkap.isEmpty()) {
            etNamaLengkap.setError("Nama anda belum diisi");
            valid = false;
        }


        return valid;
    }
}
