package com.zaharin.littlenyt.modelLayer.Database.Realm;

import java.util.List;

import io.realm.RealmObject;

/**
 * Created by zah_arin on 2/6/18.
 */

public class NewsViewed extends RealmObject {
    public String url;
    public String adxKeywords;
    public Object column;
    public String section;
    public String byline;
    public String type;
    public String title;
    public String _abstract;
    public String publishedDate;
    public String source;
    public int id;
    public int assetId;
    public int views;
    public List<String> desFacet = null;
    public String orgFacet;
    public List<String> perFacet = null;
    public String geoFacet;
    public List<Media> media = null;

}
