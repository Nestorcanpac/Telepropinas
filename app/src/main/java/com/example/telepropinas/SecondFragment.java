package com.example.telepropinas;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.telepropinas.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();


    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Button boton=view.findViewById(R.id.FormularioBoton);
        boton.setBackgroundColor(Color.parseColor("#FFFFFF"));

        Button boton2=view.findViewById(R.id.MapaBoton);
        boton2.setBackgroundColor(Color.parseColor("#FFFFFF"));


        binding.FormularioBoton.setOnClickListener(v -> {
          binding.IntroducePropiTXT.setText(binding.IntroduceDireccion.getText());
      });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}