package com.example.carloscamacho.recicler_starwars;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import model.Character;

public class MyCharacterAdapter extends RecyclerView.Adapter <CharacterViewHolder> {

    private ArrayList<Character> characterList;

    public MyCharacterAdapter(ArrayList<Character> characterList) {

        this.characterList = characterList;
    }


    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.character_custom_layout, viewGroup, false);

        CharacterViewHolder characterViewHolder = new CharacterViewHolder(contactView);

        return characterViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder viewHolder, int i) {

        Character bandTmp = characterList.get(i);

        TextView nameTv = viewHolder.name;
        nameTv.setText(bandTmp.getName());

        TextView heightTv = viewHolder.height;
        heightTv.setText(bandTmp.getHeight());

        TextView massTv = viewHolder.mass;
        massTv.setText(bandTmp.getMass());

        TextView hcTv = viewHolder.hair_color;
        hcTv.setText(bandTmp.getHairColor());

        TextView skTv = viewHolder.skin_color;
        skTv.setText(bandTmp.getSkinColor());

        TextView ecTv = viewHolder.eye_color;
        ecTv.setText(bandTmp.getEyecolor());

        TextView byTv = viewHolder.birth_year;
        byTv.setText(bandTmp.getBirth());

        TextView gTv = viewHolder.gender;
        gTv.setText(bandTmp.getGender());

    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }



}
