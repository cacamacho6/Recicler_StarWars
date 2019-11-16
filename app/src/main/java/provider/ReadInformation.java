package provider;

import java.util.ArrayList;
import model.Character;

import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class ReadInformation  {

    public ArrayList<Character> characters = new ArrayList<>();
    String cualities []= new String[8];
    public static final String URL_SWAPI = "https://swapi.co/api/";
    private int index=1;
    public int n=0;


    public ArrayList<Character> getAllCharacters() {
        for(int i = 1; i <= 10; i++)
            callWebService(i + "");
        return characters;
    }

    public void callWebService(final String serviceEndPoint){

        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
            try {
                URL urlService = new URL (URL_SWAPI + "people/"+serviceEndPoint+"/" );
                HttpsURLConnection connection =  (HttpsURLConnection) urlService.openConnection();
                connection.setRequestMethod("GET");
                InputStream responseBody = connection.getInputStream();

                if (connection.getResponseCode() == 200) {
                    // Success


                    InputStreamReader responseBodyReader = new InputStreamReader(responseBody, "UTF-8");
                    Log.i("XDXDXD", responseBody.toString());
                    JsonReader jsonReader = new JsonReader(responseBodyReader);
                    jsonReader.beginObject(); // Start processing the JSON object
                    for (int j =0 ; j<cualities.length;j++){
                        String key = jsonReader.nextName(); // Fetch the next key
                        String value = jsonReader.nextString();
                        cualities[j]=value;
                    }
                    Character character = new Character(cualities[0],cualities[1],cualities[2],cualities[3],cualities[4],cualities[5],cualities[6],cualities[7]);
                    Log.i("XDXDXD", character.getBirth());
                    characters.add(character);
                } else {
                    // Error handling code goes here
                    Log.v("ERROR", "ERROR");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        });

    }// end callWebService()
}
