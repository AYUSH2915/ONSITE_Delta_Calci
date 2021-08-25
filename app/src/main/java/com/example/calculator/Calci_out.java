package com.example.calculator;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Calci_out extends Fragment {
    private View V;
    private TextView out;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        V = inflater.inflate(R.layout.frag_out,container,false);
        out = V.findViewById(R.id.outin);

        return V;
    }
    public void updatetextview(double num)
    {
        out.setText(String.valueOf(num));

    }

}