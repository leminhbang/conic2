package jp.co.conic.conic2.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.shawnlin.numberpicker.NumberPicker;

import jp.co.conic.conic2.R;
import jp.co.conic.conic2.bussiness_logic.CalculationHelper;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, AdapterView.OnItemSelectedListener, NumberPicker.OnValueChangeListener, TextWatcher {

    AppCompatSpinner spinnerMaterial, spinnerSheetThickness,
        spinnerBendingAngle;
    private EditText edtBendingLength;
    private NumberPicker numpicV;
    private TextView txtB, txtIR, txtF;
    private CalculationHelper cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView();

    }

    private void mapView() {
        spinnerMaterial = findViewById(R.id.spinnerMaterial);
        spinnerSheetThickness = findViewById(R.id.spinnerSheetThickness);
        spinnerBendingAngle = findViewById(R.id.spinnerBendingAngle);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                this, R.array.array_material,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.
                select_dialog_singlechoice);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this, R.array.array_sheet_thickness_mild_steel,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.
                select_dialog_singlechoice);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this, R.array.array_bending_angle,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.
                select_dialog_singlechoice);
        spinnerMaterial.setAdapter(adapter1);
        spinnerMaterial.setSelection(0);
        spinnerMaterial.setOnItemSelectedListener(this);
        spinnerSheetThickness.setAdapter(adapter2);
        spinnerSheetThickness.setSelection(0);
        spinnerSheetThickness.setOnItemSelectedListener(this);
        spinnerBendingAngle.setAdapter(adapter3);
        spinnerBendingAngle.setSelection(0);
        spinnerBendingAngle.setOnItemSelectedListener(this);

        BottomNavigationView navigationView = findViewById(R.id.bottom_menu_view);
        navigationView.setOnNavigationItemSelectedListener(this);

        edtBendingLength = findViewById(R.id.edtBendingLength);
        edtBendingLength.addTextChangedListener(this);
        numpicV = findViewById(R.id.number_picker_v);
        numpicV.setOnValueChangedListener(this);

        txtB = findViewById(R.id.txtResultB);
        txtIR = findViewById(R.id.txtResultIR);
        txtF = findViewById(R.id.txtResultF);
        //&#176;
        //&#127;

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        AppCompatSpinner spinner = (AppCompatSpinner) adapterView;
        int id = spinner.getId();
        switch (id) {
            case R.id.spinnerMaterial:
                onMaterialSelected(spinnerMaterial.getSelectedItemPosition());
                onSelectChange();
                break;
            case R.id.spinnerSheetThickness:
                onSelectChange();
                break;
            case R.id.spinnerBendingAngle:
                onSelectChange();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private void onMaterialSelected(int pos) {
        ArrayAdapter<CharSequence> adapter = null;
        switch (pos) {
            case 0: //mild steel
                adapter = ArrayAdapter.createFromResource(
                        this,
                        R.array.array_sheet_thickness_mild_steel,
                        android.R.layout.simple_spinner_item);
                break;
            case 1: //stainless steel
                adapter = ArrayAdapter.createFromResource(
                        this,
                        R.array.array_sheet_thickness_stainless_steel,
                        android.R.layout.simple_spinner_item);
                break;
            case 2: //aluminium
                adapter = ArrayAdapter.createFromResource(
                        this,
                        R.array.array_sheet_thickness_aluminium,
                        android.R.layout.simple_spinner_item);
                break;
        }
        assert adapter != null;
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinnerSheetThickness.setAdapter(adapter);
    }

    private void onSelectChange() {
        String sBendingLength = edtBendingLength.getText().
                toString().trim();
        if (sBendingLength.equals("")) return;
        String sThickness = (String) spinnerSheetThickness.
                getSelectedItem();
        String sAngle = (String) spinnerBendingAngle.
                getSelectedItem();
        String[] tmp = sThickness.split(" ");
        float thickness = Float.parseFloat(tmp[0]);
        float angle = Float.parseFloat(sAngle);
        float length = Float.parseFloat(sBendingLength);
        int material = spinnerMaterial.getSelectedItemPosition();
        cal = new CalculationHelper(
                material, thickness, length, angle);
        showVList(cal);
    }

    private void showVList(CalculationHelper cal) {
        //List<String> v_list = cal.get_v_list();
        String[] data = cal.get_v_list().clone();
        /*data = (String[]) (v_list.
                toArray(new String[v_list.size()]));*/
        int l = data.length;
        numpicV.setDisplayedValues(null);
        numpicV.setMaxValue(l - 1);
        numpicV.setMinValue(0);
        numpicV.setWrapSelectorWheel(false);

        int max = numpicV.getMaxValue();
        int min = numpicV.getMinValue();
        if (max - min + 1 == l)
        numpicV.setDisplayedValues(data);
        numpicV.setValue(0);
        showResults(Float.parseFloat(data[0]));
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
        String[] s = numpicV.getDisplayedValues();
        String val = s[newVal];
        showResults(Float.parseFloat(val));
    }

    private void showResults(float v) {
        txtB.setText(String.valueOf(cal.get_b(v)));
        txtF.setText(String.valueOf(cal.get_F(v)));
        txtIR.setText(String.valueOf(cal.get_ir(v)));
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if (charSequence.length() != 0) {
            onSelectChange();
        }

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
