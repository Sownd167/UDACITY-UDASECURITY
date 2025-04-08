package com.udacity.catpoint.imageservice.service;


import java.awt.image.BufferedImage;

public interface ImageService {
    public boolean imageContainsCat(BufferedImage image, float confidenceThreshhold) ;
}
