package jp.co.conic.conic2.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import jp.co.conic.conic2.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    AppCompatSpinner spinnerMaterial, spinnerSheetThickness,
        spinnerBendingAngle;

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
                this, R.array.array_sheet_thickness,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.
                select_dialog_singlechoice);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this, R.array.array_bending_angle,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.
                select_dialog_singlechoice);
        spinnerMaterial.setAdapter(adapter1);
        spinnerSheetThickness.setAdapter(adapter2);
        spinnerBendingAngle.setAdapter(adapter3);

        BottomNavigationView navigationView = findViewById(R.id.bottom_menu_view);
        navigationView.setOnNavigationItemSelectedListener(this);
        //&#176;
        //&#127;
        /*buildscript {
            repositories {
                jcenter()
            }
        }
        dependencies {
            compile 'com.shawnlin:number-picker:2.4.6'
        }*/
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        return true;
    }
}
