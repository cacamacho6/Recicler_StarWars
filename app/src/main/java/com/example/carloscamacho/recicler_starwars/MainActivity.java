package com.example.carloscamacho.recicler_starwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import model.Character;
import provider.ReadInformation;

public class MainActivity extends AppCompatActivity {


    private RecyclerView charactersRecyclerView;
    private RecyclerView.Adapter myCharacterAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Character> characterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        charactersRecyclerView= findViewById(R.id.characterRec);
        fillDataSetOfBands ();

        layoutManager = new LinearLayoutManager(this);
        charactersRecyclerView.setLayoutManager(layoutManager);


        myCharacterAdapter = new MyCharacterAdapter(characterList);
        charactersRecyclerView.setAdapter(myCharacterAdapter);
    }

    public void fillDataSetOfBands () {
        characterList = new ArrayList<>();
        ReadInformation readerOfInfo = new ReadInformation();
        readerOfInfo.getAllCharacters();
        while(readerOfInfo.characters.size()!=10) {
        }

        characterList.addAll(readerOfInfo.characters);
    }



}
