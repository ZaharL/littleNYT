package com.zaharin.littlenyt.modelLayer.POJOs;

import java.util.List;

/**
 * Created by zah_arin on 2/6/18.
 */

public class NewsViewed {
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

    public NewsViewed(String url, String adxKeywords, Object column, String section, String byline, String type, String title, String _abstract, String publishedDate, String source, int id, int assetId, int views, List<String> desFacet, String orgFacet, List<String> perFacet, String geoFacet, List<Media> media) {
        this.url = url;
        this.adxKeywords = adxKeywords;
        this.column = column;
        this.section = section;
        this.byline = byline;
        this.type = type;
        this.title = title;
        this._abstract = _abstract;
        this.publishedDate = publishedDate;
        this.source = source;
        this.id = id;
        this.assetId = assetId;
        this.views = views;
        this.desFacet = desFacet;
        this.orgFacet = orgFacet;
        this.perFacet = perFacet;
        this.geoFacet = geoFacet;
        this.media = media;
    }
}
