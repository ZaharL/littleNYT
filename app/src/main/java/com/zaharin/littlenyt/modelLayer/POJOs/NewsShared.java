package com.zaharin.littlenyt.modelLayer.POJOs;

import java.util.List;

/**
 * Created by zah_arin on 2/6/18.
 */

public class NewsShared {
    public String url;
    public Object column;
    public String section;
    public String byline;
    public String title;
    public String _abstract;
    public String publishedDate;
    public String source;
    public int assetId;
    public int totalShares;
    public List<String> desFacet = null;
    public String orgFacet;
    public List<String> perFacet = null;
    public String geoFacet;
    public List<Media> media = null;

    public NewsShared(String url, Object column, String section, String byline, String title, String _abstract, String publishedDate, String source, int assetId, int totalShares, List<String> desFacet, String orgFacet, List<String> perFacet, String geoFacet, List<Media> media) {
        this.url = url;
        this.column = column;
        this.section = section;
        this.byline = byline;
        this.title = title;
        this._abstract = _abstract;
        this.publishedDate = publishedDate;
        this.source = source;
        this.assetId = assetId;
        this.totalShares = totalShares;
        this.desFacet = desFacet;
        this.orgFacet = orgFacet;
        this.perFacet = perFacet;
        this.geoFacet = geoFacet;
        this.media = media;
    }
}
