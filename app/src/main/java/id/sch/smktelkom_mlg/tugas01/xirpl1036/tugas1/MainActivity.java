package id.sch.smktelkom_mlg.tugas01.xirpl1036.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
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
    TextView tvForm, tvInstitut, tvJalan, tvNamaLengkap, tvJK, tvGolDar, tvHobi, tvKelasBerat, tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //image
        imgAikido = (ImageView) findViewById(R.id.imageViewAikido);
        //radiogroup
        rgJK = (RadioGroup) findViewById(R.id.radioGroupJenisKelamin);
        rgJK = (RadioGroup) findViewById(R.id.radioGroupGolDar);
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
        tvHasil = (TextView) findViewById(R.id.textViewHasil);




    }
}
