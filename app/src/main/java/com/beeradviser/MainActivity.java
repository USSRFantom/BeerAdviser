package com.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClockFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);         //Получаем сссылку на TextView
        Spinner color  = (Spinner) findViewById(R.id.color);        //Получаем ссылку на спинер
        String beerType = String.valueOf(color.getSelectedItem());//Получаем вариант выбранной строки
        List<String> brandsList = expert.getBrands(beerType); //Получаем контейнер List с сортами пива
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList){
            brandsFormatted.append(brand).append("\n");
        }
        brands.setText(brandsFormatted); //содержимое отображается

    }
}
