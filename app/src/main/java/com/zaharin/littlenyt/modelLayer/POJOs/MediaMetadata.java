package com.zaharin.littlenyt.modelLayer.POJOs;

/**
 * Created by zah_arin on 2/6/18.
 */

public class MediaMetadata {
    public String url;
    public String format;
    public int height;
    public int width;

    public MediaMetadata(String url, String format, int height, int width) {
        this.url = url;
        this.format = format;
        this.height = height;
        this.width = width;
    }
}
