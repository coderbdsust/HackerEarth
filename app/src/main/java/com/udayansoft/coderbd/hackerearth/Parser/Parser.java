package com.udayansoft.coderbd.hackerearth.parser;

import android.util.Log;

import com.udayansoft.coderbd.hackerearth.pojo.Contest;
import com.udayansoft.coderbd.hackerearth.pojo.Website;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Biswajit Debnath on 26-Sep-16.
 */

public class Parser {

    private String jsonString = "{\"websites\":[{\"id\":\"17\",\"name\":\"Battle Of Bots #6\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/battle-of-bots-5\\/images\\/c0df10c8-3-Battle-of-bots-listing.jpg\",\"category\":\"BOT\",\"description\":\"Battle of Bots is HackerEarth's flagship Artificial Intelligence Challenge. It's one of a kind challen\",\"experience\":\"0\"},{\"id\":\"18\",\"name\":\"Battle Of Bots #4\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/battle-of-bots-4\\/images\\/278aa45e-0-cover%20%2815%29.jpg\",\"category\":\"BOT\",\"description\":\"Battle of Bots is HackerEarth's flagship Artificial Intelligence Challenge. It's one of a kind challenge that will run for 6 days. There is only one problem statement in the challenge - the game for which you have to write a bot.\",\"experience\":\"0\"},{\"id\":\"19\",\"name\":\"Battle Of Bots #3\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/battle-of-bots-3\\/images\\/32b94380-c-Cover%20%2834%29.jpg\",\"category\":\"BOT\",\"description\":\"Battle of Bots is HackerEarth's flagship Artificial Intelligence Challenge. It's one of a kind challenge that will run for 6 days. There is only one problem statement in the challenge - the game for which you have to write a bot.\",\"experience\":\"0\"},{\"id\":\"20\",\"name\":\"Toppr Android\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/toppr-android-hiring-challenge\\/images\\/dea6b3c0-6-Toppr-android-listing.jpg\",\"category\":\"HIRING\",\"description\":\"Toppr is looking for smart Android Developers to lead Android development at toppr.com. This role is based in Mumbai and reports to the CTO.\",\"experience\":\"2-5 years\"},{\"id\":\"21\",\"name\":\"Amazon SDE Hiring Challenge\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/amazon-sde-hiring-challenge\\/images\\/70a63e6e-3-Amazon-Hiring-challenge-listing.png\",\"category\":\"HIRING\",\"description\":\"Amazon is looking to hire passionate software development engineers for their OLP team to build next generation of highly optimized\\/scaled services in a highly distributed environment for Bangalore location.\",\"experience\":\"2-8 years\"},{\"id\":\"22\",\"name\":\"Magicbricks Build-a-thon\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/magicbricks-build-a-thon\\/images\\/f04796b2-3-listing%20%284%29.png\",\"category\":\"HACKATHON\",\"description\":\"Magicbricks has the vision to build next generation products and unresolved problem of real-estate using Advanced Technologies \\u2013 AI, VR, AR to build Products to help consumers explore & experience Real State like never before.\",\"experience\":\"0\"},{\"id\":\"23\",\"name\":\"Digital India Hackathon\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/digital-india-hackathon\\/images\\/62040484-2-listing%20%282%29.png\",\"category\":\"HACKATHON\",\"description\":\"ACM India is hosting a one-day Digital India event in conjunction with VLDB 2016 and Persistent Systems Ltd. We are very excited by the opportunities presented by the ambitious Digital India program launched by Hon. PM Narendra Modi. It is a grandeur vision of uniting a large nation like India via h\",\"experience\":\"0\"},{\"id\":\"24\",\"name\":\"nuVizz Java Hiring Challenge\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/nuvizz-java-hiring-challenge\\/images\\/b6898714-2-Nuvizz-Listing.png\",\"category\":\"HIRING\",\"description\":\"nuVizz is looking to hire Senior Software Analyst to join their innovative tech team in Bangalore.\\r\\n\\r\\nTake up this challenge, prove your mettle in Java and stand a chance to land your dream job!\\r\\n\\r\\nRead the Job Description to know more.\",\"experience\":\"2-7 years\"},{\"id\":\"25\",\"name\":\"Canada & UAE iOS Hiring Challenge\",\"image\":\"https:\\/\\/d320jcjashajb2.cloudfront.net\\/media\\/cache\\/d6\\/86\\/d68680179cd8df007ace66ac0d28eaed.png\",\"category\":\"HIRING\",\"description\":\"www.darkmatter.ae is looking for a senior software engineer to build applications, including secure applications development that can be utilized for commercialization.\\r\\n\\r\\nYou will build Applications for both iOS and Mac OS X platforms the individual must be self-motivated, an excellent problem solv\",\"experience\":\"4-12 years\"},{\"id\":\"26\",\"name\":\"Smarter Than Yesterday Hackathon\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/styh\\/images\\/555774b6-4-Pluiralsight-lisitng.gif\",\"category\":\"HACKATHON\",\"description\":\"Pluralsight is the world's best technology learning platform. We are developers at heart and love providing developers a chance to showcase the worlds that they envision through their technology talent. Pluralsight Smarter Than Yesterday Hackathon is aimed at envisioning an India that is Smarter Tha\",\"experience\":\"0\"},{\"id\":\"27\",\"name\":\"@WalmartLabs Hack Fest 2016\",\"image\":\"https:\\/\\/he-s3.s3.amazonaws.com\\/media\\/hackathon\\/walmart-hackathon-2016\\/images\\/c2f6d446-4-Listing-2.png\",\"category\":\"HACKATHON\",\"description\":\"This is an opportunity to wear your creative hats and use next-gen technologies to build products or applications that could empower the world around us. All you need to do is to finalise a theme, from the listed ones and get going.\",\"experience\":\"0\"},{\"id\":\"28\",\"name\":\"Zoomcar Android App Development\",\"image\":\"https:\\/\\/d320jcjashajb2.cloudfront.net\\/media\\/cache\\/22\\/eb\\/22eb9d3957b9f979e1eb4a99d02bf399.png\",\"category\":\"HIRING\",\"description\":\"Zoomcar is hiring Android App Developer for their team in Bangalore. Take up the test and stand a chance!\\r\\n\\r\\nThere will be a problem statement provided in the challenge for which candidates have to build a fully functional app.\",\"experience\":\"0-2 years\"}],\"quote_max\":\"100000\",\"quote_available\":\"2407\"}";


    public Website parseEarthquakes(String json){
        json=jsonString;
        Website website = new Website();
        try{
            JSONObject root = new JSONObject(json);
            website=parseEarthquakes(root);
        }catch(JSONException ex){
            Log.e("Website Parser","ERROR IN JSON EXCEPTION",ex);
        }
        return website;
    }

    public Website parseEarthquakes(JSONObject root){
        Website website = new Website();
        try{
            website.setQuotaAvailable(root.getInt("quote_available"));
            website.setQuotaMax(root.getInt("quote_max"));
            JSONArray websiteArray = root.getJSONArray("websites");
            for(int i=0;i<websiteArray.length();i++){
                JSONObject object = websiteArray.getJSONObject(i);
                Contest contest = new Contest(
                        object.getInt("id"),
                        object.getString("name"),
                        object.getString("image"),
                        object.getString("category"),
                        object.getString("description"),
                        object.getString("experience")
                );
                website.getContests().add(contest);
            }
        }catch(JSONException ex){
            Log.e("Website Parser","ERROR IN JSON EXCEPTION",ex);
        }
        return website;
    }
}
