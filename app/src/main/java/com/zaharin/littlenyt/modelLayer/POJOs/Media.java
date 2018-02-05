package com.zaharin.littlenyt.modelLayer.POJOs;

import java.util.List;

/**
 * Created by zah_arin on 2/6/18.
 */

public class Media {
    public String type;
    public String subtype;
    public String caption;
    public String copyright;
    public int approvedForSyndication;
    public List<MediaMetadata> mediaMetadata = null;

    public Media(String type, String subtype, String caption, String copyright, int approvedForSyndication, List<MediaMetadata> mediaMetadata) {
        this.type = type;
        this.subtype = subtype;
        this.caption = caption;
        this.copyright = copyright;
        this.approvedForSyndication = approvedForSyndication;
        this.mediaMetadata = mediaMetadata;
    }
}
