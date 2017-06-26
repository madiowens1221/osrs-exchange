package com.osrs.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.*;
import com.osrs.item.Herbs;
import com.osrs.item.Item;

/**
 * Created by Jeremy on 6/25/17.
 */
public class Main {
    public static ArrayList<Item> unfinishedPotionList = new ArrayList<>();
    public static ArrayList<Item> grimyList = new ArrayList<>();
    public static ArrayList<Item> cleanList = new ArrayList<>();
    public static void main(String[] args) throws Exception {
/*
// #        Herb             unf            grimy         clean
------------------------------------------------------------------
// 0        Guam             91             199           249
// 1        Marrentil        93             201           251
// 2        Tarromin         95             203           253
// 3        Harralander      97             205           255
// 4        Ranarr           99             207           257
// 5        Irit             101            209           259
// 6        Avantoe          103            211           261
// 7        Kwuarm           105            213           263
// 8        Cadantine        107            215           265
// 9        DwarfWeed        109            217           267
// 10       Torstol          111            219           269
// 11       Toad Flax        3002           3049          2998 -
// 12       Snapdragon       3004           3051          3000 -
// 13       Lantadyme        2483           2485          2481 -
*/

        loadObjects();




    }

    private static void loadObjects() throws Exception {
        Gson parse = new Gson();
        //LOAD Unfinished potions
        for (int i = 91; i < 112; i+=2) {
            unfinishedPotionList.add(parse.fromJson(getRequest(String.valueOf(i)), Item.class));
        }
        //LOAD grimy herbs
        for (int i = 199; i < 220; i+=2) {
            grimyList.add(parse.fromJson(getRequest(String.valueOf(i)), Item.class));
        }
        //LOAD clean herbs
        for (int i = 249; i < 270; i+=2) {
            cleanList.add(parse.fromJson(getRequest(String.valueOf(i)), Item.class));
        }
        //LOAD weird itemID's

    }
    public static String getRequest(String itemID)throws Exception
    {
        String baseURL = "https://api.rsbuddy.com/grandExchange?a=guidePrice&i=";

        URL url = new URL(baseURL + itemID);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        //System.out.println("\nSending 'GET' request to URL : " + url.toString());
        //System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        return(response.toString());
    }

}
