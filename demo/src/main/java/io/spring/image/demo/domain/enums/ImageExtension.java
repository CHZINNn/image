package io.spring.image.demo.domain.enums;

import io.spring.image.demo.domain.entity.Image;
import org.springframework.http.MediaType;

import java.util.Arrays;

public enum ImageExtension {
    PNG (MediaType.IMAGE_PNG),
    JPEG (MediaType.IMAGE_JPEG),
    JPG (MediaType.IMAGE_JPEG),
    GIF (MediaType.IMAGE_GIF);

//    WebP (MediaType.IMAGE)

    private MediaType mediaType;

    ImageExtension(MediaType mediaType){
        this.mediaType = mediaType;
    }

    public static ImageExtension valueOf(MediaType mediaType){
        return Arrays.stream(values())
                .filter(ie-> ie.mediaType.equals(mediaType)).findFirst().orElse(null);
    }

}