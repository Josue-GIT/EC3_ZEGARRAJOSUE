package pe.edu.idat.appec3_zegarrajosue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import pe.edu.idat.appec3_zegarrajosue.databinding.ActivityCaminoBinding;


public class CaminoActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityCaminoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCaminoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnBuscar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnBuscar) {
            validarA();
        }
    }
    private void validarA() {
        String distrito = binding.etDistrito.getText().toString();
        String fechaInicio = binding.etFechainicio.getText().toString();
        String fechaFin = binding.etFechafin.getText().toString();

        if (distrito.isEmpty()) {
            Snackbar.make(binding.getRoot(), "El campo Distrito no puede estar vacio", Snackbar.LENGTH_LONG).show();
        } else if (fechaInicio.isEmpty()) {
            Toast.makeText(this, "El campo Fecha de Inicio no puede estar vacío", Toast.LENGTH_SHORT).show();
        } else if (fechaFin.isEmpty()) {
            Toast.makeText(this, "El campo Fecha de Fin no puede estar vacío", Toast.LENGTH_SHORT).show();
        } else {
            startActivity(new Intent(CaminoActivity.this, ListaCaminosActivity.class));
        }
    }
}