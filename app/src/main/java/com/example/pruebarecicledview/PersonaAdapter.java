package com.example.pruebarecicledview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecicledview.Persona;
import com.example.pruebarecicledview.R;

import java.util.ArrayList;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder> {
    private ArrayList<Persona> personas;

    public PersonaAdapter(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public PersonaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_persona, parent, false);
        return new PersonaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PersonaViewHolder holder, int position) {
        Persona persona = personas.get(position);
        holder.textNombre.setText(persona.getNombre());
        holder.textApellido.setText(persona.getApellido());
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder {
        public TextView textNombre;
        public TextView textApellido;

        public PersonaViewHolder(View itemView) {
            super(itemView);
            textNombre = itemView.findViewById(R.id.text_nombre);
            textApellido = itemView.findViewById(R.id.text_apellido);
        }
    }
}
