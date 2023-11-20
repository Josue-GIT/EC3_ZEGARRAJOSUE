package pe.edu.idat.appec3_zegarrajosue;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pe.edu.idat.appec3_zegarrajosue.databinding.ItemListadoBinding;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.ViewHolder>{

    private ArrayList<Bus> lista = new ArrayList<>();


    @NonNull
    @Override
    public BusAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemListadoBinding
                .inflate(LayoutInflater.from(parent.getContext())
                        ,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BusAdapter.ViewHolder holder, int position) {
        final Bus objBus = lista.get(position);
        holder.binding.tvparadero.setText(String.valueOf(objBus.getParadero()));
        holder.binding.ivimagen.setImageResource(objBus.getImagen());
        holder.binding.tvinfo.setText(objBus.getInfo());
        holder.binding.tvpasajeros.setText(objBus.getPasajeros());
    }

    @Override
    public int getItemCount() {

        return lista.size();
    }
    public void setData(ArrayList<Bus> data){
        lista.addAll(data);
        notifyDataSetChanged();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemListadoBinding binding;
        public ViewHolder(ItemListadoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
