package com.zaharin.littlenyt.modelLayer.Database.Realm;

import java.util.List;

import io.realm.RealmObject;

/**
 * Created by zah_arin on 2/6/18.
 */

public class NewsMailed extends RealmObject{
    public String url;
    public String countType;
    public String column;
    public String section;
    public String byline;
    public String title;
    public String _abstract;
    public String publishedDate;
    public String source;
    public List<String> desFacet = null;
    public List<String> orgFacet = null;
    public List<String> perFacet = null;
    public String geoFacet;
    public List<Media> media = null;

}
