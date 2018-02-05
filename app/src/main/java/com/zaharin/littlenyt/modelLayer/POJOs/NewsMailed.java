package com.zaharin.littlenyt.modelLayer.POJOs;

import java.util.List;

/**
 * Created by zah_arin on 2/6/18.
 */

public class NewsMailed {
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

    public NewsMailed(String url, String countType, String column, String section, String byline, String title, String _abstract, String publishedDate, String source, List<String> desFacet, List<String> orgFacet, List<String> perFacet, String geoFacet, List<Media> media) {
        this.url = url;
        this.countType = countType;
        this.column = column;
        this.section = section;
        this.byline = byline;
        this.title = title;
        this._abstract = _abstract;
        this.publishedDate = publishedDate;
        this.source = source;
        this.desFacet = desFacet;
        this.orgFacet = orgFacet;
        this.perFacet = perFacet;
        this.geoFacet = geoFacet;
        this.media = media;
    }
}
