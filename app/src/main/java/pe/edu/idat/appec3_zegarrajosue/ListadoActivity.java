package pe.edu.idat.appec3_zegarrajosue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import pe.edu.idat.appec3_zegarrajosue.databinding.ActivityListadoBinding;

public class ListadoActivity extends AppCompatActivity {

    private ActivityListadoBinding binding;
    private BusAdapter busAdapter = new BusAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvlistado.setLayoutManager(
                new LinearLayoutManager(getApplicationContext())
        );
        binding.rvlistado.setAdapter(busAdapter);
        busAdapter.setData(getData());
    }
    private ArrayList<Bus> getData() {
        ArrayList<Bus> list = new ArrayList<>();
        list.add(new Bus(1,
                R.drawable.ic_android_black_24dp,
                "12/10/20 13:30",
                "2"));
        list.add(new Bus(2,
                R.drawable.ic_android_black_24dp,
                "12/10/20 13:30",
                "5"));

        list.add(new Bus(3,
                R.drawable.ic_android_black_24dp,
                "13/10/20 14:45",
                "8"));

        list.add(new Bus(4,
                R.drawable.ic_android_black_24dp,
                "14/10/20 16:00",
                "12"));

        list.add(new Bus(5,
                R.drawable.ic_android_black_24dp,
                "15/10/20 17:15",
                "15"));

        list.add(new Bus(6,
                R.drawable.ic_android_black_24dp,
                "16/10/20 18:30",
                "20"));

        list.add(new Bus(7,
                R.drawable.ic_android_black_24dp,
                "17/10/20 19:45",
                "25"));

        list.add(new Bus(8,
                R.drawable.ic_android_black_24dp,
                "18/10/20 21:00",
                "25"));

        list.add(new Bus(9,
                R.drawable.ic_android_black_24dp,
                "19/10/20 22:15",
                "25"));

        list.add(new Bus(10,
                R.drawable.ic_android_black_24dp,
                "20/10/20 23:30",
                "25"));
        return list;
    }

}