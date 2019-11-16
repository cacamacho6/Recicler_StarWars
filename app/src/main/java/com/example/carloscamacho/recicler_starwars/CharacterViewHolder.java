package com.example.carloscamacho.recicler_starwars;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class CharacterViewHolder extends RecyclerView.ViewHolder  {
    
    public TextView name;
    public TextView height;
    public TextView mass;
    public TextView hair_color;
    public TextView skin_color;
    public TextView eye_color;
    public TextView birth_year;
    public TextView gender;


    public CharacterViewHolder(View characterView) {
        
        super(characterView);
        
        this.name = (TextView) characterView.findViewById(R.id.cName);
        this.height = (TextView) characterView.findViewById(R.id.cHeight);
        this.mass = (TextView) characterView.findViewById(R.id.cMass);
        this.hair_color = (TextView) characterView.findViewById(R.id.cHair_color);
        this.skin_color = (TextView) characterView.findViewById(R.id.cSkin_color);
        this.eye_color = (TextView) characterView.findViewById(R.id.cEye_color);
        this.birth_year = (TextView) characterView.findViewById(R.id.cBirth_year);
        this.gender = (TextView) characterView.findViewById(R.id.cGender);
        
    }
}
