package com.example.today;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BmiCalcuFragment extends Fragment {
    View myView;
    EditText weight, height;
    TextView result;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_bmi_calcu, container, false);
        weight = myView.findViewById(R.id.weightID);
        height = myView.findViewById(R.id.heightId);
        result = myView.findViewById(R.id.bmiTextID);
        button = myView.findViewById(R.id.SubmitButID);

        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double weight1, height1, bmi;
                weight1 = Double.parseDouble(weight.getText().toString());
                height1 = Double.parseDouble(height.getText().toString());
                bmi = weight1 / (height1 * height1);
                result.setText("BMI is " + bmi);
            }
        }));
        return myView;
    }


}
