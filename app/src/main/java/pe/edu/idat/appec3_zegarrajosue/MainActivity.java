package pe.edu.idat.appec3_zegarrajosue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import pe.edu.idat.appec3_zegarrajosue.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnlistado.setOnClickListener(this);
        binding.btnaceptar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnlistado) {
            startActivity(new Intent(MainActivity.this,
                    ListadoActivity.class));
        }else if (v.getId() == R.id.btnaceptar) {
            validar();
        }
    }
    private void validar() {
        String usuario = binding.etemail.getText().toString();
        String contrasenia = binding.etcontrasenia.getText().toString();

        if (usuario.equals("josue") && contrasenia.equals("sys123")) {
            Toast.makeText(this, "Credenciales válidas, bienvenido", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, CaminoActivity.class));
        } else {
            Toast.makeText(this, "Credenciales inválidas", Toast.LENGTH_SHORT).show();
        }
    }
}